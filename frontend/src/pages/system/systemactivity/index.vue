<template>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5295905 (修复路由)
    <div>
        <div class="context-title">发布活动</div>
        <div class="context">
            <div class="context-nav">
                <span>1. 填写活动内容</span>
                <span>>></span>
                <span>2. 提交</span>
                <span>>></span>
                <span>3. 完成</span>
            </div>
            <form action="" method="post" class="white-pink">
                <!-- <%--注意form title中的class就是下文提到的几种样式的名称，引入的时候要自己替换过来 --%> -->
                <h1>活动表
                    <span>请填写以下信息.</span>
                </h1>
                <label>
                    <span>活动标题 :</span>
                    <input id="name" type="text" name="name" placeholder="Your Full Name" />
                </label>
                <label>
                    <span>开始时间 :</span>
                    <input id="timebegin" type="text" name="timebegin" placeholder="Valid Email Address" />
                </label>
                <label>
                    <span>截止时间 :</span>
                    <input id="timeend" type="text" name="timeend" placeholder="Valid Email Address" />
                </label>
                <label>
                    <span>活动内容 :</span>
                    <textarea id="message" name="message" placeholder="Your Message to Us"></textarea>
                </label>
                <label>
                    <span>活动类型 :</span><select name="selection">
                        <option value="吃饭">吃饭</option>
                        <option value="旅行">旅行</option>
                    </select>
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
<<<<<<< HEAD
=======
=======
	<div class="hello">
		<div class="context-title">发布活动</div>
		<div class="context">
			<div class="context-nav">
				<span>1. 填写活动内容</span>
				<span>>></span>
				<span>2. 提交</span>
				<span>>></span>
				<span>3. 完成</span>
			</div>
			<form action="" method="post" class="white-pink">
				<!-- <%--注意form title中的class就是下文提到的几种样式的名称，引入的时候要自己替换过来 --%> -->
				<h1
					>活动表
					<span>请填写以下信息.</span>
				</h1>
				<label>
					<span>活动标题 :</span>
					<input
						id="name"
						type="text"
						name="name"
						placeholder="Your Full Name" />
				</label>
				<label>
					<span>开始时间 :</span>
					<input
						id="timebegin"
						type="text"
						name="timebegin"
						placeholder="Valid Email Address" />
				</label>
				<label>
					<span>截止时间 :</span>
					<input
						id="timeend"
						type="text"
						name="timeend"
						placeholder="Valid Email Address" />
				</label>
				<label>
					<span>活动内容 :</span>
					<textarea
						id="message"
						name="message"
						placeholder="Your Message to Us"></textarea>
				</label>
				<label>
					<span>活动类型 :</span
					><select name="selection">
						<option value="吃饭">吃饭</option>
						<option value="旅行">旅行</option>
					</select>
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
export default {};
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
</script>

<style scoped>
* {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5295905 (修复路由)
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
<<<<<<< HEAD
=======
=======
	margin: 0 auto;
	padding: 0;
	box-sizing: border-box;
}
.hello {
	height: 630px;
}

a {
	text-decoration: none;
	color: #000;
}

li {
	list-style-type: none;
}

/* .context {
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5295905 (修复路由)
}

.context-nav {
    background-color: rgb(237, 234, 235);
    height: 30px;
    line-height: 30px;
    color: rgb(103, 103, 103);
    font-weight: 700;
}

.context-nav>span {
    display: block;
    float: left;
    text-align: center;
    width: 160px;
}

.white-pink {
    margin-left: auto;
    margin-right: auto;
    max-width: 1040px;
    background: #FFF;
    padding: 30px 30px 20px 30px;
    box-shadow: rgba(187, 187, 187, 1) 0 0px 20px -1px;
    -webkit-box-shadow: rgba(187, 187, 187, 1) 0 0px 20px -1px;
    font: 12px Arial, Helvetica, sans-serif;
    color: #666;
    border-radius: 10px;
    -webkit-border-radius: 10px;
}

.white-pink h1 {
    font: 24px "Trebuchet MS", Arial, Helvetica, sans-serif;
    padding: 0px 0px 10px 40px;
    display: block;
    border-bottom: 1px solid #F5F5F5;
    margin: -10px -30px 10px -30px;
    color: #969696;
}

.white-pink h1>span {
    display: block;
    font-size: 11px;
    color: #C4C2C2;
}

.white-pink label {
    display: block;
    margin: 0px 0px 5px;
}

.white-pink label>span {
    float: left;
    width: 20%;
    text-align: right;
    padding-right: 10px;
    margin-top: 10px;
    color: #969696;
<<<<<<< HEAD
=======
=======
} */

.context-nav {
	background-color: rgb(237, 234, 235);
	height: 30px;
	line-height: 30px;
	color: rgb(103, 103, 103);
	font-weight: 700;
}

.context-nav > span {
	display: block;
	float: left;
	text-align: center;
	width: 160px;
}

.white-pink {
	margin-left: auto;
	margin-right: auto;
	max-width: 1040px;
	background: #fff;
	padding: 30px 30px 20px 30px;
	box-shadow: rgba(187, 187, 187, 1) 0 0px 20px -1px;
	-webkit-box-shadow: rgba(187, 187, 187, 1) 0 0px 20px -1px;
	font: 12px Arial, Helvetica, sans-serif;
	color: #666;
	border-radius: 10px;
	-webkit-border-radius: 10px;
}

.white-pink h1 {
	font: 24px "Trebuchet MS", Arial, Helvetica, sans-serif;
	padding: 0px 0px 10px 40px;
	display: block;
	border-bottom: 1px solid #f5f5f5;
	margin: -10px -30px 10px -30px;
	color: #969696;
}

