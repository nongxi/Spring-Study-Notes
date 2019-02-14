package com.ironxi.test;

import java.io.IOException;
import java.util.List;

import com.ironxi.dao.TeacherDao;
import com.ironxi.entity.Student;
import com.ironxi.entity.Teacher;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println("************");
		TeacherDao teacherDao=new TeacherDao();
		Teacher teacher=teacherDao.getTeacher(1);
		System.out.println("teacher name:"+teacher.getName());
		List<Student> list=teacher.getStudents();
		for (Student stu : list) {
			System.out.println("student name："+stu.getName());
		}
		System.out.println("************");
	}
}
