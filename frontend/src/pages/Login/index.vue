<template>
    <div>
        <div class="navbar">
            <div class="nav">
                <span>
                    <router-link to="/home">首页</router-link>
                </span>
                <span>
                    <router-link to="/hire">人才招聘</router-link>
                </span>
                <span>
                    <router-link class="default_chose" to="/login">登录</router-link>
                </span>
            </div>
        </div>
        <div class="logcontext">
            <div class="logarea">
                <div class="log-form">
                    <form>
                        <ul>
                            <li><label for="">姓名： </label><input type="text" class="inp" v-model="name">

                            </li>
                            <li><label for="">登录密码： </label><input type="password" class="inp" v-model="password">

                            </li>
                            <li>
                                <button class="btn" @click.prevent="Loginin">登录</button>
                                <el-button type="info" plain round class="forget" size="mini"
                                    @click="forgetpassword">忘记密码?</el-button>
                            </li>
                        </ul>
                    </form>

                </div>
            </div>
        </div>

        <div class="forget-context" :class="{ disappear: !forget }">
            <el-button plain class="" @click="Close" size="small">关闭</el-button>
            <el-form :inline="true" class="demo-form-inline positon">
                <el-form-item label="请输入邮箱">
                    <el-input placeholder="" v-model="e_mail"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="sendCode">发送验证码</el-button>
                </el-form-item>
                <el-form-item label="请输入密码">
                    <el-input placeholder="" v-model="fpassword"></el-input>
                </el-form-item>
                <el-form-item label="请输入验证码">
                    <el-input placeholder="" v-model="code"></el-input>
                </el-form-item>

                <el-form-item>
                    <el-button type="primary" @click="submitCode">提交</el-button>
                </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script>
export default {
    name: "",
    data() {
        return {
            name: "",
            password: "",
            forget: false,
            e_mail: '',
            code: '',
            fpassword: ''
        }
    },
    methods: {
        async Loginin() {
            try {
                const { name, password } = this
                if (name && password) {
                    await this.$store.dispatch('userLogin', { name, password })
                    // 如果路由当中有query参数择跳到query参数中
                    // let toPath = this.$route.query.redirect || "/systemindex"
                    this.$router.push("/systemindex")
                }
            } catch (error) {
                alert("账户或密码错误")
            }
        },
        forgetpassword() {
            this.forget = true
        },
        Close() {
            this.forget = false
        },
        sendCode() {
            if (this.e_mail) {
                this.$store.dispatch('getCode', this.e_mail)
            }

        },
        submitCode() {
            if (this.e_mail && this.code && this.fpassword) {
                var data = {
                    "email": this.e_mail,
                    "code": this.code,
                    "password": this.fpassword,
                    "confirmedPassword": this.fpassword
                }
                this.$store.dispatch('getNewPassword', data)
            }
        }
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
    color: #000;
}



li {
    list-style-type: none;
}

.navbar {
    height: 30px;
    background-color: rgb(241, 241, 241);
}

.navbar>.nav {
    float: right;
}

.navbar>.nav>span {
    margin-left: 15px;
    padding-right: 50px;
    color: rgb(102, 102, 102);
    border-radius: 5px;
    font-size: 20px;
}

.default_chose {
    color: red;
    border-bottom: 1px solid red;
}

.logcontext {
    width: 1688px;
    height: 800px;
    background-image: url(@/assets/login_container_bg_07.jpg);
}

.logarea {

    box-shadow: 2px 2px 5px rgb(112, 87, 87);
    border-radius: 15px;
    background-color: white;
    float: right;
    margin-top: 100px;
    margin-right: 70px;
    height: 380px;
    width: 380px;
}

.log-form {
    height: 300px;
    width: 400px;
    margin: 50px -20px 0 auto;
}


.log-form ul li {
    margin-bottom: 20px;
    margin-top: 80px;
    /* margin-left: 0px; */
}

.log-form ul li label {
    display: inline-block;
    width: 88px;
    text-align: right;
    text-shadow: 2px 2px 5px red;
}

.log-form ul li .inp {
    width: 242px;
    height: 37px;
    border: 1px solid #ccc;
}

.btn {
    margin: 0px 0px 0px 100px;
    width: 200px;
    height: 34px;
    font-size: 14px;
    color: white;
    background-color: #c81623;
}

.disappear {
    opacity: 0;
    z-index: -1;

}

.positon {
    position: absolute;
    top: 50px;
    left: 30px;
}

.forget {
    position: absolute;
    top: 130px;
    left: 1531px;
}

.forget-context {
    border-radius: 10px;
    width: 476px;
    height: 250px;
    position: absolute;
    top: 227px;
    background-color: white;
    left: 583px;
}
</style>