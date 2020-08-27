CREATE TABLE web_member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	address VARCHAR2(100) NOT NULL
)
INSERT INTO web_member(id, password, name, address) VALUES('java', '1234', '아이유', '판교');
INSERT INTO web_member(id, password, name, address) VALUES('servlet', 'abcd', '조승우', '용인');

SELECT COUNT(*) FROM web_member;