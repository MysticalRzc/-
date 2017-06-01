package com.campus.resume.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import com.campus.common.GenericHibernateDAO;
import com.campus.resume.model.TResume;
import com.campus.student.model.TStudentInfo;

@Repository("resumeDao")
public class ResumeDao extends GenericHibernateDAO<TResume, String>{
	public static Log log = LogFactory.getLog(ResumeDao.class);
	public ResumeDao(){
	}
}
