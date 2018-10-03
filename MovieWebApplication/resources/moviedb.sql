create table moviedetails(moviesId number primary key,
moviesName varchar2(50),
moviesrating number(2,2),
moviesGenre varchar2(50));

CREATE SEQUENCE movie_seq 
START WITH 1000
INCREMENT BY 1;
