<template>
	<div class="hello">
		<div class="row">
			<div class="col-3">
				<div class="card-body">
					<h3> 公司部门管理 </h3>
				</div>
			</div>
			<div class="col-4"></div>
			<div class="col-5"> </div>
		</div>
		<!-- <div class="context-modify" @click="getDepartEmployee">获取部门下的雇员列表</div> -->
		<table class="table table-bordered" style="width: 96%; margin-top: 4vh">
			<thead>
				<tr>
					<th scope="col" width="10%">雇员列表</th>
					<th scope="col" width="7%">部门id</th>
					<th scope="col" width="15%">部门名称</th>
					<th scope="col" width="7%">级别</th>
					<th scope="col" width="61%">简介</th>
				</tr>
			</thead>
			<tbody>
				<tr class="item" v-for="(item, index) in department">
					<td>
						<button
							type="button"
							style="width: 70%"
							class="btn btn-primary btn-sm submitbtn"
							data-bs-toggle="modal"
							data-bs-target="#getDepartemploy"
							@click="getDepartEmploy(item.did)"
							>获取
						</button>
						<div
							class="modal"
							id="getDepartemploy"
							tabindex="-1"
							aria-labelledby="exampleModalLabel"
							data-bs-backdrop="static"
							aria-hidden="true">
							<div
								class="modal-dialog modal-dialog-centered modal-xl">
								<div class="modal-content">
									<div class="modal-header">
										<h1
											class="modal-title fs-5"
											id="exampleModalLabel"
											>当前部门的雇员列表</h1
										>
										<button
											type="button"
											class="btn-close"
											data-bs-dismiss="modal"
											aria-label="Close"></button>
									</div>
									<div class="modal-body">
										<table
											class="table table-bordered"
											style="width: 96%; margin-top: 4vh">
											<thead>
												<tr>
													<th scope="col">员工</th>
													<th scope="col">姓名</th>
													<th scope="col">级别</th>
													<th scope="col">职位</th>
													<th scope="col">性别</th>
													<th scope="col">文化 </th>
													<th scope="col">
														政治面貌
													</th>
													<th scope="col">生日</th>
													<th scope="col">电话</th>

													<th scope="col">邮箱</th>
													<th scope="col"> 账户 </th>
													<th scope="col"
														>注册时间</th
													>
												</tr>
											</thead>
											<tbody>
												<tr
													class="tr"
													v-for="(
														item, index
													) in employee">
													<h3
														v-if="
															employee.length == 0
														"
														>当前部门下没有员工</h3
													>
													<th scope="row">{{
														item.id
													}}</th>
													<td>{{ item.name }}</td>
													<td>{{ item.level }}</td>
													<td>{{ item.status }}</td>
													<td>{{ item.gender }}</td>
													<td>{{
														item.education
													}}</td>
													<td>{{
														item.politicalFace
													}}</td>
													<td>{{ item.birthday }}</td>
													<td>{{
														item.phoneNumber
													}}</td>
													<td>{{ item.email }}</td>
													<td>{{ item.account }}</td>
													<td>{{
														item.registTime
													}}</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="modal-footer">
										<button
											type="button"
											class="btn btn-secondary"
											data-bs-dismiss="modal"
											>确定</button
										>
									</div>
								</div>
							</div>
						</div>
					</td>
					<th scope="row">{{ item.did }}</th>
					<td>{{ item.dname }}</td>
					<td>{{ item.dlevel }}</td>
					<td>{{ item.dremark }}</td>
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
			//雇员模块活跃
			alive: false,
			showdetail: "",
			//详情雇员
			nowemployee: "",
		};
	},
	methods: {
		getDepartEmploy(did) {
			this.alive = true;
			console.log(did);
			this.$store.dispatch("getDepartEmployee", did);
		},
		showDetail(index) {
			this.showdetail = true;
			console.log(index);
			this.nowemployee = this.employee[index];
		},
		Close() {
			this.showdetail = false;
		},
	},
	computed: {
		...mapState({
			department: (state) => state.department,
			employee: (state) => state.department_employee,
		}),
	},
	mounted() {
		this.$store.dispatch("getDepart");
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
