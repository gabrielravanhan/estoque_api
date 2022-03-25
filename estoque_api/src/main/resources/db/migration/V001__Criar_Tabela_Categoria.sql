CREATE TABLE categoria (
    id  BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nomecategoria   VARCHAR(200)
);

INSERT INTO categoria(nomecategoria)    VALUES ('CARNES');
INSERT INTO categoria(nomecategoria)    VALUES ('PEIXES');
INSERT INTO categoria(nomecategoria)    VALUES ('MERCEARIA');
INSERT INTO categoria(nomecategoria)    VALUES ('BEBIDAS');