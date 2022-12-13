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
                        <div><a href="#" @click="delteEmployee(item.id)">删除</a></div>
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
            <form action="" method="post" class="basic-grey">
                <h1>请填写以下信息</h1>
                <div class="closeadd" @click="Close">关闭</div>
                <label>
                    <span>姓名 :</span>
                    <input id="myname" type="text" name="myname" v-model="myname" />
                </label>
                <label>
                    <span>级别 :</span>
                    <input id="level" type="text" name="level" v-model="level" />
                </label>
                <label>
                    <span>职位 :</span>
                    <input id="status" type="text" name="status" v-model="status" />
                </label>
                <label>
                    <span>性别 :</span>
                    <input id="gender" type="text" name="gender" v-model="gender" />
                </label>
                <label>
                    <span>照片URL :</span>
                    <input id="photo" type="text" name="photo" v-model="photo" />
                </label>
                <label>
                    <span>民族 :</span>
                    <input id="ethnicity" type="text" name="ethnicity" v-model="ethnicity" />
                </label>
                <label>
                    <span>生日(yyyy-MM-dd) :</span>
                    <input id="birthday" type="text" name="birthday" v-model="birthday" />
                </label>
                <label>
                    <span>政治面貌 :</span>
                    <input id="politicalFace" type="text" name="politicalFace" v-model="politicalFace" />
                </label>
                <label>
                    <span>文化程度 :</span>
                    <input id="education" type="text" name="education" v-model="education" />
                </label>
                <label>
                    <span>身份证号 :</span>
                    <input id="id_card" type="text" name="id_card" v-model="id_card" />
                </label>
                <label>
                    <span>手机号 :</span>
                    <input id="phone_number" type="text" name="phone_number" v-model="phone_number" />
                </label>
                <label>
                    <span>电子邮箱 :</span>
                    <input id="e_mail" type="text" name="e_mail" v-model="e_mail" />
                </label>
                <label>
                    <span>用户名 :</span>
                    <input id="username" type="text" name="username" v-model="username" />
                </label>
                <label>
                    <span>账户 :</span>
                    <input id="account" type="text" name="account" v-model="account" />
                </label>
                <label>
                    <span>部门编号 :</span>
                    <input id="did" type="text" name="did" v-model="did" />
                </label>
                <label>
                    <span>&nbsp;</span>
                    <input type="button" class="button" value="提交" @click="modifyEmployee" />
                </label>
            </form>
        </div>
        <div ref="delete" class="delete" :class="{ disappear: !showdelete }">
            <div class="close" @click="Close">关闭</div>
            <div class="delete-title">你确定要删除吗</div>
            <div class="choose">
                <div><a href="#">是</a></div>
                <div><a href="#">否</a></div>
            </div>
        </div>
        <div ref="add" class="add" :class="{ disappear: !showadd }">
            <form action="" method="post" class="basic-grey" :class="{ disableform: !showadd }">
                <h1>请填写以下信息</h1>
                <div class="closeadd" @click="Close">关闭</div>
                <label>
                    <span>姓名 :</span>
                    <input id="myname" type="text" name="myname" v-model="myname" />
                </label>
                <label>
                    <span>级别 :</span>
                    <input id="level" type="text" name="level" v-model="level" />
                </label>
                <label>
                    <span>职位 :</span>
                    <input id="status" type="text" name="status" v-model="status" />
                </label>
                <label>
                    <span>性别 :</span>
                    <input id="gender" type="text" name="gender" v-model="gender" />
                </label>
                <label>
                    <span>照片URL :</span>
                    <input id="photo" type="text" name="photo" v-model="photo" />
                </label>
                <label>
                    <span>民族 :</span>
                    <input id="ethnicity" type="text" name="ethnicity" v-model="ethnicity" />
                </label>
                <label>
                    <span>生日(yyyy-MM-dd) :</span>
                    <input id="birthday" type="text" name="birthday" v-model="birthday" />
                </label>
                <label>
                    <span>政治面貌 :</span>
                    <input id="politicalFace" type="text" name="politicalFace" v-model="politicalFace" />
                </label>
                <label>
                    <span>文化程度 :</span>
                    <input id="education" type="text" name="education" v-model="education" />
                </label>
                <label>
                    <span>身份证号 :</span>
                    <input id="id_card" type="text" name="id_card" v-model="id_card" />
                </label>
                <label>
                    <span>手机号 :</span>
                    <input id="phone_number" type="text" name="phone_number" v-model="phone_number" />
                </label>
                <label>
                    <span>电子邮箱 :</span>
                    <input id="e_mail" type="text" name="e_mail" v-model="e_mail" />
                </label>
                <label>
                    <span>用户名 :</span>
                    <input id="username" type="text" name="username" v-model="username" />
                </label>
                <label>
                    <span>账户 :</span>
                    <input id="account" type="text" name="account" v-model="account" />
                </label>
                <label>
                    <span>部门编号 :</span>
                    <input id="did" type="text" name="did" v-model="did" />
                </label>
                <label>
                    <span>密码 :</span>
                    <input id="password" type="text" name="password" v-model="password" />
                </label>
                <label>
                    <span>&nbsp;</span>
                    <input type="button" class="button" value="提交" @click="addEmployee" />
                </label>
            </form>
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
            showdelete: false,
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
            this.showadd = true;
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
            this.nowindex = id

        },
        showDelete(id) {
            if (this.active == 0) {
                this.showdelete = true
                this.active = 1
            }
            this.nowindex = id
        },
        Close() {
            this.showdetail = false
            this.showdelete = false
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
    position: absolute;
    top: 70%;
    left: 50%;
    transform: translate(-50%, -50%);
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