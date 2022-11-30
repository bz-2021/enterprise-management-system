### 后端配置 ###

##### Java版本：11 #####

##### 数据库：MySQL80 #####

##### 端口：`8083` #####

#### ⚠ 注意 ####

```
1.在建表时应避免将任何column命名为诸如dName这样驼峰命名法的形式
 因为BaseMapper会将Pojo层的dName视为表中的d_name.
```

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
    d_name nvarchar(50) not null,	    --部门名称
    d_level int null,				    --部门等级	
    d_remark text				        --部门描述
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
    update_time     date null,                  --最近一次更新的时间
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

##### ⚠说明 #####

```
接口名称包含‘列表’的，返回值为List类型，其他的为Map类型
```
```
对于需要验证token的接口，需要添加Authorization参数的请求头（Header）
```

#### 登录 ####

说明：请求后端进行登录，然后返回一个token，用来进行除登录和注册外的权限验证

http请求方式: POST

URL: http://localhost:8083/employee/token/

| 参数 | 说明 |
| :---:| :---: |
| name | 姓名 |
| password | 密码 |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 报错信息 |
| token | token数据 |

error_message的可能返回值

```
success
您已离职，无权访问此系统
```

#### 添加雇员（注册） ####

http请求方式: POST

URL: http://localhost:8083/employee/register/

| 参数 | 说明 |
| :---:| :---: |
| name | 姓名 |
| level | 级别 |
| status | 职位 |
| gender | 性别 |
| photo | 照片的URL |
| ethnicity | 民族 |
| birthday | 生日（yyyy-MM-dd） |
| politicalFace | 政治面貌 |
| education | 文化程度 |
| id_card | 身份证号 |
| phone_number | 手机号 |
| e_mail | 电子邮箱 |
| username | 用户名 |
| account | 账户 |
| did | 部门编号 |
| password | 密码 |
| confirmedPassword | 确认密码 |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 报错信息 |

error_message的可能返回值

```
success
姓名不能为空
level不能为空
level只能是1-5之间的数字
level不符合规则
姓名不能为空
姓名长度不能大于10
密码不能为空
密码长度不能大于100
两次输入的密码不一致
职位不能为空
职位超出字数限制
性别只能为男或女
照片的URL不能为空
照片URL超出字数限制
民族不能为空
民族超出字数限制
政治面貌不能为空
政治面貌超出字数限制
受教育程度不能为空
受教育程度超出字数限制
身份证号不能为空
身份证号长度超出字数限制
手机号不能为空
手机号长度超出限制
E-mail不能为空
E-mail长度超出限制
用户名不能为空
用户名长度超出字数限制
部门编号不能为空
部门编号不存在
部门编号不符合规则
出生日期不符合规则
用户名已存在
```

#### 验证用户Token并获取登录用户信息 ####

http请求方式: GET

URL: http://localhost:8083/employee/info/

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 报错信息 |
| id | 唯一ID |
| name | 姓名 |
| photo | 照片 |部门 |
| status | 在职状态 |

error_message的可能返回值

```
success
```

#### 开除职员（撤销登陆系统的权限） ####

http请求方式: POST

URL: http://localhost:8083/employee/remove/

| 参数 | 说明 |
| :---:| :---: |
| id | 要开除职员的Id |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 报错信息 |

error_message的可能返回值

```
success
该员工已离职
您没有该权限
```

#### 更新职员信息 ####

http请求方式: POST

URL: http://localhost:8083/employee/update/

| 参数 | 说明 |
| :---:| :---: |
| employee_id | 对象的id |
| name | 姓名 |
| level | 级别 |
| status | 职位 |
| gender | 性别 |
| photo | 照片的URL |
| ethnicity | 民族 |
| birthday | 生日（yyyy-MM-dd） |
| politicalFace | 政治面貌 |
| education | 文化程度 |
| id_card | 身份证号 |
| phone_number | 手机号 |
| e_mail | 电子邮箱 |
| username | 用户名 |
| account | 账户 |
| did | 部门编号 |


| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 报错信息 |

error_message的可能返回值

```
success
您没有该权限
该成员级别不明，无法更新
您无法将此人level改为同级或更高
```
` 其他同注册接口的可能返回值 `

#### 获得手下职员的列表信息 ####

说明：获取比当前用户级别低的所有职员的列表

http请求方式: GET

URL: http://localhost:8083/employee/getlist/

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| id | id |
| name | 姓名 |
| level | 级别 |
| status | 职位 |
| gender | 性别 |
| photo | 照片的URL |
| ethnicity | 民族 |
| birthday | 生日（yyyy-MM-dd） |
| politicalFace | 政治面貌 |
| education | 文化程度 |
| id_card | 身份证号 |
| phone_number | 手机号 |
| e_mail | 电子邮箱 |
| username | 用户名 |
| account | 账户 |
| password | 密码（隐藏） |
| registTime | 注册时间（yyyy-MM-dd HH:mm:ss） |
| did | 部门编号 |

#### 忘记密码 ####

说明：修改更新用户密码

http请求方式: POST

URL: http://localhost:8083/update/password/

| 参数 | 说明 |
| :---:| :---: |
| id | 被更新密码的对象的id |
| password | 密码 |
| confirmedPassword | 确认密码 |


| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| error_message | 报错信息 |

error_message的可能返回值

```
success
您没有该权限
该成员级别不明，无法更新
密码不能为空
密码的长度不能大于30
两次输入的密码不一致
```

#### 获得部门列表 ####

说明：任何未离职的雇员都有权限获取所有的部门的信息

http请求方式: GET

URL: http://localhost:8083/department/getlist/

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

| 参数 | 说明 |
| :---:| :---: |
| did | 部门id |
| dname | 部门名称 |
| dlevel | 部门级别 |
| dremark | 部门简介 |

#### 获取某部门下的雇员列表 ####

说明：若请求此接口的用户所在的部门的d_level大于或等于要请求的部门的d_level，则返回该部门下的所有雇员信息

http请求方式: POST

URL: http://localhost:8083/this/employee/

| 参数 | 说明 |
| :---:| :---: |
| did | 请求的部门的id |

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数同`获得手下职员的列表信息`接口的参数


#### 获取考勤信息 ####

说明：获取指定雇员（比自己级别低）的考勤信息

http请求方式: POST

URL: http://localhost:8083/get/attendance/

| 参数 | 说明 |
| :---:| :---: |
| id | 对方的id |

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

返回参数

error_message的可能返回值

```
success
无效的Id
未找到此雇员的考勤信息
您没有该权限
```

或者是

| 参数 | 说明 |
| :---:| :---: |
| error_message | success |
| attendance | 出勤天数 |
| late | 迟到次数 |
| leave_early | 早退天数 |
| absence | 缺勤天数 |
| overtime | 加班次数 | 

#### 更新考勤信息 ####

说明：若请求对象id为本人id，则视为进行考勤打卡。
其他情况下，更新此用户的考勤状态。

http请求方式：POST

URL: http://localhost:8083/update/attendance/

| 参数 | 说明 |
| :---:| :---: |
| id | 对方的id |
| status | 当天的考勤情况 |

| 参数 | 说明 |
| :---:| :---: |
| header | 格式"Bearer " + token |

status的可能值及代表的含义

```
attendance      --正常出勤
late            --迟到
leave_early     --早退
absence         --缺勤
overtime        --加班
```

返回参数

error_message的可能返回值

```
success
无效的Id
您今天已进行过考勤
您没有该权限
您发送的参数有误（status有误）
```