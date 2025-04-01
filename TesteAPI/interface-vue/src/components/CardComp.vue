<template>
  <div class="card" data-bs-toggle="modal">
    <div class="header">
      <p class="alert">Nome: {{ dados.Nome_Fantasia || 'Nome Fantasia não disponível' }}</p>
    </div>

    <p class="message">Razao_Social: {{ dados.Razao_Social }}</p>
    <div class="d-flex teste">
      <p>Registro_ANS: {{ dados.Registro_ANS }}</p>
      <p>CNPJ: {{ dados.CNPJ }}</p>
    </div>
    <p>CEP: {{ dados.CEP }}</p>  
    <p class="message">Representante: {{ dados.Representante }}</p>
    <p class="message">Endereco_eletronico: {{ dados.Endereco_eletronico }}</p>
  </div>
</template>

<script>
export default {
    name: "CardComp",
    props: {
      dados: Object
    },
}
</script>


<style scoped>

.card {
  width: 320px;
  border-width: 1px;
  border-color: rgba(200, 164, 244, 0.836);
  border-radius: 1rem;
  background-color: rgb(249, 249, 250);
  padding: 1rem;
  height: 455px;
}

.header {
  display: flex;
  align-items: center;
}

.alert {
  font-weight: 600;
  color: rgb(153, 124, 189);
  border: 0;
}

.teste p{
  border: 1px solid rgba(128, 92, 172, 0.445);
  margin-left: 4px;
  margin-right: 4px;
}

p{
  border: 1px solid rgba(128, 92, 172, 0.404);
  padding: 4px;
  border-radius: 5px;
  color: rgba(107, 114, 128, 1);
}
</style>