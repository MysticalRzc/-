package com.campus.recruitment.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.main.SpringContext;
import com.campus.recruitment.dao.RecruitmentDao;
import com.campus.recruitment.model.RecruitInfo;

@Service("recruitmentService")
public class RecruitmentService {
	public static Log log = LogFactory.getLog(RecruitmentService.class);
	@Autowired
	private RecruitmentDao recruitmentDao;

	public RecruitmentService() {
		// TODO Auto-generated constructor stub
	}

	public static RecruitmentService getFromApplication() {
		return (RecruitmentService) SpringContext.CTX.getBean("recruitmentService");
	}
	public String getRecruitmentName(Integer sid) {
		List<RecruitInfo> recruitmentList = recruitmentDao.findByProperty("postname", sid);
		String name = null;
		if (recruitmentList != null && recruitmentList.size() > 0) {
			for (RecruitInfo student : recruitmentList) {
				name = student.getPostname();
			}
		}
		return name;
	}

	public  List<RecruitInfo> findAll() {
		Integer num;
		num  = 203;
		List<RecruitInfo> recruitmentList = recruitmentDao.findAll();
		//studentList.size();
		return recruitmentList;
	}
}
