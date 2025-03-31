<template>
    <header>
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid cont">
                <a class="navbar-brand" href="#">
                    <img src="../assets/logo.png" alt="Logo" class="mt-8">
                </a>
                <div class="navbar-nav">
                    <a class="nav-link activee" aria-current="page" href="#">Home</a>
                </div>
                <form class="d-flex">
                    <input class="form-control me-2 form-search" type="search" v-model="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-search" @click="pesquisar()">Search</button>
                </form>
            </div>
        </nav>
    </header>
</template>

<script>
export default {
    name: "HeaderComp",
    data(){
        return{
            search: ""
        }
    },
    methods: {
        pesquisar(){
            this.$router.push(this.search);
        }
    }
}
</script>

<style scoped>
header{
    padding: 12px;
}
img{
    width: 175px;
}
.activee{
    color: rgb(200, 164, 244);
    background-color: rgba(200, 164, 244, 0.39);
    padding-left: 24px;
    padding-right: 24px;
    width: 100px;
    border-radius: 8px;
}
a:hover{
    color: black;
    background-color: rgba(200, 164, 244);
    border-radius: 8px;
}
a{
    margin-right: 8px;
    margin-left: 8px;
}
.btn-search{
    border: 2px solid rgb(200, 164, 244);
    color: rgb(146, 67, 241);
}
.btn-search:hover{
    border: 2px solid rgb(200, 164, 244);
    background-color: rgb(200, 164, 244);
    color: black;
}
.form-search:focus{
    border: 2px solid rgb(200, 164, 244);
    background-color: rgb(200, 164, 244, 0.45);
}
header{
    -webkit-box-shadow: -1px 4px 5px 4px rgba(200, 164, 244, 0.45);
    -moz-box-shadow: -1px 4px 5px 4px rgba(200, 164, 244,0.45);
    box-shadow: -1px 4px 5px 4px rgba(200, 164, 244,0.45);
}
</style>