//api 统一管理
import requests from './request';

//登录请求
export const reqLogin = (data) => requests({ url: '/employee/token/', data, method: 'post' });
