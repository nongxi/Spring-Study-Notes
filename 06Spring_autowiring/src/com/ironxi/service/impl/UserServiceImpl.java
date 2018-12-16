package com.ironxi.service.impl;

import com.ironxi.dao.UserDao;
import com.ironxi.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao=null;
	/**提供了一个接口（创建对象的接口）*/
	public UserServiceImpl(UserDao userDao){
		this.userDao=userDao;
	}
	@Override
	public void getUser() {
		// TODO Auto-generated method stub
		userDao.getUser();
	}

}
