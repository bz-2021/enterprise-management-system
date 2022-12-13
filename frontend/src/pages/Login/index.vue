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
                                <!-- <input type="submit" value="登录" class="btn"> -->
                            </li>
                        </ul>
                    </form>

                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "",
    data() {
        return {
            name: "",
            password: ""
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
</style>