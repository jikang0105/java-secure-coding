CREATE TABLE account_inst(
	account_no number primary key,
	name varchar2(100) not null,
	password varchar2(100) not null,
	balance number not null
)
DROP TABLE account_inst;

CREATE sequence account_inst_seq;
DROP sequence account_inst_seq;

DELETE FROM account_inst;


SELECT * FROM account_inst;



