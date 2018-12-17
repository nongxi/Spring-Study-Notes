package com.ironxi.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log {
	/**
	 * 前置通知
	 * @param method 被调用的方法
	 * @param args 被调用方法的参数
	 * @param traget 被调用方法的目标对象
	 * */
	/**前置通知的前置通知、后置通知、环绕通知等；*/
	public void before(){
		// TODO Auto-generated method stub
		System.out.println("-----在方法执行前--------");
	}
	
	public void after(){
		// TODO Auto-generated method stub
		System.out.println("-----在方法执行后--------");
	}

}
