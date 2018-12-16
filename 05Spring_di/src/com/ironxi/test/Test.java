package com.ironxi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ironxi.vo.Student;

public class Test {
	public static void main(String[] args){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student student=(Student)ac.getBean("student");
		student.show();
	}
}
