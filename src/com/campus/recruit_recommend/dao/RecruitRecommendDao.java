package com.campus.recruit_recommend.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.campus.common.GenericHibernateDAO;
import com.campus.recruit_recommend.model.TRecruitRecommend;

@Repository("recruitRecommendDao")
public class RecruitRecommendDao extends GenericHibernateDAO<TRecruitRecommend, String>{
	public static Log log = LogFactory.getLog(RecruitRecommendDao.class);
	public RecruitRecommendDao(){
	}
}
