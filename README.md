# ssm

v1.0
Spring+SpringMVC+MyBatis 实现的快速开发框架,可更多的专注于业务逻辑开发
前端采用BootCSS+JQuery+Datatables
数据库DAO自动生产采用MyBatis Plus,目前实现出CRUD的自动生成.

Start:
1. 建立maven工程，打开项目下的pom.xml，并自动引入包
2. lib目录附加到项目资源包中，否则无法运行项目
3. 修改src/MpGenertaor 中的代码，指定自动生成CRUD代码的路径和相关配置。
4. 将自动生成代码复制到项目对应目录，修改 WebRoot/common/head.jsp 下的菜单路径， 运行项目，即可看到CRUD自动生成结果

目录命名规范
java 代码，统一放在com.waps.[obj]  obj对应数据库或项目名称，最好是英文含义。
com.waps.[obj]目录下均为自动生成目录，自动生成的目录名如做修改，必须也要修改applicationContext.xml文件中的配置。
目前com.waps.* 下的所有目录均为测试用，可删除。

WebRoot/jsframe 为所有js和css框架文件存放目录。
WebRoot/js/ 存放自己写的js,和框架js脚本分开。
WebRoot/views/* 存放自动生成的前端界面，目前list,form,alert 都集成在一个静态html中
WebRoot/common/*.jsp  页面头尾框架


注意：目前自动生成的数据表结构主键还只针对字符串类型，int和自增长还不适配


TODO：集成Redis，以后采用注释方式使用Redis
