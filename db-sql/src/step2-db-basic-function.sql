/*
 *  SQL : 데이터베이스 제어 언어
 * 
 *  DDL - CREATE(생성), DROP(삭제), ALTER(수정)
 * 	DML - SELECT, INSERT, DELETE, UPDATE
 * 	DCL - COMMIT, ROLLBACK
 */

-- DATA TYPE : 오라클에서 권장하는 문자열 타입 VARCHAR2(20)
--				  MySQL이나 MSSQL에서는 VARCHAR(20)

CREATE TABLE typetest(
	name VARCHAR2(9) PRIMARY KEY,
	money number not null
)
-- 최대사이즈가 9이므로 10자는 insert안됨
INSERT INTO typetest(name, money) VALUES('abcdefghij', 100);
INSERT INTO typetest(name, money) VALUES('abcdefghi', 100);
-- 한글은 3byte를 차지하므로 12byte이기에 error
INSERT INTO typetest(name, money) VALUES('정재우님', 100);
-- success
INSERT INTO typetest(name, money) VALUES('정재우', 100);

-- UPDATE 연습 : NAME이 정재우인 대상의 MONEY를 200을 '누적'해본다.
-- 이 구문은 200으로 money를 수정
UPDATE typetest SET money = 200 WHERE name = '정재우';
-- 아래구문은 200을 누적
UPDATE typetest SET money = money + 200 WHERE name = '정재우';
SELECT name, money FROM typetest;

/*
 *  DDL : TABLE 정보를 변경할 때 -> ALTER
 * 		  제약조건 중 defoult를 사용
 * ex) hit number default 0으로 제약조건을 설정하면 별도로 hit에 정보를
 * 	  insert하지 않아도 0으로 초기화
 */

CREATE TABLE altertest(
	id VARCHAR2(100) PRIMARY KEY,
	hit number DEFAULT 0
)

INSERT INTO altertest(id) VALUES('java');

SELECT * FROM altertest; -- 별도로 hit값을 insert 하지 않아도 default 설정에 의해 초기값 0으로 할당.

-- DDL : ALTER를 이용해 테이블명을 변경해본다.
ALTER TABLE altertest rename to altertest2;

SELECT * FROM altertest2;

-- DDL : ALTER를 이용해 컬럼명을 변경해본다
ALTER TABLE altertest2 rename COLUMN hit to count;

/*
 * 테이블명 : PRODUCT
 * 컬럼명 : ID, NAME, MAKER -> VARCHAR2(100)			PRICE -> NUMBER
 * 제약조건 : ID는 PRIMARY KEY , 나머지는 NOT NULL
 */
-- DDL : CREATE

CREATE TABLE product(
	id VARCHAR2(100) PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL
)

INSERT INTO product(id, name, maker, price) VALUES('1', '카스', '오비', 2000);
INSERT INTO product(id, name, maker, price) VALUES('2', '테라', '진로', 1800);
INSERT INTO product(id, name, maker, price) VALUES('3', '맥스', '오비', 2400);

SELECT * FROM product;

-- 오라클 함수
-- 전체 상품수
SELECT COUNT(*) FROM product;

-- 상품 최저가
SELECT MIN(price) FROM product;
-- 상품 최고가
SELECT MAX(price) FROM product;
-- 정렬 : PRICE 오름차순 -> ORDER BY 컬럼명 ASC
SELECT id, name, maker, price FROM product ORDER BY price ASC;

-- 내림차순 정렬 ORDER BY 컬럼명 DESC
SELECT id, name, maker, price FROM product ORDER BY price DESC;

-- WHERE 조건절과 ORDER BY 정렬을 함께 한다.
-- MAKER 가 오비인 상품의 NAME과 PRICE를 조회하되 PRICE내림차순 (높은가격 -> 낮은가격)
SELECT name, price FROM product WHERE maker = '오비' ORDER BY price DESC;

-- PRICE가 2000이상, 2500이하인 상품의 NAME, PRICE만 모두 출력( 가격 오름차순 )
SELECT name, price FROM product WHERE price >= 2000 AND price <= 2500 ORDER BY price ASC; 
SELECT name, price FROM product WHERE price BETWEEN 2000 AND 2500 ORDER BY price ASC;

-- PRIMARY KEY로 검색해서 0 또는 1값을 조회할 수 있다.
SELECT COUNT(*) FROM product WHERE id = '1'; -- 있으면 1
SELECT COUNT(*) FROM product WHERE id = 'ab'; -- 없으면 0

SELECT * FROM product;

-- maker의 종류만 조회 - 중복제외
SELECT DISTINCT maker FROM product;

-- 컬럼 별칭 : maker as 제조사
SELECT id, name, maker AS 제조사 FROM product;

/*
 * 상품 중 maker가 오비인 상품들의 name, maker, price를 조회하되
 * price를 200씩 할인해서 조회하고 정렬은 가격 내림차순으로 조회한다.(price는 별칭을 부여하여
 * 컬럼명 대신 '할인가'로 표현한다.)
 */


SELECT name, maker, price, price - 200 AS 할인가 FROM product WHERE maker = '오비'  ORDER BY price DESC;

/*
 * 월요일에 공부할 내용
 *  Oracle SEQUENCE - 자동으로 유일값 발급
 */
