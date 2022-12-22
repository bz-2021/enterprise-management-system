<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5295905 (修复路由)
import Vue from 'vue';
import VueRouter from 'vue-router';
Vue.use(VueRouter);
import store from '@/store'
import Login from '@/pages/Login'
import Home from '@/pages/Home'
import Hire from '@/pages/Hire'
import SystemActivity from '@/pages/system/systemactivity'
import SystemAnnounce from '@/pages/system/systemannouce'
import SystemComplain from '@/pages/system/systemcomplain'
import SystemIndex from '@/pages/system/systemindex'
import SystemUser from '@/pages/system/systemuser'
import SystemDepart from '@/pages/system/systemdepart'
import SystemAttendance from '@/pages/system/systemattend'
let router = new VueRouter({
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
        {
            path: "/systemdepart",
            component: SystemDepart,
            meta: { show: true }

        },
        {
            path: "/systemattendance",
            component: SystemAttendance,
            meta: { show: true }

        },
        //重定向
        // {
        //     path: '*',
        //     redirect: '/home'
        // }
    ]
})
router.beforeEach((to, from, next) => {
    let token = store.state.token
    if (token) {
        //已经登录
        next()
    } else {
        console.log(to.path);
        if (to.path == "/hire" || to.path == "/login" || to.path == "home")
            next()
    }
})
<<<<<<< HEAD
export default router
=======
export default router
=======
import Vue from "vue";
import VueRouter from "vue-router";
Vue.use(VueRouter);
import Login from "@/pages/Login/index2.vue";
import Hire from "@/pages/Hire";
import SystemActivity from "@/pages/system/systemactivity";
import SystemAnnounce from "@/pages/system/systemannouce";
import SystemComplain from "@/pages/system/systemcomplain";
import SystemIndex from "@/pages/system/systemindex";
import SystemUser from "@/pages/system/systemuser";
import SystemDepart from "@/pages/system/systemdepart";
import SystemAttendance from "@/pages/system/systemattend";
let router = new VueRouter({
	mode: "history",
	routes: [
		{
			path: "/",
			redirect: "/hire",
			meta: { show: false },
		},
		{
			path: "/login",
			component: Login,
			meta: { show: false },
		},
		{
			path: "/home",
			component: Hire,
			meta: { show: false },
		},
		{
			path: "/hire",
			component: Hire,
			meta: { show: false },
		},
		{
			path: "/systemacitvity",
			component: SystemActivity,
			meta: { show: true },
		},
		{
			path: "/systemannounce",
			component: SystemAnnounce,
			meta: { show: true },
		},
		{
			path: "/systemcomplain",
			component: SystemComplain,
			meta: { show: true },
		},
		{
			path: "/systemindex",
			component: SystemIndex,
			meta: { show: true },
		},
		{
			path: "/systemuser",
			component: SystemUser,
			meta: { show: true },
		},
		{
			path: "/systemdepart",
			component: SystemDepart,
			meta: { show: true },
		},
		{
			path: "/systemattendance",
			component: SystemAttendance,
			meta: { show: true },
		},
		//重定向
		// {
		//     path: '*',
		//     redirect: '/home'
		// }
	],
});
router.beforeEach((to, from, next) => {
	let token = sessionStorage.getItem("TOKEN");
	if (token) {
		//已经登录
		console.log("success");
		next();
	} else {
		console.log(to.path);
		console.log("failed");
		if (to.path == "/hire" || to.path == "/login" || to.path == "home")
			next();
		if (to.meta.show) next({ path: "/login" });
	}
});
export default router;
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
