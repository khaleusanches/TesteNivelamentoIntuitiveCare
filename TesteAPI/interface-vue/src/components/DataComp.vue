<template>
    <div class="box">
        <div class="boxinbox" v-for="(operadora, index) in operadoras" :key="index">
            <CardComp :dadoss="operadora" />
        </div>
    </div>
</template>

<script>
import CardComp from '@/components/CardComp.vue'
import api from '@/services/api';
export default {
    name: "DataComp",
    components: {CardComp},
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
}
</style>