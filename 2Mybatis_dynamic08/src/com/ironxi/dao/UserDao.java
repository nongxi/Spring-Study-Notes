package com.ironxi.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.ironxi.entity.User;
import com.ironxi.util.MybatisUtil;

public class UserDao {
	/**search all
	 * @throws IOException */
	public List<User> getAll(Map<String,Object> map) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		List<User> list= session.selectList("com.ironxi.entity.UserMapper.getUserByCondition",map);
		session.close();
		return list;
	}
}
