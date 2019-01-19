package com.deepesh.bo;

import java.util.List;

import com.deepesh.bean.SubjectBean;
import com.deepesh.dao.SubjectDao;


public class SubjectBo {
	
	private SubjectDao subjectDao;

	public void setSubjectDao(SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}
	
	public int insertSubject(SubjectBean subject) {
		return subjectDao.insert(subject);
	}

	public int updateSubject(SubjectBean subject) {
		return this.subjectDao.update(subject);
	}

	public int deleteSubject(int id) {
		return this.subjectDao.delete(id);
	}
	
	public SubjectBean getSubjectDetails(int id) {
		SubjectBean subject = this.subjectDao.selectById(id);
		
		System.out.println(subject);

		return subject;
	}
	
	public SubjectDao getSubjectDao() {
		return subjectDao;
	}

	public List<SubjectBean> getAllSubjects() {
		return subjectDao.selectAll();
	}

}
