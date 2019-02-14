package com.ironxi.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ironxi.dao.UserDao;
import com.ironxi.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		
		/** Select */
		UserDao userDao = new UserDao();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", "四");
		List<User> list=userDao.getAll(map);
		for(User u:list){
			System.out.println(u);
		}
		System.out.println("************");
		
	
	
	}
}
