<template>
	<div class="card">
		<div class="card-body">
			<div class="context-title">投诉管理</div>
			<div class="context">
				<div class="context-nav">
					<span>投诉内容</span>
					<span>投诉时间</span>
					<span>投诉者</span>
					<span>操作</span>
				</div>
				<ul>
					<li class="item">
						<div>这是第一个投诉</div>
						<div>2022-11-24</div>
						<div>尹冠宇</div>
						<div>编辑</div>
					</li>
				</ul>
				<ul>
					<li class="item">
						<div>关于页面跳转Bug的投诉</div>
						<div>2022-12-15</div>
						<div>bz2021</div>
						<div>编辑</div>
					</li>
				</ul>
				<ul>
					<li class="item">
						<div>
							<s>这个项目的代码简直泥马是坨屎山</s>
						</div>
						<div>2022-12-21</div>
						<div>用户已被注销</div>
						<div>编辑</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
</template>

<script>
export default {};
</script>

<style scoped>
* {
	margin: 0 auto;
	padding: 0;
	box-sizing: border-box;
}
li > div {
	margin-top: 5px;
	margin-bottom: 5px;
}

.card {
	height: 630px;
}

a {
	text-decoration: none;
	color: #000;
}

li {
	list-style-type: none;
}

.context {
	border: 2px solid pink;
	border-top: 1px solid pink;
	position: absolute;
	top: 80px;
	left: 70px;
	height: 500px;
	width: 890px;
}

.context-title {
	background-color: rgb(68, 81, 97);
	height: 30px;
	color: rgb(255, 255, 255);
	width: 120px;
	position: absolute;
	left: 70px;
	top: 50px;
	text-align: center;
	line-height: 30px;
}

.context-detail {
	text-align: center;
	line-height: 246px;
	height: 246px;
	width: 900px;
}

.context-nav {
	background-color: rgb(237, 234, 235);
	height: 30px;
	line-height: 30px;
}

.context-nav > span {
	display: block;
	float: left;
	text-align: center;
	width: 126px;
}

.context-nav > span:nth-child(1) {
	display: block;
	float: left;
	text-align: center;
	width: 500px;
}

.item {
	display: block;
}

.item > div:nth-child(1) {
	float: left;
	border-bottom: 1px solid pink;
	width: 500px;
	text-align: left;
}

.item > div {
	float: left;
	border-bottom: 1px solid pink;
	width: 126px;
	text-align: center;
}
</style>
