<template>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5295905 (修复路由)
    <div>
        <div class="context-title">系统首页</div>
        <div class="context-modify" @click="modify">修改个人信息</div>
        <div class="context">
            <div class="context-detail">{{ self.department }} {{ self.status }}{{ self.name }}，欢迎来到后台管理系统</div>
        </div>
        <div ref="update" class="update" :class="{ disappear: !show }">
            <el-form ref="form" label-width="160px">
                <el-form-item label="照片URL :">
                    <el-input v-model="photo"></el-input>
                </el-form-item>
                <el-form-item label="民族  :">
                    <el-input v-model="ethnicity"></el-input>
                </el-form-item>
                <el-form-item label="生日(yyyy-MM-dd) :">
                    <el-input v-model="birthday"></el-input>
                </el-form-item>
                <el-form-item label="政治面貌 :">
                    <el-input v-model="politicalFace"></el-input>
                </el-form-item>
                <el-form-item label="文化程度 :">
                    <el-input v-model="education"></el-input>
                </el-form-item>
                <el-form-item label="身份证号 :">
                    <el-input v-model="id_card"></el-input>
                </el-form-item>
                <el-form-item label="手机号 :">
                    <el-input v-model="phone_number"></el-input>
                </el-form-item>
                <el-form-item label="电子邮箱 :">
                    <el-input v-model="e_mail"></el-input>
                </el-form-item>
                <el-form-item label="用户名 :">
                    <el-input v-model="username"></el-input>
                </el-form-item>
                <el-form-item label="账户 :">
                    <el-input v-model="account"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="submit">提交</el-button>
                    <el-button @click="Close">取消</el-button>
                </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script>
import { mapState } from 'vuex';
export default {
    inject: ['reload'],
    data() {
        return {
            show: false,
            photo: '', ethnicity: '', birthday: '',
            politicalFace: '', education: '',
            id_card: '', phone_number: '',
            e_mail: '', username: '', account: '',
        }
    },
    methods: {
        modify() {
            this.show = true
        },
        Close() {
            this.show = false
        },
        submit() {
            let data = {
                "photo": this.photo,
                "ethnicity": this.ethnicity,
                "birthday": this.birthday,
                "politicalFace": this.politicalFace,
                "education": this.education,
                "id_card": this.id_card,
                "phone_number": this.phone_number,
                "e_mail": this.e_mail,
                "username": this.username,
                "account": this.account
            }
            this.$store.dispatch('molSelf', data).then(res => {
                this.reload()
            });
        }
    },
    computed: mapState({
        self: (state) => state.self
    }),
    mounted: function () {
        this.$store.dispatch('getMe')
    }
}
</script>

<style scoped>
.context {
    border: 2px solid pink;
    border-top: 1px solid pink;
    position: absolute;
    top: 210px;
    left: 394px;
    height: 246px;
    width: 840px;
}

.context-title {
    background-color: rgb(68, 81, 97);
    height: 30px;
    color: rgb(255, 255, 255);
    width: 70px;
    position: absolute;
    left: 394px;
    top: 180px;
    text-align: center;
    line-height: 30px;
}

.context-modify {
    background-color: rgb(68, 81, 97);
    height: 30px;
    color: rgb(255, 255, 255);
    width: 106px;
    position: absolute;
    left: 1127px;
    top: 180px;
    text-align: center;
    line-height: 30px;
}

.context-detail {
    text-align: center;
    line-height: 246px;
    height: 246px;
    width: 840px;
}

.update {
    background-color: #ffffff;
    position: absolute;
    top: 25%;
    left: 32%;
    /* transform: translate(-50%, -50%); */
    width: 400px;
}


.disappear {
    opacity: 0;
}

