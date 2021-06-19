SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS users (
 id int PRIMARY KEY auto_increment,
 UserName VARCHAR,
 role VARCHAR,
 department_id INTEGER,
);

CREATE TABLE IF NOT EXISTS news (
 id int PRIMARY KEY auto_increment,
 title VARCHAR,
 content VARCHAR
);


CREATE TABLE IF NOT EXISTS departments (
 id int PRIMARY KEY auto_increment,
 department_name VARCHAR,
 description VARCHAR,
 no_of_employees INTEGER
);

CREATE TABLE IF NOT EXISTS departments_news(
 id int PRIMARY KEY auto_increment,
 department_id INTEGER,
 news_id INTEGER
);
