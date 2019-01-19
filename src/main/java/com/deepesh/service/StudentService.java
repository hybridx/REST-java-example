package com.deepesh.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.deepesh.bean.StudentBean;
import com.deepesh.bo.StudentBo;

public class StudentService {
	
	private StudentBo studentBo;
	private StudentBean studentBean = new StudentBean();
	
	
	public StudentBo getStudentBo() {
		return studentBo;
	}

	public void setStudentBo(StudentBo studentBo) {
		this.studentBo = studentBo;
	}

	public StudentBean getStudentBean() {
		return studentBean;
	}

	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	
	@POST
	@Path("/addStudent")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public int addStudent(@Multipart(value="name")String name,
			@Multipart(value="rollNo")int rollNo){
		
		System.out.println(name);
		System.out.println(rollNo);
		
		studentBean.setName(name);
		studentBean.setRollNo(rollNo);
		return studentBo.insertStudent(studentBean);
	}
	
	@GET
	@Path("/getStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentBean> getAllStudents() {
		return studentBo.getAllStudents();

	}
}
