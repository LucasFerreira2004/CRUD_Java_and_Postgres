/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Lenovo
 * Created: 13 de jun. de 2022
 */

-- Database: TrabLabSoftDB

-- DROP DATABASE IF EXISTS "TrabLabSoftDB";

CREATE DATABASE "TrabLabSoftDB"
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
    id integer NOT NULL DEFAULT nextval('funcionario_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    endereco character varying(50) COLLATE pg_catalog."default" NOT NULL,
    telefone character varying(20) COLLATE pg_catalog."default" NOT NULL,
    salario real NOT NULL,
    cargo character varying(20) COLLATE pg_catalog."default" NOT NULL DEFAULT 'funcioario'::character varying,
    adicinal_salario real NOT NULL DEFAULT '0'::real,
/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Lenovo
 * Created: 13 de jun. de 2022
 */

-- Database: TrabLabSoftDB

-- DROP DATABASE IF EXISTS "TrabLabSoftDB";

CREATE DATABASE "TrabLabSoftDB"
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
    id integer NOT NULL DEFAULT nextval('funcionario_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    endereco character varying(50) COLLATE pg_catalog."default" NOT NULL,
    telefone character varying(20) COLLATE pg_catalog."default" NOT NULL,
    salario real NOT NULL,
    CONSTRAINT funcionario_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.funcionario
    OWNER to postgres;

-- Table: public.produto

-- DROP TABLE IF EXISTS public.produto;

CREATE TABLE IF NOT EXISTS public.produto
(
    id integer NOT NULL DEFAULT nextval('produto_id_seq'::regclass),
    nome character varying(30) COLLATE pg_catalog."default" NOT NULL,
    tipo character varying(30) COLLATE pg_catalog."default" NOT NULL,
    preco real NOT NULL,
    qtd_estoque integer NOT NULL DEFAULT 0,
    data_fabricacao character varying(15) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT produto_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.produto
    OWNER to postgres;
