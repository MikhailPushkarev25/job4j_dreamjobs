CREATE TABLE post (
   id SERIAL PRIMARY KEY,
   name TEXT
);

CREATE TABLE candidate (
   id SERIAL PRIMARY KEY,
   name TEXT,
   city_id INT
);

CREATE TABLE users (
   id SERIAL PRIMARY KEY,
   name TEXT,
   email TEXT,
   password TEXT
);

CREATE TABLE city (
   id SERIAL PRIMARY KEY,
   name TEXT
);

insert into city(id, name) values (1, 'Moscow');
insert into city(id, name) values (2, 'Spb');
