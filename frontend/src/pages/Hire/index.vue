<template>
	<div>
		<div class="navbar">
			<div class="nav">
				<span>
					<router-link to="/home">首页</router-link>
				</span>
				<span>
					<a href="/login">登录</a>
				</span>
			</div>
		</div>
		<div
			class="card"
			style="
				width: 90%;
				margin-left: 5vw;
				margin-top: 10px;
				opacity: 92%;
			">
			<div class="card-body">
				<div class="image">
					<img src="@/assets/hires_big.jpeg" />
				</div>
				<div class="row" style="margin-top: 20px">
					<div class="col-5">
						<div class="context">
							<div class="col">
								<div class="row-4">
									<div class="card">
										<div class="card-body">
											<div class="text-center">
												<h3>加入我们</h3>
											</div>
											<div class="reg-form">
												<form action="">
													<ul>
														<li>
															<input
																class="user-input"
																type="text"
																name="search"
																placeholder="请输入岗位名称" />
															<input
																class="user-btn"
																type="button"
																value="搜索" />
														</li>
														<div
															class="card-body"></div>
														<li>
															<label
																style="
																	width: 100px;
																"
																>所在省</label
															>
															<select
																style="
																	width: 200px;
																">
																<option
																	>山东</option
																>
																<option
																	>北京</option
																>
																<option
																	>上海</option
																>
															</select>
														</li>
													</ul>
												</form>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col">
								<div class="row-8"
									><div class="card">
										<div class="card-body"></div>
										<div class="text-center">
											<h3>新的职位</h3>
										</div>
										<div class="job-content">
											<ul>
												<li>
													<div class="card">
														<div class="card-body">
															<div class="subbox">
																<a href="#">
																	<div
																		class="subtop">
																		<p
																			class="name">
																			前端开发工程师（理塘）
																		</p>
																		<span
																			class="salary"
																			>5-8K</span
																		>
																	</div>
																	<p
																		class="job-text"
																		>大专及以上</p
																	>
																</a>
																<div
																	class="commanybox">
																	<a
																		href="#"
																		class="commany-info">
																		<span
																			>计算机软件</span
																		>
																		<span
																			>企业服务</span
																		>
																	</a>
																</div>
															</div>
														</div>
													</div>
												</li>
												<li>
													<div class="card">
														<div class="card-body">
															<div class="subbox">
																<a href="#">
																	<div
																		class="subtop">
																		<p
																			class="name"
																			>硬件工程师（山东）</p
																		>
																		<span
																			class="salary"
																			>15-23K</span
																		>
																	</div>
																	<p
																		class="job-text"
																		>5-10年本科</p
																	>
																</a>
																<div
																	class="commanybox">
																	<a
																		href="#"
																		class="commany-info">
																		<span
																			>智能硬件</span
																		>
																		<span
																			>企业服务</span
																		>
																	</a>
																</div>
															</div>
														</div>
													</div>
												</li>
												<li>
													<div class="card">
														<div class="card-body">
															<div class="subbox">
																<a href="#">
																	<div
																		class="subtop">
																		<p
																			class="name">
																			JAVA研发工程师（山东）
																		</p>
																		<span
																			class="salary"
																			>15-18K</span
																		>
																	</div>
																	<p
																		class="job-text"
																		>3-5年本科</p
																	>
																</a>
																<div
																	class="commanybox">
																	<a
																		href="#"
																		class="commany-info">
																		<span
																			>计算机软件</span
																		>
																		<span
																			>企业服务</span
																		>
																	</a>
																</div>
															</div>
														</div>
													</div>
												</li>
											</ul>
										</div></div
									>
								</div></div
							>
						</div>
					</div>
					<div class="col-7">
						<div class="card ienews">
							<div class="card-body">
								<div class="row">
									<thead
										><h3
											>机电与信息工程学院通知公告</h3
										></thead
									>
									<table class="newslist">
										<tbody>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://ie.wh.sdu.edu.cn/info/1031/9771.htm"
														title="关于2022-2023-2学期新选用教材审核通过的公示"
														>关于2022-2023-2学期新选用教材审核通过的公示</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>12-13</span
													>
												</td>
											</tr>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://ie.wh.sdu.edu.cn/info/1031/9741.htm"
														title="关于举办第十八届（2023年）山东大学（威海）大学生机电产品创新设计竞赛的预通知"
														>关于举办第十八届（2023年）山东大学（威海）大学生机电产品创新设计竞赛的预通知</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>12-07</span
													>
												</td>
											</tr>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://ie.wh.sdu.edu.cn/info/1031/9672.htm"
														title="关于举办山东大学（威海）第九届成才杯·​第二届“元宇宙+”创意设计比赛的通知"
														>关于举办山东大学（威海）第九届成才杯·​第二届“元宇宙+”创意设计比赛的通知</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>11-28</span
													>
												</td>
											</tr>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://ie.wh.sdu.edu.cn/info/1031/9631.htm"
														title="关于组织申报机电学院第二届本科生创新创业项目的通知"
														>关于组织申报机电学院第二届本科生创新创业项目的通知</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>11-24</span
													>
												</td>
											</tr>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://ie.wh.sdu.edu.cn/info/1031/9609.htm"
														title="第十六届全国大学生软件创新大赛校内选拔赛开赛通知"
														>第十六届全国大学生软件创新大赛校内选拔赛开赛通知</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>11-21</span
													>
												</td>
											</tr>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://ie.wh.sdu.edu.cn/info/1031/9592.htm"
														title="校园招聘/宣讲会预告（11.21—11.28）第十二周"
														>校园招聘/宣讲会预告（11.21—11.28）第十二周</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>11-21</span
													>
												</td>
											</tr>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://ie.wh.sdu.edu.cn/info/1031/9582.htm"
														title="机电与信息工程学院秋季学期转专业面试通知"
														>机电与信息工程学院秋季学期转专业面试通知</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>11-20</span
													>
												</td>
											</tr>
											<tr>
												<td
													style="
														padding: 10px 1px;
														font-size: 16px;
													">
													<a
														href="https://jwc.wh.sdu.edu.cn/nry.jsp?urltype=news.NewsContentUrl&amp;wbtreeid=1035&amp;wbnewsid=13793"
														title="关于举办2022年山东大学程序设计精英挑战赛的通知"
														>关于举办2022年山东大学程序设计精英挑战赛的通知</a
													>
												</td>
												<td width="40" align="center">
													<span
														style="font-size: 14px"
														>11-14</span
													>
												</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>

