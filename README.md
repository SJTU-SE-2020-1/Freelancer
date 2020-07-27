# Freelancer

## Week1-day 1 任务：

1. 熟悉github 协作的流程（每人在公共库中push一个测试文本）
2. 注册AWS账号，以及申请教育支持
3. 本项目涉及的关键词：前后端分离，Unit Test， CQRS（读写分离），
		Continuous Integration（代码连续性），performance test（性能测试），Microservice[微服务，云部署组件、API]、Container（Docker、Docker Compose)、Container Ochestration（Kubernetes）
4. 项目构思：
		页面：homepage（search bar，导航栏，tasks/根据用户类型展示），
			employee的界面（history work，profile，竞拍，推荐项目），管理员封禁的界面，employer的界面（发布项目，profile）

	数据库设计：见思维导图

## Week1-day 2 任务：

1. 数据库设计：利用powerdesign设计关系型数据库部分，参考freelancer设计数据库，总体包含work和user两个大类，其余是关联类。用户与项目之间有三种关系——完成项目（do_work），发布项目（issue_work），申请项目（propose_work）。skill是一个标签类，建表之后大部分时间可以作为静态的数据库存储，用于体现用户包含哪些技能，以及项目需求哪些技能。对于管理员，目前设想大概只有封禁用户的权利了，未来再看看吧。
2. 后端框架搭建：
3. 前端框架搭建：

## Week1-day 3 任务：

1. 爬虫（郑世民）：爬虫用了轮子，加上了proxy和header来绕过captcha
2. 后端（谢厚）：LoginController，SkillController的接口实现。
3. 前端组件（蒋钊）：完成登陆，注册，任务库，任务列表等基本组件的静态实现。
4. 前端页面（张澳）：结合组件，给页面分配router，修改了form有关组件中的验证条件，以及构建了相关页面。

## Week1-day 4 任务

1. 增强爬虫程序鲁棒性，增加了异常处理功能，基本实现了自动化
2. 小组成员合作爬取数据，共168页freelancer数据
3. 后端继续完成接口设计，并使用page进行分页查询数据
4. 前端使用eslint检验代码风格，并美化界面设计，同时统一页面设计风格，对于form验证进行适当补充修改

## Week2-day1总结
1. 谢厚：后端User的登录和注册测试，Work全部展示，已发布和已完成work展示的测试，对work的命名由驼峰改为下划线。
2. 蒋钊：整合数据，更新skill，user，work表，整合了propose_work表数据。
3. 张澳：添加avatarlist组件，skill选择组件，修改header元素，主页项目组件，预计明天任务是完成主页面，个人信息详情等页面的内容
4. 郑世民：研究一下junit测试，测试了后端部分的接口。

## Week2-day2总结
1. 郑世民：开始使用junit测试后端接口，测试了workcontroller的接口。
2. 蒋钊：完成了剩余数据的整合，整合了user_skill,need skill,do_work表数据。
3. 谢厚：完成了后端剩余功能，使用postman对所有接口进行了一遍测试并debug。
4. 张澳：完成主页，个人界面，对与样式表不起作用的问题找到了解决办法，主要页面构建基本完成。

## Week2-day3总结
1. 谢厚：后端测试类的编写（user，admin的controller层和dao层）。
2. 张澳：前端界面调优，个人假面的雇主/威客板块，jest单元测试的环境配置。
3. 蒋钊：完成了jest+enzyme前端单元测试的环境配置并熟悉了基本操作。
4. 郑世民：后端junit测试，work的controller层和dao层。

## Week2-day4总结

1. 谢厚：userController测试，user，admin部分测试文档。
2. 郑世民：继续后端junit测试，完成部分测试文档。
3. 张澳：初步测试与后台数据进行联动的问题，发送接收请求以及后端响应的处理，发现后端有接口会出现返回数据不能转化为json字符的问题（getuserinfo）：解决办法，去除user实体类中@JsonIdentityInfo的注解。
4. 蒋钊：开始进行前端测试，用jest+enzyme测试了loginForm中的组件的渲染和输入部分。

## Week2-day5总结
1. 蒋钊：完成了loginform前端组件的后续单元测试以及测试文档。
2. 张澳：对前端的一些bug进行修复，同时对tasklist的界面显示做了一定的调整，增加了页脚，对description数据进行了解析
3. 郑世民：后端使用junit对work的controller、dao层测试，完善测试。
4. 谢厚：后端使用junit对user的controller、dao层测试，完善测试。

## Week3-day1总结
1. 蒋钊：完成了端对端调试react-cypress相关环境的配置并了解了基本操作。
2. 郑世民：了解spring.security,增强后端安全性。
3. 谢厚：学习微服务架构。
4. 张澳：回顾上课视频，cypress环境配置（最后删除已经安装的文件夹后，使用cnpm重装后，正常打开了）

## Week3-day2总结
1. 蒋钊：尝试了react-cypress端对端测试的一些基本操作。
2. 谢厚：对后端进行功能拆分，使模块间相互独立。
3. 张澳：协助查询spring-security使用的相关资料，对于tasklist的展示的界面增添筛选的部件，完成个人相关work查询的接口
4. 郑世民：研究spring security的 authentication 和 authority。

## Week3-day3总结
1. 郑世民：spring security authentication 定制UsernamePasswordAuthenticationFilter使spring scurity接受前端json，明天开始authority。
	1. [JSON Authencation](https://stackoverflow.com/questions/19500332/spring-security-and-json-authentication)
	2. [Core Security Filters](https://docs.spring.io/spring-security/site/docs/3.0.x/reference/core-web-filters.html)
	3. [BasicAuthencationFilter](https://docs.spring.io/spring-security/site/docs/3.0.x/apidocs/org/springframework/security/web/authentication/www/BasicAuthenticationFilter.html)
	4. [Spring security application/json](https://www.jianshu.com/p/6df55b0cbbbe)

2. 蒋钊：利用react-cypress测试了一些如登录 ，后端数据提取等简单业务，实现初始页面。
3. 谢厚：增加work与skill和发布者相关联信息的接口，并使之尽量在service层互相独立。
4. 张澳：增加我的项目页面，分为雇主与freelancer不同的显示板块，增加个人信息修改界面

## Week3-day4总结
1. 蒋钊：完善了初始（未登录）界面，并用react—cypress对发布任务业务进行了端对端测试。
2. 张澳：融合业务逻辑，配合security修改前端部分结构，融合初始（未登录）界面，taskdetail界面重绘
3. 谢厚：完善接口，配置服务器环境。
4. 郑世民：spring security使用数据库用户信息验证，使用session进行部分的authority。

## Week3-day5总结
1. 蒋钊：完成了发布任务的端对端测试并完成了测试文档。
2. 张澳：task detail界面设计以及相关后台接口的修改.
3. 郑世民：增加接口的权限检验。
