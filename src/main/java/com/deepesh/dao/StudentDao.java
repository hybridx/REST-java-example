package com.deepesh.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.deepesh.bean.StudentBean;

public class StudentDao {
	
	private SqlSessionFactory sqlSessionFactory = null;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<StudentBean> selectAll(){
		List<StudentBean> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			list = session.selectList("com.deepesh.bean.StudentBean.getAll");
			System.out.println(list);
			
		} finally {
			session.close();
		}
		return list;
	}
	
	public int insert(StudentBean student){
		int boolValue = 0;
		SqlSession session=sqlSessionFactory.openSession();
		
		try{
			boolValue = session.insert("com.deepesh.bean.StudentBean.insert", student);
			session.commit();
		}
		finally{
			session.close();
		}
		return boolValue;
	}
	
	public int update(StudentBean student){
		int boolValue = 0;
		SqlSession session=sqlSessionFactory.openSession();
		
		try{
			boolValue = session.insert("com.deepesh.bean.StudentBean.update", student);
			session.commit();
		}
		finally{
			session.close();
		}
		return boolValue;
	}
	
	public int delete(int rollNo){
		int boolValue = 0;
		SqlSession session=sqlSessionFactory.openSession();
		
		try{
			boolValue = session.insert("com.deepesh.bean.StudentBean.delete", rollNo);
			session.commit();
		}
		finally{
			session.close();
		}
		return boolValue;
	}
	
	public StudentBean selectById(int id){
		StudentBean student = null;
		SqlSession session = sqlSessionFactory.openSession();
		try {
			student = (StudentBean) session.
					selectOne("com.deepesh.bean.StudentBean.getByID", id);

		} finally {
			session.close();
		}
		
		return student;
	}
	
	
}
