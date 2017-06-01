package com.campus.company.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.company.dao.CompanyDao;
import com.campus.company.model.CompanyInfo;
import com.campus.main.SpringContext;


@Service("companyService")
public class CompanyService {
	public static Log log = LogFactory.getLog(CompanyService.class);
	@Autowired
	private CompanyDao companyDao;

	public CompanyService() {
		// TODO Auto-generated constructor stub
	}

	public static CompanyService getFromApplication() {
		return (CompanyService) SpringContext.CTX.getBean("companyService");
	}

	public  List<CompanyInfo> findAll() {
		Integer num;
		num  = 203;
		List<CompanyInfo> companylist = companyDao.findAll();
		//studentList.size();
		return companylist;
	}
}
