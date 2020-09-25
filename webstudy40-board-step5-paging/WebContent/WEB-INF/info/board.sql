drop table board_member;
drop table board_paging;

drop sequence board_seq;
create sequence board_seq;

create table board_member_paging(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null
)
create table board_paging(
	no number primary key,
	title varchar2(100) not null,
	content clob not null,
	hits number default 0,
	time_posted date not null,
	id varchar2(100) not null,
	constraint board_paging_fk foreign key(id) references board_member(id)
)
insert into board_member_paging(id,password,name)
values('java','a','아이유');
insert into board_member_paging(id,password,name)
values('spring','a','공유');


insert into board_paging(no,title,content,time_posted,id) 
values(board_paging_seq.nextval,'방가','ㅋㅋ',sysdate,'java');
insert into board_paging(no,title,content,time_posted,id) 
values(board_paging_seq.nextval,'안녕','치맥',sysdate,'spring');
insert into board_paging(no,title,content,time_posted,id) 
values(board_paging_seq.nextval,'즐연휴','추석 연휴 잘보내세요^^',sysdate,'java');

select * from board_member_paging;
select * from board_paging;

-- 리스트 
SELECT b.no,b.title,b.hits,to_char(time_posted,'YYYY.MM.DD') as time_posted,m.id,m.name 
FROM board_paging b , board_member_paging m
WHERE b.id=m.id
ORDER BY no DESC

-- 상세보기 
select b.title,to_char(b.time_posted,'YYYY.MM.DD  HH24:MI:SS') as time_posted,
b.content,b.hits,b.id,m.name
from board_paging b,board_member_paging m
where b.id=m.id and b.no=1


SELECT B.no,B.title,B.hits,B.time_posted,M.id,M.NAME
FROM(SELECT row_number() over(ORDER BY NO DESC) as rnum,no,title,hits,to_char(time_posted,'YYYY.MM.DD') as time_posted,id
FROM board_paging)B, BOARD_MEMBER_paging M WHERE B.id=M.id AND rnum BETWEEN 1 AND 5






















