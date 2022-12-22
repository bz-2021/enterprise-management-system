import Vue from 'vue';
import Vuex from 'vuex';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(Vuex);
Vue.use(ElementUI)


import { reqGetList, reqLogin, reqGetme, reqAddEmployee, reqDelEmployee, reqModify, reqModEmployee, reqGetDepart, reqGetDepartEmployee, reqEmail, reqForgetPassword, reqGetAttendance, reqUpdateAttendance } from "@/api";
const state = {
    code: '',
<<<<<<< HEAD
    token: localStorage.getItem('TOKEN'),
=======
<<<<<<< HEAD
    token: localStorage.getItem('TOKEN'),
=======
    token: sessionStorage.getItem('TOKEN'),
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
    userInfo: '',
    userlist: {},
    self: {},
    department: {},
    department_employee: [],
    attendance: {}
};
const mutations = {
    USERLOGIN(state, token) {
        state.token = token
    },
    GETLIST(state, userlist) {
        state.userlist = userlist
    },
    GETME(state, result) {
        state.self = result;
    },
    GETDEPART(state, department) {
        state.department = department
    },
    GETDEPARTEMPLOYEE(state, employee) {
        state.department_employee = employee
    },
    GETATTENDANCE(state, attendance) {
        console.log(attendance);
        state.attendance = attendance
    }
};
const actions = {
    //登录
    async userLogin({ commit }, data) {
        let result = await reqLogin(data.name, data.password)
        // 服务器下发token 通过带token向服务器要资源
        if (result.error_message == 'success') {
            commit('USERLOGIN', result.token)
            // 持久化存储token
<<<<<<< HEAD
            localStorage.setItem("TOKEN", result.token)
=======
<<<<<<< HEAD
            localStorage.setItem("TOKEN", result.token)
=======
            sessionStorage.setItem("TOKEN", result.token)
>>>>>>> d9eb88a (修复路由导航)
>>>>>>> 5295905 (修复路由)
            return 'ok'
        }
        else if (result.status == '403')
            return Promise.reject(new Error('faile'))
    },
    //获得手下职员的列表信息
    async getList({ commit }) {

        let result = await reqGetList(state.token);
        if (result.length > 0) {
            commit('GETLIST', result)
            return 'ok'
        } else
            return Promise.reject(new Error('faile'))
    },
    //获得登录者信息
    async getMe({ commit }) {
        let result = await reqGetme(state.token);
        console.log(result);
        if (result.length !== 0) {
            commit('GETME', result)
            return 'ok'
        } else
            return Promise.reject(new Error('faile'))
    },
    //添加雇员
    async addEmployee({ commit }, data) {
        let result = await reqAddEmployee(data);
        if (result.error_message == 'success') {
            alert("添加成功")
            return 'ok'
        } else {
            alert(result.error_message);
            return Promise.reject(new Error('faile'))
        }
    },
    //开除雇员 
    async delEmployee({ commit }, data) {
        let result = await reqDelEmployee(data, state.token);
        if (result.error_message == 'success' || result.error_message == '该员工已离职') {
            alert("删除成功")
            return 'ok'
        } else {
            alert(result.error_message);
            return Promise.reject(new Error('faile'))
        }
    },
    //修改个人信息
    async molSelf({ commit }, data) {
        let result = await reqModify(data, state.token);
        console.log(result);
        if (result.error_message == 'success') {
            alert("修改成功")
            return 'ok'
        } else if (result.error_message == '出生日期不符合规则') {
            alert(result.error_message);
            return Promise.reject(new Error('faile'))
        }
    },
    //更新职员信息
    async molEmployee({ commit }, data) {
        let result = await reqModEmployee(data, state.token);
        // console.log(result);
        if (result.error_message == 'success') {
            alert("修改成功")
            return 'ok'

        } else {
            alert(result.error_message);
            return Promise.reject(new Error('faile'))
        }
    },
    //获得部门信息
    async getDepart({ commit }) {
        let result = await reqGetDepart(state.token);
        // console.log(result);
        if (result.length > 0) {
            commit('GETDEPART', result)
            return 'ok'
        } else
            return Promise.reject(new Error('faile'))
    },
    //获得部门下雇员    
    async getDepartEmployee({ commit }, data) {
        let result = await reqGetDepartEmployee(data, state.token);
        // console.log(result);
        if (result.length >= 0) {
            commit('GETDEPARTEMPLOYEE', result)
            return 'ok'
        } else
            return Promise.reject(new Error('faile'))
    },
    //发送验证码
    async getCode({ commit }, data) {
        let result = await reqEmail(data);
        // console.log(result);
        if (result.error_message == 'succeess') {
            return 'ok'
        } else
            return Promise.reject(new Error('faile'))
    },
    //忘记密码
    async getNewPassword({ commit }, data) {
        // console.log(data);
        let result = await reqForgetPassword(data);
        // console.log(result);
        if (result.error_message == 'succeess') {
            return 'ok'
        } else
            return Promise.reject(new Error('faile'))
    },
    //获取考勤信息
    async getAttendance({ commit }, data) {
        // console.log(data);
        let result = await reqGetAttendance(data, state.token);
        // console.log(result.error_message);
        if (result.error_message == 'success') {
            // console.log(result);
            commit('GETATTENDANCE', result)
            return 'ok'
        } else {
            alert(result.error_message)
            return Promise.reject(new Error('faile'))
        }
    },
    //更新考勤
    async updateAttendance({ commit }, data) {
        // console.log(data);
        let result = await reqUpdateAttendance(data, state.token);
        // console.log(result);
        if (result.error_message == 'success') {
            // console.log(result);
            commit('GETATTENDANCE', result)
            return '更新成功'
        } else {
            alert(result.error_message)
            return Promise.reject(new Error('faile'))
        }
    },
};
const getter = {};
Vue.config.devtools = true
export default new Vuex.Store({
    state,
    mutations,
    actions,
    getter
});