<template>
    <div>
        <div class="title">
            <h1>后台管理系统</h1>
        </div>
        <div class="nav">
            <span class="nav-bar choose"> <a href="#">管理首页</a></span>
            <!-- <span class="nav-bar"><a href="#">管理二页</a> </span> -->
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

li {
    list-style-type: none;
}

.title {
    background-color: rgb(68, 81, 97);
    height: 130px;
    color: wheat;
    line-height: 180px;
    text-shadow: 2px 2px 5px red;
    font-size: large;
}

.nav {
    height: 30px;
    background-color: rgb(87, 119, 161);
}

.nav-bar {
    float: left;
    margin-left: 15px;
    width: 90px;
    height: 30px;
}

.nav-bar a {
    display: block;
    text-align: center;
    color: white;
    font-weight: 700;
}

.choose {
    background-color: rgb(53, 79, 116);

}
</style>