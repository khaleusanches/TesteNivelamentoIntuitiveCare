<template>
    <HeaderComp></HeaderComp>
    <DataComp :search="this.search"/>
</template>

<script>
import HeaderComp from '@/components/HeaderComp.vue';
import DataComp from '@/components/DataComp.vue'
export default {
    props: ['search'],
    name: "DataPage",
    components: {HeaderComp, DataComp}
}
</script>

<style>
</style>