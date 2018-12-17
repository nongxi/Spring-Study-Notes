package com.ironxi.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {
	/**
	 * 后置通知
	 * 返回值 returnValue
	 * 被调用方法的对象 method
	 * 被调用方法的对象的参数 args
	 * 被调用方法的目标对象target*/
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被成功执行，返回值是"+returnValue);
	}

}
