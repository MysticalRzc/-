package com.campus.resume.service;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.campus.main.SpringContext;
import com.campus.resume.dao.ResumeDao;
import com.campus.resume.model.TResume;

@Service("resumeService")
public class ResumeService {
	public static Log log = LogFactory.getLog(ResumeService.class);
	@Autowired
	private ResumeDao resumeDao;

	public ResumeService() {
		// TODO Auto-generated constructor stub
	}

	public static ResumeService getFromApplication() {
		return (ResumeService) SpringContext.CTX.getBean("resumeService");
	}
	public String getResumeName(Integer sid) {
		List<TResume> resumeList = resumeDao.findByProperty("pkResumeId", sid);
		String name = null;
		if (resumeList != null && resumeList.size() > 0) {
			for (TResume student : resumeList) {
				name = student.getName();
			}
		}
		return name;
	}

	public  List<TResume> findAll() {
		Integer num;
		num  = 203;
		List<TResume> resumeList = resumeDao.findAll();
		//studentList.size();
		return resumeList;
	}
}
