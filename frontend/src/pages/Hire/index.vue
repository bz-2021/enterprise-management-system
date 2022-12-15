<template>
    <div>
        <div class="navbar">
            <div class="nav">
                <span>
                    <router-link to="/home">首页</router-link>
                </span>
                <span>
                    <router-link class="default_chose" to="/hire">人才招聘</router-link>
                </span>
                <span>
                    <router-link to="/login">登录</router-link>
                </span>
            </div>
        </div>
        <div class="image">
            <img src="@/assets/hires_big.jpeg">
        </div>
        <div class="context">
            <div class="join">
                <div class="join_title"> 加入我们</div>
                <div class="reg-form">
                    <form action="">
                        <ul>
                            <li>
                                <input class="user-input" type="text" name="search" placeholder="请输入岗位名称">
                                <input class="user-btn" type="button" value="搜索">
                            </li>
                            <li>
                                <label>所在省</label>
                                <select>
                                    <option>山东</option>
                                    <option>北京</option>
                                    <option>上海</option>
                                </select>
                            </li>
                        </ul>
                    </form>
                </div>

            </div>
            <div class="job">
                <div class="job-title">新的职位</div>
                <div class="job-content">

                    <ul>
                        <li>
                            <div class="subbox">
                                <a href="#">
                                    <div class="subtop">
                                        <p class="name">前端开发工程师（山东） </p>
                                        <span class="salary">15-23K</span>
                                    </div>
                                    <p class="job-text">5-10年本科</p>
                                </a>
                                <div class="commanybox">
                                    <a href="#" class="commany-info">
                                        <span>计算机软件</span>
                                        <span>企业服务</span>
                                    </a>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="subbox">
                                <a href="#">
                                    <div class="subtop">
                                        <p class="name">硬件工程师（山东） </p>
                                        <span class="salary">15-23K</span>
                                    </div>
                                    <p class="job-text">5-10年本科</p>
                                </a>
                                <div class="commanybox">
                                    <a href="#" class="commany-info">
                                        <span>智能硬件</span>
                                        <span>企业服务</span>
                                    </a>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="subbox">
                                <a href="#">
                                    <div class="subtop">
                                        <p class="name">JAVA研发工程师（山东） </p>
                                        <span class="salary">15-18K</span>
                                    </div>
                                    <p class="job-text">3-5年本科</p>
                                </a>
                                <div class="commanybox">
                                    <a href="#" class="commany-info">
                                        <span>计算机软件</span>
                                        <span>企业服务</span>
                                    </a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>
* {
    margin: 0 auto;
    padding: 0;
    box-sizing: border-box;
}

li {
    list-style-type: none
}

a {
    text-decoration: none;
    color: #000;
}

a:hover {
    color: red;
    border-bottom: 1px solid red;
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

img {
    display: block;
    width: 1510px;
    height: 500px;
}

.join {
    padding-top: 70px;
    width: 500px;
    padding-left: 70px;
    text-align: center;
    float: left;
}

.context>.join>.join_title {
    float: left;
    margin-left: 20px;
    margin-top: 3px;
    font-size: large;
    font-weight: 500;
}

.user-input {
    width: 200px;
    height: 30px;
    border: 2px solid rgb(109, 109, 164);
    border-radius: 5px;
    box-sizing: border-box;
    outline: none;
    text-indent: 10px;
}

.user-btn {
    width: 70px;
    height: 30px;
    border: none;
    border-radius: 5px;
    background: rgb(140, 140, 235);
    vertical-align: middle;
    outline: none;
    color: white;
    font-size: 20px;
}

.job {
    margin-top: 5px;
    float: right;

}

.job-title {
    margin-left: 20px;
    margin-top: 3px;
    font-size: large;
    font-weight: 500;
    text-align: center;
}

.job-content {
    width: 1000px;
}

.job-content>ul li {
    height: 130px;
    width: 750px;
    float: left;
    margin: 30px 14px 16px 170px;
    background: #fff;
    border: 1px solid #eef0f5;
}

.subbox {
    display: block;
    height: 130px;
    width: 750px;

    padding: 16px 20px;
    box-sizing: border-box;
}

.subtop {
    overflow: hidden;
}

.name {
    position: relative;

    font-size: 15px;
    color: #414a60;
    margin-right: 8px;

    overflow: hidden;

    float: left;

}

.salary {
    float: right;
    color: #f90;
    font-size: 14px;
}

.job-text {
    line-height: 40px;
}

.user-info img {
    width: 30px;
    height: 30px;
    float: left;
    margin-right: 10px;
}

.commanybox {
    border-top: 1px solid #eef0f5;
    line-height: 30px;
    padding-top: 12px;
}

.commany-info span {
    font-size: 14px;
    margin-right: 10px;
}
</style>