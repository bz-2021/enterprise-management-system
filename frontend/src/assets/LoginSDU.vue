<template>
	<!DOCTYPE html>
	<!-- saved from url=(0098)https://pass.sdu.edu.cn/cas/login?service=https%3A%2F%2Fservice.sdu.edu.cn%2Ftp_up%2Fview%3Fm%3Dup -->
	<html
		><head
			><meta
				http-equiv="Content-Type"
				content="text/html; charset=UTF-8" />

			<meta http-equiv="X-UA-Compatible" content="IE=edge" />
			<meta
				name="viewport"
				content="width=device-width, initial-scale=1" />
			<meta name="renderer" content="webkit" />
			<link
				rel="stylesheet"
				type="text/css"
				href="./山东大学统一身份认证平台_files/icon.css" />
			<link
				rel="stylesheet"
				type="text/css"
				href="./山东大学统一身份认证平台_files/ie7.css" />
			<link
				rel="stylesheet"
				type="text/css"
				href="./山东大学统一身份认证平台_files/camera.css" />
			<link
				rel="stylesheet"
				type="text/css"
				href="./山东大学统一身份认证平台_files/login.css" />
			<link
				rel="stylesheet"
				type="text/css"
				href="./山东大学统一身份认证平台_files/captcha.css" />
			<title>山东大学统一身份认证平台</title>

			<link
				rel="stylesheet"
				type="text/css"
				href="./山东大学统一身份认证平台_files/code.css"
		/></head>
		<body
			class="fluid_container"
			id="container_bg"
			style="height: 753px; width: 1707px">
			<div
				class="camera_wrap camera_emboss pattern_1"
				id="camera_wrap_4"
				style="display: block"
				><div class="camera_fakehover"
					><div class="camera_src camerastarted">
						<div
							data-thumb="/cas/comm/sdu/image/login_container_bg_03.jpg"
							data-src="/cas/comm/sdu/image/login_container_bg_03.jpg">
						</div> </div
					><div class="camera_target"
						><div class="cameraCont"
							><div
								class="cameraSlide cameraSlide_0 cameracurrent"
								style="
									visibility: visible;
									display: block;
									z-index: 999;
								"
								><img
									src="./山东大学统一身份认证平台_files/login_container_bg_03.jpg"
									class="imgLoaded"
									style="
										visibility: visible;
										height: 1066.88px;
										margin-left: 0px;
										margin-top: -156.938px;
										position: absolute;
										width: 1707px;
									"
									data-alignment=""
									data-portrait=""
									width="1440"
									height="900" /><div
									class="camerarelative"
									style="
										width: 1707px;
										height: 753px;
									"></div></div
							><div
								class="cameraSlide cameraSlide_1"
								style="z-index: 1; display: none"
								><div
									class="camerarelative"
									style="
										width: 1707px;
										height: 753px;
									"></div></div></div></div
					><div class="camera_overlayer"></div
					><div class="camera_target_content"
						><div class="cameraContents"
							><div
								class="cameraContent cameracurrent"
								style="display: block"></div></div></div
					><div
						class="camera_bar"
						style="display: none; top: auto; height: 7px"
						><span
							class="camera_bar_cont"
							style="
								opacity: 8;
								position: absolute;
								inset: 0px;
								background-color: rgb(34, 34, 34);
							"
							><span
								id="pie_0"
								style="
									opacity: 8;
									position: absolute;
									background-color: rgb(238, 238, 238);
									left: 0px;
									right: 0px;
									display: none;
								"></span></span></div></div
				><div class="camera_loader" style="display: none"></div
			></div>
			<div
				class="login_conatiner"
				id="login_container_box"
				style="height: 753px; width: 1707px">
				<div class="shadow-bar">
					<div class="floor1">
						<div class="logo">
							<a class="login_logo_bg" href="javascript:;"></a>
							<span class="line"></span>
							<span class="title">信息化公共服务平台</span>
							<a
								id="change_language"
								value="English"
								class="zh-en">
								<span class="pic"></span>
								English
							</a>
						</div>
					</div>
				</div>
				<form
					id="loginForm"
					action="https://pass.sdu.edu.cn/cas/login?service=https%3A%2F%2Fservice.sdu.edu.cn%2Ftp_up%2Fview%3Fm%3Dup"
					method="post">
					<div class="floor2">
						<div class="content_login_box">
							<div class="login_box_tab">
								<a
									class="active"
									name="login_type"
									type="account">
									账号登录
								</a>
								<a class="" name="login_type" type="scan">
									扫码登录
								</a>
							</div>
							<span class="notice"> </span>
							<div id="template_container">
								<div class="login_box_up">
									<div>
										<input
											class="login_box_input"
											id="un"
											tabindex="1"
											value=""
											autocomplete="off"
											placeholder="用户名" />
									</div>
									<div>
										<input
											class="login_box_input"
											id="pd"
											tabindex="2"
											type="password"
											autocomplete="off"
											placeholder="密码" />
									</div>

									<div class="down_link_choice">
										<input
											type="checkbox"
											class="login_box_checkbox" />
										<span class="login_box_checkbox_label"
											>自动登录</span
										>

										<a
											href="https://pass.sdu.edu.cn/cas/pwd?locale=zh_CN"
											id="pwd_url"
											class="login_box_psd"
											>忘记密码？</a
										>
									</div>
									<span class="landing_btn_bg">
										<input
											type="button"
											class="login_box_landing_btn"
											id="index_login_btn" />账号登录
									</span>
									<div class="login_box_down">
										<div class="new_student">
											<p class="row"
												><b>温馨提示：</b>
												<font
													style="
														color: #760506;
														float: right;
													"
													>校外访问，请登录
													<a
														class=""
														href="https://webvpn.sdu.edu.cn/"
														target="_blank"
														>Web VPN</a
													>。</font
												>
											</p>
											<p class="row"
												>1.用户名为“职工号／学号”。若忘记密码或提示密码错误，<a
													class=""
													href="http://www.nc.sdu.edu.cn/info/1004/1707.htm"
													target="_blank"
													>请点此查看密码重置方法</a
												>。</p
											>
											<!--<p class="row">2.兼容威海校区统一认证用户名密码登录。</p>-->
											<p
												class="row"
												style="
													word-break: break-all;
													color: #760506;
												">
												2.扫码登录前请先加入<a
													class=""
													href="https://www.nc.sdu.edu.cn/info/1004/1301.htm"
													target="_blank"
													>“山东大学企业微信”</a
												>。
											</p>
										</div>
										<p
											class="new_student"
											style="
												position: relative;
												margin: 0;
												float: left;
											"
											>3.浏览器请使用极速模式
											<a class="open_360" id="open_360">
												(如何使用?)
												<span
													class="b_360"
													id="open_360_img"
													style="display: none"
													><img
														src="./山东大学统一身份认证平台_files/open360fast.png"
														width="826"
														height="170"
												/></span>
											</a>
										</p>
										<p class="browser">
											<span class="left"
												>4.建议浏览器：</span
											>
											<a
												style="margin-left: 0"
												class="ie_pic"
												target="_blank"
												href="http://windows.microsoft.com/zh-cn/internet-explorer/download-ie">
												IE10+
											</a>
											<a
												class="firefox_pic"
												target="_blank"
												href="http://www.firefox.com.cn/download/">
												火狐
											</a>
											<a
												class="google_pic"
												target="_blank"
												href="https://www.google.cn/chrome/">
												谷歌
											</a>
										</p>
										<!--<div class="new_student">
					<p class="row" >校外访问，请登录 <a class="" href="https://webvpn.sdu.edu.cn" target="_blank">Web VPN</a>。</p>
				</div> -->

										<!--<p class="browser">5.技术服务电话：0531-88369882.</p>-->
									</div>
								</div>
							</div>
						</div>
					</div>
					<input type="hidden" id="rsa" name="rsa" />
					<input type="hidden" id="ul" name="ul" />
					<input type="hidden" id="pl" name="pl" />
					<input
						type="hidden"
						id="lt"
						name="lt"
						value="LT-152732-dPpJiuLoExaVkSyPacejKcwwaesHb1-cas" />
					<input type="hidden" name="execution" value="e1s1" />
					<input type="hidden" name="_eventId" value="submit" />
				</form>
			</div>
			<footer id="footer">
				<div class="login_footer">
					<span class="left"
						>山东大学 版权所有 Copyright@2017 &nbsp;&nbsp;<a
							style="color: #fff"
							href="http://www.nc.sdu.edu.cn/"
							target="_blank"
							>信息化工作办公室</a
						></span
					>
					<span class="right">服务邮箱：passadmin@sdu.edu.cn</span>
				</div>
			</footer>
		</body>
	</html>
