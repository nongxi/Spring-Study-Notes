package com.ironxi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ironxi.bean.Hello;

public class Test {
	public static void main(String[] args){
		//解析beans.xml文件，生成管理相应的bean对象；
		/**BeanFactory context=new ClassPathXmlApplicationContext("beans.xml");*/
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//Hello hello=(Hello)context.getBean("hello");
		Hello hello=context.getBean(Hello.class);
		hello.show();
	}
}
