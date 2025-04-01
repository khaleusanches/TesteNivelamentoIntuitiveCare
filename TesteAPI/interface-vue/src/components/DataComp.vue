<template>
    <div class="box">
        <div class="boxinbox" v-for="(operadora, index) in operadoras" :key="index">
            <ModalComp :dados="operadora" :id="index"/>
            <CardComp :dados="operadora" data-bs-toggle="modal" :data-bs-target="'#'+index"/> 
        </div>
    </div>
</template>

<script>
import CardComp from '@/components/CardComp.vue'
import api from '@/services/api';
import ModalComp from './ModalComp.vue';
export default {
    name: "DataComp",
    components: {CardComp, ModalComp},
    props: {
      search: String
    },
    data(){
        return{
            operadoras:[]
        }
    },
    mounted(){
        this.fetchData()
    },
    methods: {
        fetchData(){
            api.get(this.search).then(response => {
                this.operadoras = response.data
                console.log(response.data)
            })
        }
    },
}
</script>

<style scoped>
.box{
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
    margin-top: 45px;
    margin-left: 12px;
    text-align: Left;
    font-size: 14px;
}

.boxinbox{
    margin-bottom: 15px;
    border-radius: 15px;
}
.boxinbox:hover{
    -webkit-box-shadow: -1px 4px 5px 4px rgba(200, 164, 244, 0.45);
    -moz-box-shadow: -1px 4px 5px 4px rgba(200, 164, 244,0.45);
    box-shadow: -1px 4px 5px 4px rgba(200, 164, 244,0.45);
}
</style>