.close {
    position: absolute;
    left: -40px;
    width: 40px;
    height: 31px;
    background: rgb(94, 221, 72);
    text-align: center;
}
<<<<<<< HEAD
</style>
=======
</style>
=======
	<div>
		<div class="row main_menu">
			<div class="col-3">
				<div class="card-body">
					<h3> 系统首页 </h3>
				</div>
			</div>
			<div class="col-4"></div>
			<div class="col-2">
				<button
					type="button"
					style="width: 105%"
					class="btn btn-outline-warning btn-lg"
					data-bs-toggle="modal"
					data-bs-target="#exampleModal">
					修改信息
				</button>
			</div>
			<div class="col-2">
				<button
					type="button"
					style="width: 105%"
					class="btn btn-outline-danger btn-lg"
					@click="logout">
					退出登录
				</button>
			</div>
			<div class="col-1"></div>
		</div>
		<div class="context">
			<div class="context-detail"
				>{{ self.department }} {{ self.status
				}}{{ self.name }}，欢迎来到后台管理系统
			</div>
			<div class="blank"></div>
		</div>

		<div
			class="modal fade"
			id="exampleModal"
			aria-labelledby="exampleModalLabel"
			aria-hidden="true">
			<div class="modal-dialog modal-dialog-scrollable">
				<div class="modal-content">
					<div class="modal-body">
						<el-form
							ref="form"
							tabindex=""
							label-width="200px"
							label-font="30px"
							id="selectForm"
							style="margin-top: 5%">
							<el-form-item label="照片URL :">
								<el-input v-model="photo"></el-input>
							</el-form-item>
							<el-form-item label="民族  :">
								<el-input v-model="ethnicity"></el-input>
							</el-form-item>
							<el-form-item label="生日(yyyy-MM-dd) :">
								<el-input v-model="birthday"></el-input>
							</el-form-item>
							<el-form-item label="政治面貌 :">
								<el-input v-model="politicalFace"></el-input>
							</el-form-item>
							<el-form-item label="文化程度 :">
								<el-input v-model="education"></el-input>
							</el-form-item>
							<el-form-item label="身份证号 :">
								<el-input v-model="id_card"></el-input>
							</el-form-item>
							<el-form-item label="手机号 :">
								<el-input v-model="phone_number"></el-input>
							</el-form-item>
							<el-form-item label="电子邮箱 :">
								<el-input v-model="e_mail"></el-input>
							</el-form-item>
							<el-form-item label="用户名 :">
								<el-input v-model="username"></el-input>
							</el-form-item>
							<el-form-item label="账户 :">
								<el-input v-model="account"></el-input>
							</el-form-item>
						</el-form>
					</div>
					<div class="row btnrow">
						<div class="col-1"></div>
						<div class="col-5"
							><button
								type="button"
								class="btn btn-primary btn-lg submitbtn"
								@click="submit"
								>提交
							</button>
						</div>
						<div class="col-5"
							><button
								type="button"
								class="btn btn-secondary btn-lg submitbtn"
								data-bs-dismiss="modal"
								@click="Close"
								>取消
							</button>
						</div>
						<div class="col-1"></div>
					</div>
				</div>
			</div>
		</div>

		<div id="exampleModal2" class="modal-dialog modal-dialog-scrollable">
			<div ref="update" class="update"> </div>
		</div>

		<!-- Button trigger modal -->
	</div>
</template>

<script>
import { mapState } from "vuex";
import "@/assets/js/jquery";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap";
export default {
	inject: ["reload"],
	data() {
		return {
			show: false,
			photo: "",
			ethnicity: "",
			birthday: "",
			politicalFace: "",
			education: "",
			id_card: "",
			phone_number: "",
			e_mail: "",
			username: "",
			account: "",
		};
	},
	methods: {
		logout() {
			localStorage.removeItem("TOKEN");
			window.location.href = window.location.href;
		},
		modify() {
			this.show = true;
		},
		Close() {
			this.show = false;
		},
		submit() {
			let data = {
				photo: this.photo,
				ethnicity: this.ethnicity,
				birthday: this.birthday,
				politicalFace: this.politicalFace,
				education: this.education,
				id_card: this.id_card,
				phone_number: this.phone_number,
				e_mail: this.e_mail,
				username: this.username,
				account: this.account,
			};
			this.$store.dispatch("molSelf", data).then((res) => {
				this.reload();
			});
		},
	},
	computed: mapState({
		self: (state) => state.self,
	}),
	mounted: function () {
		this.$store.dispatch("getMe");
	},
};
</script>

<style scoped>
.context-detail {
	font-size: 300%;
	margin-top: 10%;
	margin-left: 10%;
}
.main_menu {
	margin-top: 0%;
	margin-right: 0%;
}
.blank {
	height: 335px;
}
.btnrow {
	margin-bottom: 5%;
}
.submitbtn {
	width: 100%;
}
#selectForm >>> .el-form-item__label {
	font-size: 18px;
}
/* .context {
	border: 2px solid pink;
	border-top: 1px solid pink;
	position: absolute;
	top: 210px;
	left: 394px;
	height: 246px;
	width: 840px;
}

.context-title {
	background-color: rgb(68, 81, 97);
	height: 30px;
	color: rgb(255, 255, 255);
	width: 70px;
	position: absolute;
	left: 394px;
	top: 180px;
	text-align: center;
	line-height: 30px;
}

.context-modify {
	background-color: rgb(68, 81, 97);
	height: 30px;
	color: rgb(255, 255, 255);
	width: 106px;
	position: absolute;
	left: 1127px;
	top: 180px;
	text-align: center;
	line-height: 30px;
}

.context-detail {
	text-align: center;
	line-height: 246px;
	height: 246px;
	width: 840px;
}

.update {
	background-color: #ffffff;
	position: absolute;
	top: 25%;
	left: 32%;
	width: 400px;
} 

.disappear {
	opacity: 0;
}


.close {
	position: absolute;
	left: -40px;
	width: 40px;
	height: 31px;
	background: rgb(94, 221, 72);
	text-align: center;
} */
</style>
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
