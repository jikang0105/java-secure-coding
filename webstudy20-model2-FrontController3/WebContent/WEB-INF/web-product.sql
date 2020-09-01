DROP TABLE web_product;

CREATE TABLE web_product(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null
)
DROP SEQUENCE web_product_seq;
CREATE SEQUENCE web_product_seq nocache;

INSERT INTO web_product VALUES(web_product_seq.nextval,'카스','두산',1500);
INSERT INTO web_product VALUES(web_product_seq.nextval,'테라','진로',1700);
INSERT INTO web_product VALUES(web_product_seq.nextval,'참이슬','진로',1300);

commit

SELECT * FROM web_product;

-- maker 종류만 조회한다 DISTINCT(컬럼명)
SELECT DISTINCT(maker) FROM web_product;

select id,name,price from web_product where maker='진로';









