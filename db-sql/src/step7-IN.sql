/*
 *  IN 연산자
 *  특정값이 포함되는 데이터를 조회하고자 할 때 사용하는 연산자
 * 	SELECT 컬럼, 컬럼
 * 	FROM 테이블명
 * 	WHERE 컬럼 IN('롯데', '빙그레', '진로');
 * 
 * 	NOT IN 연산자
 * 	특정값이 포함되지 않는 데이터를 조회하고자 할 때
 *	SELECT 컬럼, 컬럼
 * 	FROM 테이블명
 * 	WHERE 컬럼 NOT IN('롯데', '빙그레', '진로');
 */

-- MAKER가 롯데 진로 빙그레인 상품의 정보를 조회한다.
SELECT * FROM product
WHERE maker = '롯데' or maker = '진로' or maker = '빙그레';

-- 위 sql을 IN으로 조회해본다
SELECT * FROM product WHERE maker IN('롯데', '진로', '빙그레');

-- maker가 롯데 진로 빙그레가 아닌 상품들을 조회한다.
SELECT * FROM product WHERE maker <> '롯데' AND maker <> '진로' AND maker <> '빙그레';

-- 위 sql을 IN으로 조회해본다
SELECT * FROM product WHERE maker NOT IN('롯데', '진로', '빙그레');

-- maker 별 상품수가 하나인 maker 상품을 조회한다.
-- 1. 상품수가 하나인 MAKER를 확인한다.
SELECT maker, COUNT(*) AS 상품수 FROM product GROUP BY maker
-- 2. 1번에 해당하는 MAKER만 출력한다.
SELECT maker, COUNT(*) AS 상품수 FROM product GROUP BY maker HAVING COUNT(*) = 1
-- 3. SUBQUERY를 사용한다.
SELECT * FROM product WHERE maker IN(
SELECT maker FROM product GROUP BY maker HAVING COUNT(*) = 1);


-- 전체 사원의 평균 월급
SELECT AVG(salary) FROM employee;

SELECT * FROM employee;

-- 전체사원의 평균 월급보다 job의 평균월급이 많은 job의 사원정보를 조회한다.
--1. 전체사원 평균 월급
--2. job별 평균 월급
--3. 전체사원평균월급보다 많이 받는 job
--4. 그 job에 해당하는 사원의 job와 name

SELECT job, name FROM employee WHERE job IN(
	SELECT job FROM employee GROUP BY job HAVING ROUND(AVG(salary)) > (SELECT AVG(salary) FROM employee));
