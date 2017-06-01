package com.campus.resume_recommend.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.campus.common.GenericHibernateDAO;
import com.campus.resume_recommend.model.TResumeRecommend;

@Repository("resumeRecommendDao")
public class ResumeRecommendDao extends GenericHibernateDAO<TResumeRecommend, String>{
	public static Log log = LogFactory.getLog(ResumeRecommendDao.class);
	public ResumeRecommendDao(){
	}
}
