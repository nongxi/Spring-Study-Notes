package com.ironxi.impl;

import com.ironxi.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("增加用户");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("删除用户");
	}

	@Override
	public void update(int a) {
		// TODO Auto-generated method stub
		System.out.println("改变用户");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("查询用户");
	}

}
