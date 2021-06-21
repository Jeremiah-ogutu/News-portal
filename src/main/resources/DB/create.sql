SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS users (
 id int PRIMARY KEY auto_increment,
 UserName VARCHAR,
 phone_no VARCHAR,
postion VARCHAR,
);

CREATE TABLE IF NOT EXISTS news (
 id int PRIMARY KEY auto_increment,
 title VARCHAR,
 content VARCHAR,
 id int
);


CREATE TABLE IF NOT EXISTS departments (
 id int PRIMARY KEY auto_increment,
 department_name VARCHAR,
 description VARCHAR,
 no_of_employees INTEGER
);

/
