package com.campus.main;


import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.campus.algorithms.Match;
import com.campus.algorithms.Sort;
import com.campus.student.service.StudentService;
import information_reader.Employer;
import information_reader.Work;
import information_reader.employerReader;
import information_reader.workReader;

public class unmain {
	public static Log log = LogFactory.getLog(unmain.class);
	public static void main(String[] args) {
		if(SpringContext.initSpring()){
			StudentService studentService = StudentService.getFromApplication();
			String name = studentService.getStudentName(1);
			System.out.println("studentName："+name);
//			
//			int workNum = 1000, sumWork = 0;
//			int employerNum = 1000, sumEmployer = 0;
//			int[] a = new int[200];
//			Work[] work = new Work[1000];
//			Employer[] employer = new Employer[1000];
//
//			workReader wr = new workReader();
//			employerReader er = new employerReader();
//			try {
//				sumEmployer = er.reader(employer, employerNum);
//				//已完成
//				
//	//			Sort sortEmployer = new Sort(employer, sumEmployer - 1);
//				//已完成
//				
//				sumWork = wr.reader(work, workNum);
//				//已完成
//				
////				Sort sortWork = new Sort(work, sumWork - 1);
//				//已完成
//				
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			for (int i = 0; i < sumWork; i++) {
//				System.out.print(i + work[i].getWorkPlace() + "	");
//				System.out.print(work[i].getWorkMajor() + "	");
//				System.out.print(work[i].getWorkEducation() + "	");
//				System.out.print(work[i].getWorkMoney() + "	");
//				System.out.println("\t" + work[i].getValue());
//			}
//			System.out.println();
//			for (int i = 0; i < sumEmployer; i++) {
//				System.out.print(i + employer[i].getWorkPlace() + "	");
//				System.out.print(employer[i].getWorkMajor() + "	");
//				System.out.print(employer[i].getWorkEducation() + "	");
//				System.out.print(employer[i].getWorkMoney() + "	");
//				System.out.println("\t" + employer[i].getValue());
//			}
//
//			Match match = new Match();
//			int index = 0;
//			double max = 0;
//			for (int i = 0; i < sumEmployer; i++)
//			{
////				if (max < match.singleMatch(work[0], employer[i], false)) {
////					max = match.singleMatch(work[0], employer[i], false);
//					index = i;
//				}
//			// System.out.println("\n\n第一个工作的最佳人选是第"+(index+1)+"名员工\n" +
//			// match.singlematch(work[0], employer[index], false));
////			Search search = new Search();
////			int[] ind = { 0, sumWork - 1, 0 };
//	//
////			search.workSearch(ind, employer[0], work);
////			System.out.println(ind[0] + "  " + ind[1] + " " + ind[2]);
//
////			ind[0] = 0;
////			ind[1] = sumEmployer - 1;
////			ind[2] = 0;
////			search.employerSearch(ind, work[0], employer);
////			System.out.println(ind[0] + "  " + ind[1] + " " + ind[2]);
////			System.out.println(sumWork+ " "+sumEmployer);
////			match.holisticMatch(work, employer, sumWork-1, sumEmployer-1);
		}else{
			log.error("main start test failed!");
            System.exit(0);
		}
		
	}
}
