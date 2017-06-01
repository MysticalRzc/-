package com.campus.algorithms;
/***
 * StringToInt将字符串中隐含的数字提取出来。
 * @author RZC
 *
 */
public class InformationManage {
	public int StringToInt(String str) {
		if (str.compareTo("面议") == 0)
			return 1;
		String[] num = str.split("[[^0-9]+]");
		int sum = 0;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			try {
				if (num[i].length() != 0) {
					sum += Integer.parseInt(num[i]);
					count++;
				}
			} catch (Exception e) {
			}
		}
		return sum/count;
	}
}
