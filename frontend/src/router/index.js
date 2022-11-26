import Vue from 'vue';
import VueRouter from 'vue-router';
Vue.use(VueRouter);
import Login from '@/pages/Login'
import Home from '@/pages/Home'
import Hire from '@/pages/Hire'
import SystemActivity from '@/pages/system/systemactivity'
import SystemAnnounce from '@/pages/system/systemannouce'
import SystemComplain from '@/pages/system/systemcomplain'
import SystemIndex from '@/pages/system/systemindex'
import SystemUser from '@/pages/system/systemuser'
export default new VueRouter({
    routes: [
        {
            path: "/login",
            component: Login,
            meta: { show: false }
        },
        {
            path: "/home",
            component: Home,
            meta: { show: false }
        },
        {
            path: "/hire",
            component: Hire,
            meta: { show: false }
        },
        {
            path: "/systemacitvity",
            component: SystemActivity,
            meta: { show: true }
        },
        {
            path: "/systemannounce",
            component: SystemAnnounce,
            meta: { show: true }
        },
        {
            path: "/systemcomplain",
            component: SystemComplain,
            meta: { show: true }

        },
        {
            path: "/systemindex",
            component: SystemIndex,
            meta: { show: true }

        },
        {
            path: "/systemuser",
            component: SystemUser,
            meta: { show: true }

        },
        //重定向
        {
            path: '*',
            redirect: '/home'
        }
    ]
})