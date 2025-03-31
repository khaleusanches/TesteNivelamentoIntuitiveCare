import { createRouter, createWebHistory } from "vue-router";
import HomePage from "./Pages/HomePage.vue";
import DataPage from "./Pages/DataPage.vue";
const routes = [
    {
        path: "/",
        name: "Home",
        component: HomePage
    },
    {
        path: "/:search",
        name: "Dados",
        props: true,
        component: DataPage
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router;