### 后端配置 ###

##### Java版本：11 #####

##### 数据库：MySQL80 #####

##### 用户名：`root`  密码：`123456` #####

##### 端口：`8082` #####

建立Employee表：
```
create table employee
(
    id             int auto_increment
        primary key,
    name           varchar(20)   not null,
    gender         varchar(5)    null,
    photo          varchar(1000) null,
    ethnicity      varchar(20)   null,
    birthday       date          null,
    political_face varchar(20)   null,
    education      varchar(20)   null,
    id_card        varchar(30)   null,
    phone_number   varchar(12)   null,
    password       varchar(20)   null,
    department     int           null,
    status         varchar(20)   null,
    level          int           null,
    constraint employee_id_uindex
        unique (id)
);
```

### 接口文档 ###

#### 登录 ####

http请求方式: POST
URL:http://localhost:8082/employee/token/

| 参数 | 说明 |
| :---:| :---: |
| name | 姓名 |
| password | 密码 |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | success：成功 |
| token | token数据 |

#### 注册 ####

http请求方式: POST
URL:http://localhost:8082/employee/register/

| 参数 | 说明 |
| :---:| :---: |
| name | 姓名 |
| gender | 密码 |
| ethnicity | 民族 |
| birthday | 生日（格式为yy-MM-dd） |
| politicalFace | 政治面貌 |
| education | 文化程度 |
| idCard | 身份证号 |
| phoneNumber | 手机号 |
| department | 部门 |
| password | 密码 |
| confirmedPassword | 确认密码 |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | success：成功 |

