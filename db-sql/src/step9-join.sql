/*
 * JOIN SQL - ���� ���̺��� �����Ͽ� ������ ��ȸ�ϱ����� SQL�̴�
 *
 * 1. INNER JOIN - JOIN ���ǿ��� ���� ��ġ�ϴ� ���� ��ȯ�Ѵ�.
 * 		1) EQUI-JOIN	2) NON-EQUI-JOIN
 * 
 * 2. OUTER JOIN - JOIN ���ǿ��� ���� ���� ��ġ���� �ʴ��� ���� ��ȯ�Ѵ�.
 * 
 * 3. SELF JOIN
 * 
 */

--------------------------------------------------------------

/*
 *	1. INNER JOIN
 *		1) equi join : ���� ��� ���̺��� �����ϴ� �÷� ������ ��Ȯ�ϰ� ��ġ�ϴ� ��쿡 ����ϴ� JOIN
 *					WHERE ���� '=' �����ڸ� �̿��� ���������� ����Ѵ�.
 *					(����� �μ� ���̺��� �μ���ȣ�� �̿��� �����Ѵ�) 
 *		
 *		2) non-equi join : ���� ���̺� ���� �����ϴ� �÷� ������ ���� �� ����ϴ� �����̴�.
 *						(��� ���̺�� ���޵�����̺��� �÷��� �������� ������ ����� ���޵���� Ȯ���ϱ� ����
 *						non-equi join�� �̿��Ѵ�)
 *						WHERE ���� '>'�� ���� �����ڸ� �̿��� ���������� ����Ѵ�.
 *
 */
SELECT e.empno, e.ename, d.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno;

-- �� SQL�� JOIN ON���� ǥ���Ѵ�.
SELECT e.empno, e.ename, d.deptno, d.dname, d.loc
FROM emp e
INNER JOIN dept d ON e.deptno = d.deptno; 

-- �� SQL�� JOIN USING���� ǥ���Ѵ�.
SELECT e.empno, e.ename, deptno, d.dname, d.loc
FROM emp e
INNER JOIN dept d USING (deptno); -- USING ���� ��Ī�� ������� �ʴ´�.


-- ���� ���� sal ������ �޴� ��� emp�� empno, ename, sal, deptno, loc�� ��ȸ
SELECT MAX(sal) FROM emp;
SELECT * FROM emp WHERE sal = 5000;
-- �� �� sql�� ���� ������ ���ļ� �����ȣ�� ��ȸ�Ѵ�
SELSET empno FROM emp WHERE sal = (SELECT MAX(sal) FROM emp);
-- subquery�� join�� �̿��� ��ȸ
SELECT e.empno, e.ename, e.sal, d.deptno, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno AND e.empno = (SELECT empno FROM emp WHERE sal = (SELECT MAX(sal) FROM emp));

---------------------------------------------------------------------------------------------------------------------

-- non-equi join
-- ex) emp(���)	salgrade(���޵��)
--		sal			hisal,	losal
--		�� ���̺��� �������� ����� sal�� salgrade�� �ְ�� hisal�� ������ losal ���̿� �ִ�.

SELECT * FROM emp; -- smith�� sal�� 800�̴�.

SELECT e.ename, e.sal, s.grade, s.losal, s.hisal
FROM emp e, salgrade s
WHERE e.ename = 'SMITH' AND e.sal >= s.losal AND e.sal <= s.hisal

/*
 *  2. OUTER JOIN 
 * 	�Ϲ����� ���� ���ǿ� �������� �ʴ� ��쿡��
 * 	�ٸ� ���� ��ȸ�ϱ� ���� ���
 * 	--> INNER JOIN�� ���̺� ���� �÷��� ��ġ�Ǵ� ���� ���� ��쿡�� ��ȸ���� �ʴ´�.
 * 
 * 	JOIN ���ǿ� (+)�� ����Ѵ�. (���ν�ų ���� ���� ���� ǥ���Ѵ�)
 *  SELECT COLUMN ...
 * 	FROM TABLE1, TABLE2
 * 	WHERE TABLE1.�÷�(+) = TABLE2.�÷�;
 * 
 * 	OUTER JOIN ��ʸ� ����
 */

 SELECT DISTINCT(deptno) FROM emp;
 SELECT DISTINCT(deptno) FROM dept;
 -- �⺻ INNER JOIN������ ����� ���� �μ� ��ȣ 40�� �ش��ϴ� �μ������� ��ȸ���� �ʴ´�.
 SELECT e. ename, d.deptno, d.dname
 FROM emp e, dept d
 WHERE e.deptno = d.deptno
 ORDER BY e.deptno ASC;
-- ����� ���� �μ��������� ��� ��ȸ�ϰ��� �� ���� OUTER JOIN�� �̿��Ѵ�.
 SELECT e. ename, d.deptno, d.dname
 FROM emp e, dept d
 WHERE e.deptno(+) = d.deptno
 ORDER BY e.deptno ASC;

 -- LEFT OUTER JOIN ���·� �� SQL�� ����Ѵ�.
 SELECT e. ename, d.deptno, d.dname
 FROM dept d
 LEFT OUTER JOIN emp e
 ON d.deptno = e.deptno;
 
 -- RIGHT OUTER JOIN ���·� ���
 SELECT e.ename, d.deptno, d.dname
 FROM dept d
 RIGHT OUTER JOIN emp e
 ON d.deptno = e.deptno;
 
 
 
/*
 * 	SELF JOIN : ���̺� ��ü� �����Ѵ�.
 * 	������ ���̺������� ���������� �ٸ� ������ �����Ѵ�.
 * 	��� - 
 */
 -- SMITH�� �Ŵ�����ȣ(mgr)�� 7902�̴�
 SELECT empno, ename, mgr FROM emp WHERE empno = 7369;
 -- SMITH�� �Ŵ��� ��ȣ mgr�� �� �ٸ� ����� empno�̴�.
 SELECT empno, ename, mgr FROM emp WHERE empno = 7902;
 
 SELECT * FROM emp;
 
 -- ���� ������� �����ȣ empno, ����� ename, �Ŵ�����ȣmgr, �Ŵ������� ��ȸ�Ѵ�.
 
 SELECT e.empno, e.ename, e.mgr, m.ename
 FROM emp e, emp m
 WHERE e.mgr = m.empno;
 -- �� SQL�� INNER JOIN �����̹Ƿ� �Ŵ����� ���� ����� ���ܵǾ� 13�� ��ȸ�ȴ�(���� 14��)
 -- �Ŵ����� ���� ������� ��� ��ȸ�ϰ��� �Ҷ��� OUTER JOIN�� �̿��Ѵ�.
 
 SELECT e.empno, e.ename, e.mgr, m.ename
 FROM emp e, emp m
 WHERE e.mgr = m.empno(+);

 
 -- 7369 empno�� ename�� dname, �Ŵ�����(m.ename), grade(���޵��)�� ��ȸ�Ѵ�.
 
 SELECT e.ename, d.dname, m.ename, s.grade
 FROM emp e, dept d, emp m, salgrade s
 WHERE e.empno = 7369 
 AND e.deptno = d.deptno 
 AND e.mgr = m.empno 
 AND e.sal >= s.losal 
 AND e.sal <= s.hisal;





