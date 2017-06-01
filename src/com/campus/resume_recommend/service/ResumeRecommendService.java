package com.campus.resume_recommend.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.main.SpringContext;
import com.campus.resume_recommend.dao.ResumeRecommendDao;
import com.campus.resume_recommend.model.TResumeRecommend;

@Service("resumeRecommendService")
public class ResumeRecommendService {
	public static Log log = LogFactory.getLog(ResumeRecommendService.class);
	@Autowired
	private ResumeRecommendDao resumeRecommendDao;

	public ResumeRecommendService() {
		// TODO Auto-generated constructor stub
	}

	public static ResumeRecommendService getFromApplication() {
		return (ResumeRecommendService) SpringContext.CTX.getBean("resumeRecommendService");
	}

	public void saveOrUpdateAll(List<TResumeRecommend> tResumeRecommend)
	{
		try {
			resumeRecommendDao.saveOrUpdateAll(tResumeRecommend);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void saveAll(List<TResumeRecommend> tResumeRecommend)
	{
		try {
			resumeRecommendDao.saveAll(tResumeRecommend);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void save(TResumeRecommend tResumeRecommend)
	{
		try {
			resumeRecommendDao.save(tResumeRecommend);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
//	public Integer getCompanyId(Integer sid) {
//		List<TResumeRecommend> recommend = resumeRecommendDao.findByProperty("companyId", sid);
//		Integer id = null;
//		if (recommend != null && recommend.size() > 0) {
//			for (TResumeRecommend student : recommend) {
//				id = student.getid();
//			}
//		}
//		System.out.println(">>"+id);
//		return id;
//	}

//	public  List<TResumeRecommend> findAll() {
//		Integer num;
//		num  = 203;
//		List<TResumeRecommend> List = resumeRecommendDao.findAll();
//		//studentList.size();
//		resumeRecommendDao.
//		//System.out.println(List.size());
//		return List;
//	}
}
