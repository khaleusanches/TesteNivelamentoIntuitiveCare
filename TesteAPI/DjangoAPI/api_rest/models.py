from django.db import models

class OperadoraAtiva(models.Model):
    Registro_ANS = models.IntegerField(primary_key=True)
    CNPJ = models.CharField(max_length=14)
    Razao_Social = models.CharField(max_length=255)
    Nome_Fantasia = models.CharField(max_length=255)
    Modalidade = models.CharField(max_length=255)
    Logradouro = models.CharField(max_length=255)
    Numero = models.CharField(max_length=26)
    Complemento = models.CharField(max_length=100)
    Bairro = models.CharField(max_length=150)
    Cidade = models.CharField(max_length=75)
    UF = models.CharField(max_length=2)
    CEP = models.CharField(max_length=8)
    DDD = models.CharField(max_length=2)
    Telefone = models.CharField(max_length=20)
    Fax = models.CharField(max_length=26)
    Endereco_eletronico = models.CharField(max_length=90)
    Representante = models.CharField(max_length=90)
    Cargo_Representante = models.CharField(max_length=55)
    Regiao_de_Comercializacao = models.CharField(max_length=2)
    Data_Registro_ANS = models.DateField

    def __init__(self, dados):
        (self.Registro_ANS, self.CNPJ, self.Razao_Social, self.Nome_Fantasia, self.Modalidade, 
         self.Logradouro, self.Numero, self.Complemento, self.Bairro, self.Cidade, self.UF, 
         self.CEP, self.DDD, self.Telefone, self.Fax, self.Endereco_eletronico, 
         self.Representante, self.Cargo_Representante, self.Regiao_de_Comercializacao, 
         self.Data_Registro_ANS) = dados


    def __str__(self):
        return f'Nome Fantasia: {self.Nome_Fantasia}'