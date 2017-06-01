package com.campus.structural;

import java.util.List;

public class B_pointWork {
	B_pointWork next = null;
	B_pointWork pre  = null;
	Work work = null;
	Employer employer = null;
	boolean end = true;			//判断是否是叶子节点
	List list = null; 			//一个容器，存放特定属性的学生
}
