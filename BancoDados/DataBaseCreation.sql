create database TesteBancoDados;
use TesteBancoDados;

create table OperadorasAtivas(
	Registro_ANS int primary key,
	CNPJ varchar(14),
	Razao_Social varchar(255),
	Nome_Fantasia varchar(255),
	Modalidade varchar(255),
	Logradouro varchar(255),
	Numero varchar(26),
	Complemento varchar(100),
	Bairro varchar(150),
	Cidade varchar(75),
	UF varchar(2),
	CEP varchar(8),
	DDD varchar(2),
	Telefone varchar(20),
	Fax varchar(26),
	Endereco_eletronico varchar(90),
	Representante varchar(90),
	Cargo_Representante varchar(55),
	Regiao_de_Comercializacao varchar(2),
	Data_Registro_ANS date
);
create table DemonstracaoContabeis(
    ID int primary key auto_increment,
	DATA date,
    REG_ANS int,
    CD_CONTA_CONTABIL int,
    DESCRICAO varchar(255),
    VL_SALDO_INICIAL decimal(18,2),
    VL_SALDO_FINAL decimal(18,2),
    foreign key (reg_ans) references OperadorasAtivas(Registro_ANS)
);
