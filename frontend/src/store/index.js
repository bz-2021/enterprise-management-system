import Vue from 'vue';
import Vuex from 'vuex';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(Vuex);
Vue.use(ElementUI)


import { reqGetList, reqLogin, reqGetme, reqAddEmployee, reqDelEmployee, reqModify, reqModEmployee, reqGetDepart, reqGetDepartEmployee, reqEmail, reqForgetPassword } from "@/api";
const state = {
    code: '',
    token: localStorage.getItem('TOKEN'),
    userInfo: '',
    userlist: {},
    self: {},
    department: {},
    department_employee: []
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
            localStorage.setItem("TOKEN", result.token)
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
        console.log(result);
        if (result.error_message == 'succeess') {
            return 'ok'
        } else
            return Promise.reject(new Error('faile'))
    },
    //忘记密码
    async getNewPassword({ commit }, data) {
        console.log(data);
        let result = await reqForgetPassword(data);
        console.log(result);
        // if (result.error_message == 'succeess') {
        //     return 'ok'
        // } else
        //     return Promise.reject(new Error('faile'))
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