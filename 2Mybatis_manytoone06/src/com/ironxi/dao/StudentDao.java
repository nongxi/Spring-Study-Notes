package com.ironxi.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ironxi.entity.Student;
import com.ironxi.util.MybatisUtil;

public class StudentDao {
	
	/**search all */
	public List<Student> getAll() throws IOException{
		SqlSession session = MybatisUtil.getSession();
		List<Student> list= session.selectList("com.ironxi.entity.StudentMapper.getStudents");
		session.close();
		return list;
	}
}
