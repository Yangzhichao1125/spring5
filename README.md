# spring5
spring5

自己编译的以及翻译的Spring5.0



步骤：

1:安装gradle:   使用4.9版本

2:下载springframwork源码

3:导入idea

4:配置：![1](./img/1.png)

等待编译完成（半小时到一小时）

5:运行core包下的test

![2](./img/2.png)





# Spring流程



### 1:实例化上下文

```java
new AnnotationConfigApplicationContext(SpringConf.class);
```



### 2:调用父类构造，new 一个beanFactory       ( DefaultListableBeanFactory )

```java
	public GenericApplicationContext() {
		this.beanFactory = new DefaultListableBeanFactory();
	}
```



### 3:spring第三步 构造函数实例化一个bdreader

```java
	public AnnotationConfigApplicationContext() { 
		this.reader = new AnnotatedBeanDefinitionReader(this);
		this.scanner = new ClassPathBeanDefinitionScanner(this);
	}
```



### 4:spring第四步，注册6个bd,放入set中

```java
AnnotationConfigUtils.registerAnnotationConfigProcessors(this.registry);
```

1个beanFactoryPostProcessor

核心中的核心类：

```
ConfigurationClassPostProcessor
```

5个beanPostProcessor



### 5:spring第五步调用refresh方法

```java
refresh()
```



### 6:spring第六步准备工厂

```java
prepareBeanFactory(beanFactory);
```

```java
//spring第六步重要点：添加后置处理器
beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));
```



### 7:spring第七步调用bean工厂后置处理器

```java
invokeBeanFactoryPostProcessors(beanFactory);
```



获取容器中所有bean名字,然后解析对象

```java
public void processConfigBeanDefinitions(BeanDefinitionRegistry registry) 
```









