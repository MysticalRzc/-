package com.campus.company.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.campus.common.GenericHibernateDAO;
import com.campus.company.model.CompanyInfo;
import com.campus.student.dao.StudentDao;

@Repository("companyDao")
public class CompanyDao extends GenericHibernateDAO<CompanyInfo, String>{
	public static Log log = LogFactory.getLog(StudentDao.class);
	public CompanyDao(){
	}
}
