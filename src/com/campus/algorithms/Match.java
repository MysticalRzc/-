package com.campus.algorithms;

import com.campus.structural.Employer;
import com.campus.structural.Work;

/***
 * holisticMatch�������ƥ�䣬ÿһ�����ݶ�����ƥ������Ӧ������
 * singleMath ���������ݽ���ƥ�䣬���ҷ������������Ǻ�ϵ��
 * @author RZC
 *
 */
public class Match {
	
	InformationManage inforManage = new InformationManage();
	Display display = new Display();
	ResultWriteInClass writeIn = new ResultWriteInClass();
	
	public boolean holisticMatch(Work work[], Employer employer[], int sumWork, int sumEmployer) {
// 		��������ƥ��
		Search search = new Search();
		int[] index = { 0, 0, 0 };
		Sort sort = new Sort();
		for (int i = 0; i < sumWork; i++) {
		//	System.out.println(">>"+i);
			index[0] = 0;
			index[1] = sumEmployer;
			index[2] = -1;
			
			search.employerSearch(index, work[i], employer);
//			if(i == 2900)
//				System.out.println(index[2]);
//			if (i == 10)
//				System.out.println("###" + index[2]);
			if (index[2] != -1) {
				double[][] message = new double[index[2] + 1][3];
				// System.out.println(index[2]);
				for(int j = index[0]; j <= index[1]; j++) {
					message[j - index[0]][0] = singleMatch(work[i], employer[j], true);
					message[j - index[0]][1] = j;
					message[j - index[0]][2] = 0;
				}
				sort.ArraySort(message, new int[] { 0, 1 });
				
		//		display.CompareResultOutput("Work id :", message, index, i);
				writeIn.workResultWriteIn(message,index[2],work[i]);
		//		display.WorkWriteResultOutput(work[i]);
			}
		}
		for (int i = 0; i < sumEmployer; i++) {
			//System.out.println("<<"+i);
			index[0] = 0;
			index[1] = sumWork;
			index[2] = -1;
			search.workSearch(index, employer[i], work);

			if (index[2] != -1) {
				double[][] message = new double[index[2] + 1][3];
				// System.out.println(index[2]);
				for (int j = index[0]; j <= index[1]; j++) {
					message[j - index[0]][0] = singleMatch(work[j], employer[i], true);
					message[j - index[0]][1] = j;
					message[j - index[0]][2] = 0;
				}
				sort.ArraySort(message, new int[] { 0, 1 });
				
			//	display.CompareResultOutput("employer id : ",message, index, i);
				writeIn.employerResultWriteIn(message,index[2],employer[i]);
//				display.EmployerWriteResultOutput(employer[i]);
			}
		}
		return true;
	}

	public double singleMatch(Work work, Employer employer, boolean flag) {
		// System.out.print(">");
		// System.out.println(work.getWorkPlace());
		if (work.getWorkPlace() == null || employer.getDomicile() == null)
			return 0;
		if (work.getWorkPlace().trim().equals(employer.getDomicile().trim()) && work.getMajor().trim().equals(employer.getMajor().trim())) {
			double grade = 0.0;
			if (flag) {// ���flagΪ��,ΪԱ��ƥ�乤����λ
						// Pn=н�����/����н��(����н�����<����н��)or 1
						// (����н �����>=����н��)
				double temp = 0;
				temp = inforManage.StringToInt(work.getMoney())/inforManage.StringToInt(employer.getMoney());
				grade += temp + 0.1;
			} else {// ������λƥ��Ա��
					// Pn=н�����/����н��(����н�����<����н��)or 1
					// (����н �����>=����н��)
				// ������������ݵ�����ƥ��

				double temp = 0;
				temp +=employer.getDegree()/work.getDegree();

				grade += temp + 0.1;
			}
			return grade;
		} else
			return 0;
	}
}