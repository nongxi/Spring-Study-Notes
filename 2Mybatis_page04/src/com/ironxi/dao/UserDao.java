package com.ironxi.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.ironxi.entity.User;
import com.ironxi.util.MybatisUtil;

public class UserDao {
	/**search */
	public User getById(int id) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		User user = session.selectOne("com.ironxi.entity.UserMapper.selectUser",id);
		session.close();//可以写到fuilter(开始关闭)；
		return user;
	}
	/**search all by pagination
	 * @throws IOException */
	public List<User> selectAllUser(int currentPage,int pageSize)throws IOException{
		SqlSession session = MybatisUtil.getSession();
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("startIndex", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		List<User> list= session.selectList("com.ironxi.entity.UserMapper.selectAllUser",map);
		session.close();
		return list;
	}
	/**search all by rowBounds
	 * @throws IOException */
	public List<User> getAll(int currentPage,int pageSize)throws IOException{
		SqlSession session = MybatisUtil.getSession();
		RowBounds rowBounds=new RowBounds((currentPage-1)*pageSize,pageSize);
		List<User> list= session.selectList("com.ironxi.entity.UserMapper.getAll",null,rowBounds);
		session.close();
		return list;
	}
	/**add*/
	public int add(User user) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		int result=session.insert("com.ironxi.entity.UserMapper.addUser",user);
		session.commit();
		session.close();
		return result;
	}
	/**update*/
	public int update(User user) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		int result=session.update("com.ironxi.entity.UserMapper.updateUser",user);
		session.commit();
		session.close();
		return result;
	}
	/**delete*/
	public int deleteUser(int id) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		int result=session.delete("com.ironxi.entity.UserMapper.deleteUser",id);
		session.commit();
		session.close();
		return result;
	}
}
