create table moviedetails(moviesId number primary key,
moviesName varchar2(50),
moviesrating number(2,2),
moviesGenre varchar2(50));

create table movie_category(categoryId number primary key, categoryName varchar2(50));

insert into movie_category values(1,'Fiction');
insert into movie_category values(2,'Drama');
insert into movie_category values(3,'Satire');

CREATE SEQUENCE movie_seq 
START WITH 1000
INCREMENT BY 1;
