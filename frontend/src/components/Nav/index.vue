<template>
	<div>
		<div class="card-body">
			<a class="list-group-item list-group-item-action disabled">
				<h5>系统管理菜单</h5>
			</a>
		</div>

		<div class="list-group">
			<a class="list-group-item list-group-item-action disabled">
				<b>用户管理</b>
			</a>
			<router-link
				to="/systemindex"
				class="list-group-item list-group-item-action">
				个人管理
			</router-link>
			<router-link
				to="/systemuser"
				class="list-group-item list-group-item-action">
				公司用户管理
			</router-link>
			<router-link
				to="/systemdepart"
				class="list-group-item list-group-item-action">
				部门管理
			</router-link>
			<router-link
				to="/systemattendance"
				class="list-group-item list-group-item-action">
				考勤管理
			</router-link>
		</div>
		<div class="card-body"> </div>
		<div class="list-group">
			<a class="list-group-item list-group-item-action disabled">
				<b>资讯管理</b>
			</a>
			<router-link
				to="/systemannounce"
				class="list-group-item list-group-item-action">
				公告管理
			</router-link>
			<router-link
				to="/systemcomplain"
				class="list-group-item list-group-item-action">
				投诉管理
			</router-link>
		</div>
		<div class="card-body"> </div>
		<div class="list-group">
			<a class="list-group-item list-group-item-action disabled">
				<b>活动管理</b>
			</a>
			<router-link
				to="/systemacitvity"
				class="list-group-item list-group-item-action">
				发起官方活动
			</router-link>
		</div>
		<div class="card-body"></div>
	</div>
</template>

<script>
export default {};
</script>

<style scoped>
.list-group {
}
/* .side {
    float: left;
    margin-left: 15px;
    margin-top: 20px;
    width: 192px;
    height: 313px;
}

.side-menu {
    background-color: rgb(51, 78, 117);
    height: 35px;
    color: white;
    text-align: center;
    font-weight: 700;
    line-height: 35px;
}



.side-item-title {
    background-color: rgb(151, 164, 182);
    height: 30px;
    line-height: 30px;
    padding-left: 15px;
    color: white;
    font-size: 13px;
}

.side-choose {
    background-color: rgb(87, 119, 161);
}

.side-item {
    border: 1px solid rgb(239, 239, 239);
    padding-left: 12px;
    height: 30px;
    line-height: 30px;
    border-left: 2px solid pink;
    border-right: 2px solid pink;
}

.side-activity {
    border-bottom: 2px solid pink;
} */
</style>
