<template>
    <div>
        <div class="context-title">公司用户管理</div>
        <div class="context-add"><a href="#">增添员工</a> </div>
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
                <li class="item">
                    <div>001</div>
                    <div>尹冠宇</div>
                    <div>1</div>
                    <div>员工</div>
                    <div>男</div>
                    <div>高中</div>
                    <div>照片</div>
                    <div>团员</div>
                    <div>汉</div>

                    <div class="operation">
                        <div><a href="#">详情</a></div>
                        <div><a href="#">编辑</a></div>
                        <div><a href="#">删除</a></div>
                    </div>
                </li>
            </ul>
        </div>

        <div class="detail disappear">
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
                <div>2003-03-27</div>
                <div>1550000000</div>
                <div>技术部</div>
                <div>1242453657@qq.com</div>
                <div>糖送</div>
                <div>糖送</div>
                <div>777777</div>
                <div>2003-03-27</div>
            </div>
        </div>
        <div class="update disappear">
            <form action="" method="post" class="basic-grey">
                <!-- <%--注意form title中的class就是下文提到的几种样式的名称，引入的时候要自己替换过来 --%> -->
                <h1>请填写以下信息</h1>
                <label>
                    <span>姓名 :</span>
                    <input id="name" type="text" name="name" />
                </label>
                <label>
                    <span>级别 :</span>
                    <input id="level" type="text" name="level" />
                </label>
                <label>
                    <span>职位 :</span>
                    <input id="position" type="text" name="position" />
                </label>
                <label>
                    <span>性别 :</span>
                    <input id="gender" type="text" name="gender" />
                </label>
                <label>
                    <span>照片URL :</span>
                    <input id="photo" type="text" name="photo" />
                </label>
                <label>
                    <span>民族 :</span>
                    <input id="ethnicity" type="text" name="ethnicity" />
                </label>
                <label>
                    <span>生日(yyyy-MM-dd) :</span>
                    <input id="birthday" type="text" name="birthday" />
                </label>
                <label>
                    <span>政治面貌 :</span>
                    <input id="politicalFace" type="text" name="politicalFace" />
                </label>
                <label>
                    <span>文化程度 :</span>
                    <input id="education" type="text" name="education" />
                </label>
                <label>
                    <span>身份证号 :</span>
                    <input id="id_card" type="text" name="id_card" />
                </label>
                <label>
                    <span>手机号 :</span>
                    <input id="phone_number" type="text" name="phone_number" />
                </label>
                <label>
                    <span>电子邮箱 :</span>
                    <input id="e_mail" type="text" name="e_mail" />
                </label>
                <label>
                    <span>用户名 :</span>
                    <input id="username" type="text" name="username" />
                </label>
                <label>
                    <span>账户 :</span>
                    <input id="account" type="text" name="account" />
                </label>
                <label>
                    <span>部门编号 :</span>
                    <input id="did" type="text" name="did" />
                </label>
                <label>
                    <span>&nbsp;</span>
                    <input type="button" class="button" value="提交" />
                </label>
            </form>
        </div>
        <div class="delete disappear">
            <div class="delete-title">你确定要删除吗</div>
            <div class="choose">
                <div><a href="#">是</a></div>
                <div><a href="#">否</a></div>
            </div>
        </div>
        <div class="add disappear">
            <form action="" method="post" class="basic-grey">
                <!-- <%--注意form title中的class就是下文提到的几种样式的名称，引入的时候要自己替换过来 --%> -->
                <h1>请填写以下信息</h1>
                <label>
                    <span>姓名 :</span>
                    <input id="name" type="text" name="name" />
                </label>
                <label>
                    <span>级别 :</span>
                    <input id="level" type="text" name="level" />
                </label>
                <label>
                    <span>职位 :</span>
                    <input id="position" type="text" name="position" />
                </label>
                <label>
                    <span>性别 :</span>
                    <input id="gender" type="text" name="gender" />
                </label>
                <label>
                    <span>照片URL :</span>
                    <input id="photo" type="text" name="photo" />
                </label>
                <label>
                    <span>民族 :</span>
                    <input id="ethnicity" type="text" name="ethnicity" />
                </label>
                <label>
                    <span>生日(yyyy-MM-dd) :</span>
                    <input id="birthday" type="text" name="birthday" />
                </label>
                <label>
                    <span>政治面貌 :</span>
                    <input id="politicalFace" type="text" name="politicalFace" />
                </label>
                <label>
                    <span>文化程度 :</span>
                    <input id="education" type="text" name="education" />
                </label>
                <label>
                    <span>身份证号 :</span>
                    <input id="id_card" type="text" name="id_card" />
                </label>
                <label>
                    <span>手机号 :</span>
                    <input id="phone_number" type="text" name="phone_number" />
                </label>
                <label>
                    <span>电子邮箱 :</span>
                    <input id="e_mail" type="text" name="e_mail" />
                </label>
                <label>
                    <span>用户名 :</span>
                    <input id="username" type="text" name="username" />
                </label>
                <label>
                    <span>账户 :</span>
                    <input id="account" type="text" name="account" />
                </label>
                <label>
                    <span>部门编号 :</span>
                    <input id="did" type="text" name="did" />
                </label>
                <label>
                    <span>密码 :</span>
                    <input id="password" type="text" name="password" />
                </label>
                <label>
                    <span>&nbsp;</span>
                    <input type="button" class="button" value="提交" />
                </label>
            </form>
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
    width: 1100px;
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
    width: 120px;
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
    width: 120px;
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
</style>