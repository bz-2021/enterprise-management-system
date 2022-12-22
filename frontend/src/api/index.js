//api 统一管理
import requests from "./request";

//登录请求 http://localhost:8083/employee/token/ post
export const reqLogin = (name, password) => {
	return requests({
		url: `/employee/token/?name=${name}&password=${password}`,
		method: "post",
	});
};
//获得手下职员的列表信息 URL: http://localhost:8083/employee/getlist/ get
export const reqGetList = (token) => {
	return requests({
		url: "/employee/getlist/",
		method: "get",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
//获取指定用户信息
// URL: http://localhost:8083/employee/info/
export const reqGetme = (token) => {
	return requests({
		url: "/employee/info/",
		method: "get",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
//添加雇员
// URL: http://localhost:8083/employee/register/
export const reqAddEmployee = (data) => {
	return requests({
		url: `/employee/register/?name=${encodeURIComponent(data.name)}&level=${
			data.level
		}&status=${encodeURIComponent(data.status)}&gender=${encodeURI(
			data.gender
		)}&photo=${data.photo}&ethnicity=${encodeURIComponent(
			data.ethnicity
		)}&birthday=${data.birthday}&politicalFace=${encodeURIComponent(
			data.politicalFace
		)}&education=${encodeURIComponent(data.education)}&id_card=${
			data.id_card
		}&phone_number=${data.phone_number}&e_mail=${
			data.e_mail
		}&username=${encodeURIComponent(
			data.username
		)}&account=${encodeURIComponent(data.account)}&did=${
			data.did
		}&password=${data.password}&confirmedPassword=${
			data.confirmedPassword
		}`,
		method: "post",
	});
};
//开除职员 数据库删不掉
export const reqDelEmployee = (id, token) => {
	return requests({
		url: `/employee/delete/?id=${id}`,
		method: "post",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
//修改个人信息
export const reqModify = (data, token) => {
	console.log(
		`/employee/add/info/?photo=${data.photo}&ethnicity=${data.ethnicity}&birthday=${data.birthday}&politicalFace=${data.politicalFace}&education=${data.education}&id_card=${data.id_card}&phone_number=${data.phone_number}&e_mail=${data.e_mail}&username=${data.username}&account=${data.account}`
	);
	return requests({
		url: `/employee/add/info/?photo=${data.photo}&ethnicity=${data.ethnicity}&birthday=${data.birthday}&politicalFace=${data.politicalFace}&education=${data.education}&id_card=${data.id_card}&phone_number=${data.phone_number}&e_mail=${data.e_mail}&username=${data.username}&account=${data.account}`,
		method: "post",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
//更新职员
// http://localhost:8083/employee/update/
export const reqModEmployee = (data, token) => {
	return requests({
		url: `/employee/update/?employee_id=${data.employee_id}&name=${data.name}&level=${data.level}&status=${data.status}&gender=${data.gender}&photo=${data.photo}&ethnicity=${data.ethnicity}&birthday=${data.birthday}&politicalFace=${data.politicalFace}&education=${data.education}&id_card=${data.id_card}&phone_number=${data.phone_number}&e_mail=${data.e_mail}&username=${data.username}&account=${data.account}&did=${data.did}`,
		method: "post",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
//获得部门列表
// URL: http://localhost:8083/department/getlist/
export const reqGetDepart = (token) => {
	return requests({
		url: "/department/getlist/",
		method: "get",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
//获得部门下雇员
// http://localhost:8083/this/employee/
export const reqGetDepartEmployee = (did, token) => {
	return requests({
		url: `/this/employee/?did=${did}`,
		method: "post",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
//忘记密码
// http://localhost:8083/update/password/
export const reqForgetPassword = (data) => {
	return requests({
		url: `/update/password/?email=${data.email}&code=${data.code}&password=${data.password}&confirmedPassword=${data.confirmedPassword} `,
		method: "post",
	});
};
//发送邮箱验证码
// URL: http://localhost:8083/verification/email/
export const reqEmail = (data) => {
	return requests({
		url: `/verification/email/?email=${data}`,
		method: "post",
	});
};
// 获取考勤信息
// URL: http://localhost:8083/get/attendance/
export const reqGetAttendance = (data, token) => {
	return requests({
		url: `/get/attendance/?id=${data} `,
		method: "post",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
// http://localhost:8083/update/attendance/
export const reqUpdateAttendance = (data, token) => {
	return requests({
		url: `/update/attendance/?id=${data.id}&status=${data.status} `,
		method: "post",
		headers: {
			Authorization: `Bearer ${token}`,
		},
	});
};
