package com.campus.main;

import com.campus.SQLReader.Build_B;
import com.campus.algorithms.Display;
import com.campus.algorithms.Match;
import com.campus.algorithms.ResultWriteInSQL;
import com.campus.algorithms.Sort;
import com.campus.structural.Employer;
import com.campus.structural.Work;

public class Main {
	public static void main(String[] args) {
		Build_B build = new Build_B();
		Work[] work = null;
		Employer[] employer = null;

		employer = build.employer_Builder(employer);
		work = build.work_Builder(work);

		int sumEmployer = build.getResumeLength();
		int sumWork = build.getRecruitmentLength();

		Sort sortEmployer = new Sort(employer, sumEmployer - 1);
		Sort sortWork = new Sort(work, sumWork - 1);

		Display display = new Display();
		 for (int i = 0; i < sumEmployer; i++) {
//			 display.employerOutput(employer[i]);
		 }
		 System.out.println("\n>>>>>>>>>>>>>>>>>>>>>");
		 for (int i = 2500; i < sumWork; i++) {
//			 display.workOutput(work[i]);
		 }
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		Match match = new Match();
		// double number2 = match.singleMatch(work[1500], employer[20], false);

		// System.out.println(number2);
		// System.out.println(work[1500].getMajor().equals(employer[20].getMajor()));
		// System.out.println(work[1500].getWorkPlace() +
		// employer[20].getDomicile() + "\n" + work[1500].getMajor() + "\n"
		// + employer[20].getMajor());

		// ¹Ø¼üÐÔÆ¥Åä

		match.holisticMatch(work, employer, sumWork - 1, sumEmployer - 1);
		ResultWriteInSQL resultWriteSQL = new ResultWriteInSQL();
		resultWriteSQL.writeInSQL(employer, work, sumWork, sumEmployer);
		
		
//		for (int i = 0; i < sumWork; i++) {
//			int j;
//			for (j = 0; j < work[i].getListLength(); j++) {
//				System.out.print(work[i].getListNumber(j)+" ");
//			}
//			if (j != 0)
//				System.out.println();
//		}
//		System.out.println();
//		for (int i = 0; i < sumEmployer; i++) {
//			int j;
//			for (j = 0; j < employer[i].getListLength(); j++) {
//				System.out.print(employer[i].getListNumber(j)+" ");
//			}
//			if (j != 0)
//				System.out.println();
//		}
		// double number = match.singleMatch(work[10], employer[10],true);
		// System.out.println(number);

		// System.out.println("This is project is end!");
		// for(int i =0;i<sumWork;i++)
		// {
		// System.out.println(work[i].getMajor());
		// }
	}
}