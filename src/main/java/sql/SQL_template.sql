-- Database: TrabLabSoftDB
-- DROP DATABASE IF EXISTS "TrabLabSoftDB";
CREATE DATABASE "db_trabalho_final_labsoft"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

-- Table: public.funcionario
-- DROP TABLE IF EXISTS public.funcionario;
CREATE TABLE IF NOT EXISTS public.funcionario
(
    id serial not null primary key,
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    endereco character varying(50) COLLATE pg_catalog."default" NOT NULL,
    telefone character varying(20) COLLATE pg_catalog."default" NOT NULL,
    salario float(2) not null,
    senha varchar(50) not null
);

-- Table: public.produto
-- DROP TABLE IF EXISTS public.produto;
CREATE TABLE IF NOT EXISTS public.produto
(
    id serial not null primary key,
    nome character varying(30) COLLATE pg_catalog."default" NOT NULL,
    tipo character varying(30) COLLATE pg_catalog."default" NOT NULL,
    preco real NOT NULL,
    qtd_estoque integer NOT NULL DEFAULT 0,
    data_fabricacao character varying(15) COLLATE pg_catalog."default" NOT NULL
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.produto
    OWNER to postgres;

-- Table: public.gerente
-- DROP TABLE IF EXISTS public.gerente;
CREATE TABLE IF NOT EXISTS public.gerente
(
    id serial not null primary key,
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    endereco character varying(50) COLLATE pg_catalog."default" NOT NULL,
    telefone character varying(20) COLLATE pg_catalog."default" NOT NULL,
    salario float(2) not null,
    adicional_salario float(2) not null,
    senha varchar(50) not null
);

insert into gerente (id, nome, endereco, telefone, salario, adicional_salario, senha) values (102030, 'Root', 'Ocara/CE', '085991695826', 1000, 1000, 'root_admin');