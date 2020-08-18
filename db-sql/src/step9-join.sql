/*
 * JOIN SQL - 여러 테이블을 결합하여 정보를 조회하기위한 SQL이다
 *
 * 1. INNER JOIN - JOIN 조건에서 값이 일치하는 행을 반환한다.
 * 		1) EQUI-JOIN	2) NON-EQUI-JOIN
 * 
 * 2. OUTER JOIN - JOIN 조건에서 한쪽 값이 일치하지 않더라도 행을 반환한다.
 * 
 * 3. SELF JOIN
 * 
 */

--------------------------------------------------------------

/*
 *	1. INNER JOIN
 *		1) equi join : 조인 대상 테이블의 상응하는 컬럼 정보가 정확하게 일치하는 경우에 사용하는 JOIN
 *					WHERE 절에 '=' 연산자를 이용해 조인조건을 명시한다.
 *					(사원과 부서 테이블의 부서번호를 이용해 조인한다) 
 *		
 *		2) non-equi join : 조인 테이블 간의 상응하는 컬럼 정보가 없을 때 사용하는 조인이다.
 *						(사원 테이블과 월급등급테이블은 컬럼에 연관성은 없지만 사원의 월급등급을 확인하기 위해
 *						non-equi join을 이용한다)
 *						WHERE 절에 '>'와 같은 연산자를 이용해 조인조건을 명시한다.
 *
 */
SELECT e.empno, e.ename, d.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno;

-- 위 SQL을 JOIN ON으로 표현한다.
SELECT e.empno, e.ename, d.deptno, d.dname, d.loc
FROM emp e
INNER JOIN dept d ON e.deptno = d.deptno; 

-- 위 SQL을 JOIN USING으로 표현한다.
SELECT e.empno, e.ename, deptno, d.dname, d.loc
FROM emp e
INNER JOIN dept d USING (deptno); -- USING 사용시 별칭을 사용하지 않는다.


-- 가장 높은 sal 월급을 받는 사원 emp의 empno, ename, sal, deptno, loc를 조회
SELECT MAX(sal) FROM emp;
SELECT * FROM emp WHERE sal = 5000;
-- 위 두 sql을 서브 쿼리로 합쳐서 사원번호를 조회한다
SELSET empno FROM emp WHERE sal = (SELECT MAX(sal) FROM emp);
-- subquery와 join을 이용해 조회
SELECT e.empno, e.ename, e.sal, d.deptno, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno AND e.empno = (SELECT empno FROM emp WHERE sal = (SELECT MAX(sal) FROM emp));

---------------------------------------------------------------------------------------------------------------------

-- non-equi join
-- ex) emp(사원)	salgrade(월급등급)
--		sal			hisal,	losal
--		두 테이블의 연관성은 사원의 sal과 salgrade의 최고액 hisal과 최저액 losal 사이에 있다.

SELECT * FROM emp; -- smith의 sal은 800이다.

SELECT e.ename, e.sal, s.grade, s.losal, s.hisal
FROM emp e, salgrade s
WHERE e.ename = 'SMITH' AND e.sal >= s.losal AND e.sal <= s.hisal

/*
 *  2. OUTER JOIN 
 * 	일반적인 조인 조건에 만족하지 않는 경우에도
 * 	다른 행을 조회하기 위해 사용
 * 	--> INNER JOIN은 테이블 간의 컬럼에 일치되는 값이 없는 경우에는 조회되지 않는다.
 * 
 * 	JOIN 조건에 (+)을 명시한다. (조인시킬 값이 없는 측에 표기한다)
 *  SELECT COLUMN ...
 * 	FROM TABLE1, TABLE2
 * 	WHERE TABLE1.컬럼(+) = TABLE2.컬럼;
 * 
 * 	OUTER JOIN 사례를 정리
 */

 SELECT DISTINCT(deptno) FROM emp;
 SELECT DISTINCT(deptno) FROM dept;
 -- 기본 INNER JOIN에서는 사원이 없는 부서 번호 40에 해당하는 부서정보는 조회되지 않는다.
 SELECT e. ename, d.deptno, d.dname
 FROM emp e, dept d
 WHERE e.deptno = d.deptno
 ORDER BY e.deptno ASC;
-- 사원이 없는 부서정보까지 모두 조회하고자 할 때는 OUTER JOIN을 이용한다.
 SELECT e. ename, d.deptno, d.dname
 FROM emp e, dept d
 WHERE e.deptno(+) = d.deptno
 ORDER BY e.deptno ASC;

 -- LEFT OUTER JOIN 형태로 위 SQL을 기술한다.
 SELECT e. ename, d.deptno, d.dname
 FROM dept d
 LEFT OUTER JOIN emp e
 ON d.deptno = e.deptno;
 
 -- RIGHT OUTER JOIN 형태로 기술
 SELECT e.ename, d.deptno, d.dname
 FROM dept d
 RIGHT OUTER JOIN emp e
 ON d.deptno = e.deptno;
 
 
 
/*
 * 	SELF JOIN : 테이블 자체어서 조인한다.
 * 	동일한 테이블이지만 개념적으로 다를 정보를 결합한다.
 * 	사례 - 
 */
 -- SMITH의 매니저번호(mgr)는 7902이다
 SELECT empno, ename, mgr FROM emp WHERE empno = 7369;
 -- SMITH의 매니저 번호 mgr은 또 다른 사원의 empno이다.
 SELECT empno, ename, mgr FROM emp WHERE empno = 7902;
 
 SELECT * FROM emp;
 
 -- 현재 사원들의 사원번호 empno, 사원명 ename, 매니저번호mgr, 매니저명을 조회한다.
 
 SELECT e.empno, e.ename, e.mgr, m.ename
 FROM emp e, emp m
 WHERE e.mgr = m.empno;
 -- 위 SQL은 INNER JOIN 형태이므로 매니저가 없는 사원은 제외되어 13이 조회된다(원래 14명)
 -- 매니저가 없는 사원까지 모두 조회하고자 할때는 OUTER JOIN을 이용한다.
 
 SELECT e.empno, e.ename, e.mgr, m.ename
 FROM emp e, emp m
 WHERE e.mgr = m.empno(+);

 
 -- 7369 empno의 ename와 dname, 매니저명(m.ename), grade(월급등급)을 조회한다.
 
 SELECT e.ename, d.dname, m.ename, s.grade
 FROM emp e, dept d, emp m, salgrade s
 WHERE e.empno = 7369 
 AND e.deptno = d.deptno 
 AND e.mgr = m.empno 
 AND e.sal >= s.losal 
 AND e.sal <= s.hisal;





