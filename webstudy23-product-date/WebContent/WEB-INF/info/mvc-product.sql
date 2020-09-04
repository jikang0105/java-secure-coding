/*
 *  mvc-product.sql
 * 	DATE형을 다루어 웹어플리케이션을 구현해보는 예제
 */
CREATE TABLE mvc_product(
	id NUMBER PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL,
	regdate DATE NOT NULL
)

CREATE SEQUENCE mvc_product_seq NOCACHE;

SELECT * FROM mvc_product;

DELETE mvc_product;

SELECT id, name, TO_CHAR(regdate, 'YYYY/MM/DD') FROM mvc_product ORDER BY id DESC