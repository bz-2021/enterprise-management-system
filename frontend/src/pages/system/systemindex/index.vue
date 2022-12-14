<template>
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