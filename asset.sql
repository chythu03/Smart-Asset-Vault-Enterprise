CREATE DATABASE asset;

USE asset;
/*drop database asset;*/
CREATE TABLE actor (
	ID CHAR(3),
    act VARCHAR(20),
    PRIMARY KEY(act)
)engine=InnoDB default charset=latin1;

/*drop table actor;*/
CREATE TABLE USERN(
	UserID CHAR(5),
    act VARCHAR(20),
    name VARCHAR(100) not null,
    password VARCHAR(100) not null,
    PRIMARY KEY(UserID),
    FOREIGN KEY(act) REFERENCES actor(act)
)engine=InnoDB default charset=latin1;

/*drop table usern;*/

INSERT INTO actor VALUES('adm','Admin');
INSERT INTO actor VALUES('stf','Staff');
INSERT INTO actor VALUES('aud','Audit Manager');

INSERT INTO UserN VALUES('00001','Admin','Mona',aes_encrypt('hello123','passkey'));
INSERT INTO UserN VALUES('00002','Audit Manager','Venkata',aes_encrypt('hello456','passkey'));
INSERT INTO UserN VALUES('00003','Audit Manager','Antu',aes_encrypt('hello789','passkey'));
INSERT INTO UserN VALUES('00004','Staff','Aisu Roy',aes_encrypt('hello10','passkey'));
INSERT INTO UserN VALUES('00005','Staff','Priya',aes_encrypt('hello132','passkey'));
INSERT INTO UserN VALUES('00006','Staff','Shenglin',aes_encrypt('hello465','passkey'));
INSERT INTO UserN VALUES('00007','Staff','Uma bava',aes_encrypt('hello091','passkey'));

select * from usern;

SELECT userid,name,act, cast(aes_decrypt(password,'passkey') as char(100)) FROM UserN;
SELECT * FROM actor;

Select act from UserN where UserID='00001' and password=aes_encrypt('hello123','passkey');
/*-------------------------------------------------------------------------------------------------------------*/

CREATE TABLE stat(status varchar(15) primary key)engine=InnoDB default charset=latin1;
insert into stat values('damaged');
insert into stat values('working');
insert into stat values('In repare');

CREATE TABLE loc(location varchar(10) primary key)engine=InnoDB default charset=latin1;

insert into loc values('A');
insert into loc values('B');
insert into loc values('C');
insert into loc values('D');
insert into loc values('E');
insert into loc values('F');	
/*-------------------------------------------------------------------------------------------------------------*/
CREATE TABLE products(
	prod_id varchar(4) primary key,
    product varchar(20),
    category varchar(20)
    )engine=InnoDB default charset=latin1;

insert into products values('P100','sample_pro','sam');

select * from products;

CREATE TABLE assets(
	asset_id varchar(6) primary key,
	prod_id varchar(4),
    location varchar(10),
    room varchar(10),
    status varchar(15),
    UserId char(5),
    time datetime,
    foreign key(prod_id) references products(prod_id),
    foreign key(userid) references usern(userid),
    foreign key(status) references stat(status),
    foreign key(location) references loc(location)
    )engine=InnoDB default charset=latin1;
/*drop table assets;*/    

insert into assets values('A10000','P100','A','reception','working','00003','2022-02-12 23:52:48');
insert into assets values('A10001','P100','A','reception','working','00003','2022-02-12 23:52:48');
select * from assets;


select max(asset_id) from assets;
Select location,room from assets where asset_id='A10000';
/*delete from assets where asset_id='A10001';*/

CREATE TABLE status(
	TransID varchar(10) primary key,
	prod_id varchar(4),
    asset_id varchar(6),
    status varchar(15),
	UserId char(5),
    time datetime,
    foreign key(prod_id) references products(prod_id),
    foreign key(asset_id) references assets(asset_id),
    foreign key(userid) references usern(userid),
    foreign key(status) references stat(status)
    )engine=InnoDB default charset=latin1;
/*drop table status;*/
insert into status values('S100000000','P100','A10000','working','00003','2022-02-12 23:52:50');


update assets set status='damaged' where asset_id='A10004';
update assets set location='A' , room='12' where asset_id='A10002';

update assets set location='A'where asset_id='A10002';
update assets set room='12' where asset_id='A10002';

SELECT * FROM assets;
UPDATE assets set prod_id = 'P100' WHERE asset_id = 'A10001';

select * from status;
CREATE TABLE location(
	TransID varchar(10) primary key,
	prod_id varchar(4),
    asset_id varchar(6),
    tolocation varchar(10),
    toRoom varchar(10),
	UserId char(5),
    time datetime,
    foreign key(prod_id) references products(prod_id),
    foreign key(userid) references usern(userid),
    foreign key(asset_id) references assets(asset_id),
    foreign key(tolocation) references loc(location)
    )engine=InnoDB default charset=latin1;
/*drop table location;*/
insert into location values('L100000000','P100','A10000','A','samp','00003','2022-02-12 23:52:51');
select * from location;

Select prod_id,asset_id,tolocation,toroom,time from location where time>='2022-02-12 23:52:51' and time<='2022-02-12 23:53:52';
Show Grants;
SELECT user,authentication_string,plugin,host FROM mysql.user;
GRANT ALL ON *.* TO `root`@`localhost` WITH GRANT OPTION;
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
FLUSH PRIVILEGES;
SELECT user,authentication_string,plugin,host FROM mysql.user;
