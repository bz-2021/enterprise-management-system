<template>
	<div class="fluid_container">
		<div class="login_conatiner">
			<div class="shadow-bar">
				<div class="floor1">
					<div class="logo">
						<div class="divv card-body"></div>
						<div class="login_logo_bg"></div>
						<span class="line"></span>
						<span class="title">企业管理系统（非官方）</span>
					</div>
				</div>
				<div class="floor2">
					<div class="card" v-if="!this.forget">
						<div class="card-body">
							<div class="text-center">
								<h4>账号登录</h4>
							</div>
							<form>
								<!-- Email input -->
								<div class="form-outline mb-4">
									<label
										class="form-label"
										for="form2Example1">
										姓名
									</label>
									<input
										type="email"
										v-model="name"
										id="form2Example1"
										class="form-control" />
								</div>

								<!-- Password input -->
								<div class="form-outline mb-4">
									<label
										class="form-label"
										for="form2Example2">
										密码
									</label>
									<input
										type="password"
										v-model="password"
										id="form2Example2"
										class="form-control" />
								</div>

								<div style="height: 10px"></div>

								<!-- 2 column grid layout for inline styling -->
								<div class="row mb-4">
									<div
										class="col d-flex justify-content-center">
										<!-- Checkbox -->
										<div class="form-check">
											<input
												class="form-check-input"
												type="checkbox"
												value=""
												id="form2Example31"
												checked />
											<label
												class="form-check-label"
												for="form2Example31">
												Remember me
											</label>
										</div>
									</div>

									<div class="col">
										<!-- Simple link -->
										<a type="button" @click="forgetpassword"
											>Forgot password?</a
										>
									</div>
								</div>

								<!-- Submit button -->
								<button
									style="margin-left: 15px"
									type="button"
									class="btn btn-outline-danger btn-lg"
									@click.prevent="Loginin">
									登录
								</button>
								<div style="height: 10px"></div>
							</form>
						</div>
					</div>
					<div class="card" v-else>
						<div class="card-body">
							<button
								style="margin-left: 0px"
								type="button"
								class="btn btn-outline-primary btn-sm"
								@click="Close">
								Back
							</button>
							<el-form
								:inline="true"
								class="demo-form-inline positon">
								<el-input
									type="password"
									hidden
									autocomplete="“new-password”"></el-input>
								<el-form-item label="请输入邮箱：">
									<el-input
										type="email"
										style="width: 240px"
										placeholder=""
										v-model="e_mail"></el-input>
								</el-form-item>
								<el-form-item>
									<button
										style="width: 150%; margin-left: 60px"
										type="button"
										class="btn btn-outline-primary btn-md"
										@click="sendCode">
										发送验证码
									</button>
								</el-form-item>

								<el-form-item label="请输入验证码">
									<el-input
										type="text"
										style="width: 240px"
										placeholder=""
										v-model="code"></el-input>
								</el-form-item>
								<el-form-item label="请输入密码：">
									<el-input
										type="password"
										style="width: 240px"
										placeholder=""
										v-model="fpassword"></el-input>
								</el-form-item>
								<el-form-item label="请确认密码：">
									<el-input
										type="password"
										style="width: 240px"
										placeholder=""
										v-model="confirmedPassword"></el-input>
								</el-form-item>
								<el-form-item>
									<button
										style="width: 200%; margin-left: 60px"
										type="button"
										class="btn btn-outline-primary btn-md"
										@click="submitCode">
										提交
									</button>
								</el-form-item>
							</el-form>
						</div>
					</div>
				</div>
			</div>
			<div class="floor3" style="margin-left: 20vw; margin-top: 75vh">
				<div class="card-footer">
					<div class="team">
						<div class="team">
							<span style="font-size: 18px">前端:</span>
							<span>尹冠宇</span>
							<span>白阳烨</span>
							<span style="font-size: 18px">数据库:</span>
							<span>方宁</span>
							<span>牛丙钊</span>
							<span style="font-size: 18px">后端:</span>
							<span>徐奥峰</span>
							<span>任翔宇</span>
							<span style="font-size: 18px; color: white">
								版权所有 Copyright@2022</span
							>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>

