package com.campus.algorithms;

import java.util.Arrays;
import java.util.Comparator;

import com.campus.structural.Employer;
import com.campus.structural.Work;
/***
 * �޲ι��캯��
 * Sort(Work,messageNumber)��ֱ�����������work�б�
 * Sort(Employer,messageNumber)��ֱ�����������Employer�б�
 * 
 * ArraySory �Ը����Ͷ�ά������п�������
 * employerSort ��employer���ݰ����ض��Ĺ��ɽ�������
 * workSort ��worker���ݰ����ض��Ĺ��ɽ�������
 * @author RZC
 *
 */
public class Sort {
	private Work work[];
	private Employer employer[];

	public Sort(){
	}
	
	public Sort(Work work[], int messageNumber) {
		this.work = work;
		workSort(0, messageNumber);
	}

	public Sort(Employer employer[], int messageNumber) {
		this.employer = employer;
		employerSort(0, messageNumber);
	}

	Compare compare = new Compare();

	public void ArraySort(double[][] ob, final int[] order) {
		Arrays.sort(ob, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				double[] one = (double[]) o1;
				double[] two = (double[]) o2;
				if (one[0] > two[0]) {
					return 1;
				} else 
					return -1;
			}
		});
	}
	
	public void employerSort(int Begin, int End) {
		// �����employer�Ŀ��������㷨
		if (Begin >= End)
			return;
		int begin = Begin, end = End;
		Employer key = employer[begin];
		while (begin < end) {
			// System.out.println(begin + " " + end);
			while (begin < end && compare.employerCompare(key, employer[end])) {
				end--;
			}
			employer[begin] = employer[end];
			while (begin < end && !compare.employerCompare(key, employer[begin])) {
				begin++;
			}
			employer[end] = employer[begin];
		}
		employer[begin] = key;
		employerSort(Begin, begin - 1);
		employerSort(begin + 1, End);
	}

	public void workSort(int Begin, int End) {
		// �����work�Ŀ��������㷨
		if (Begin >= End)
			return;
		int begin = Begin, end = End;
		Work key = work[begin];
		while (begin < end) {
			while (begin < end && compare.workCompare(key, work[end])) {
				end--;
			}
			work[begin] = work[end];
			while (begin < end && !compare.workCompare(key, work[begin])) {
				begin++;
			}
			work[end] = work[begin];
		}
		work[begin] = key;
		workSort(Begin, begin - 1);
		workSort(begin + 1, End);
	}
}