.white-pink h1 > span {
	display: block;
	font-size: 11px;
	color: #c4c2c2;
}

.white-pink label {
	display: block;
	margin: 0px 0px 5px;
}

.white-pink label > span {
	float: left;
	width: 20%;
	text-align: right;
	padding-right: 10px;
	margin-top: 10px;
	color: #969696;
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
}

.white-pink input[type="text"],
.white-pink input[type="email"],
.white-pink textarea,
.white-pink select {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5295905 (修复路由)
    color: #555;
    width: 70%;
    padding: 3px 0px 3px 5px;
    margin-top: 2px;
    margin-right: 6px;
    margin-bottom: 16px;
    border: 1px solid #e5e5e5;
    background: #fbfbfb;
    height: 25px;
    line-height: 15px;
    outline: 0;
    -webkit-box-shadow: inset 1px 1px 2px rgba(200, 200, 200, 0.2);
    box-shadow: inset 1px 1px 2px rgba(200, 200, 200, 0.2);
}

.white-pink textarea {
    height: 100px;
    padding: 5px 0px 0px 5px;
    width: 70%;
}

.white-pink .button {
    -moz-box-shadow: inset 0px 1px 0px 0px #fbafe3;
    -webkit-box-shadow: inset 0px 1px 0px 0px #fbafe3;
    box-shadow: inset 0px 1px 0px 0px #fbafe3;
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ff5bb0), color-stop(1, #ef027d));
    background: -moz-linear-gradient(center top, #ff5bb0 5%, #ef027d 100%);
    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5bb0', endColorstr='#ef027d');
    background-color: #ff5bb0;
    border-radius: 9px;
    -webkit-border-radius: 9px;
    -moz-border-border-radius: 9px;
    border: 1px solid #ee1eb5;
    display: inline-block;
    color: #ffffff;
    font-family: Arial;
    font-size: 15px;
    font-weight: bold;
    font-style: normal;
    height: 40px;
    line-height: 30px;
    width: 100px;
    text-decoration: none;
    text-align: center;
    text-shadow: 1px 1px 0px #c70067;
}

.white-pink .button:hover {
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ef027d), color-stop(1, #ff5bb0));
    background: -moz-linear-gradient(center top, #ef027d 5%, #ff5bb0 100%);
    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ef027d', endColorstr='#ff5bb0');
    background-color: #ef027d;
}

.white-pink .button:active {
    position: relative;
    top: 1px;
}

.white-pink select {
    /* background: url('down-arrow.png') no-repeat right, -moz-linear-gradient(top, #FBFBFB 0%, #E9E9E9 100%); */
    /* background: url('down-arrow.png') no-repeat right, -webkit-gradient(linear, left top, left bottom, color-stop(0%, #FBFBFB), color-stop(100%, #E9E9E9)); */
    appearance: none;
    -webkit-appearance: none;
    -moz-appearance: none;
    text-indent: 0.01px;
    text-overflow: '';
    width: 70%;
    line-height: 15px;
    height: 30px;
}
<<<<<<< HEAD
</style>
=======
</style>
=======
	color: #555;
	width: 70%;
	padding: 3px 0px 3px 5px;
	margin-top: 2px;
	margin-right: 6px;
	margin-bottom: 16px;
	border: 1px solid #e5e5e5;
	background: #fbfbfb;
	height: 25px;
	line-height: 15px;
	outline: 0;
	-webkit-box-shadow: inset 1px 1px 2px rgba(200, 200, 200, 0.2);
	box-shadow: inset 1px 1px 2px rgba(200, 200, 200, 0.2);
}

.white-pink textarea {
	height: 100px;
	padding: 5px 0px 0px 5px;
	width: 70%;
}

.white-pink .button {
	-moz-box-shadow: inset 0px 1px 0px 0px #fbafe3;
	-webkit-box-shadow: inset 0px 1px 0px 0px #fbafe3;
	box-shadow: inset 0px 1px 0px 0px #fbafe3;
	background: -webkit-gradient(
		linear,
		left top,
		left bottom,
		color-stop(0.05, #ff5bb0),
		color-stop(1, #ef027d)
	);
	background: -moz-linear-gradient(center top, #ff5bb0 5%, #ef027d 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5bb0', endColorstr='#ef027d');
	background-color: #ff5bb0;
	border-radius: 9px;
	-webkit-border-radius: 9px;
	-moz-border-border-radius: 9px;
	border: 1px solid #ee1eb5;
	display: inline-block;
	color: #ffffff;
	font-family: Arial;
	font-size: 15px;
	font-weight: bold;
	font-style: normal;
	height: 40px;
	line-height: 30px;
	width: 100px;
	text-decoration: none;
	text-align: center;
	text-shadow: 1px 1px 0px #c70067;
}

.white-pink .button:hover {
	background: -webkit-gradient(
		linear,
		left top,
		left bottom,
		color-stop(0.05, #ef027d),
		color-stop(1, #ff5bb0)
	);
	background: -moz-linear-gradient(center top, #ef027d 5%, #ff5bb0 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ef027d', endColorstr='#ff5bb0');
	background-color: #ef027d;
}

.white-pink .button:active {
	position: relative;
	top: 1px;
}

.white-pink select {
	/* background: url('down-arrow.png') no-repeat right, -moz-linear-gradient(top, #FBFBFB 0%, #E9E9E9 100%); */
	/* background: url('down-arrow.png') no-repeat right, -webkit-gradient(linear, left top, left bottom, color-stop(0%, #FBFBFB), color-stop(100%, #E9E9E9)); */
	appearance: none;
	-webkit-appearance: none;
	-moz-appearance: none;
	text-indent: 0.01px;
	text-overflow: "";
	width: 70%;
	line-height: 15px;
	height: 30px;
}
</style>
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
