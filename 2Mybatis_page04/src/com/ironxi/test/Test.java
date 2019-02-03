package com.ironxi.test;

import java.io.IOException;
import java.util.List;

import com.ironxi.dao.UserDao;
import com.ironxi.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		/**分页查询：通过postgreSQL的limit a offset b实现*/
		System.out.println("************");
		UserDao userDao = new UserDao();
		List<User> list = userDao.selectAllUser(2, 6);
		for (User u : list) {
			System.out.println(u);
		}
		System.out.println("************");
		UserDao userDao2=new UserDao();
		List<User> list1 = userDao2.getAll(2, 6);
		for (User u : list1) {
			System.out.println(u);
		}
		System.out.println("************");
	}
}
