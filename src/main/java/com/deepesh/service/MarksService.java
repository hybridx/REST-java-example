package com.deepesh.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.deepesh.bean.MarksBean;
import com.deepesh.bo.MarksBo;

public class MarksService {
	
	private MarksBean marksBean = new MarksBean();
	private MarksBo marksBo = null;
	
	public MarksBo getMarksBo() {
		return marksBo;
	}
	public void setMarksBo(MarksBo marksBo) {
		this.marksBo = marksBo;
	}
	public MarksBean getMarksBean() {
		return marksBean;
	}
	public void setMarksBean(MarksBean marksBean) {
		this.marksBean = marksBean;
	}
	
	
	@POST
	@Path("/addMarks")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public int addMarks(@Multipart(value="subjectId")int subjectId,
			@Multipart(value="rollNo")int rollNo,
			@Multipart(value="marks")int marks){
		
		System.out.println(rollNo);
		System.out.println(subjectId);
		System.out.println(marks);
		
		
		marksBean.setMarks(marks);
		marksBean.setRollNo(rollNo);
		marksBean.setSubjectId(subjectId);
		
		return marksBo.insert(marksBean);
	}
	
	@GET
	@Path("/getMarks")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<MarksBean> getAllStudents() {
		return marksBo.getAllMarks();

	}
	
}
