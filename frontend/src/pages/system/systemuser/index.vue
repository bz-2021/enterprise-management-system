<template>
	<div class="hello">
		<div class="row">
			<div class="col-3">
				<div class="card-body">
					<h3> 公司用户管理 </h3>
				</div>
			</div>
			<div class="col-4"></div>
			<div class="col-2">
				<button
					type="button"
					style="width: 105%"
					class="btn btn-outline-warning btn-lg"
					data-bs-toggle="modal"
					data-bs-target="#addemployee">
					增添员工
				</button>
			</div>
			<div class="col-3"> </div>
		</div>

		<div
			class="modal fade"
			id="addemployee"
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
							<el-form-item label="姓名 :">
								<el-input
									v-model="myname"
									type="name"></el-input>
							</el-form-item>
							<el-form-item label="级别 :">
								<el-input v-model="level"></el-input>
							</el-form-item>
							<el-form-item label="职位 :">
								<el-input v-model="status"></el-input>
							</el-form-item>
							<el-form-item label="性别 :">
								<el-input v-model="gender"></el-input>
							</el-form-item>
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
							<el-form-item label="部门编号 :">
								<el-input v-model="did"></el-input>
							</el-form-item>
							<el-form-item label="密码 :">
								<el-input
									v-model="password"
									type="password"></el-input>
							</el-form-item>
							<el-form-item label="确认密码 :">
								<el-input
									v-model="comfirmedpassword"
									type="password"></el-input>
							</el-form-item>
						</el-form>
					</div>
					<div class="row btnrow">
						<div class="col-1"></div>
						<div class="col-5"
							><button
								type="button"
								class="btn btn-primary btn-lg submitbtn"
								data-bs-dismiss="modal"
								@click="addEmployee"
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

		<table class="table table-bordered" style="width: 96%; margin-top: 4vh">
			<thead>
				<tr>
					<th scope="col">员工ID</th>
					<th scope="col">姓名</th>
					<th scope="col">级别</th>
					<th scope="col">职位</th>
					<th scope="col">性别</th>
					<th scope="col">文化程度</th>
					<th scope="col">照片</th>
					<th scope="col">政治面貌</th>
					<th scope="col">民族</th>
					<th scope="col">操作</th>
				</tr>
			</thead>
			<tbody>
				<tr class="tr" v-for="(item, index) in userlist">
					<th scope="row">{{ item.id }}</th>
					<td>{{ item.name }}</td>
					<td>{{ item.level }}</td>
					<td>{{ item.status }}</td>
					<td>{{ item.gender }}</td>
					<td>{{ item.education }}</td>
					<td>{{ item.photo }}</td>
					<td>{{ item.politicalFace }}</td>
					<td>{{ item.ethnicity }}</td>
					<td>
						<button
							type="button"
							style="width: 25%"
							class="btn btn-outline-primary btn-sm"
							data-bs-toggle="modal"
							:data-bs-target="'#showDetail-' + index">
							详情
						</button>
						<button
							type="button"
							style="width: 25%"
							class="btn btn-outline-warning btn-sm"
							data-bs-toggle="modal"
							:data-bs-target="'#updateemployee-' + index">
							编辑
						</button>
						<button
							type="button"
							style="width: 25%"
							class="btn btn-outline-danger btn-sm"
							data-bs-toggle="modal"
							data-bs-target="#deleteEmployee">
							删除
						</button>

						<!-- Modal -->
						<div
							class="modal fade"
							id="deleteEmployee"
							tabindex="-1"
							aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h1
											class="modal-title fs-5"
											id="exampleModalLabel"
											>警告</h1
										>
										<button
											type="button"
											class="btn-close"
											data-bs-dismiss="modal"
											aria-label="Close"></button>
									</div>
									<div class="modal-body"
										>你确定要删除吗？</div
									>
									<div class="modal-footer">
										<button
											type="button"
											class="btn btn-secondary"
											data-bs-dismiss="modal"
											>Close</button
										>
										<button
											type="button"
											class="btn btn-danger"
											@click="delteEmployee(item.id)"
											>Save changes</button
										>
									</div>
								</div>
							</div>
						</div>
					</td>
					<div
						class="modal fade"
						:id="'showDetail-' + index"
						aria-labelledby="exampleModalLabel"
						aria-hidden="true"
						style="margin-top: 5%">
						<div class="modal-dialog modal-dialog-scrollable">
							<div class="modal-content">
								<div class="modal-body">
									<div class="row">
										<div class="col-4"
											><div class="detail-nav">
												<div>生日</div>
												<div>电话号码</div>
												<div>部门</div>
												<div>电子邮箱</div>
												<div>用户名</div>
												<div>账户</div>
												<div>密码</div>
												<div>注册时间</div>
											</div></div
										>
										<div class="col-8"
											><div class="detail-item">
												<div>{{ item.birthday }}</div>
												<div>{{
													item.phoneNumber
												}}</div>
												<div>{{ item.did }}</div>
												<div>{{ item.email }}</div>
												<div>{{ item.userName }}</div>
												<div>{{ item.account }}</div>
												<div>{{ item.password }}</div>
												<div>{{ item.registTime }}</div>
											</div></div
										>
									</div>
								</div>
								<div class="row btnrow" style="margin-top: 3%">
									<div class="col-3"></div>
									<div class="col-6"
										><button
											type="button"
											class="btn btn-secondary btn-lg submitbtn"
											data-bs-dismiss="modal"
											@click="Close"
											>取消
										</button>
									</div>
									<div class="col-3"></div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="modal fade"
						:id="'updateemployee-' + index"
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
										<el-form-item label="姓名 :">
											<el-input
												v-model="myname"></el-input>
										</el-form-item>
										<el-form-item label="级别 :">
											<el-input
												v-model="level"></el-input>
										</el-form-item>
										<el-form-item label="职位 :">
											<el-input
												v-model="status"></el-input>
										</el-form-item>
										<el-form-item label="性别 :">
											<el-input
												v-model="gender"></el-input>
										</el-form-item>
										<el-form-item label="照片URL :">
											<el-input
												v-model="photo"></el-input>
										</el-form-item>
										<el-form-item label="民族  :">
											<el-input
												v-model="ethnicity"></el-input>
										</el-form-item>
										<el-form-item
											label="生日(yyyy-MM-dd) :">
											<el-input
												v-model="birthday"></el-input>
										</el-form-item>
										<el-form-item label="政治面貌 :">
											<el-input
												v-model="
													politicalFace
												"></el-input>
										</el-form-item>
										<el-form-item label="文化程度 :">
											<el-input
												v-model="education"></el-input>
										</el-form-item>
										<el-form-item label="身份证号 :">
											<el-input
												v-model="id_card"></el-input>
										</el-form-item>
										<el-form-item label="手机号 :">
											<el-input
												v-model="
													phone_number
												"></el-input>
										</el-form-item>
										<el-form-item label="电子邮箱 :">
											<el-input
												v-model="e_mail"></el-input>
										</el-form-item>
										<el-form-item label="用户名 :">
											<el-input
												v-model="username"></el-input>
										</el-form-item>
										<el-form-item label="账户 :">
											<el-input
												v-model="account"></el-input>
										</el-form-item>
										<el-form-item label="部门编号 :">
											<el-input v-model="did"></el-input>
										</el-form-item>
									</el-form>
								</div>
								<div class="row btnrow">
									<div class="col-1"></div>
									<div class="col-5"
										><button
											type="button"
											class="btn btn-primary btn-lg submitbtn"
											data-bs-dismiss="modal"
											@click="modifyEmployee"
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
				</tr>
			</tbody>
		</table>
	</div>
