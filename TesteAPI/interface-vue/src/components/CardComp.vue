<template>
  <div class="card">
    <div class="header">
      <p class="alert">Nome: {{ dadoss.Nome_Fantasia }}</p>
    </div>

    <p class="message">Razao_Social: {{ dadoss.Razao_Social }}</p>
    <div class="d-flex teste">
      <p>Registro_ANS: {{ dadoss.Registro_ANS }}</p>
      <p>CNPJ: {{ dadoss.CNPJ }}</p>
    </div>
    <p>CEP: {{ dadoss.CEP }}</p>  
    <p class="message">Representante: {{ dadoss.Representante }}</p>
    <p class="message">Endereco_eletronico: {{ dadoss.Endereco_eletronico }}</p>
  </div>
</template>

<script>
export default {
    name: "CardComp",
    props: {
      dadoss: Object
    },
    data(){
      return{
        dados: {
              "Nome_fantasia": '',
              "Razao_Social": '',
              "Registro_ANS": '',
              "CNPJ": '',
              "Representante": '',
              "Endereco_eletronico": ''
            }
      }
    }
}
</script>


<style scoped>

.card {
  width: 320px;
  border-width: 1px;
  border-color: rgba(219, 234, 254, 1);
  border-radius: 1rem;
  background-color: rgba(255, 255, 255, 1);
  padding: 1rem;
  height: 455px;
}

.header {
  display: flex;
  align-items: center;
}

.alert {
  font-weight: 600;
  color: rgba(107, 114, 128, 1);
  border: 0;
}

.teste p{
  border: 1px solid rgb(218, 218, 218);
  margin-left: 4px;
  margin-right: 4px;
}

p{
  border: 1px solid rgb(218, 218, 218);
  padding: 4px;
  border-radius: 5px;
  color: rgba(107, 114, 128, 1);
}
</style>