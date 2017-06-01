package com.campus.recruitment.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import com.campus.common.GenericHibernateDAO;
import com.campus.recruitment.model.RecruitInfo;

@Repository("recruitmentDao")
public class RecruitmentDao extends GenericHibernateDAO<RecruitInfo, String>{
	public static Log log = LogFactory.getLog(RecruitmentDao.class);
	public RecruitmentDao(){
	}
}
