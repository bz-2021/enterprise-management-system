<template>
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
	</div>
</template>

<script>
import Header from "@/components/Header";
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
	background-image: url("@/assets/background.jfif");
	background-size: 100%;
}
</style>
<style scoped>
.fluid {
	overflow-x: hidden;
	overflow-y: hidden;
}
</style>
