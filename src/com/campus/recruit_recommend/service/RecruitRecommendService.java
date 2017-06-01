package com.campus.recruit_recommend.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.main.SpringContext;
import com.campus.recruit_recommend.dao.RecruitRecommendDao;
import com.campus.recruit_recommend.model.TRecruitRecommend;

@Service("recruitRecommendService")
public class RecruitRecommendService {
	public static Log log = LogFactory.getLog(RecruitRecommendService.class);
	@Autowired
	private RecruitRecommendDao recruitRecommendDao;

	public RecruitRecommendService() {
		// TODO Auto-generated constructor stub
	}

	public static RecruitRecommendService getFromApplication() {
		return (RecruitRecommendService) SpringContext.CTX.getBean("recruitRecommendService");
	}

	public Integer getTime(Integer sid) {
		List<TRecruitRecommend> recruit = recruitRecommendDao.findByProperty("recommend_time", sid);
		Integer id = null;
		if (recruit != null && recruit.size() > 0) {
			for (TRecruitRecommend student : recruit) {
				id = student.getRecommendTime();
			}
		}
		System.out.println(">>" + id);
		return id;
	}

	public void save(TRecruitRecommend tRecruitRecommend) {
		try {
			recruitRecommendDao.save(tRecruitRecommend);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void saveAll(List<TRecruitRecommend> tRecruitRecommend) {
		try {
			recruitRecommendDao.saveAll(tRecruitRecommend);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void saveOrUpdateAll(List<TRecruitRecommend> tRecruitRecommend) {
		try {
			recruitRecommendDao.saveOrUpdateAll(tRecruitRecommend);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}