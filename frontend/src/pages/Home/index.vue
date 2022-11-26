<template>
    <div>
        <div class="navbar">
            <div class="nav">
                <span>
                    <router-link class="default_chose" to="/home">首页</router-link>
                </span>
                <span>
                    <router-link to="/hire">人才招聘</router-link>
                    <!-- <a href="./pages/hires.html"></a> -->
                </span>
                <span>
                    <router-link to="/login">登录</router-link>
                </span>
            </div>
        </div>

        <div class="image">
            <img src="@/assets/index_big.jpg">
        </div>
        <div class="newsflash">
            <div class="news">
                <h2 class="about_title">新闻动态</h2>
                <div class="news-bd">
                    <ul>
                        <a href="#">
                            <li>
                                <div class="left">
                                    <p class="en">22-11</p>
                                    <p class="num">15</p>
                                </div>
                                <div class="right">
                                    <p class="p1">还没想好是什么新闻</p>
                                    <p class="p2">时间：11月15日19:00 地点山东大学威海</p>
                                </div>
                            </li>
                        </a>
                        <a href="#">
                            <li>
                                <div class="left">
                                    <p class="en">22-11</p>
                                    <p class="num">15</p>
                                </div>
                                <div class="right">
                                    <p class="p1">还没想好是什么新闻</p>
                                    <p class="p2">时间：11月15日19:00 地点山东大学威海</p>
                                </div>
                            </li>
                        </a>
                        <a href="#">
                            <li>
                                <div class="left">
                                    <p class="en">22-11</p>
                                    <p class="num">15</p>
                                </div>
                                <div class="right">
                                    <p class="p1">还没想好是什么新闻</p>
                                    <p class="p2">时间：11月15日19:00 地点山东大学威海</p>
                                </div>
                            </li>
                        </a>
                        <a href="#">
                            <li>
                                <div class="left">
                                    <p class="en">22-11</p>
                                    <p class="num">15</p>
                                </div>
                                <div class="right">
                                    <p class="p1">还没想好是什么新闻</p>
                                    <p class="p2">时间：11月15日19:00 地点山东大学威海</p>
                                </div>
                            </li>
                        </a>
                    </ul>
                </div>
            </div>
        </div>
        <div class="about">
            <h2 class="about_title">关于我们</h2>

            <div class="team">
                <span>尹冠宇</span>
                <span>牛丙钊</span>
                <span>徐奥峰</span>
                <span>方宁</span>
                <span>任翔宇</span>
                <span>白阳烨</span>
            </div>
            <div class="copyright">
                计算机合2班 Java大作业

            </div>
        </div>
    </div>
</template>

<script>
export default {

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

a:hover {
    color: red;
    border-bottom: 1px solid red;
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

img {
    display: block;
    width: 1510px;
}

.newsflash {
    /* float: right; */
    margin: 0 auto;
    width: 1500px;
    height: 700px;
    border-bottom: 10px dotted #e4e4e4;
}

.news-bd ul a {
    display: block;
}

.news-bd ul a:nth-child(odd) {
    background-color: wheat;
}

.news-bd ul a:nth-child(even) {
    background-color: white;
}

.news-bd li {
    width: 100%;
    height: 130px;
    padding: 30px 15px;
}

.left {
    width: 45px;
    float: left;
    text-align: right;
}

.news-bd li .left .en {
    font-size: 14px;
    color: #ba323b;
    padding-bottom: 12px;
}

.news-bd li .left .num {
    font-size: 24px;
    color: #ba323b;
    padding-bottom: 15px;
    display: inline-block;
    border-bottom: 4px solid #ba323b;
    position: relative;
}

.news-bd li .right {
    float: left;
    width: 335px;
    padding-left: 30px;
}

.news-bd li .right .p1 {
    font-size: 18px;
    color: #464646;
    padding-bottom: 22px;
    display: block;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}

.news-bd li .right .p2 {
    font-size: 14px;
    color: #848484;
    padding-bottom: 22px;
    display: block;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}

.more {
    font-size: 14px;
    float: right;
}


.about {
    height: 300px;
    background-color: rgb(241, 241, 241);
}

.about_title {
    padding-top: 30px;
    text-align: center;
    color: rgb(172, 204, 230);
    font-weight: 700;
    text-shadow: 2px 2px 5px rgb(228, 219, 219);
}


.about>.team {
    padding-top: 10px;
    text-align: center;
}

.about>.team>span {
    margin-left: 10px;
    margin-right: 30px;
}

.copyright {
    text-align: center;
    padding-top: 100px;
    line-height: 20px;
    color: rgb(102, 102, 102);

}
</style>