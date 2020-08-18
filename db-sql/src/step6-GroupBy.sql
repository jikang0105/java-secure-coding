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
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'정예울','총무',300);
commit	
	
select * from employee;	

insert into employee(empno,name,job,salary) values(employee_seq.nextval,'강지훈','기획',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'강희석','기획',1000);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'양성식','기획',700);

-- job 컬럼을 기준으로 그룹화 job, 사원수, 평균월급 내림차수
-- job 별 평균월급이 500을 초과하는 job들을 조회하는 것으로 그룹 조회 조건을 추가한다.

SELECT job, COUNT(*) AS 사원수, ROUND(AVG(salary)) AS 평균월급
FROM employee GROUP BY job HAVING ROUND(AVG(salary)) > 500 ORDER BY 평균월급 DESC; 

-- job 그룹별 가장 높은 salary(별칭 highsal)와 job을 조회(highsal 내림차순)

SELECT job, MAX(salary) AS highsal FROM employee GROUP BY job ORDER BY highsal DESC;

-- job의 종류만 조회한다.
SELECT DISTINCT(job) FROM employee;

