package com.ironxi.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
	/**
	 * 前置通知
	 * @param method 被调用的方法
	 * @param args 被调用方法的参数
	 * @param traget 被调用方法的目标对象
	 * */
	/**前置通知的前置通知、后置通知、环绕通知等；*/
	@Before("execution(* com.ironxi.impl.*.*(..))")
	public void before(){
		// TODO Auto-generated method stub
		System.out.println("-----在方法执行前--------");
	}
	@After("execution(* com.ironxi.impl.*.*(..))")
	public void after(){
		// TODO Auto-generated method stub
		System.out.println("-----在方法执行后--------");
	}
	//环绕通知
	@Around("execution(* com.ironxi.impl.*.*(..))")
	public Object aroud(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("在前置通知前");
		System.out.println("方法签名："+jp.getSignature());
		Object result=jp.proceed();
		System.out.println("在后置通知后");
		return result;
	}

}
