package com.deepesh.bo;

import java.util.List;

import com.deepesh.bean.StudentBean;
import com.deepesh.dao.StudentDao;


public class StudentBo {
	
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public int insertStudent(StudentBean student) {
		return studentDao.insert(student);
	}

	public int updateStudent(StudentBean student) {
		return this.studentDao.update(student);
	}

	public int deleteStudent(int id) {
		return this.studentDao.delete(id);
	}
	
	public StudentBean getStudentDetails(int id) {
		StudentBean student = this.studentDao.selectById(id);
		
		System.out.println(student);

		return student;
	}
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public List<StudentBean> getAllStudents() {
		return studentDao.selectAll();
	}

}
