##表结构是这个样子的
create table user.student
(
	id int auto_increment
		primary key,
	name char(30) charset ucs2 not null,
	salary bigint(10) null
)
charset=utf8;

