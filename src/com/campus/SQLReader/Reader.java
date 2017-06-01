package com.campus.SQLReader;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.campus.common.GenericHibernateDAO;
import com.campus.company.model.CompanyInfo;
import com.campus.company.service.CompanyService;
import com.campus.main.SpringContext;
import com.campus.recruitment.model.RecruitInfo;
import com.campus.recruitment.service.RecruitmentService;
import com.campus.resume.model.TResume;
import com.campus.resume.service.ResumeService;
import com.campus.structural.B_pointEmployer;
import com.campus.structural.B_pointWork;
import com.campus.student.dao.StudentDao;
import com.campus.student.model.TStudentInfo;
import com.campus.student.service.StudentService;

public class Reader extends GenericHibernateDAO<StudentDao, String>{
	public static Log log = LogFactory.getLog(Reader.class);
	
	public List<TStudentInfo> studentlist = null;
	public List<TResume> resumelist = null;
	public List<RecruitInfo> recruitmentlist = null;
	public List<CompanyInfo> companylist = null;

	
	public void employerReader() {
		//�����ص㣬���ʶ��٣��ó�רҵ
		this.studentReader();
		this.resumeReader();
		
	}

	public void workReader() {
		//��λ�ص㣬���ʶ��٣����̷���
		this.companyReader();
		this.recruitmentReader();
	}
	
	
	
	

	public void studentReader() {
		//��ȡѧ����Ϣ
		if (SpringContext.initSpring()) {
			StudentService studentService = StudentService.getFromApplication();
//			String name = studentService.getStudentName(203);
//			TStudentInfo student = new TStudentInfo();
//			System.out.println("studentName��" + name);
			
 			studentlist = studentService.findAll();
 			
//			System.out.println(studentlist.get(1).getMajorName());
//			System.out.println("ok");
		}
	}
	public void resumeReader(){
		//��ȡѧ��������Ϣ
		if(SpringContext.initSpring()){
			ResumeService resumeService = ResumeService.getFromApplication();
			
//			System.out.println(resumeService.getResumeName(10));
			resumelist = resumeService.findAll();
//			for(int j=0 ;j<resumelist.size();j++)
//			{
//				System.out.println(resumelist.get(j).getName());
//			}
		//	System.out.println(resume.size());
		}
	}
	public void recruitmentReader(){
		//��ȡ 
		if(SpringContext.initSpring()){
			RecruitmentService recruitmentService = RecruitmentService.getFromApplication();
			
			recruitmentlist = recruitmentService.findAll();
//			for(int i =0;i<recruitmentlist.size();i++)
//				System.out.println(recruitmentlist.get(i).getDegree());
//			System.out.println(recruitmentlist.size());
//			System.out.println(recruitmentlist.get(4).getSalary());
		}
	}
	public void companyReader(){
		//��ȡ��˾��Ϣ
		if(SpringContext.initSpring()){
			CompanyService companyService = CompanyService.getFromApplication();
			
			
			companylist = companyService.findAll();
//			System.out.println(companylist.size());
//			System.out.println(companylist.get(2).getLocation());
		}
	}
}
