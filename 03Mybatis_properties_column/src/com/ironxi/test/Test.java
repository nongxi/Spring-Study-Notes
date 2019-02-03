package com.ironxi.test;

import java.io.IOException;
import java.util.List;

import com.ironxi.dao.UserDao;
import com.ironxi.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		
		/** Select */
		/*UserDao userDao = new UserDao();
		System.out.println(userDao.getById(1));
		System.out.println("************");*/
		
		/** add */
		/*UserDao userDao = new UserDao();
		User user = new User();
		user.setName("四狗");
		user.setPassword("123455");
		System.out.println(userDao.add(user));
		System.out.println("************");*/
		/** update */
		/*UserDao userDao = new UserDao();
		User user = userDao.getById(2);
		user.setName("司礼");
		System.out.println(userDao.update(user));
		System.out.println("************");*/
		/* delete 
		UserDao userDao3 = new UserDao();
		System.out.println(userDao3.deleteUser(2));
		System.out.println("************");
		**/
		//**select all*//*
		UserDao userDao = new UserDao();
		List<User> list = userDao.getAllUser();
		for (User u : list) {
			System.out.println(u);
		}
		System.out.println("************");
	}
}
