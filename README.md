<p align="center">
 <img src="https://img.shields.io/badge/VUE-2.5.21-green.svg" alt="Build Status">
  <img src="https://img.shields.io/badge/Spring%20Cloud-Edgware.SR5-orange.svg" alt="Coverage Status">
  <img src="https://img.shields.io/badge/spring%20Boot-1.5.16.RELEASE-brightgreen.svg" alt="Downloads">
</p>  

# pikachu

## 介绍
酒店管理项目

## 软件架构
软件架构说明

### 服务切分

``` lua
pikachu
├── pikachu-ui -- vue-admin实现[8080]
├── pikachu-auth --  授权服务提供[3000]
├── pikachu-common -- 系统公共模块 
├── pikachu-config -- 配置中心[7777]
├── pikachu-eureka -- 服务注册与发现[8888]
├── pikachu-gateway -- ZUUL网关[9999]
├── pikachu-modules -- 微服务模块
├    ├── pikachu-order-service -- 订单服务[8030]
├    ├── pikachu-goods-service -- 商品服务[8040]
├    ├── pikachu-operation-service -- 酒店运营管理服务[8050]
├    ├── pikachu-operation-service -- 客户中心服务[8050]
├    ├── pikachu-internal-control-service -- 内部管控服务[8070]
├    └── pikachu-report-service -- 报表中心服务[8060]
└── pikachu-visual  -- 图形化模块 
     ├── pikachu-monitor -- 服务状态监控、turbine [8010]
     ├── pikachu-zipkin-elk -- zipkin、ELK监控[8011、8012](暂无)
     └── pikachu-cache-cloud -- 缓存管理、统一监控[8013](暂无)
```
### 功能列表
1.


## 安装教程

1. xxxx
2. xxxx
3. xxxx

## 使用说明

1. xxxx
2. xxxx
3. xxxx

## 参与贡献

1. Fork 本仓库
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)