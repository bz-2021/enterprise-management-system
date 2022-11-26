<template>
    <div>
        <div class="context-title">投诉管理</div>
        <div class="context">
            <div class="context-nav">
                <span>投诉内容</span>
                <span>投诉时间</span>
                <span>投诉者</span>
                <span>操作</span>
            </div>
            <ul>
                <li class="item">
                    <div>这是第一个投诉</div>
                    <div>2022-11-24</div>
                    <div>尹冠宇</div>
                    <div>编辑</div>
                </li>
            </ul>
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

.context {
    border: 2px solid pink;
    border-top: 1px solid pink;
    position: absolute;
    top: 210px;
    left: 394px;
    height: 500px;
    width: 837px;
}

.context-title {
    background-color: rgb(68, 81, 97);
    height: 30px;
    color: rgb(255, 255, 255);
    width: 120px;
    position: absolute;
    left: 394px;
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

.context-nav {
    background-color: rgb(237, 234, 235);
    height: 30px;
    line-height: 30px;
}

.context-nav>span {
    display: block;
    float: left;
    text-align: center;
    width: 126px;
}

.context-nav>span:nth-child(1) {
    display: block;
    float: left;
    text-align: center;
    width: 455px;
}



.item {
    display: block;
}

.item>div:nth-child(1) {
    float: left;
    border-bottom: 1px solid pink;
    width: 455px;
    text-align: left;
}

.item>div {
    float: left;
    border-bottom: 1px solid pink;
    width: 126px;
    text-align: center;
}
</style>