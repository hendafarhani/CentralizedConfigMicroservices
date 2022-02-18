CREATE TABLE customer
(id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
 first_name VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 email VARCHAR(50) NOT NULL UNIQUE
 );


 INSERT INTO customer (first_name, last_name, email) VALUES ("A", "BCD", "a.bcd@gmail.com");