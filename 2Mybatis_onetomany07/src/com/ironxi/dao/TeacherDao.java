package com.ironxi.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.ironxi.entity.Teacher;
import com.ironxi.util.MybatisUtil;

public class TeacherDao {
	public Teacher getTeacher(int id) throws IOException{
		SqlSession session = MybatisUtil.getSession();
		Teacher teacher= session.selectOne("com.ironxi.entity.TeacherMapper.getTeacher",id);
		session.close();
		return teacher;
	}
}
