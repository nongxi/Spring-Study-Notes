package com.ironxi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ironxi.service.UserService;

public class Test {
	public static void main(String[] args){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=(UserService)ac.getBean("userService");
		userService.add();
		System.out.println("********************");
		userService.delete();
		System.out.println("********************");
		userService.update(6666);
		System.out.println("********************");
		userService.search();
		
		
	}
}
