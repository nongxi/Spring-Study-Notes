package com.ironxi.test;

import java.io.IOException;
import java.util.List;

import com.ironxi.dao.StudentDao;
import com.ironxi.entity.Student;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println("************");
		StudentDao studentDao=new StudentDao();
		List<Student> list=studentDao.getAll();
		for (Student stu : list) {
			System.out.println("student name："+stu.getName()+"       student's teacher name："+stu.getTeacher().getName());
		}
		System.out.println("************");
	}
}
