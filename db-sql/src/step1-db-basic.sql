/*
	SQL 여러줄 주석
*/

-- SQL 한줄 주석

/*
 *  SQL ( Structured Query Language ) : 데이터를 정의하고, 조작, 제어하는 언어이다.
 * 
 *	DDL, DML, DCL
 *	1. DDL ( Data Definition Language : 데이터 정의어)
 * 		: CREATE 생성 , DROP 삭제, ALTER 수정
 *	2. DMA ( Data Manipulation Language : 데이터 조작어)
 * 		: INSERT 삽입, DELETE 삭제, UPDATE 수정, SELECT 검색
 *		CRUD ( CREATE, READ, UPDATE, DELETE )
 *				INSERT SELECT UPDATE DELETE *	
 *	3. DCL ( Data Control Language : 데이터 제어어 )
 * 		: COMMIT 실제 DB에 반영하다, ROLLBACK 작업을 취소하고 되돌리다.
 * 		  GRANT 권한부여, REVOKE 권한취소
 *	
 *	TABLE - 데이터를 저장하는 공간
 *	COLUMN - 속성( attribute )
 *	CONSTRAINT - 제약조건	ex) PRIMARY KEY - 중복허용 X , NOT NULL
 *	DataType - 문자열 varchar2(100), 숫자형 number
 */

-- MEMBER TABLE을 생성하고 정보를 저장한 후 조회해본다.
-- 실행 단축키 영역지정후 alt + x
CREATE TABLE member(
	id VARCHAR2(200) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	address VARCHAR2(100)
)
DROP TABLE member; -- 테이블 삭제 DDL
-- DML : INSERT 테이블 MEMBER에 정보를 추가
INSERT INTO member(id, password, name, address) VALUES('java', '1234', '아이유', '판교');
-- DML : SELECT 테이블 MEMBER에 있는 모든 정보를 조회
SELECT * FROM member;
INSERT INTO member(id, password, name, address) VALUES('king', 'ab', '서정우', '용인');
INSERT INTO member(id, password, name, address) VALUES('boy', 'girl', '김수민', '용인');
-- 제약조건 PRIMARY KEY 는 중복된 값을 허용하지 않으므로 아래 SQL을 ERROR가 난다.
INSERT INTO member(id, password, name, address) VALUES('boy', 'test', 'test', 'test');
-- 총 회원수를 조회해본다 COUNT(*)
SELECT COUNT(*) FROM member;

-- DML UPDATE 정보를 수정
UPDATE member SET address = '하와이' WHERE id = 'boy';
-- DML : SELECT, WHERE 절을 이용해 boy라는 아이디를 가진 회원정보만 조회
SELECT * FROM member WHERE id = 'boy';
-- DML : DELETE 정보를 삭제
DELETE FROM member WHERE address = '하와이';
-- 총 회원수 조회
SELECT COUNT(*) FROM member;
-- MEMBER TABLE의 정보를 조회시 회원 NAME, ADDRESS만 조회
SELECT name, address FROM member;
-- SELECT 시 WHERE 컬럼 = ... AND 컬럼 = ....
-- NAME이 아이유이고 ADDRESS 가 판교인 회원의 ID를 조회해본다.
SELECT id FROM member WHERE name = '아이유' AND address = '판교'
-- 제약조건 테스트 : PRIMARY KEY로 지정된 컬럼은 유일해야(UNIQUE)하며 NOT NULL
--					이어야 하므로 반드시 중복되지 않은 정보를 저장해야 한다.
INSERT INTO member(password, name, address) VALUES('A', '옹성우', '판교');
-- PASSWORD 컬럼에 NOT NULL 제약조건이 있으므로 반드시 INSERT 해야하므로 ERROR
INSERT INTO member(id, name, address) VALUES('A', '옹성우', '판교');
-- ADDRESS 는 별도의 제약조건이 없으므로 NULL이 허용된다.
INSERT INTO member(id, password, name) VALUES('A', 'a', '옹성우');
/*
 * 1. 회원 정보 두 명을 입력
 * ID			PASSWORD				NAME				ADDRESS
 * spring		aop						고슬링				뉴욕
 * mybatis		di						양성식				뉴욕
 * 
 * 2. INSERT 구문 실행 후 뉴욕에 사는 회원들의 이름만 출력(SELECT)
 * 3. ADDRESS가 뉴욕인 회원들의 ADDRESS를 워싱턴으로 수정(UPDATE)
 * 4. 전체 회원정보를 조회
 */
INSERT INTO member(id, password, name, address) VALUES('spring', 'aop', '고슬링', '뉴욕');
INSERT INTO member(id, password, name, address) VALUES('mybatis', 'di', '양성식', '뉴욕');
SELECT name FROM member WHERE address = '뉴욕';
UPDATE member SET address = '워싱턴' WHERE address = '뉴욕';
SELECT * FROM member;

COMMIT -- 실제 데이터베이스에 반영(작업 정보를 저장)
ROLLBACK -- 커밋 이전의 모든 작업을 취소하고 되돌리는 명령어

-- 기본 SQL 리뷰

INSERT INTO member(id, password, name, address) VALUES('ebs', 'abcd', '팽수', '양재');

-- member 테이블에서 name이 팽수이고 address가 양재인 회원의 id를 조회
SELECT id FROM member WHERE name = '팽수' AND address = '양재';

SELECT * FROM member;

-- member 테이블의 회원 주소 중 양재인 회원의 조소를 판교로 업데이트
UPDATE member SET address = '판교' WHERE address = '양재';

SELECT * FROM member;
