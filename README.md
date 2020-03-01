# spring-boot-shiro-demo

## 一、项目介绍:
SpringBoot整合Shiro示例实现动态权限加载更新+Session共享+单点登录(数据库中测试号的密码进行了加密,密码皆为123456)


### 补充说明


#### 1.Redis
记得将Redis安装好，确定启动没问题后，登录客户端执行如下命令:
````
 config set requirepass 123456
 
 auth 123456
 
 config get requirepass
````


#### 2.使用POSTMAN测试

请求测试地址:localhost:2020/userLogin/login

请求数据需为下面这样的格式:

````
{"username":"user","password":"123456"}

````

响应数据为(token会变的):

````
{
    "msg": "登录成功",
    "code": 0,
    "token": "login_token_3144621d-2391-42e8-98cd-e0b3d77b3583"
}
````

## 二、数据脚本(SQL脚本在项目中，sql文件夹下的my.shiro.sql):
复制脚本内容到sqlyog或者navicat指定区域执行即可

如果有其它问题，欢迎提Issue