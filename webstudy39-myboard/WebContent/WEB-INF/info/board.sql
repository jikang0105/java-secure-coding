DROP TABLE board_member;
DROP TABLE board;

DROP SEQUESNCE board_seq;
CREATE SEQUENCE board_seq;

CREATE TABLE board_member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL
)

CREATE TABLE board(
	no VARCHAR2(100) PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	content CLOB NOT NULL,
	count NUMBER DEFAULT 0,
	time_posted DATE NOT NULL,
	id VARCHAR2(100) NOT NULL,
	CONSTRAINT board_fk FOREIGN KEY(id) REFERENCES board_member(id)
)

INSERT INTO board_member(id, password, name) VALUES('first', 'first', '퍼스트')
INSERT INTO board_member(id, password, name) VALUES('secound', 'secound', '세컨드')

INSERT INTO board (no, title, content, time_posted, id) VALUES(board_seq.nextval, '제가 첫번째 입니다.', '첫번째 맞쥬?', SYSDATE , 'first');
INSERT INTO board (no, title, content, time_posted, id) VALUES(board_seq.nextval, '제가 두번째 입니다.', '두번째 맞쥬?', SYSDATE , 'secound');
INSERT INTO board (no, title, content, time_posted, id) VALUES(board_seq.nextval, '제가 네번째 입니다.', '사실 세번째 입니다.', SYSDATE , 'secound');
SELECT * FROM board_member;
SELECT * FROM board;