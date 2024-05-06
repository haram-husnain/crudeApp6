mysql database:

create database crud_app;

mysql table:

create table job (jobcode int not null primary key auto_increment, jobclass varchar(20));
create table employee (empnum int not null primary key auto_increment, lname varchar(20), fname varchar(20), empcode int, jobcode int, foreign key(jobcode) references job(jobcode));
create table project (projnum int not null primary key auto_increment, projname varchar(20));
create table assignment (assignnum int not null primary key auto_increment, assigndate date, projnum int, empnum int, billph int, foreign key(projnum) references project(projnum), foreign key(empnum) references employee(empnum));

describe job; describe employee; describe project; describe assignment;

drop table job; drop table employee; drop table project; drop table assignment;
