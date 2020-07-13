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