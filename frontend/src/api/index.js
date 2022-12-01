//api 统一管理
import requests from './request';

//登录请求 http://localhost:8083/employee/token/ post
export const reqLogin = (name, password) => {
    return requests({ url: `/employee/token/?name=${name}&password=${password}`, method: "post" })
}
//获得手下职员的列表信息 URL: http://localhost:8083/employee/getlist/ get
export const reqGetList = (token) => {
    return requests({
        url: '/employee/getlist/',
        method: 'get',
        headers: {
            'Authorization': `Bearer ${token}`
        }
    })
}

