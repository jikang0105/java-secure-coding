-------------------------------------------------
-- employee ��� ���̺� 
create table employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence employee_seq;	
	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','����',700);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','�ѹ�',300);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�ż�ȣ','����',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','�ѹ�',400);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','����',500);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','����',900);	
commit	
	
select * from employee;	
	
-- ���� job �� ����� �� ���� ���� sal�� �޴� ���������?
select empno,name,job,salary from employee
where salary=(select max(salary) from employee where job='����')
	