</template>

<script type="text/html" id="password_template">
<div class="login_box_up">
	<div>
		<input
			class="login_box_input"
			id="un"
			tabindex="1"
			value=""
			autocomplete="off"
			placeholder="用户名" />
	</div>
	<div>
		<input
			class="login_box_input"
			id="pd"
			tabindex="2"
			type="password"
			autocomplete="off"
			placeholder="密码" />
	</div>

	<div class="down_link_choice">
		<input type="checkbox" class="login_box_checkbox" />
		<span class="login_box_checkbox_label">自动登录</span>

		<a href="pwd" id="pwd_url" class="login_box_psd">忘记密码？</a>
	</div>
	<span class="landing_btn_bg">
		<input
			type="button"
			class="login_box_landing_btn"
			id="index_login_btn" />账号登录
	</span>
	<div class="login_box_down">
		<div class="new_student">
			<p class="row"
				><b>温馨提示：</b>
				<font style="color: #760506;float:right;"
					>校外访问，请登录
					<a class="" href="https://webvpn.sdu.edu.cn" target="_blank"
						>Web VPN</a
					>。</font
				>
			</p>
			<p class="row"
				>1.用户名为“职工号／学号”。若忘记密码或提示密码错误，<a
					class=""
					href="http://www.nc.sdu.edu.cn/info/1004/1707.htm"
					target="_blank"
					>请点此查看密码重置方法</a
				>。</p
			>
			<p class="row" style="word-break:break-all;color:#760506">
				2.扫码登录前请先加入<a
					class=""
					href="https://www.nc.sdu.edu.cn/info/1004/1301.htm"
					target="_blank"
					>“山东大学企业微信”</a
				>。
			</p>
		</div>
		<p class="new_student" style="position:relative;margin:0;float:left;"
			>3.浏览器请使用极速模式
			<a class="open_360" id="open_360">
				(如何使用?)
				<span class="b_360" id="open_360_img" style="display:none;"
					><img
						src="comm/image/open360fast.png"
						width="826"
						height="170"
				/></span>
			</a>
		</p>
		<p class="browser">
			<span class="left">4.建议浏览器：</span>
			<a
				style="margin-left:0;"
				class="ie_pic"
				target="_blank"
				href="http://windows.microsoft.com/zh-cn/internet-explorer/download-ie">
				IE10+
			</a>
			<a
				class="firefox_pic"
				target="_blank"
				href="http://www.firefox.com.cn/download/">
				火狐
			</a>
			<a
				class="google_pic"
				target="_blank"
				href="https://www.google.cn/chrome/">
				谷歌
			</a>
		</p>
	</div>
