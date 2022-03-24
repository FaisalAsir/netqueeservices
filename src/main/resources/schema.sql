drop table if exists countries CASCADE;

CREATE TABLE COUNTRIES (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR (225),
    PRIMARY KEY (id)
);

--INSERT INTO countries (name) VALUES ('USA');
--INSERT INTO countries (name) VALUES ('France');
--INSERT INTO countries (name) VALUES ( 'Brazil');
--INSERT INTO countries (name) VALUES ( 'Italy');
--INSERT INTO countries (name) VALUES ( 'Canada');