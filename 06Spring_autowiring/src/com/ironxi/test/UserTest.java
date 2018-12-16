package com.ironxi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ironxi.service.UserService;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		/**getBean()括号里面的参数是获取bean.xml定义的name="**"*/
		UserService uc=(UserService)context.getBean("service");
		uc.getUser();
		System.out.println("***************");
		
	}
}
