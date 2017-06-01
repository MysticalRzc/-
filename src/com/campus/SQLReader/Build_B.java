package com.campus.SQLReader;

import java.util.Scanner;

import com.campus.structural.Employer;
import com.campus.structural.Work;

public class Build_B {
	
	private int studentLength;
	private int resumeLength;
	private int companyLength;
	private int recruitmentLength;
	
	public Employer[] employer_Builder(Employer[] employer) {
		Reader reader = new Reader();
		reader.employerReader();
		reader.resumeReader();
		
		//数据库中学生的个数
		this.studentLength = reader.studentlist.size();
		//数据库中简历的个数
		this.resumeLength = reader.resumelist.size();
		
		System.out.println("学生的数量："+studentLength);
		System.out.println("简历的数量："+resumeLength);
		
		employer = new Employer[studentLength];
		
		for(int i=0;i<resumeLength;i++)
		{
			employer[i] = new Employer();
			employer[i].setMajor(reader.resumelist.get(i).getMajor());
			if(reader.resumelist.get(i).getSalary()==null)
				employer[i].setMoney("0");
			else	
				employer[i].setMoney(reader.resumelist.get(i).getSalary());
			employer[i].setDegree(reader.resumelist.get(i).getDegree());
			employer[i].setStudent_id(reader.resumelist.get(i).getStudentId());
			employer[i].setPk_resume_id(reader.resumelist.get(i).getPkResumeId());
			employer[i].setDomicile(reader.resumelist.get(i).getDomicile());		//住址
			employer[i].setValue(0);
		}	
		return employer;
	}
	
	public Work[] work_Builder(Work[] work){
		Reader reader = new Reader();
		reader.companyReader();
		reader.recruitmentReader();
		
		//数据库中公司的个数
		this.companyLength = reader.companylist.size();
		//数据库中职位的个数
		this.recruitmentLength = reader.recruitmentlist.size();
		
		System.out.println("公司的数量："+companyLength);
		System.out.println("工作岗位的数量："+recruitmentLength);
		Scanner in = new Scanner(System.in);
//		int a=1;
//		while(a!=0)
//		{
//			a = in.nextInt();
//
//			System.out.println(reader.recruitmentlist.get(a).getWorkProvince());
//		}
		work = new Work[recruitmentLength];
		for(int i=0;i<recruitmentLength;i++)
		{
			work[i] = new Work();
			if(reader.recruitmentlist.get(i).getOccupationName()==null)
				work[i].setMajor("This is major is null");
			else
				work[i].setMajor(reader.recruitmentlist.get(i).getOccupationName());
			work[i].setMoney(reader.recruitmentlist.get(i).getSalary());
			work[i].setProvince(reader.recruitmentlist.get(i).getWorkProvince());
			if(reader.recruitmentlist.get(i).getCityName()==null)
				work[i].setWorkPlace("This workPlace is null");
			else
				work[i].setWorkPlace(reader.recruitmentlist.get(i).getCityName());
			work[i].setCompany_id(reader.recruitmentlist.get(i).getCompanyId());
			work[i].setPk_recruitment_id(reader.recruitmentlist.get(i).getPostId());
			if(reader.recruitmentlist.get(i).getDegree()!=null)
				work[i].setDegree(reader.recruitmentlist.get(i).getDegree());
			else
				work[i].setDegree(0);
			work[i].setValue(0);
		}
//		int i=1;
//		while(i!=0)
//		{
//			i = in.nextInt();
//			System.out.println(work[i].getMajor());
//			System.out.println(work[i].getMoney());
//			System.out.println(work[i].getProvince());
//			System.out.println(work[i].getWorkPlace());
//		}
		return work;
	}
	public int getStudentLength() {
		return studentLength;
	}
	public void setStudentLength(int studentLength) {
		this.studentLength = studentLength;
	}
	public int getResumeLength() {
		return resumeLength;
	}
	public void setResumeLength(int resumeLength) {
		this.resumeLength = resumeLength;
	}
	public int getCompanyLength() {
		return companyLength;
	}
	public void setCompanyLength(int companyLength) {
		this.companyLength = companyLength;
	}
	public int getRecruitmentLength() {
		return recruitmentLength;
	}
	public void setRecruitmentLength(int recruitmentLength) {
		this.recruitmentLength = recruitmentLength;
	}
}
