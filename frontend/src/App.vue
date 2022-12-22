<template>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5295905 (修复路由)
  <div>
    <Header v-show="$route.meta.show"></Header>
    <router-view v-if="isRouterAlive"></router-view>
    <Nav v-show="$route.meta.show"></Nav>
  </div>
</template>

<script>
import Header from '@/components/Header'
import Nav from '@/components/Nav'
export default {
  name: 'App',
  components: {
    Header,
    Nav
  },
  provide() {
    return {
      reload: this.reload
    }
  },
  data() {
    return {
      isRouterAlive: true
    }
  },
  methods: {
    reload() {
      this.isRouterAlive = false
      this.$nextTick(function () {
        this.isRouterAlive = true
      })
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
<<<<<<< HEAD
=======
=======
	<div class="fluid">
		<Header v-show="$route.meta.show"></Header>
		<div class="blankdiv" v-show="$route.meta.show"></div>
		<div class="row" v-show="$route.meta.show">
			<div class="col-md-1"></div>
			<div class="col-md-2">
				<Car><Nav v-show="$route.meta.show"></Nav></Car>
			</div>
			<div class="col-md-8">
				<Car><router-view v-if="isRouterAlive"></router-view></Car>
			</div>
			<div class="col-md-1"></div>
		</div>
		<router-view v-show="$route.meta.show == false"></router-view>
		<div class="card-body" style="height: 50px"></div>
	</div>
</template>
<script>
import Header from "@/components/Header";
import { onMounted } from "vue";
import Nav from "@/components/Nav";
import Car from "@/components/Card";
import "@/assets/js/jquery";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap";
export default {
	name: "App",
	components: {
		Header,
		Nav,
		Car,
	},
	provide() {
		return {
			reload: this.reload,
		};
	},
	data() {
		return {
			isRouterAlive: true,
		};
	},
	methods: {
		reload() {
			this.isRouterAlive = false;
			this.$nextTick(function () {
				this.isRouterAlive = true;
			});
		},
	},
	computed: {},
	setup() {
		onMounted(() => {
			var bg = [];
			bg[0] =
				"https://video.acwing.com/image/default/A5E2888AD835444DBFC8DEE492355889-6-2.jpg?auth_key=1671623931-a4b571da81-0-488853a85af00f69e54b335828db6417";
			bg[2] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_03.jpg";
			bg[1] =
				"https://video.acwing.com/image/default/3647D524C6964A939CEC6D370D931925-6-2.jpg?auth_key=1671624482-ed1d80a581-0-547018dd924a059e8b93c4be7581c218";
			bg[3] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_08.jpg";
			bg[4] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_01.jpg";
			bg[5] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_04.jpg";
			bg[6] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_06.jpg";
			bg[7] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_07.jpg";
			bg[8] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_01.jpg";

			var randomIndex = Math.round(Math.random() * 6) + 2;

			var body = document.querySelector("body");
			//随机的背景图
			body.style.background = "url(" + bg[randomIndex] + ")";
		});
	},
};
</script>
<style>
.blankdiv {
	height: 3vh;
}
#app {
	font-family: Avenir, Helvetica, Arial, sans-serif;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	text-align: center;
	color: #2c3e50;
	margin-top: 60px;
}
body {
	background-size: 100%;
}
</style>
<style scoped>
.fluid {
	overflow-x: hidden;
	overflow-y: hidden;
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
}
</style>
