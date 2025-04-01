<template>
<div class="modal fade" :id="this.id" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-6 w-100" id="staticBackdropLabel">{{ dados.Nome_Fantasia }}</h1>
        <p class="modal-title small w-100 text-end">{{ dados.Registro_ANS }}</p>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <p>CNPJ: {{ dados.CNPJ }}</p>
        <p>Razão Social: {{ dados.Razao_Social }}</p>
        <p>Modalidade: {{ dados.Modalidade }}</p>
        <p>Endereço: {{ dados.Logradouro }}, {{ dados.Numero }}, {{ dados.Bairro }} - {{ dados.Cidade }}, {{ dados.UF }}</p>
        <p>CEP: {{ dados.CEP }}, Complemento: {{ dados.Complemento }}</p>
        <p>Telefone: {{ dados.DDD }} {{ dados.Telefone }}</p>
        <p>Representante: {{ dados.Representante }}</p>
        <p>Email: {{ dados.Endereco_eletronico }}</p>
        <p>Cargo Representante: {{ dados.Cargo_Representante }}</p>
        <p>Região de Comercialização: {{ dados.Regiao_de_Comercializacao }}</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn_close" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
</template>

<script>
export default {
    name: 'ModalComp',
    props: {
      teste: String,
      id: String,
      dados: Object
    },
}
</script>

<style scoped>
.modal-header p{
    margin-right: 12px;
}
.modal-body p{
    text-align: left;
}
.btn_close{
    background-color: rgba(200, 164, 244, 0.39);
}
.btn_close:hover{
    background-color: rgb(200, 164, 244);
}
</style>