<template>
	<div class="card">
		<div class="card-body">
			<div class="context-title">公告管理</div>
			<div class="context">
				<div class="context-nav">
					<span>公告标题</span>
					<span>修改时间</span>
					<span>操作人</span>
					<span>操作</span>
				</div>
				<ul>
					<li class="item">
						<div>这是第一个公告</div>
						<div>2022-11-24</div>
						<div>糖送元明清</div>
						<div>编辑</div>
					</li>
					<li class="item">
						<div>
							关于组织申报机电学院第二届本科生创新创业项目的通知
						</div>
						<div>2022-11-24</div>
						<div>SDUW</div>
						<div>编辑</div>
					</li>

					<li class="item">
						<div>
							关于举办第十八届（2023年）山东大学（威海）大学生机电产品···
						</div>
						<div>2022-12-07</div>
						<div>SDUW</div>
						<div>编辑</div>
					</li>
					<li class="item">
						<div> 关于2022-2023-2学期新选用教材审核通过的公示 </div>
						<div>2022-12-13</div>
						<div>SDUW</div>
						<div>编辑</div>
					</li>
					<li class="item">
						<div>2022年秋季学期Java大作业结课报告</div>
						<div>2022-12-21</div>
						<div>bz2021</div>
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
