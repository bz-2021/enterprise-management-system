<template>
    <div>
        <div class="context-title">系统首页</div>
        <div class="context">
            <div class="context-detail">您好，欢迎来到后台管理系统</div>
        </div>
    </div>
</template>

<script>
export default {

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

.context-detail {
    text-align: center;
    line-height: 246px;
    height: 246px;
    width: 840px;
}
</style>