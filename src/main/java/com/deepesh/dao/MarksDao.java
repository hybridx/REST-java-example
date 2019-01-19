package com.deepesh.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.deepesh.bean.MarksBean;

public class MarksDao {
	
	private SqlSessionFactory sqlSessionFactory = null;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<MarksBean> selectAll(){
		List<MarksBean> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			list = session.selectList("com.deepesh.bean.MarksBean.getAll");
			System.out.println(list);
			
		} finally {
			session.close();
		}
		return list;
	}
	
	public int insert(MarksBean marks){
		int boolValue = 0;
		SqlSession session=sqlSessionFactory.openSession();
		
		try{
			boolValue = session.insert("com.deepesh.bean.MarksBean.insert", marks);
			session.commit();
		}
		finally{
			session.close();
		}
		return boolValue;
	}
	
}
