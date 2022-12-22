<template>
	<div>
		<div class="title">
			<h5 style="opacity: 0">12</h5>
			<h1 style="margin-left: 30px">后台管理系统</h1>
			<!-- <img
				src="../../assets/font.png"
				style="width: 20%; height: 70%; margin-left: 5px" /> -->
		</div>
		<div class="nav">
			<span class="nav-bar choose"> <a href="#">管理首页</a></span>
			<!-- <span class="nav-bar"><a href="#">管理二页</a> </span> -->
		</div>
	</div>
</template>

<script>
import { Card } from "element-ui";

export default { components: { Card } };
</script>

<style scoped>
* {
	margin: 0 auto;
	padding: 0;
	box-sizing: border-box;
}

a {
	text-decoration: none;
	color: #000;
}

li {
	list-style-type: none;
}

.title {
	background-color: rgb(79, 120, 171);
	height: 100px;
	color: rgb(255, 255, 255);
	line-height: 180px;
	text-shadow: 2px 2px 5px rgb(255, 53, 53);
	font-size: large;
}

.nav {
	height: 30px;
	background-color: rgb(124, 164, 216);
}

.nav-bar {
	float: left;
	margin-left: 15px;
	width: 90px;
	height: 30px;
}

.nav-bar a {
	display: block;
	text-align: center;
	color: white;
	font-weight: 700;
}

.choose {
	background-color: rgb(53, 79, 116);
}
</style>
