package com.campus.student.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import com.campus.common.GenericHibernateDAO;
import com.campus.student.model.TStudentInfo;

@Repository("studentDao")
public class StudentDao extends GenericHibernateDAO<TStudentInfo, String>{
	public static Log log = LogFactory.getLog(StudentDao.class);
	public StudentDao(){
	}
}
