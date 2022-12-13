<template>
    <div>
        <div class="context-title">部门</div>
        <!-- <div class="context-modify" @click="getDepartEmployee">获取部门下的雇员列表</div> -->
        <div class="context">
            <div class="context-nav">
                <span>获取部门下的雇员列表</span>
                <span>部门id</span>
                <span>部门名称</span>
                <span>部门级别</span>
                <span>部门简介</span>
            </div>
            <ul>
                <li class="item" v-for="(item, index) in department">
                    <div><a href="javascript:void(0)" @click="getDepartEmploy(item.did)">获取</a></div>
                    <div>{{ item.did }}</div>
                    <div>{{ item.dname }}</div>
                    <div>{{ item.dlevel }}</div>
                    <div v-if="item.dremark == null">null</div>
                    <div v-else>{{ item.dremark }}</div>
                </li>
            </ul>
        </div>
        <div class="context-employee" :class="{ disappear: !alive }">
            <div class=" context-employee-nav">
                <span>员工ID</span>
                <span>姓名</span>
                <span>级别</span>
                <span>职位</span>
                <span>性别</span>
                <span>文化程度</span>
                <span>照片</span>
                <span>政治面貌</span>
                <span>民族</span>
                <div>操作</div>
            </div>
            <ul>
                <li class="item_employee" v-for="(item, index) in employee">
                    <div>{{ item.id }}</div>
                    <div>{{ item.name }}</div>
                    <div>{{ item.level }}</div>
                    <div>{{ item.status }}</div>
                    <div>{{ item.gender }}</div>
                    <div>{{ item.education }}</div>
                    <div>{{ item.photo }}</div>
                    <div>{{ item.politicalFace }}</div>
                    <div>{{ item.ethnicity }}</div>
                    <div class="operation">
                        <div><a href="#" @click="showDetail(index)">详情</a></div>
                    </div>
                </li>
            </ul>
        </div>
        <div ref='detail' class="detail" :class="{ disappear: !showdetail }">
            <div class="close" @click="Close">关闭</div>
            <div class="detail-nav">
                <span>生日</span>
                <span>电话号码</span>
                <span>部门</span>
                <span>电子邮箱</span>
                <span>用户名</span>
                <span>账户</span>
                <span>密码</span>
                <span>注册时间</span>
            </div>
            <div class="detail-item">
                <div>{{ nowemployee.birthday }}</div>
                <div>{{ nowemployee.phoneNumber }}</div>
                <div>{{ nowemployee.did }}</div>
                <div>{{ nowemployee.email }}</div>
                <div>{{ nowemployee.userName }}</div>
                <div>{{ nowemployee.account }}</div>
                <div>密码不可见 </div>
                <div>{{ nowemployee.registTime }}</div>
            </div>
        </div>
    </div>

</template>

<script>
import { mapState } from 'vuex';
export default {
    inject: ['reload'],
    data() {
        return {
            //雇员模块活跃
            alive: false,
            showdetail: '',
            //详情雇员
            nowemployee: '',
        }
    },
    methods: {
        getDepartEmploy(did) {
            this.alive = true
            this.$store.dispatch('getDepartEmployee', did)
        },
        showDetail(index) {
            this.showdetail = true
            console.log(index);
            this.nowemployee = this.employee[index]
        },
        Close() {
            this.showdetail = false
        }
    },
    computed: {
        ...mapState({
            department: (state) => state.department,
            employee: (state) => state.department_employee
        })
    },
    mounted() {
        this.$store.dispatch('getDepart');
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
    height: 206px;
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
    width: 170px;
    position: absolute;
    left: 1064px;
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
    position: absolute;
    top: 70%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 400px;
}

.basic-grey {

    margin-left: auto;

    margin-right: auto;

    max-width: 1000px;

    background: #F7F7F7;

    padding: 25px 15px 25px 10px;

    font: 12px Georgia, "Times New Roman", Times, serif;

    color: #888;

    text-shadow: 1px 1px 1px #FFF;

    border: 1px solid #E4E4E4;

}

.basic-grey h1 {

    font-size: 25px;

    padding: 0px 0px 10px 40px;

    display: block;

    border-bottom: 1px solid #E4E4E4;

    margin: -10px -15px 30px -10px;
    ;

    color: #888;

}

.basic-grey h1>span {

    display: block;

    font-size: 11px;

}

.basic-grey label {

    display: block;

    margin: 0px;

}

.basic-grey label>span {

    float: left;

    width: 20%;

    text-align: right;

    padding-right: 10px;

    margin-top: 10px;

    color: #888;

}

.basic-grey input[type="text"],
.basic-grey input[type="email"],
.basic-grey textarea,
.basic-grey select {

    border: 1px solid #DADADA;

    color: #888;

    height: 30px;

    margin-bottom: 16px;

    margin-right: 6px;

    margin-top: 2px;

    outline: 0 none;

    padding: 3px 3px 3px 5px;

    width: 70%;

    font-size: 12px;

    line-height: 15px;

    box-shadow: inset 0px 1px 4px #ECECEC;

    -moz-box-shadow: inset 0px 1px 4px #ECECEC;

    -webkit-box-shadow: inset 0px 1px 4px #ECECEC;

}

.basic-grey textarea {

    padding: 5px 3px 3px 5px;

}

.basic-grey select {

    /* background: #FFF url('down-arrow.png') no-repeat right; */

    /* background: #FFF url('down-arrow.png') no-repeat right; */

    appearance: none;

    -webkit-appearance: none;

    -moz-appearance: none;

    text-indent: 0.01px;

    text-overflow: '';

    width: 70%;

    height: 35px;

    line-height: 25px;

}

.basic-grey textarea {

    height: 100px;

}

.basic-grey .button {

    background: #E27575;

    border: none;

    padding: 10px 25px 10px 25px;

    color: #FFF;

    box-shadow: 1px 1px 5px #B6B6B6;

    border-radius: 3px;

    text-shadow: 1px 1px 1px #9E3F3F;

    cursor: pointer;

}

.basic-grey .button:hover {

    background: #CF7A7A
}

.context-nav {
    background-color: rgb(237, 234, 235);
    height: 30px;
    line-height: 30px;
}

.context-nav>span {
    display: block;
    float: left;
    text-align: center;
    width: 162px;
}

.context-nav div {
    float: right;
    width: 120px;
}


.item {
    display: block;
}

.item>div {
    float: left;
    border-bottom: 1px solid pink;
    text-align: center;
    width: 163px;
}

.item :nth-child(5) {
    width: 184px;
    text-align: left;
}

/* employee */
.context-employee {
    border: 2px solid pink;
    border-top: 1px solid pink;
    position: absolute;
    top: 484px;
    left: 394px;
    height: 500px;
    width: 1057px;
}

.context-employee-nav {
    background-color: rgb(237, 234, 235);
    height: 30px;
    line-height: 30px;
}

.context-employee-nav>span {
    display: block;
    float: left;
    text-align: center;
    width: 103px;
}

.context-employee-nav div {
    float: right;
    width: 80px;
}

.item_employee {
    display: block;
}

.item_employee>div {
    float: left;
    border-bottom: 1px solid pink;
    text-align: center;
    width: 103px;
}

.item_employee :nth-child(10) {
    text-align: center;
    width: 126px;
}

.operation {
    width: 120px;
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

.detail-nav>span {
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
</style>