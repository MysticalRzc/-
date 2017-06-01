package com.campus.structural;

import java.util.List;

public class B_pointEmployer {
	int index;
	B_pointEmployer next = null;
	B_pointEmployer pre  = null;
	Work work = null;
	Employer employer = null;
	boolean end = true;			//判断是否是叶子节点
	List list = null; 			//一个容器，存放特定属性的学生
}
