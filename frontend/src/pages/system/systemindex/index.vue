<template>
    <div>
        <div class="context-title">系统首页</div>
        <div class="context-modify" @click="modify">修改个人信息</div>
        <div class="context">
            <div class="context-detail">{{ self.department }} {{ self.status }}{{ self.name }}，欢迎来到后台管理系统</div>
        </div>
        <div ref="update" class="update" :class="{ disappear: !show }">
            <div class="close" @click="Close">关闭</div>
            <form action="" method="post" class="basic-grey">
                <!-- <%--注意form title中的class就是下文提到的几种样式的名称，引入的时候要自己替换过来 --%> -->
                <h1>请填写以下信息</h1>
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
                    <span>&nbsp;</span>
                    <input type="button" class="button" value="提交" @click="submit" />
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
            show: false,
            photo: '', ethnicity: '', birthday: '',
            politicalFace: '', education: '',
            id_card: '', phone_number: '',
            e_mail: '', username: '', account: ''
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