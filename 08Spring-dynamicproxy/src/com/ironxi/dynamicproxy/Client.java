package com.ironxi.dynamicproxy;

import java.util.ArrayList;
import java.util.List;

import com.ironxi.service.UserService;
import com.ironxi.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Host host=new Host();
		ProxyInovcationHandler pih=new ProxyInovcationHandler();
		pih.setTarget(host);
		Rent proxy=(Rent)pih.getProxy();
		proxy.rent();
		System.out.println("***********");
		//user测试
		UserService userService=new UserServiceImpl();
		ProxyInovcationHandler userPih=new ProxyInovcationHandler();
		userPih.setTarget(userService);
		UserService userProxy=(UserService)userPih.getProxy();
		userProxy.add();
		System.out.println("***********////");
		userProxy.delete();
		System.out.println("***********////");
		userProxy.update();	
		System.out.println("***********////");
		userProxy.search();
		
		//
		System.out.println("***********////");
		System.out.println("任意对象");
		ProxyInovcationHandler pi=new ProxyInovcationHandler();
		pi.setTarget(new ArrayList());
		List list =(List)pi.getProxy();
		list.add("hello");
	}

}
