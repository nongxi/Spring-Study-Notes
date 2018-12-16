package com.ironxi.service;

public class UserServiceProxy implements UserService {
	private UserService userService;
	@Override
	public void add() {
		// TODO Auto-generated method stub
		log("add");
		userService.add();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		log("delete");
		userService.delete();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		log("update");
		userService.update();
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		log("search");
		userService.search();
	}
	public void log(String methoddName){
		System.out.println("执行"+methoddName+"方法");
	}
}