</template>

<script>
import { mapState } from "vuex";

export default {
	inject: ["reload"],
	data() {
		return {
			showadd: false,
			showdetail: false,
			showupdate: false,
			nowEmployeeid: "",
			nowindex: "", //现在指向哪个id
			active: 0, //同一时间只能活跃一个窗口
			user: "",
			myname: "",
			level: "",
			status: "",
			gender: "",
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
			did: "",
			password: "",
			comfirmedpassword: "",
		};
	},
	methods: {
		delteEmployee(id) {
			this.$store.dispatch("delEmployee", id);
		},
		modifyEmployee() {
			var data = {
				employee_id: this.nowEmployeeid,
				name: this.myname,
				level: this.level,
				status: this.status,
				gender: this.gender,
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
				did: this.did,
			};
			console.log(data);
			this.$store.dispatch("molEmployee", data).then((res) => {
				this.reload();
			});
		},
		addEmployee() {
			var data = {
				name: this.myname,
				level: this.level,
				status: this.status,
				gender: this.gender,
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
				did: this.did,
				password: this.password,
				confirmedPassword: this.comfirmedpassword,
			};
			this.$store.dispatch("addEmployee", data).then((res) => {
				this.reload();
			});
		},
		showAdd() {
			if (this.active == 0) {
				this.showadd = true;
				this.active = 1;
			}
		},
		showDetail(id) {
			if (this.active == 0) {
				this.showdetail = true;
				this.active = 1;
			}
			this.nowindex = id;
			// console.log();
			this.user = this.userlist[id];
		},
		showUpdate(id, nowEmployeeid) {
			if (this.active == 0) {
				this.showupdate = true;
				this.active = 1;
			}
			this.nowEmployeeid = nowEmployeeid;
			console.log(this.active);
			this.nowindex = id;
		},
		Close() {
			this.showdetail = false;
			this.showupdate = false;
			this.showadd = false;
			this.active = 0;
		},
	},
	computed: mapState({
		userlist: (state) => state.userlist,
	}),
	mounted: function () {
		this.$store.dispatch("getList");
	},
};
</script>

