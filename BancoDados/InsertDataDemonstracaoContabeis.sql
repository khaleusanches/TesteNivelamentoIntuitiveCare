SET foreign_key_checks = 0;

load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/1T2024.csv'
into table demonstracaocontabeis
fields terminated by ';'
OPTIONALLY ENCLOSED BY '"' 
ignore 1 rows
(DATA, REG_ANS, CD_CONTA_CONTABIL, DESCRICAO, @VL_SALDO_INICIAL, @VL_SALDO_FINAL)
set 
VL_SALDO_INICIAL = REPLACE(@VL_SALDO_INICIAL, ',', '.'),
VL_SALDO_FINAL = REPLACE(@VL_SALDO_FINAL, ',', '.');

load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/2T2024.csv'
into table demonstracaocontabeis
fields terminated by ';'
OPTIONALLY ENCLOSED BY '"' 
ignore 1 rows
(DATA, REG_ANS, CD_CONTA_CONTABIL, DESCRICAO, @VL_SALDO_INICIAL, @VL_SALDO_FINAL)
set 
VL_SALDO_INICIAL = REPLACE(@VL_SALDO_INICIAL, ',', '.'),
VL_SALDO_FINAL = REPLACE(@VL_SALDO_FINAL, ',', '.');

load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/3T2024.csv'
into table demonstracaocontabeis
fields terminated by ';'
OPTIONALLY ENCLOSED BY '"' 
ignore 1 rows
(DATA, REG_ANS, CD_CONTA_CONTABIL, DESCRICAO, @VL_SALDO_INICIAL, @VL_SALDO_FINAL)
set 
VL_SALDO_INICIAL = REPLACE(@VL_SALDO_INICIAL, ',', '.'),
VL_SALDO_FINAL = REPLACE(@VL_SALDO_FINAL, ',', '.');

load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/4T2024.csv'
into table demonstracaocontabeis
fields terminated by ';'
OPTIONALLY ENCLOSED BY '"' 
ignore 1 rows
(DATA, REG_ANS, CD_CONTA_CONTABIL, DESCRICAO, @VL_SALDO_INICIAL, @VL_SALDO_FINAL)
set 
VL_SALDO_INICIAL = REPLACE(@VL_SALDO_INICIAL, ',', '.'),
VL_SALDO_FINAL = REPLACE(@VL_SALDO_FINAL, ',', '.');

SET foreign_key_checks = 1;
