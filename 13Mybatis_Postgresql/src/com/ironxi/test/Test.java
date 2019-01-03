package com.ironxi.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.ironxi.entity.User;
import com.ironxi.util.MybatisUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		System.out.println(session);
		User user = (User)session.selectOne("com.ironxi.entity.UserMapper.selectUser",2);
		System.out.println("id:" + user.getId() + "   name:" + user.getName()+ "   password:" + user.getPassward());
		session.close();
	}
}
