/*
 * 오라클 시퀀스(sequence) : 순차적으로 증가, 유일한 값을 생성하기 위한 객체
 * 주로 primary key(unique + not null)를 생성하기 위해 사용 테이블과는 독립적 구조
 * CREATE SEQUENCE 시퀀스명
 * [ START WITH 시작번호 ]
 * [ INCREMENT BY 증가값 ]
 * [ MAXVALUE 최대값 ]
 * [ MINVALUE 최소값 ]
 * [ CYCLE or NOCYCLE ]
 * [ NOCACHE ]
 */
-- 시퀀스 생성
CREATE SEQUENCE test_seq;
-- 시퀀스 삭제
DROP SEQUENCE test_seq;
/*
 *  Oracle dual table : 오라클에서 제공하는 기본 테이블
 * 컬럼 하나만 존재, 주로 시컨스 또는 날짜함수, 산술연산에 사용한다.
 * sys Adimin 계정에서 관리하고 수정 및 삭제 등 조작은 불가능하다.
 */
SELECT * FROM dual;
-- dual table을 이용해 생성한 시퀀스 값을 확인한다.
-- 시퀀스 : 시퀀스명.nextval -> 다음 시퀀스값을 생성한다.
SELECT test_seq.nextval FROM dual;
-- 시퀀스 : 현재값 시퀀스명.currval -> 하나의 커넥션에서 nextval 후 currval만 가능하다
-- application에서 테스트 : 다수의 사용자들에 의해 공유되는 시퀀스이므로 하나의 커넥션에서만
-- 현재의 시퀀스값을 볼 수 있다.
--SELECT test_seq.currval FROM dual;

-- CAR table를 생성해서 시퀀스 적용해보기
CREATE TABLE car(
car_no number primary key, -- 시퀀스로 자동발급
model VARCHAR2(100) NOT NULL
)
-- car_seq 이름으로 시퀀스 생성
CREATE SEQUENCE car_seq;

-- INSERT
INSERT INTO car(car_no,model) VALUES(car_seq.nextval, '소나타');
INSERT INTO car(car_no,model) VALUES(car_seq.nextval, '말리부');

SELECT*FROM car;

-- GUESTBOOK Table 생성
CREATE TABLE guestbook(
guestbook_no number primary key,
title varchar2(100) not null,
content varchar2(1000) not null
)

-- guestbook_seq 시퀀스 생성
CREATE SEQUENCE guestbook_seq;

-- INSERT 구문 guestbook_no는 시퀀스로 자동발급, title : 즐거운 8월, content : 열공
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '즐거운 8월', '열공');

DELETE FROM guestbook WHERE guestbook_no = '1';

SELECT * FROM guestbook;

-- 시퀀스 테스트2
-- 연습용 테이블, 시퀀스 생성
CREATE TABLE movie(
	id number PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	attendance number DEFAULT 0
)

-- 캐쉬 기능을 사용하지 않겠다는 옵션을 할당한다 -> 비정상종료시에도 번호가 이어지도록한다.
CREATE SEQUENCE movie_seq NOCACHE;

INSERT INTO movie(id, title) VALUES(movie_seq.nextval, '8월의 크리스마스');

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