</div>
</script>
<script type="text/html" id="qrcode_template">
<div class="login-qr-box" style="padding-bottom:15px;">
	<div class="login-qr-title">手机扫码 安全防盗</div>
	<div class="qr-code-box" id="qrcode"> </div>
	<div class="qr-code-text">扫二维码登录校园门户</div>
</div>
<div class="login_box_down">
	<div class="new_student">
		<p class="row"><b>温馨提示：</b></p>
		<p class="row"
			>扫码登录前请先关注<a
				class=""
				href="http://wx.sdu.edu.cn/wechat/app/publicity.html"
				target="_blank"
				>“山东大学微信企业号”</a
			>。</p
		>
	</div>
</div>
</script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/jquery.min.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/qrcode.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/login-qrcode.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/des.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/jquery-1.10.3-ui.min.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/jquery.captcha.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/login.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/jquery-camera.min.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/jquery.easing.1.3.js.下载"></script>
<script
	type="text/javascript"
	src="./山东大学统一身份认证平台_files/camera.min.js.下载"></script>
<script>
jQuery(function () {
	jQuery("#camera_wrap_4").camera({
		height: "auto", //高度

		hover: false, //鼠标经过幻灯片时暂停(true, false)

		//imagePath: 图片的目录

		loader: "none", //加载图标(pie, bar, none)

		//loaderColor: 加载图标颜色( '颜色值,例如:#eee' )

		//loaderBgColor: 加载图标背景颜色

		loaderOpacity: "8", //加载图标的透明度( '.8'默认值, 其他的可以写 0, .1, .2, .3, .4, .5, .6, .7, .8, .9, 1 )

		loaderPadding: "2", //加载图标的大小( 填数字,默认为2 )

		navigation: false, //左右箭头显示/隐藏(true, false)

		navigationHover: false, //鼠标经过时左右箭头显示/隐藏(true, false)

		pagination: false, //是否显示分页(true, false)

		playPause: false, //暂停按钮显示/隐藏(true, false)

		pauseOnClick: false, //鼠标点击后是否暂停(true, false)

		portrait: false, //显示幻灯片里所有图片的实际大小(true, false)

		thumbnails: false, //是否显示缩略图(true, false)

		time: 500000000, // 幻灯片播放时间( 填数字 )

		//transPeriod: 4000,//动画速度( 填数字 )

		imagePath: "../images/",
		thumbnails: false,
	});
});
var winW = $("body").width();
$("#login_container_box").css(winW, "100%");
</script>

<style>
html,
body {
	height: 100%;
	margin: 0;
	padding: 0;
}
a {
	color: #09f;
}
a:hover {
	text-decoration: none;
}
#back_to_camera {
	background: rgba(255, 255, 255, 0.9);
	clear: both;
	display: block;
	height: 40px;
	line-height: 40px;
	padding: 20px;
	position: relative;
	z-index: 1;
}
.fluid_container {
	bottom: 0;
	height: 100%;
	left: 0;
	position: fixed;
	right: 0;
	top: 0;
	z-index: 0;
}
#camera_wrap_4 {
	bottom: 0;
	height: 100%;
	left: 0;
	margin-bottom: 0 !important;
	position: fixed;
	right: 0;
	top: 0;
}
.camera_bar {
	z-index: 2;
}
.camera_thumbs {
	margin-top: -100px;
	position: relative;
	z-index: 1;
}
.camera_thumbs_cont {
	border-radius: 0;
	-moz-border-radius: 0;
	-webkit-border-radius: 0;
}
.camera_overlayer {
	opacity: 0.1;
}
</style>
