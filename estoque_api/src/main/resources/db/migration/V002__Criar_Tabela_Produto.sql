CREATE TABLE produto (
    id  BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nomeproduto   VARCHAR(200),
    id_categoria BIGINT
);

ALTER TABLE produto ADD CONSTRAINT FK_produto_categoria FOREIGN KEY (id_categoria) REFERENCES categoria(id);

INSERT INTO produto(nomeproduto, id_categoria) VALUES ('Coca Cola 2L', 4);
INSERT INTO produto(nomeproduto, id_categoria) VALUES ('Filé Mignon', 1);
INSERT INTO produto(nomeproduto, id_categoria) VALUES ('Filé de Tilápia', 2);
INSERT INTO produto(nomeproduto, id_categoria) VALUES ('Leite Integral Longa Vida UHT', 3);