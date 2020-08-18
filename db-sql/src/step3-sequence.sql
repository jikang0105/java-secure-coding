/*
 * ����Ŭ ������(sequence) : ���������� ����, ������ ���� �����ϱ� ���� ��ü
 * �ַ� primary key(unique + not null)�� �����ϱ� ���� ��� ���̺���� ������ ����
 * CREATE SEQUENCE ��������
 * [ START WITH ���۹�ȣ ]
 * [ INCREMENT BY ������ ]
 * [ MAXVALUE �ִ밪 ]
 * [ MINVALUE �ּҰ� ]
 * [ CYCLE or NOCYCLE ]
 * [ NOCACHE ]
 */
-- ������ ����
CREATE SEQUENCE test_seq;
-- ������ ����
DROP SEQUENCE test_seq;
/*
 *  Oracle dual table : ����Ŭ���� �����ϴ� �⺻ ���̺�
 * �÷� �ϳ��� ����, �ַ� ������ �Ǵ� ��¥�Լ�, ������꿡 ����Ѵ�.
 * sys Adimin �������� �����ϰ� ���� �� ���� �� ������ �Ұ����ϴ�.
 */
SELECT * FROM dual;
-- dual table�� �̿��� ������ ������ ���� Ȯ���Ѵ�.
-- ������ : ��������.nextval -> ���� ���������� �����Ѵ�.
SELECT test_seq.nextval FROM dual;
-- ������ : ���簪 ��������.currval -> �ϳ��� Ŀ�ؼǿ��� nextval �� currval�� �����ϴ�
-- application���� �׽�Ʈ : �ټ��� ����ڵ鿡 ���� �����Ǵ� �������̹Ƿ� �ϳ��� Ŀ�ؼǿ�����
-- ������ ���������� �� �� �ִ�.
--SELECT test_seq.currval FROM dual;

-- CAR table�� �����ؼ� ������ �����غ���
CREATE TABLE car(
car_no number primary key, -- �������� �ڵ��߱�
model VARCHAR2(100) NOT NULL
)
-- car_seq �̸����� ������ ����
CREATE SEQUENCE car_seq;

-- INSERT
INSERT INTO car(car_no,model) VALUES(car_seq.nextval, '�ҳ�Ÿ');
INSERT INTO car(car_no,model) VALUES(car_seq.nextval, '������');

SELECT*FROM car;

-- GUESTBOOK Table ����
CREATE TABLE guestbook(
guestbook_no number primary key,
title varchar2(100) not null,
content varchar2(1000) not null
)

-- guestbook_seq ������ ����
CREATE SEQUENCE guestbook_seq;

-- INSERT ���� guestbook_no�� �������� �ڵ��߱�, title : ��ſ� 8��, content : ����
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '��ſ� 8��', '����');

DELETE FROM guestbook WHERE guestbook_no = '1';

SELECT * FROM guestbook;

-- ������ �׽�Ʈ2
-- ������ ���̺�, ������ ����
CREATE TABLE movie(
	id number PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	attendance number DEFAULT 0
)

-- ĳ�� ����� ������� �ʰڴٴ� �ɼ��� �Ҵ��Ѵ� -> ����������ÿ��� ��ȣ�� �̾��������Ѵ�.
CREATE SEQUENCE movie_seq NOCACHE;

INSERT INTO movie(id, title) VALUES(movie_seq.nextval, '8���� ũ��������');

SELECT * FROM movie;

CREATE TABLE account(
	accountnum number PRIMARY KEY,
	username VARCHAR2(100) NOT NULL,
	userpass VarChar2(100) NOT NULL,
	blance number DEFAULT 0
)

CREATE SEQUENCE accountnum_seq NOCACHE;

SELECT * FROM account;

DELETE FROM account WHERE accountnum = '6';

DROP TABLE account;














