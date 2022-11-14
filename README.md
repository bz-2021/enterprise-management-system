###后端配置
#####Java版本：11
#####数据库：MySQL80
#####用户名：`root`  密码：`123456`
#####端口：`8082`
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