<script>
export default {
	name: "",
	data() {
		return {
			name: "",
			password: "",
			forget: false,
			e_mail: "",
			code: "",
			fpassword: "",
			confirmedPassword: "",
		};
	},
	setup() {
		onMounted(() => {
			var bg = [];
			bg[0] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_03.jpg";
			bg[1] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_04.jpg";
			bg[2] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_06.jpg";
			bg[3] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_07.jpg";
			bg[4] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_01.jpg";
			bg[5] =
				"https://pass.sdu.edu.cn/cas/comm/sdu/image/login_container_bg_08.jpg";
			var randomIndex = Math.round(Math.random() * 6);

			var body = document.querySelector(".login_conatiner");
			//随机的背景图
			body.style.background = "url(" + bg[randomIndex] + ")";
		});
	},
	methods: {
		async Loginin() {
			try {
				const { name, password } = this;
				if (name && password) {
					await this.$store.dispatch("userLogin", { name, password });
					// 如果路由当中有query参数择跳到query参数中
					// let toPath = this.$route.query.redirect || "/systemindex"
					this.$router.push("/systemindex");
				}
			} catch (error) {
				alert("账户或密码错误");
			}
		},
		forgetpassword() {
			this.forget = true;
			console.log(this.forget);
		},
		Close() {
			this.forget = false;
		},
		sendCode() {
			if (this.e_mail) {
				this.$store.dispatch("getCode", this.e_mail);
			} else {
				alert("邮箱不能为空");
			}
		},
		submitCode() {
			if (
				this.e_mail &&
				this.code &&
				this.fpassword &&
				this.confirmedPassword
			) {
				var data = {
					email: this.e_mail,
					code: this.code,
					password: this.fpassword,
					confirmedPassword: this.confirmedPassword,
				};
				this.$store.dispatch("getNewPassword", data);
			} else {
				alert("必填项不能为空");
			}
		},
	},
};
</script>

<style scpoed>
* {
	box-sizing: content-box;
}
#staticBackdrop .modal-dialog {
	/* 遮罩层z-index值1040 */
	z-index: 1080;
}

.team > span {
	margin-left: 2%;
	font-size: 25px;
	color: yellow;
}
.btn-outline-danger {
	width: 90%;
}
a:hover {
	color: rgb(68, 0, 255);
	border-bottom: 1px solid rgb(55, 0, 255);
}
.floor2 {
	position: fixed;
	width: 390px;
	right: 10%;
	bottom: 30%;
	opacity: 90%;
}
.content_login_box {
	float: left;
	width: 340px;
	border: 1px solid #dedede;
	background: url(../../assets/images/content_login_box_bg.png) scroll repeat
		0 0 transparent;
}
.fluid_container {
	bottom: 0;
	height: 100%;
	left: 0;
	position: fixed;
	right: 0;
	top: 0;
	z-index: 0;
}
.login_conatiner {
	background-image: url(../../assets/images/login_container_bg_03.jpg);
	background-size: 100%;
}
.line {
	height: 58px;
	border-left: 1px solid #fff;
	float: left;
	width: 20px;
	margin: 45px 0 0 0px;
}
.logo {
	margin-left: 5vw;
}
.login_conatiner {
	height: 100%;
	width: 100% !important;
	position: relative;
}
.floor1 .logo .title {
	float: left;
	font-size: 28px;
	color: #fff;
	margin-top: 50px;
}
.floor1 .logo {
	float: left;
	width: 95%;
	height: 148px;
}
body {
	line-height: 1.5;
	color: #222;
}
div,
span {
	margin: 0;
	padding: 0;
	border: 0;
	font-weight: inherit;
	font-style: inherit;
	font-size: 100%;
	font-family: "microsoft yahei";
	vertical-align: baseline;
}
.login_logo_bg {
	float: left;
	margin: 0;
	width: 243px;
	height: 148px;
	background: url(../../assets/images/logo-pc.png) no-repeat 0 0;
}
.shadow-bar {
	position: relative;
	width: 100%;
	height: 165px;
	background: url(../../assets/images/shadow-bg.png) repeat-x 0 0;
}
</style>
