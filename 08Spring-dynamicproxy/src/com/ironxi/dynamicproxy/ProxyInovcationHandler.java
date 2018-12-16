package com.ironxi.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInovcationHandler implements InvocationHandler {
	private Object target;//目标
	public void setTarget(Object target) {
		this.target = target;
	}
	/**
	 * 生成代理类
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	/**
	 * proxy是代理类 Method是调用处理程序的方法对象
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		log(method.getName());
		//seeHose();
		Object result = method.invoke(target, args);
		//fare();
		return result;
	}
	/**
	// 看房
	private void seeHose() {
		System.out.println("带房客看房");
	}

	// 收取中介费
	private void fare() {
		System.out.println("收取中介费用");
	}
	*/
	public void log(String methodName){
		System.out.println("执行"+methodName+"方法");
	}
}
