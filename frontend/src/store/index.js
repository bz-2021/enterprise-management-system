import Vue from 'vue';
import Vuex from 'vuex';
Vue.use(Vuex);


import { reqGetList, reqLogin } from "@/api";
const state = {
    code: '',
    token: localStorage.getItem('TOKEN'),
    userInfo: '',
    userlist: {}
};
const mutations = {
    USERLOGIN(state, token) {
        state.token = token
    },
    GETLIST(state, userlist) {
        state.userlist = userlist
    }
};
const actions = {
    //登录
    async userLogin({ commit }, data) {
        let result = await reqLogin(data.name, data.password)
        console.log(result);
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
    }
};
const getter = {};
Vue.config.devtools = true
export default new Vuex.Store({
    state,
    mutations,
    actions,
    getter
});