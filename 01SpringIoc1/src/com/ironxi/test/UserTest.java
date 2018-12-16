package com.ironxi.test;

import com.ironxi.daoImpl.UserDaoMysqlImpl;
import com.ironxi.daoImpl.UserDaoOracleImpl;
import com.ironxi.serviceImpl.UserServiceImpl;

public class UserTest {

	public static void main(String[] args) {
		/**放在编译环境里面就可以不用自己来*/
		// TODO Auto-generated method stub
		UserServiceImpl userService=new UserServiceImpl();
		userService.setUserDao(new UserDaoMysqlImpl());
		userService.getUser();
		System.out.println("***************");
		userService.setUserDao(new UserDaoOracleImpl());
		userService.getUser();
	}

}
