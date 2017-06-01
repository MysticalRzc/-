package com.campus.algorithms;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.campus.main.SpringContext;
import com.campus.recruit_recommend.model.TRecruitRecommend;
import com.campus.recruit_recommend.service.RecruitRecommendService;
import com.campus.resume_recommend.model.TResumeRecommend;
import com.campus.resume_recommend.service.ResumeRecommendService;
import com.campus.structural.Employer;
import com.campus.structural.Work;

public class ResultWriteInSQL {
	
	public void writeInSQL(Employer employer[], Work work[],int sumWork,int sumEmployer) {
		if(SpringContext.initSpring()){
			ResumeRecommendService resumeRecommendService = ResumeRecommendService.getFromApplication();
			List<TResumeRecommend> resumeRecomList = new ArrayList<TResumeRecommend>();
			for (int i = 0; i < sumEmployer; i++) {
				this.employerWriteInSQL(employer[i],resumeRecommendService,resumeRecomList);			
			}
			resumeRecommendService.saveOrUpdateAll(resumeRecomList);
		}
		if(SpringContext.initSpring()){
			RecruitRecommendService recruitRecommendService = RecruitRecommendService.getFromApplication();
			List<TRecruitRecommend> recruitRecomList = new ArrayList<TRecruitRecommend>();
			for (int i = 0; i < sumWork; i++) {
				this.workWriteInSQL(work[i],recruitRecommendService,recruitRecomList);
			}
			recruitRecommendService.saveOrUpdateAll(recruitRecomList);
		}
	}

	private void employerWriteInSQL(Employer employer ,ResumeRecommendService resumeRecommendService, List<TResumeRecommend> resumeRecomList) {
		
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyMMddhhmm");
		Date date=new Date();
		int time = Integer.parseInt(dateFormater.format(date));
		for(int i =0;i<employer.getListLength();i++)
		{
			TResumeRecommend resuRecom = new TResumeRecommend();
			resuRecom.setRecommendId(null);
			resuRecom.setRecommendTime(time);
			resuRecom.setRecruitId(employer.getListNumber(i));
			resuRecom.setRemarker(0);
			resuRecom.setResumeId(employer.getPk_resume_id());
			resuRecom.setViewCount(0);
			resumeRecomList.add(resuRecom);
		}
		
	}

	private void workWriteInSQL(Work work,RecruitRecommendService recruitRecommendService, List<TRecruitRecommend> recruitRecomList){
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyMMddhhmm");
		Date date=new Date();
		int time = Integer.parseInt(dateFormater.format(date));
		for(int i =0;i<work.getListLength();i++)
		{
			TRecruitRecommend recrRecom = new TRecruitRecommend();
			recrRecom.setId(null);
			recrRecom.setRecommendTime(time);
			recrRecom.setRecruitId(work.getPk_recruitment_id());
			recrRecom.setStudentId(work.getListNumber(i));
			recrRecom.setViewCount(0);
			recrRecom.setRemarker(0);
			recruitRecomList.add(recrRecom);
		}
	}
}
