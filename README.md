### 后端配置 ###

##### Java版本：11 #####

##### 数据库：MySQL80 #####

##### 端口：`8083` #####

建立Employee表：
```
create table employee
(
    id             int primary key identity(1,1),		--员工编号
    did 	int references department(did) not null,    --部门(引用外键)
    status         varchar(20)   null,			        --职位
    level          int           null,				    --等级(L1-L5)
    name           varchar(20)   not null,			    --姓名
    gender         varchar(5)    not null,			    --性别
    photo          varchar(1000) null,			        --大头照
    ethnicity      varchar(20)   null,			        --民族
    birthday       date          null,				    --生日
    political_face varchar(20)   null,			        --政治面貌
    education      varchar(20)   null,			        --文化程度
    id_card        varchar(30)   not null,			    --身份证
    phone_number   varchar(12)   not null,		        --电话号码
    e_mail		varchar(30)  not null,		            --电子邮箱
    incumbency	varchar(2) default('是') check(incumbency='是' or incumbency='否'),
                                                        --在职情况
    user_name	varchar(10) not null,		            --用户名
    account		varchar(20) not null,		            --账号
    password       varchar(200)  not null,		        --密码
    regist_time	smalldatetime default(getdate()),       --注册时间
    constraint employee_id_uindex unique (id)
);
```
建立Department表
```
create table department
(
    did int primary key identity(1,1),	--部门编号
    dName nvarchar(50) not null,	    --部门名称
    dlevel int null,				    --部门等级	
    dRemark text				        --部门描述
);

```
建立Attendance表
```
create table employee_attendance
(
    id 	int references employer(id) not null,	--员工编号(引用外键)
    attendance	int not null,			        --出勤天数
    late			int not null,			    --迟到次数
    leave_early 	int not null,			    --早退天数
    absence		int not null,			        --缺勤天数
    overtime		int not null,			    --加班次数
);
```
建立Wages表
```
create table employee_wages
(
    id 	int references employer(id) not null,	--员工编号(引用外键)
    base_salary 	money not null,		        --底薪
    bonus 		money not null,		            --奖金	
    deduct_wages text	money not null,	        --扣除工资
    deduct_reason	text				        --扣除原因
    net_salary		money not null,		        --实发工资
    time		smalldatetime not null,	        --发工资时间
);
```

### 接口文档 ###

#### 登录 ####

说明：请求后端返回一个token，用来进行除登录和注册接口外的权限验证

http请求方式: POST

URL: http://localhost:8083/employee/token/

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

URL: http://localhost:8083/employee/register/

| 参数 | 说明 |
| :---:| :---: |
| name | 姓名 |
| gender | 密码 |
| ethnicity | 民族 |
| birthday | 生日（格式为yyyy-MM-dd） |
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

#### 获取登录用户信息 ####

http请求方式: GET

URL: http://localhost:8083/employee/info/

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 成功：success |
| id | 唯一ID |
| name | 姓名 |
| photo | 照片 |部门 |
| status | 在职状态 |

#### 开除职员 ####

http请求方式: POST

URL: http://localhost:8083/employee/remove/

| 参数 | 说明 |
| :---:| :---: |
| id | 要开除职员的Id |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 成功：success 失败：您没有该权限 |

#### 更新职员信息 ####

http请求方式: POST

URL: http://localhost:8083/employee/update/

| 参数 | 说明 |
| :---:| :---: |
| employee_id | 对象的id |
| name | 姓名 |
| gender | 密码 |
| photo | 头像 |
| ethnicity | 民族 |
| birthday | 生日（格式为yyyy-MM-dd） |
| politicalFace | 政治面貌 |
| education | 文化程度 |
| idCard | 身份证号 |
| phoneNumber | 手机号 |
| department | 部门 |
| status | 在职状态 |
| level | 等级 |


| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 成功：success |

#### 获得职员信息 ####

说明：获取比当前用户级别低的所有职员的列表

http请求方式: GET

URL: http://localhost:8083/employee/getlist/

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 成功：success |
| id | id |
| name | 姓名 |
| gender | 性别 |
| photo | 照片 |
| ethnicity | 民族 |
| birthday | 生日（格式为yyyy-MM-dd）|
| politicalFace | 政治面貌 |
| education | 文化程度 |
| idCard | 身份证号 |
| phoneNumber | 手机号 |
| department | 部门 |
| status | 在职状态 |
| level | 等级 |