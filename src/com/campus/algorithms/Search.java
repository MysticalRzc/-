package com.campus.algorithms;

import com.campus.structural.Employer;
import com.campus.structural.Work;
import com.campus.algorithms.Compare;;
/**
 * searchHalf ���ֲ��ң�����Ѿ�ƥ���ϵ����ݣ�����ѡ�����Ž����
 * employerSearch index����洢���ݿ�ʼ�ͽ������±� index[2]��ʾ���ڿ�ƥ��Ķ���ĸ���
 * workSearch index����洢���ݿ�ʼ�ͽ������±� index[2]��ʾ���ڿ�ƥ��Ķ���ĸ���
 * @author RZC
 *
 */
public class Search {
	Compare compare = new Compare();
	Match match = new Match();
	public int searchHalf(double[][] message,int end) {
		int begin = 0;
		double balanceValue=1.0;
		double value = message[0][0] - balanceValue;
		int mid=0;
		if(end == 0)
			return 0;
		if(end==1)
		{
			if(Math.abs(message[0][0]-balanceValue)<Math.abs(message[1][0]-balanceValue))
				return 0;
			else
				return 1;
		}
		while (begin < end - 1) {
			mid = (begin + end) / 2;
			if(message[mid][0] == balanceValue)
				break;
			if(message[mid][0]-balanceValue>0)
				end = mid;
			else
				begin=mid;
		}
		return mid;
	}
	public void workSearch(int index[], Employer employer, Work work[]) {
		/**
		 * index ����洢���ݿ�ʼ�ͽ������±� index[2]��ʾ�Ƿ���ڿ�ƥ��Ķ��� ���ֲ���
		 */
		if (index[1] - index[0] <= 3) {
			for (int i = index[0]; i <= index[1]; i++) {
				if (match.singleMatch(work[i], employer, true) != 0) {
					index[0] = i;
					break;
				}
			}
			for (int i = index[1]; i >= index[0]; i--) {
				if (match.singleMatch(work[i], employer, true) != 0) {
					index[1] = i;
					break;
				}
			}
			if (match.singleMatch(work[index[0]], employer, true) == 0) {
				index[2] = -1;
				return;
			} else {
				index[2] = index[1] - index[0];
				return;
			}
		} else {
			if (match.singleMatch(work[index[0]], employer, true) == 0) {
				index[0]++;
				int end = index[1];
				int mid = (index[0] + index[1]) / 2;

				while (match.singleMatch(work[index[0]], employer, true) == 0) {
					// Ѱ�ҿ�ƥ����������
//					if(num==48)
//					{
//						System.out.println("���ֲ��ҹ���"+mid);
//						System.out.println(compare.WorkToEmployer(employer,work[mid-1]));
//					}
					if (end - index[0] <= 1) {
						double a = match.singleMatch(work[end], employer, true);
						if (a != 0) {
							index[0] = index[1] = end;
							index[2] = 1;
							return;
						}
						if (a == 0) {
							index[2] = -1;
							return;
						}

					}
					if (match.singleMatch(work[mid - 1], employer, true) == 0) {
						if(compare.WorkToEmployer(employer,work[mid-1])==false)
							index[0] = mid;
						else
							end=mid;
						mid = (end + index[0]) / 2;
					} else {
						end = mid;
						// System.out.println(">" + mid + " " + index[0] + " " +
						// end);
						mid = (end + index[0]) / 2;
					}
				//	 System.out.println(mid + " " + index[0] + " " + end);
				}

			}
			// System.out.println(index[1]);

			if (match.singleMatch(work[index[1]], employer, true) == 0) {
				index[1]--;
				int begin = index[0];
				int mid = (index[0] + index[1]) / 2;
				while (match.singleMatch(work[index[1]], employer, true) == 0) {
					// Ѱ�ҿ�ƥ��������0��
					if (match.singleMatch(work[mid + 1], employer, true) == 0) {
						index[1] = mid;
						mid = (begin + index[1]) / 2;
					} else {
						// System.out.println(">");
						begin = mid;
						mid = (begin + index[1]) / 2;
					}
					// System.out.println(mid);
				}
			}
			index[2] = index[1] - index[0];
		}
	}

	public void employerSearch(int index[], Work work, Employer employer[]) {
		/**
		 * index ����洢���ݿ�ʼ�ͽ������±� index[2]��ʾ�Ƿ���ڿ�ƥ��Ķ��� ���ֲ���
		 */
		if (index[1] - index[0] <= 3) {
			for (int i = index[0]; i <= index[1]; i++) {
				if (match.singleMatch(work, employer[i], true) != 0) {
					index[0] = i;
					break;
				}
			}
			for (int i = index[1]; i >= index[0]; i--) {
				if (match.singleMatch(work, employer[i], true) != 0) {
					index[1] = i;
					break;
				}
			}
			if (match.singleMatch(work, employer[index[0]], true) == 0) {
				index[2] = -1;
				return;
			} else {
				index[2] = index[1] - index[0];
				return;
			}
		} else {
			if (match.singleMatch(work, employer[index[0]], true) == 0) {
				index[0]++;
				int end = index[1];
				int mid = (index[0] + index[1]) / 2;
				while (match.singleMatch(work, employer[index[0]], true) == 0) {
					// Ѱ�ҿ�ƥ����������

					if (end - index[0] <= 1) {
						double a = match.singleMatch(work, employer[end], true);
						if (a != 0) {
							index[0] = index[1] = end;
							index[2] = 1;
							return;
						}
						if (a == 0) {
							index[2] = -1;
							return;
						}

					}
					if (match.singleMatch(work, employer[mid - 1], true) == 0) {
						if(compare.WorkToEmployer(employer[mid-1],work)==true)
							index[0] = mid;
						else
							end=mid;
						mid = (end + index[0]) / 2;
					} else {
						end = mid;
						// System.out.println(">" + mid + " " + index[0] + " " +
						// end);
						mid = (end + index[0]) / 2;
					}
					// System.out.println(mid + " " + index[0] + " " + end);

				}

			}
			// System.out.println(index[1]);

			if (match.singleMatch(work, employer[index[1]], true) == 0) {
				index[1]--;
				int begin = index[0];
				int mid = (index[0] + index[1]) / 2;
				while (match.singleMatch(work, employer[index[1]], true) == 0) {
					// Ѱ�ҿ�ƥ��������0��
					if (match.singleMatch(work, employer[mid + 1], true) == 0) {
						index[1] = mid;
						mid = (begin + index[1]) / 2;
					} else {
						// System.out.println(">");
						begin = mid;
						mid = (begin + index[1]) / 2;
					}
					// System.out.println(mid);
				}
			}
			index[2] = index[1] - index[0];
		}
	}
}
