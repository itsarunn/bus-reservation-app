CREATE DATABASE bus_reservation;
SHOW DATABASES;
USE bus_reservation;
create table bus(
	busno int primary key,
    ac boolean,
    capacity int
);
insert into bus values(101,1,2);
insert into bus values(102,1,48);
insert into bus values(103,0,48);

select * from bus;

create table booking(
	passengername varchar(30),
    busno int ,
    journey_date date
); 

select* from booking;

