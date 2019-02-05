package com.ironxi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ironxi.entity.User;

public interface UserDao {
	@Select("SELECT * FROM public.use")
	public List<User> getList();
	/**编类似的可以写select,update,delete;可以配置主键，在Mybatis.conf.xml中配置setting（设置为true或者false即可）*/
}
