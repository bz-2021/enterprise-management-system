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
					<div class="card">
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
										<a @click="forgetpassword"
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
		};
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
		},
		Close() {
			this.forget = false;
		},
		sendCode() {
			if (this.e_mail) {
				this.$store.dispatch("getCode", this.e_mail);
			}
		},
		submitCode() {
			if (this.e_mail && this.code && this.fpassword) {
				var data = {
					email: this.e_mail,
					code: this.code,
					password: this.fpassword,
					confirmedPassword: this.fpassword,
				};
				this.$store.dispatch("getNewPassword", data);
			}
		},
	},
};
</script>

<style scpoed>
* {
	box-sizing: content-box;
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
