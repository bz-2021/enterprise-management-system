<template>
    <div>
        <div class="side">
            <div class="side-menu">系统管理菜单</div>

            <div class="side-user">
                <div class="side-item-title side-choose">用户管理</div>
                <!-- <div class="side-item"><a href="#">普通用户管理</a></div> -->
                <div class="side-item">
                    <router-link to="/systemindex">个人管理</router-link>
                </div>
                <div class="side-item">
                    <router-link to="/systemuser">公司用户管理</router-link>
                </div>
                <div class="side-item">
                    <router-link to="/systemdepart">部门管理</router-link>
                </div>
                <div class="side-item">
                    <router-link to="/systemattendance">考勤管理</router-link>
                </div>
            </div>
            <div class="side-news">
                <div class="side-item-title">资讯管理</div>
                <div class="side-item">
                    <router-link class="side-item" to="/systemannounce">公告管理</router-link>
                </div>
                <div class="side-item">
                    <router-link class="side-item" to="/systemcomplain">投诉管理</router-link>
                </div>
            </div>
            <div class="side-activity">
                <div class="side-item-title">活动管理</div>
                <div class="side-item">
                    <router-link class="side-item" to="/systemacitvity">发起官方活动</router-link>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style scoped>
.side {
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
}
</style>