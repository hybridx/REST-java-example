package com.deepesh.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.deepesh.bean.SubjectBean;

public class SubjectDao {
	
	private SqlSessionFactory sqlSessionFactory = null;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<SubjectBean> selectAll(){
		List<SubjectBean> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			list = session.selectList("com.deepesh.bean.SubjectBean.getAll");
			System.out.println(list);
			
		} finally {
			session.close();
		}
		return list;
	}
	
	public int insert(SubjectBean subject){
		int boolValue = 0;
		SqlSession session=sqlSessionFactory.openSession();
		
		try{
			boolValue = session.insert("com.deepesh.bean.SubjectBean.insert", subject);
			session.commit();
		}
		finally{
			session.close();
		}
		return boolValue;
	}
	
	public int update(SubjectBean subject){
		int boolValue = 0;
		SqlSession session=sqlSessionFactory.openSession();
		
		try{
			boolValue = session.insert("com.deepesh.bean.SubjectBean.update", subject);
			session.commit();
		}
		finally{
			session.close();
		}
		return boolValue;
	}
	
	public int delete(int subjectId){
		int boolValue = 0;
		SqlSession session=sqlSessionFactory.openSession();
		
		try{
			boolValue = session.insert("com.deepesh.bean.SubjectBean.delete", subjectId);
			session.commit();
		}
		finally{
			session.close();
		}
		return boolValue;
	}
	
	public SubjectBean selectById(int id){
		SubjectBean subject = null;
		SqlSession session = sqlSessionFactory.openSession();
		try {
			subject = (SubjectBean) session.
					selectOne("com.deepesh.bean.SubjectBean.getByID", id);

		} finally {
			session.close();
		}
		
		return subject;
	}
	
	
}
