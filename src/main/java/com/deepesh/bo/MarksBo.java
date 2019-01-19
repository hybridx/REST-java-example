package com.deepesh.bo;

import java.util.List;

import com.deepesh.bean.MarksBean;
import com.deepesh.dao.MarksDao;

public class MarksBo {
	private MarksDao marksDoa;
	
	public MarksDao getMarksDoa() {
		return marksDoa;
	}

	public void setMarksDoa(MarksDao marksDoa) {
		this.marksDoa = marksDoa;
	}

	public List<MarksBean> getAllMarks() {
		return marksDoa.selectAll();
	}
	
	public int insert(MarksBean marks){
		return marksDoa.insert(marks);
	}
	
}
