package com.campus.algorithms;

import com.campus.structural.Employer;
import com.campus.structural.Work;

public class Display {
	public void employerOutput(Employer employer){
		//System.out.println(employer.getValue());
		System.out.println(
				"员工信息：Major" + employer.getMajor().trim()
				+ "\t\tworkPlace:" + employer.getDomicile().trim() 
				+ "\t\tMoney:"+ employer.getMoney().trim() 
				+"\t\tValue:"+employer.getValue()
				+"\t\tresumeId:"+employer.getPk_resume_id()
				+"\t\tstudentId:"+employer.getStudent_id()
		);
	}
	public void workOutput(Work work){
		System.out.println(
				"职位信息：Major" + work.getMajor().trim()
				+ "\t\tworkPlace:" + work.getWorkPlace().trim()
				+ "\t\tMoney:" + work.getMoney().trim()
				+ "\t\tValue:" + work.getValue()
				+ "\t\tCompanyId:" + work.getCompany_id()
				+ "\t\trecruitId:" + work.getPk_recruitment_id()
 		);
	}
	public void CompareResultOutput(String name,double message[][],int index[],int n)
	{
		Search search = new Search();
		
		System.out.println(search.searchHalf(message, index[2]));
		
		System.out.println("<<<<<<<<<<<<<<<<" + n + ">>>>>>>>>>>>>>>>");
		for (int j = 0; j <= index[2]; j++) {
			System.out.println(name + n +"    匹配符合度： "+message[j][0] + "   Id:" + message[j][1]);

		}
		System.out.println("\n\n");
	}
	
	public void EmployerWriteResultOutput(Employer employer)
	{
		int[] list = employer.getWorkIndexList();
		for(int i =0;i<employer.getListLength();i++)
		{
			System.out.println(list[i]);
		}
	}
	
	public void WorkWriteResultOutput(Work work)
	{
		int[] list = work.getEmployerIndexList();
		for(int i =0;i<work.getListLength();i++)
		{
			System.out.println(list[i]);
		}
	}
}
