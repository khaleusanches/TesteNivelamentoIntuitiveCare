-- Fiz dois selects para buscar as 10 operadoras com maiores despesas no ultimo trimestre.
-- Ultimo trimestre a partir da data atual:
select Registro_ANS, cnpj, Nome_Fantasia, ssum(VL_SALDO_INICIAL) as Saldo_Inicial, sum(VL_SALDO_FINAL) as Saldo_Final, (sum(VL_SALDO_FINAL) - sum(VL_SALDO_INICIAL)) as despesas from operadorasativas
join demonstracaocontabeis on operadorasativas.Registro_ANS = demonstracaocontabeis.REG_ANS
where descricao = 'EVENTOS/ SINISTROS CONHECIDOS OU AVISADOS  DE ASSISTÊNCIA A SAÚDE MEDICO HOSPITALAR ' and
DATA >= CURDATE() - INTERVAL 3 MONTH
group by Registro_ANS
order by despesas desc
limit 10;

-- Ultimo trimestre que se tem registro:
select Registro_ANS, cnpj, Nome_Fantasia, sum(VL_SALDO_INICIAL) as Saldo_Inicial, sum(VL_SALDO_FINAL) as Saldo_Final, (sum(VL_SALDO_FINAL) - sum(VL_SALDO_INICIAL)) as despesas from operadorasativas
left join demonstracaocontabeis on operadorasativas.Registro_ANS = demonstracaocontabeis.REG_ANS
where descricao = 'EVENTOS/ SINISTROS CONHECIDOS OU AVISADOS  DE ASSISTÊNCIA A SAÚDE MEDICO HOSPITALAR ' and
DATA >= '2025-01-01' - INTERVAL 3 MONTH
group by Registro_ANS
order by despesas desc
limit 10;

-- Fiz dois selects para buscar as 10 operadoras com maiores despesas no ultimo ano.
-- Ultimo trimestre a partir da data atual:
select Registro_ANS, cnpj, Nome_Fantasia, sum(VL_SALDO_INICIAL) as Saldo_Inicial, sum(VL_SALDO_FINAL) as Saldo_Final, (sum(VL_SALDO_FINAL) - sum(VL_SALDO_INICIAL)) as despesas from operadorasativas
join demonstracaocontabeis on operadorasativas.Registro_ANS = demonstracaocontabeis.REG_ANS
where descricao = 'EVENTOS/ SINISTROS CONHECIDOS OU AVISADOS  DE ASSISTÊNCIA A SAÚDE MEDICO HOSPITALAR ' and
DATA >= CURDATE() - INTERVAL 1 year
group by Registro_ANS
order by despesas desc
limit 10;

-- Ultimo trimestre que se tem registro:
select Registro_ANS, cnpj, Nome_Fantasia, sum(VL_SALDO_INICIAL) as Saldo_Inicial, sum(VL_SALDO_FINAL) as Saldo_Final, (sum(VL_SALDO_FINAL) - sum(VL_SALDO_INICIAL)) as despesas from operadorasativas
left join demonstracaocontabeis on operadorasativas.Registro_ANS = demonstracaocontabeis.REG_ANS
where descricao = 'EVENTOS/ SINISTROS CONHECIDOS OU AVISADOS  DE ASSISTÊNCIA A SAÚDE MEDICO HOSPITALAR ' and
DATA >= '2025-01-01' - INTERVAL 1 year
group by Registro_ANS
order by despesas desc
limit 10;