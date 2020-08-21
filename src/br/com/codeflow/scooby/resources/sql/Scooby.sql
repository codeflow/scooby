CREATE DATABASE
    scooby
CHARACTER SET 
    utf8
COLLATE
    utf8_general_ci;
    
CREATE USER
    'scooby'@'localhost'
IDENTIFIED BY
    'scooby';
    
GRANT ALL ON
    scooby.*
TO
    'scooby'@'localhost';
    
CREATE TABLE
    address(
        id BIGINT NOT NULL AUTO_INCREMENT,
        street VARCHAR(500),
        neighbourhood VARCHAR(500),
        number BIGINT,
        PRIMARY KEY(id)
    )ENGINE=InnoDB;
    
DROP TABLE address;
    
CREATE TABLE
    contact(
        id BIGINT NOT NULL AUTO_INCREMENT,
        phone BIGINT,
        mail VARCHAR(500),
        PRIMARY KEY(id)
    )ENGINE=InnoDB;

DROP TABLE contact;
    
CREATE TABLE
    customer(
        id BIGINT NOT NULL AUTO_INCREMENT,
        id_address BIGINT NOT NULL,
        id_contact BIGINT NOT NULL,
        name VARCHAR(500) NOT NULL,
        PRIMARY KEY(id),
        CONSTRAINT FK_ID_ADDRESS FOREIGN KEY(id_address) REFERENCES address(id),
        CONSTRAINT FK_ID_CONTACT FOREIGN KEY(id_contact) REFERENCES contact(id)
        ON  UPDATE CASCADE
    )ENGINE=InnoDB;

CREATE UNIQUE INDEX IDX_NAME ON customer(name);
    
DROP TABLE customer;

SELECT * FROM customer;
SELECT * FROM address;
SELECT * FROM contact;