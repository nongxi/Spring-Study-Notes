package com.ironxi.log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class Share {
	/**返回通知*/
	@AfterReturning("execution(* com.ironxi.impl.*.*(..))")
	public void share() {
		System.out.println("----最后返回一个结果-----");
	}
}
