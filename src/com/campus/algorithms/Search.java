package com.campus.algorithms;

import com.campus.structural.Employer;
import com.campus.structural.Work;
import com.campus.algorithms.Compare;;
/**
 * searchHalf 二分查找，针对已经匹配上的数据，进行选择最优结果。
 * employerSearch index数组存储数据开始和结束的下标 index[2]表示存在可匹配的对象的个数
 * workSearch index数组存储数据开始和结束的下标 index[2]表示存在可匹配的对象的个数
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
		 * index 数组存储数据开始和结束的下标 index[2]表示是否存在可匹配的对象 二分查找
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
					// 寻找可匹配对象的上限
//					if(num==48)
//					{
//						System.out.println("二分查找过程"+mid);
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
					// 寻找可匹配对象的下0限
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
		 * index 数组存储数据开始和结束的下标 index[2]表示是否存在可匹配的对象 二分查找
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
					// 寻找可匹配对象的上限

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
					// 寻找可匹配对象的下0限
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
