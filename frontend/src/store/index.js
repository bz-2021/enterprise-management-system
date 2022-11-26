import Vue from 'vue';
import Vuex from 'vuex';
Vue.use(Vuex);

import user from './user';

Vue.config.devtools = true
export default new Vuex.Store({
    module: {
        user
    }
});