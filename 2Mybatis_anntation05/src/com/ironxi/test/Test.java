package com.ironxi.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ironxi.dao.UserDao;
import com.ironxi.entity.User;
import com.ironxi.util.MybatisUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		/**通过注解实现查询*/
		System.out.println("************");
		SqlSession session=MybatisUtil.getSession(); 
		UserDao userDao=session.getMapper(UserDao.class);
		/**通过动态代理实现接口UserDao的实现类，getList()获取的是UserDao实现类的getList方法*/
		List<User> list=userDao.getList();
		for(User u:list){
			System.out.println(u);
		}
	}
}
