# Tuple
java tuple implementation

于2022-04-14 从 icefrog  项目中剥离

 

##  致自己
专注元组操作



<p align="center">
	<a href="https://whaleal.com/"><img src="https://docs.whaleal.com/images/logo1.png" width="45%"></a>
</p>
<p align="center">
	<a href="https://whaleal.com/"><img src="https://docs.whaleal.com/images/logo1.png" width="45%"></a>
</p>

<p align="center">
	<strong>仅仅一次方法调用就可以返回多个对象</strong>
</p>
<p align="center">
	👉 <a href="https://whaleal.com">https://whaleal.com/</a> 👈
</p>

<p align="center">
	<a target="_blank" href="https://search.maven.org/artifact/com.whaleal.tuple/tuple-all">
		<img src="https://img.shields.io/maven-central/v/com.whaleal.tuple/tuple-core.svg?label=Maven%20Central" />
	</a>
	<a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
		<img src="https://img.shields.io/badge/JDK-8+-green.svg" />
	</a>
	<a target="_blank" href='https://github.com/whaleal/tuple'>
		<img src="https://img.shields.io/github/stars/whaleal/tuple.svg?style=social" alt="github star"/>
	</a>
</p>


-------------------------------------------------------------------------------

[**🌎English Documentation**](README_En.md)

-------------------------------------------------------------------------------

## 📚简介
Tuple是一种数据结构，可存放多个元素，每个元素的数据类型可不同。

Tuple与List集合类似，但是不同的是，List集合只能存储一种数据类型，而Tuple可存储多种数据类型。Tuple在创建的时候，就可以直接指定多个元素数据类型。

Tuple是关系数据库中的基本概念，关系是一张表，表中的每行（即数据库中的每条记录）就是一个元组，每列就是一个属性。 在二维表里，元组也称为行。


### 🍺Tuple能帮我们什么

比如需要返回多个值这种场景，我们用java的话，一般是会定义一个model类，或者干脆直接放到Map中，
这两种方式其实都不是很方便，一个需要频繁定义一些类，另一个对于返回值的类型我们并不知道。

Java中Tuple最多支持我们创建十个返回值，其中tuple中的类型，我们可以随便存放，
这里其实是用到了java中的泛型，来帮我们表示里面的类型

-------------------------------------------------------------------------------


## 📦安装

### 🍊Maven
在项目的pom.xml的dependencies中加入以下内容:

```xml
<dependency>
    <groupId>com.whaleal</groupId>
    <artifactId>tuple</artifactId>
    <version>0.1.0</version>
</dependency>
```

### 🍐Gradle
```
implementation 'com.whaleal.tuple:tuple-core:x.x.x'
```

### 📥下载jar

点击以下链接，下载`tuple-core-X.X.X.jar`即可：

- [Maven中央库](https://repo1.maven.org/maven2/com/whaleal/tuple)

> 🔔️注意
> 所有版本编译起始均为JDK8+

### 🚽编译安装

访问tuple的github主页：[https://github.com/whaleal/tuple](https://github.com/whaleal/tuple) 下载整个项目源码然后进入tuple项目目录执行：

进行基础的编译安装就可以了

然后就可以使用Maven引入了。



-------------------------------------------------------------------------------

## 🏗️添砖加瓦

### 🐞提供bug反馈或建议

提交问题反馈请说明正在使用的JDK版本呢、tuple版本和相关依赖库版本。

- [github issue](https://github.com/whaleal/tuple/issues)


### 🧬贡献代码的步骤
1. 在github issues 上找到需要修复的问题，或提出要贡献的特性内容
2. 在github或者Github上fork项目到自己的repo
3. 把fork过去的项目也就是你的项目clone到你的本地
4. 修改代码并进行相关测试
5. commit后push到自己的库
6. 登录github或Github在你首页可以看到一个 pull request 按钮，点击它，选择自己的分支及本项目的分支，填写一些说明信息，然后提交即可。
7. 等待维护者合并

### 📐PR遵照的原则

tuple欢迎任何人为tuple添砖加瓦，贡献代码，不过维护者是一个强迫症患者，为了照顾病人，需要提交的pr（pull request）符合一些规范，规范如下：

1. 注释完备，尤其每个新增的方法应按照Java文档规范标明方法说明、参数说明、返回值说明等信息，必要时请添加单元测试，如果愿意，也可以加上你的大名。
2. tuple的缩进按照IDEA,IDEA真香，默认（tab）缩进，所以请遵守（不要和我争执空格与tab的问题，这是一个病人的习惯）。
3. 新加的方法不要使用第三方库的方法，tuple遵循无依赖原则（除非在extra模块中加方法工具）。


-------------------------------------------------------------------------------


## ⭐欢迎关注

如果你觉得本项目还不错，欢迎持续关注，在此表示感谢^_^。



## 其他相关项目
[Project](https://docs.whaleal.com/project)

## 社区支持
本项目由 [whaleal社区](https://www.whaleal.com/)提供支持




