<template>
	<div class="hello">
		<div class="row">
			<div class="col-3">
				<div class="card-body">
					<h3> 考勤管理 </h3>
				</div>
			</div>
			<div class="col-4"></div>
			<div class="col-5"> </div>
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
				<tr class="item" v-for="(item, index) in userlist">
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
							@click="showDetail(item.id)">
							详情
						</button>
						<button
							type="button"
							style="width: 25%"
							class="btn btn-outline-warning btn-sm"
							data-bs-toggle="modal"
							@click="nowEmployeeid = item.id"
							:data-bs-target="'#updateAttendance-' + index">
							更新
						</button>

						<button
							type="button"
							style="width: 25%; opacity: 0"
							class="btn btn-outline-primary btn-sm"
							data-bs-toggle="modal"
							:data-bs-target="'#showDetail-' + index">
							详情
						</button>

						<!-- Modal -->
						<div
							style="margin-top: 30vh"
							class="modal fade"
							:id="'updateAttendance-' + index"
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
										><el-tag>缺勤</el-tag>
										<el-tag type="success">正常出勤</el-tag>
										<el-tag type="info">迟到</el-tag>
										<el-tag type="warning">早退</el-tag>
										<el-tag type="danger">加班</el-tag>
										<el-input
											v-model="input"
											placeholder="请更新考勤信息"></el-input>
										<span
											slot="footer"
											class="dialog-footer">
										</span
									></div>
									<div class="modal-footer">
										<button
											type="button"
											class="btn btn-secondary"
											data-bs-dismiss="modal"
											>取消</button
										>
										<button
											type="button"
											class="btn btn-danger"
											@click="updateAttendance"
											>提交</button
										>
									</div>
								</div>
							</div>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
		<el-dialog
			title="提示"
			:visible.sync="dialogVisible"
			width="30%"
			:before-close="handleClose">
			<el-tag>缺勤</el-tag>
			<el-tag type="success">正常出勤</el-tag>
			<el-tag type="info">迟到</el-tag>
			<el-tag type="warning">早退</el-tag>
			<el-tag type="danger">加班</el-tag>
			<el-input v-model="input" placeholder="请更新考勤信息"></el-input>
			<span slot="footer" class="dialog-footer">
				<el-button @click="dialogVisible = false">取 消</el-button>
				<el-button type="primary" @click="updateAttendance"
					>确 定</el-button
				>
			</span>
		</el-dialog>
	</div>
</template>

<script>
import { mapState } from "vuex";
export default {
	inject: ["reload"],
	data() {
		return {
			dialogVisible: false,
			nowEmployeeid: "",
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
			input: "",
		};
	},
	methods: {
		handleClose(done) {
			this.$confirm("确认关闭？")
				.then((_) => {
					done();
				})
				.catch((_) => {});
		},
		showDetail(id) {
			this.$store.dispatch("getAttendance", id).then((res) => {
				this.$alert(
					`<strong style="font-size:18px;">缺勤:${this.attendance.absence}次  出席:${this.attendance.attendance}次  迟到:${this.attendance.late}次  早退:${this.attendance.leave_early}次  加班:${this.attendance.overtime}次</strong>`,
					"考勤信息",
					{
						dangerouslyUseHTMLString: true,
					}
				);
			});
		},
		updateAttendance() {
			this.dialogVisible = false;

			var data = {
				id: this.nowEmployeeid,
				status: this.input,
			};
			this.$store.dispatch("updateAttendance", data).then((res) => {
				alert(res);
			});
		},
	},
	computed: {
		...mapState({
			userlist: (state) => state.userlist,
			attendance: (state) => state.attendance,
		}),
	},
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
</style>