<script>
export default {};
</script>

<style scpoed>
* {
	margin: 0 auto;
	padding: 0;
	box-sizing: border-box;
}
.card {
	margin-top: 10px;
	margin-right: 10px;
}
li {
	list-style-type: none;
}

a {
	text-decoration: none;
	color: #000;
}

a:hover {
	color: rgb(0, 217, 255);
	border-bottom: 1px solid rgb(0, 221, 255);
}

.navbar {
	height: 50px;
	background-color: rgb(241, 241, 241);
}

.navbar > .nav {
	float: right;
	margin-left: 5vw;
}

.navbar > .nav > span {
	margin-left: 5vw;
	padding-right: 50px;
	color: rgb(102, 102, 102);
	border-radius: 5px;
	font-size: 20px;
}

.default_chose {
	color: red;
	border-bottom: 1px solid red;
}

img {
	display: block;
	width: 1400px;
	height: 480px;
}

.join {
	padding-top: 70px;
	width: 500px;
	padding-left: 70px;
	text-align: center;
	float: left;
}

.context > .join > .join_title {
	float: left;
	margin-top: 3px;
	font-size: large;
	font-weight: 500;
}

.user-input {
	width: 200px;
	height: 30px;
	border: 2px solid rgb(109, 109, 164);
	border-radius: 5px;
	box-sizing: border-box;
	outline: none;
	text-indent: 10px;
}

.user-btn {
	width: 70px;
	height: 30px;
	border: none;
	border-radius: 5px;
	background: rgb(140, 140, 235);
	vertical-align: middle;
	outline: none;
	color: white;
	font-size: 20px;
}

/* .job {
	margin-top: 5px;
	float: right;
}

.job-title {
	margin-left: 200px;
	margin-top: 3px;
	font-size: large;
	font-weight: 500;
	text-align: center;
}

.job-content {
	width: 400px;
}

.job-content > ul li {
	height: 130px;
	width: 400px;
	float: left;
	margin: 30px 14px 16px 300px;
	background: #fff;
	border: 1px solid #eef0f5;
} */

.subbox {
	display: block;
	height: 130px;
	width: 400px;

	padding: 16px 20px;
	box-sizing: border-box;
}

.subtop {
	overflow: hidden;
}

.name {
	position: relative;

	font-size: 15px;
	color: #414a60;
	margin-right: 8px;

	overflow: hidden;

	float: left;
}

.salary {
	float: right;
	color: #f90;
	font-size: 14px;
}

.job-text {
	line-height: 40px;
}

.user-info img {
	width: 30px;
	height: 30px;
	float: left;
	margin-right: 10px;
}

.commanybox {
	border-top: 1px solid #eef0f5;
	line-height: 30px;
	padding-top: 12px;
}

.commany-info span {
	font-size: 14px;
	margin-right: 10px;
}
</style>
