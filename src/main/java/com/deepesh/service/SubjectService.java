package com.deepesh.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.deepesh.bean.SubjectBean;
import com.deepesh.bo.SubjectBo;

public class SubjectService {
	
	private SubjectBo subjectBo;
	private SubjectBean subjectBean = new SubjectBean();
	
	
	public SubjectBean getSubjectBean() {
		return subjectBean;
	}
	
	public void setSubjectBean(SubjectBean subjectBean) {
		this.subjectBean = subjectBean;
	}
	
	public SubjectBo getSubjectBo() {
		return subjectBo;
	}
	
	public void setSubjectBo(SubjectBo subjectBo) {
		this.subjectBo = subjectBo;
	}
	
	
	
	@POST
	@Path("/addSubject")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public int addStudent(@Multipart(value="subjectName")String subjectName,
			@Multipart(value="subjectId")int subjectId){
		
		System.out.println(subjectName);
		System.out.println(subjectId);
		
		subjectBean.setSubjectId(subjectId);
		subjectBean.setSubjectName(subjectName);
		return subjectBo.insertSubject(subjectBean);
	}
	
	
	@GET
	@Path("/getSubject")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<SubjectBean> getAllSubjects() {
		return subjectBo.getAllSubjects();

	}
	
	
	
}
