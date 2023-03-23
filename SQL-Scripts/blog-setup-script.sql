-- Creates the user which we will link to the REST Application -- 

CREATE USER 'StudentAdmin'@'localhost' IDENTIFIED BY 'password';
FLUSH PRIVILEGES;
GRANT ALL PRIVILEGES ON *.* TO 'StudentAdmin'@'localhost' WITH GRANT OPTION;	
FLUSH PRIVILEGES;

-- Schema -- 

DROP SCHEMA IF EXISTS `students`;
CREATE SCHEMA `students`;
use `students`;
SET FOREIGN_KEY_CHECKS = 0;

-- Tables -- 

DROP TABLE IF EXISTS degree;

CREATE TABLE degree (
	degree_id int(11) NOT NULL AUTO_INCREMENT,
    degree_name varchar(50) DEFAULT NULL,
    PRIMARY KEY (degree_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
	student_id int(11) NOT NULL AUTO_INCREMENT,
    first_name varchar(32) DEFAULT NULL,
    last_name varchar(32) DEFAULT NULL,
    email varchar(88) DEFAULT NULL,
    gender varchar(50) DEFAULT NULL,
	gpa double(2,1) DEFAULT NULL,
	degree_id int(11) DEFAULT NULL,
	PRIMARY KEY (student_id),
	KEY FK_STUDENT_DEGREE (degree_id),
	CONSTRAINT FK_STUDENT_DEGREE_ID FOREIGN KEY (degree_id) 
	REFERENCES degree (degree_id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


-- Dummy Data --

-- Degree Table -- 

insert into degree (degree_name) VALUES ('Computer Science');
insert into degree (degree_name) VALUES ('Mathematics');
insert into degree (degree_name) VALUES ('Psychology');
insert into degree (degree_name) VALUES ('Sociology');
insert into degree (degree_name) VALUES ('Engineering');
insert into degree (degree_name) VALUES ('Law');
insert into degree (degree_name) VALUES ('History');
insert into degree (degree_name) VALUES ('Art');
insert into degree (degree_name) VALUES ('Accounting');

-- Student Table -- 

insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Darlene', 'Barth', 'dbarth0@usa.gov', 'Female', 1.9, 7);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Babita', 'Belly', 'bbelly1@delicious.com', 'Female', 1.0, 5);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Luciana', 'Kennsley', 'lkennsley2@posterous.com', 'Female', 2.3, 5);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Loraine', 'Florez', 'lflorez3@posterous.com', 'Female', 2.3, 4);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Alejoa', 'Davidman', 'adavidman4@ucoz.ru', 'Male', 3.4, 6);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Clem', 'Tummasutti', 'ctummasutti5@addtoany.com', 'Female', 3.8, 1);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Leoine', 'Biever', 'lbiever6@wisc.edu', 'Female', 2.0, 2);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Irena', 'Hebson', 'ihebson7@umn.edu', 'Female', 1.4, 4);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Elvis', 'Crossby', 'ecrossby8@jiathis.com', 'Male', 1.9, 8);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Enrica', 'Winsor', 'ewinsor9@ehow.com', 'Female', 2.8, 4);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Arther', 'Lambot', 'alambota@yahoo.com', 'Male', 1.0, 3);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Keelia', 'Bolletti', 'kbollettib@fc2.com', 'Genderfluid', 2.5, 6);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Olivero', 'Crutcher', 'ocrutcherc@disqus.com', 'Male', 3.0, 7);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Onfroi', 'Reubens', 'oreubensd@state.tx.us', 'Male', 3.3, 1);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Angelica', 'Greber', 'agrebere@cmu.edu', 'Female', 2.1, 5);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Georgie', 'Beecroft', 'gbeecroftf@webeden.co.uk', 'Male', 3.3, 1);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Adara', 'Suermeier', 'asuermeierg@mediafire.com', 'Female', 1.3, 5);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Shamus', 'McDermott-Row', 'smcdermottrowh@google.ru', 'Male', 3.5, 3);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Korey', 'Henrionot', 'khenrionoti@yale.edu', 'Male', 3.4, 5);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Noak', 'Dabner', 'ndabnerj@omniture.com', 'Male', 3.7, 6);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Teodoor', 'Patesel', 'tpateselk@homestead.com', 'Male', 3.7, 9);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Miguela', 'Howitt', 'mhowittl@furl.net', 'Female', 2.1, 7);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Rogers', 'Simkovich', 'rsimkovichm@virginia.edu', 'Male', 2.5, 6);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Allys', 'Esterbrook', 'aesterbrookn@baidu.com', 'Female', 3.7, 9);
insert into student (first_name, last_name, email, gender, gpa, degree_id) values ('Jed', 'Iacoviello', 'jiacovielloo@usa.gov', 'Male', 2.3, 2);


































