package com.ironxi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ironxi.vo.User;

public class UserTest {
	public static void main(String[] args){
	ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	//User user=(User) ac.getBean("user");
	//System.out.println(user);
	User user=(User) ac.getBean("u1");
	System.out.println(user);
	}
}
