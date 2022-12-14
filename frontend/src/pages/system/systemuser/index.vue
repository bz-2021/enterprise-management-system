<template>
    <div>
        <div class="context-title">公司用户管理</div>
        <div class="context-add" @click="showAdd"><a href="#">增添员工</a> </div>
        <div class="context">
            <div class="context-nav">
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
                <li class="item" v-for="(item, index) in userlist">
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
                        <div><a href="#" @click="showUpdate(index, item.id)">编辑</a></div>
                        <el-popover placement="top" width="160">
                            <p>确定删除吗？</p>
                            <div style="text-align: right; margin: 0">
                                <el-button type="primary" size="mini" @click="delteEmployee(item.id)">确定</el-button>
                            </div>
                            <a slot="reference">删除</a>
                        </el-popover>
                    </div>
                </li>
            </ul>
        </div>

        <div ref='detail' class="detail" :class="{ disappear: !showdetail }">
            <el-button type="warning" @click="Close" size="small">关闭</el-button>
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
                <div>{{ user.birthday }}</div>
                <div>{{ user.phoneNumber }}</div>
                <div>{{ user.did }}</div>
                <div>{{ user.email }}</div>
                <div>{{ user.userName }}</div>
                <div>{{ user.account }}</div>
                <div>{{ user.password }}</div>
                <div>{{ user.registTime }}</div>
            </div>
        </div>
        <div ref="update" class="update" :class="{ disappear: !showupdate }">
            <el-form ref="form" label-width="160px">
                <el-form-item label="姓名 :">
                    <el-input v-model="myname"></el-input>
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
                <el-form-item>
                    <el-button type="primary" @click="modifyEmployee">提交</el-button>
                    <el-button @click="Close">取消</el-button>
                </el-form-item>
            </el-form>
        </div>
        <div ref="add" class="add" :class="{ disappear: !showadd }">
            <el-form ref="form" label-width="160px">
                <el-form-item label="姓名 :">
                    <el-input v-model="myname"></el-input>
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
                    <el-input v-model="password"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="addEmployee">提交</el-button>
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
            showadd: false,
            showdetail: false,
            showupdate: false,
            nowEmployeeid: '',
            nowindex: '',//现在指向哪个id
            active: 0,//同一时间只能活跃一个窗口
            user: '',
            myname: '', level: '', status: '', gender: '', photo: '',
            ethnicity: '', birthday: '', politicalFace: '',
            education: '', id_card: '', phone_number: '',
            e_mail: '', username: '', account: '', did: '', password: '',
        }
    },
    methods: {
        delteEmployee(id) {
            this.$store.dispatch('delEmployee', id);
        },
        modifyEmployee() {
            var data = {
                "employee_id": this.nowEmployeeid, "name": this.myname, "level": this.level, "status": this.status, "gender": this.gender
                , "photo": this.photo, "ethnicity": this.ethnicity, "birthday": this.birthday, "politicalFace": this.politicalFace, "education": this.education
                , "id_card": this.id_card, "phone_number": this.phone_number
                , "e_mail": this.e_mail, "username": this.username, "account": this.account, "did": this.did
            }
            console.log(data);
            this.$store.dispatch('molEmployee', data).then(res => {
                this.reload()
            });
        },
        addEmployee() {
            var data = {
                "name": this.myname, "level": this.level, "status": this.status, "gender": this.gender
                , "photo": this.photo, "ethnicity": this.ethnicity, "birthday": this.birthday, "politicalFace": this.politicalFace, "education": this.education
                , "id_card": this.id_card, "phone_number": this.phone_number
                , "e_mail": this.e_mail, "username": this.username, "account": this.account, "did": this.did, "password": this.password, "confirmedPassword": this.password
            }
            this.$store.dispatch('addEmployee', data).then(res => {
                this.reload()
            });
        },
        showAdd() {
            if (this.active == 0) {
                this.showadd = true
                this.active = 1
            }

        },
        showDetail(id) {
            if (this.active == 0) {
                this.showdetail = true
                this.active = 1
            }
            this.nowindex = id
            // console.log();
            this.user = this.userlist[id]
        },
        showUpdate(id, nowEmployeeid) {
            if (this.active == 0) {
                this.showupdate = true
                this.active = 1
            }
            this.nowEmployeeid = nowEmployeeid
            console.log(this.active);
            this.nowindex = id

        },
        Close() {
            this.showdetail = false
            this.showupdate = false
            this.showadd = false
            this.active = 0
        }
    },
    computed: mapState({
        userlist: (state) => state.userlist
    }),
    mounted: function () {
        this.$store.dispatch('getList')

    }

}

</script>

<style scoped>
* {
    margin: 0 auto;
    padding: 0;
    box-sizing: border-box;
}

a {
    text-decoration: none;
    /* color: #000; */
}

li {
    list-style-type: none;
}

.context {
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

.context-nav>span {
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

.item>div {
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

.operation>div {
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

.update {
    background-color: #ffffff;
    position: absolute;
    top: 25%;
    left: 32%;
    /* transform: translate(-50%, -50%); */
    width: 400px;
}



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
    /* transform: translate(-50%, -50%); */
    width: 400px;
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
    /* background: rgb(148, 152, 147); */
    text-align: center;
}

.disableform {
    pointer-events: none;
}
</style>