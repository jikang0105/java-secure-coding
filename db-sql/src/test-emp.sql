-------------------------------------------------
-- employee 사원 테이블 
create table employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence employee_seq;	
	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'강상훈','개발',700);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'아이유','총무',300);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'신성호','개발',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'장기하','총무',400);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'김수민','개발',500);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'정재우','개발',900);	
commit	
	
select * from employee;	
	
-- 개발 job 인 사원들 중 가장 높은 sal을 받는 사원정보는?
select empno,name,job,salary from employee
where salary=(select max(salary) from employee where job='개발')
	