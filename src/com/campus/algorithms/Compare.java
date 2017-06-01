package com.campus.algorithms;

import com.campus.structural.Employer;
import com.campus.structural.Work;
/***
 * employerCompare ���ڶ�employer�ıȽ��ж�������������е�ǰ��˳��
 * workCompare ���ڶ�work�ıȽ��ж�������������е�ǰ��˳��
 * WorkToEmployer ���ڶ�work��employer֮���ģ���Ƚ�
 * @author RZC
 *
 */
public class Compare {
	//
	public boolean employerCompare(Employer employer1, Employer employer2) {
		// employer1�Ƿ�С��employer2
		if (employer1.getDomicile() == null)
			return false;
		else if (employer2.getDomicile() == null)
			return true;
		int valueOfPlace = employer1.getDomicile().compareTo(employer2.getDomicile());
		if (valueOfPlace > 0) {
			return false;
		} else if (valueOfPlace < 0) {
			return true;
		} else {
			// ����ڹ����ص������
			int valueOfMajor = employer1.getMajor().compareTo(employer2.getMajor());
			if (valueOfMajor > 0) {
				return false;
			} else if (valueOfMajor < 0) {
				return true;
			} else {
				if (Math.abs(employer1.getValue() - employer2.getValue()) <= 0.01)
					return employer1.getMoney().compareTo(employer2.getMoney()) >= 0 ? false : true;
				else
					return employer1.getValue() > employer2.getValue() ? false : true;
			}
		}
	}

	public boolean workCompare(Work work1, Work work2) {
		// work1�Ƿ�С��work2
		if (work1.getWorkPlace() == null)
			return false;
		else if (work2.getWorkPlace() == null)
			return true;
		int value = work1.getWorkPlace().compareTo(work2.getWorkPlace());
		if (value > 0) {
			return false;
		} else if (value < 0) {
			return true;
		} else {
			// ����ڹ����ص������
			int valueOfMajor = work1.getMajor().compareTo(work2.getMajor());
			if (valueOfMajor > 0) {
				return false;
			} else if (valueOfMajor < 0) {
				return true;
			} else {
				if (Math.abs(work1.getValue() - work2.getValue()) <= 0.01)
					return work1.getMoney().compareTo(work2.getMoney()) >= 0 ? false : true;
				return work1.getValue() > work2.getValue() ? false : true;
			}
		}
	}
	public boolean WorkToEmployer(Employer employer, Work work){
		if (employer.getDomicile() == null)
			return false;
		else if (work.getWorkPlace() == null)
			return true;
		int value = employer.getDomicile().trim().compareTo(work.getWorkPlace().trim());
		if (value > 0) {
			return false;
		} else if (value < 0) {
			return true;
		} else {
			
			
			int valueOfMajor = employer.getMajor().trim().compareTo(work.getMajor().trim());
			if (valueOfMajor > 0) {
				return false;
			} else if (valueOfMajor < 0) {
				return true;
			} else {
				if (Math.abs(employer.getValue() - work.getValue()) <= 0.01)
				{
					return employer.getMoney().compareTo(work.getMoney()) >= 0 ? false : true;
				}
				return employer.getValue() > work.getValue() ? false : true;
			}
		}
	}
}
