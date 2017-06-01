package com.campus.student.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.main.SpringContext;
import com.campus.student.dao.StudentDao;
import com.campus.student.model.TStudentInfo;

@Service("studentService")
public class StudentService {
	public static Log log = LogFactory.getLog(StudentService.class);
	@Autowired
	private StudentDao studentDao;

	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	public static StudentService getFromApplication() {
		return (StudentService) SpringContext.CTX.getBean("studentService");
	}

	public String getStudentName(Integer sid) {
		List<TStudentInfo> studentList = studentDao.findByProperty("pkStudentId", sid);
		String name = null;
		if (studentList != null && studentList.size() > 0) {
			for (TStudentInfo student : studentList) {
				System.out.println(student.getUserName()+"sdfasdf");
				name = student.getUserName();
			}
		}
		return name;
	}

	public  List<TStudentInfo> findAll() {
		Integer num;
		num  = 203;
		List<TStudentInfo> studentList = studentDao.findAll();
		//studentList.size();
		return studentList;
	}
}
