create database atividade10;
use atividade10;

create table livro(
	idLivro int primary key,
    nome varchar(30) not null,
    autor varchar(30) not null,
    anoPubli date,
    tipo varchar(30) not null
);

create table categoria(
	idCategoria int primary key,
    nome varchar(30) not null
);

create table pertence(
	id int primary key auto_increment,
    idLivro int not null,
    foreign key (idLivro) references livro(idLivro),
	idCategoria int not null,
    foreign key (idCategoria) references categoria(idCategoria)
);