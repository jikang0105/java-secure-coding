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
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','�ѹ�',300);
commit	
	
select * from employee;	

insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','��ȹ',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'����','��ȹ',1000);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�缺��','��ȹ',700);

-- job �÷��� �������� �׷�ȭ job, �����, ��տ��� ��������
-- job �� ��տ����� 500�� �ʰ��ϴ� job���� ��ȸ�ϴ� ������ �׷� ��ȸ ������ �߰��Ѵ�.

SELECT job, COUNT(*) AS �����, ROUND(AVG(salary)) AS ��տ���
FROM employee GROUP BY job HAVING ROUND(AVG(salary)) > 500 ORDER BY ��տ��� DESC; 

-- job �׷캰 ���� ���� salary(��Ī highsal)�� job�� ��ȸ(highsal ��������)

SELECT job, MAX(salary) AS highsal FROM employee GROUP BY job ORDER BY highsal DESC;

-- job�� ������ ��ȸ�Ѵ�.
SELECT DISTINCT(job) FROM employee;

