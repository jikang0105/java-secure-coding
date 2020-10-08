CREATE TABLE web_member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	addresss VARCHAR2(!00) NOT NULL
)
SELECT * FROM web_member;
INSERT INTO web_member values('ajax','1','조승우','판교');