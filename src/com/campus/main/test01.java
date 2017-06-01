package com.campus.main;

import com.campus.recruit_recommend.model.TRecruitRecommend;
import com.campus.recruit_recommend.service.RecruitRecommendService;

public class test01 {
	public static void main(String[] args) {
		// if(false)
		// {
		// SimpleDateFormat dateFormater = new SimpleDateFormat("yyMMddhhmm");
		// Date date=new Date();
		// int da = Integer.parseInt(dateFormater.format(date));
		// System.out.print(da);
		// }
		//
		// else
		if (SpringContext.initSpring()) {
			// StudentService studentService =
			// StudentService.getFromApplication();
			// String name = studentService.getStudentName(203);
			// System.out.println("studentName£º"+name);
			RecruitRecommendService recruitRecommendService = RecruitRecommendService.getFromApplication();
//			RecruitRecommendService.getTime(4);
			 TRecruitRecommend resuRecom = new TRecruitRecommend();
			 resuRecom.setId(null);
			 resuRecom.setRecommendTime(3);
			 resuRecom.setRecruitId(4);
			 resuRecom.setRemarker((float)5);
			 resuRecom.setStudentId(6);
			 resuRecom.setViewCount(7);
			 recruitRecommendService.save(resuRecom);
			// rs.findAll();
			System.out.println("The project has been end.");
		} else {
			System.out.println("MySQL can't connect");
		}
	}
}