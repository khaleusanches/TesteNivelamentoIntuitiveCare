load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Relatorio_cadop.csv'
into table operadorasativas
fields terminated by ';'
OPTIONALLY ENCLOSED BY '"' 
ignore 1 rows;
