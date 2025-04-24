create database livraria;

use livraria;

-- drop database livraria;

create table livro(
	id int primary key auto_increment,
    titulo varchar(45),
    autores varchar(45),
    editora varchar(45),
    preco decimal(10,2)
);

create table impresso(
	id int primary key auto_increment,
    frete decimal(10,2),
    estoque int,
    fkLivro int,
    constraint livroImpresso foreign key (fkLivro) references livro (id)
);


create table venda(
	id int primary key auto_increment,
    numVendas int,
    numero int,
    cliente varchar(45),
    valor decimal(10,2)
);
create table eletronico(
	id int primary key auto_increment,
	tamanho int,
    fkLivro int,
    constraint eletronicos foreign key (fkLivro) references livro(id)
);

create table livrariaVirtual(
	id int primary key auto_increment,
	maxImpressoras int,
    maxEletronicos int,
    maxVendas int,
    fkImpressos int,
    fkEletronicos int,
    fkVendas int,
	numImpressos int,
	numEletronicos int,
	numVendas int
);

INSERT INTO livro (titulo, autores, editora, preco) VALUES 
('Dom Casmurro', 'Machado de Assis', 'Companhia das Letras', 34.90),
('1984', 'George Orwell', 'Editora Aleph', 45.00),
('O Hobbit', 'J.R.R. Tolkien', 'HarperCollins', 59.99);


INSERT INTO impresso (frete, estoque, fkLivro) VALUES 
(10.00, 50, 1), 
(12.50, 30, 2), 
(15.00, 20, 3);


INSERT INTO venda (numVendas, numero, cliente, valor) VALUES 
(1, 1001, 'Carlos Silva', 79.90),
(2, 1002, 'Ana Paula', 45.00),
(3, 1003, 'Mariana Costa', 59.99);


INSERT INTO eletronico (tamanho, fkLivro) VALUES 
(5, 1),
(10, 2 ),
(8, 3);

INSERT INTO livrariaVirtual (maxImpressoras, maxEletronicos, maxVendas,fkImpressos, fkEletronicos, fkVendas,numImpressos, numEletronicos, numVendas) VALUES 
(100, 200, 300, 1, 1, 1, 3, 3, 3),
(150, 100, 250, 2, 2, 2, 2, 2, 2),
(200, 150, 100, 3, 3, 3, 1, 1, 1);


select * from impresso where fkLivro = 1;
ALTER TABLE livro ADD COLUMN DTYPE VARCHAR(255) DEFAULT 'Livro';
desc livro;

select * from livro;
select * from eletronico;
select * from impresso;