<style scoped>
* {
	overflow-x: hidden;
	overflow-y: hidden;
}
.hello {
	overflow-y: hidden;
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
.detail-nav > div {
	font-size: 20px;
	margin-top: 10%;
	margin-left: 10%;
}
.detail-item > div {
	font-size: 20px;
	margin-top: 4.6%;
}
.btn-sm {
	margin-left: 0.3vw;
}
/* * {
    margin: 0 auto;
    padding: 0;
    box-sizing: border-box;
} */

/* a {
	text-decoration: none;
}

li {
	list-style-type: none;
} */

/* .context {
	border: 2px solid pink;
	border-top: 1px solid pink;
	position: absolute;
	top: 210px;
	left: 245px;
	height: 500px;
	width: 1057px;
}

.context-title {
	background-color: rgb(68, 81, 97);
	height: 30px;
	color: rgb(255, 255, 255);
	width: 120px;
	position: absolute;
	left: 245px;
	top: 180px;
	text-align: center;
	line-height: 30px;
}

.context-add {
	background-color: rgb(68, 81, 97);
	height: 30px;
	color: rgb(255, 255, 255);
	width: 120px;
	position: absolute;
	left: 1182px;
	top: 180px;
	text-align: center;
	line-height: 30px;
}

.context-add a {
	color: white;
}

.context-detail {
	text-align: center;
	line-height: 246px;
	height: 246px;
	width: 840px;
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
	width: 96px;
}

.context-nav div {
	float: right;
	width: 120px;
}

.item {
	display: block;
}

.item > div {
	float: left;
	border-bottom: 1px solid pink;
	text-align: center;
	width: 96px;
}

.item :nth-child(10) {
	width: 180px;
}

.operation {
	width: 120px;
}

.operation > div {
	float: left;
	width: 59px;
}

.detail {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 1400px;
}

.detail-nav {
	background-color: rgb(248, 189, 210);
	height: 30px;
	line-height: 30px;
}

.detail-nav > span {
	text-align: center;
	display: block;
	float: left;
	width: 160px;
	margin-right: 10px;
}

.detail-item {
	background-color: rgb(185, 175, 239);
	height: 30px;
	line-height: 30px;
}

.detail-item div {
	text-align: center;
	float: left;
	width: 160px;
	margin-right: 10px;
}

.update {
	background-color: #ffffff;
	position: absolute;
	top: 25%;
	left: 32%;
	width: 400px;
} */

/* 
.delete {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 300px;
    height: 60px;
    background-color: rgb(234, 179, 179);
    border-radius: 3px;
}

.delete-title {
    text-align: center;
}

.delete>.choose {
    width: 300px;
    height: 60px;
}

.delete>.choose>div {
    float: left;
    line-height: 24px;
    text-align: center;
    background: #E27575;
    border: none;
    margin-left: 84px;
    padding: 3px 3px 3px 3px;
    color: #FFF;
    box-shadow: 1px 1px 5px #B6B6B6;
    border-radius: 3px;
    text-shadow: 1px 1px 1px #9E3F3F;
    cursor: pointer;
}

.disappear {
    opacity: 0;
    z-index: -1;

}

.showagain {
    opacity: 100;
}

.add {
    background-color: #ffffff;
    position: absolute;
    top: 25%;
    left: 32%;
    width: 500px;
}

.close {
    position: absolute;
    left: -40px;
    width: 40px;
    height: 31px;
    background: rgb(94, 221, 72);
    text-align: center;
}

.closeadd {
    position: absolute;
    left: 300px;
    width: 40px;
    height: 31px;
    top: 22px;
    font-size: large;
    text-align: center;
}

.disableform {
    pointer-events: none;
} */
</style>
