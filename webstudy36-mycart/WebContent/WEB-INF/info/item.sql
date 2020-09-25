CREATE TABLE item(
	item_no NUMBER PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL,
	detail VARCHAR2(2000) NOT NULL
)

SELECT * FROM item;

CREATE SEQUENCE item_seq nocache;

DROP SEQUENCE item_seq;

INSERT INTO item(item_no, name, maker, price, detail) VALUES(item_seq.nextval, '아이폰7', '애플', 1000, '스티브잡스가 만들었습니다.');
INSERT INTO item(item_no, name, maker, price, detail) VALUES(item_seq.nextval, '갤럭시9', '삼성', 1500, '누가 만들었나요?');
INSERT INTO item(item_no, name, maker, price, detail) VALUES(item_seq.nextval, 'G8', 'LG', 2000, '잘 좀 해봐');

