package com.campus.recruitment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import org.hibernate.annotations.Formula;

@SuppressWarnings("serial")
@Entity
@Table(name = "t_recruitment", catalog = "jobspace")
public class RecruitInfo {
	public RecruitInfo() {
		super();
		this.isCompanyMarked = 0;
		this.isPostMarked = 0;
		this.isResumeDelivered = 0;
	}

	@Id
	@Column(name = "pk_recruitment_id", unique = true, nullable = false)//1
	private Integer PostId;
	@Column(name = "name")//2
	private String postname;
	
	//@Column(name = "subject_major")//3
	//private Integer major; // 面向专业
	//@Formula("(select t.major_name from t_major t where t.pk_major_id = subject_major)")  
	//private String majorName;
	/*public String getMajorName() {
		return majorName;
	}*/

	@Formula("(select t.salary from t_salary_scale t where t.pk_salary_scale_id = salary)")  
	private String salaryName;
	

	public String getSalaryName() {
		return salaryName;
	}

	public void setSalaryName(String salaryName) {
		this.salaryName = salaryName;
	}

	/*public void setMajorName(String majorName) {
		this.majorName = majorName;
	}*/

	@Column(name = "company_id")//4
	private Integer companyId;
	@Formula("(select t.company_name from t_company_info t where t.pk_company_id = company_id)")  
	private String companyName;
	@Formula("(select t.company_logo from t_company_info t where t.pk_company_id = company_id)")  
	private String logo; // :浼佷笟logo
	
	@Column(name = "work_city")//5
	private Integer workCity;
	@Formula("(select t.city from t_city t where t.pk_city_id = work_city)")  
	private String cityName;
	
	
	@Column(name = "salary" )//鏀�6
	private String salary;
	/*@Column(name = "publish_date")//7
	private Integer publishTime;*/
	
	@Column(name = "work_province")//8
	private Integer workProvince;
	
	@Column(name = "work_direct")//8
	private Integer workDirect;
	
	@Column(name = "pub_date",nullable = false)//8
	private Integer pubDate;
	
	@Column(name = "create_date",nullable = false)//8
	private Integer createDate;
	
	@Column(name = "degree")//8
	private Integer degree;
	
	@Formula("(select t.degree from t_degree t where t.pk_degree_id = degree)")  
	private String degreeName;
	
	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	@Column(name = "work_time", nullable = false)//8
	private String workTime;
	
	@Column(name = "salary_type", nullable = false)//8
	private String salaryType;
	
	public String getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}

	@Column(name = "sum")//8
	private Integer sum;
	
	public Integer getWorkDirect() {
		return workDirect;
	}

	public void setWorkDirect(Integer workDirect) {
		this.workDirect = workDirect;
	}

	public Integer getPubDate() {
		return pubDate;
	}

	public void setPubDate(Integer pubDate) {
		this.pubDate = pubDate;
	}

	public Integer getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Integer createDate) {
		this.createDate = createDate;
	}

	public Integer getDegree() {
		return degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getWorkProvince() {
		return workProvince;
	}

	public void setWorkProvince(Integer workProvince) {
		this.workProvince = workProvince;
	}

	@Column(name = "status")//8
	private Integer status;
	@Column(name = "count")//9
	private Integer count;
	@Column(name = "occupation_id")//10
	private Integer occupationId;
	@Formula("(select t.occupation from t_occupation t where t.pk_occupation_id = occupation_id)")  
	private String occupationName;
	
	@Column(name = "industry_id")//11
	private Integer industryId;
	@Formula("(select t.industry from t_industry t where t.pk_industry_id = industry_id)")  
	private String industryName;
	
	@Column(name = "position_id")//12
	private Integer positionId;	
	@Formula("(select t.position from t_position t where t.pk_position_id = position_id)")  
	private String positionName;
	
//	private PositionInfo position;
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="position_id",unique=true)
//	//涓�瀵逛竴澶栭敭鍏宠仈锛屼娇鐢ˊOneToOne锛屽苟璁剧疆浜嗙骇鑱旀搷浣�
//	//@JoinColum璁剧疆浜嗗閿殑鍚嶇О涓篵odyid濡傛灉涓嶈缃紝鍒欓粯璁や负heart_id
//	//澶栭敭鐨勫�兼槸鍞竴鐨�(unique)锛屼笉鍙噸澶嶏紝涓嶩eart鐨勪富閿竴鐩�
//	public PositionInfo getPosition() {
//		return position;
//  }
	
/*	@Column(name = "publish_type")//13
	private Integer publishType;*/
	@Column(name = "job_category",nullable = false)//14
	private Integer job_category;//宸ヤ綔鎬ц川	0 鍏ㄨ亴 1 鍏艰亴 2 瀹炰範

	
	public Integer getJob_category() {
		return job_category;
	}

	public void setJob_category(Integer job_category) {
		this.job_category = job_category;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getJobRequirements() {
		return jobRequirements;
	}

	public void setJobRequirements(String jobRequirements) {
		this.jobRequirements = jobRequirements;
	}

	public String getJobDuty() {
		return jobDuty;
	}

	public void setJobDuty(String jobDuty) {
		this.jobDuty = jobDuty;
	}

	@Column(name = "welfare")//15
	private String welfare;
	@Column(name = "job_requirements")//16
	private String jobRequirements;
	@Column(name = "job_duty")//17
	private String jobDuty;
	@Transient
	private Integer isCompanyMarked;
	@Transient
	private Integer isPostMarked;
	@Transient
	private Integer isResumeDelivered;
	
	public Integer getIsCompanyMarked() {
		return isCompanyMarked;
	}

	public void setIsCompanyMarked(Integer isCompanyMarked) {
		this.isCompanyMarked = isCompanyMarked;
	}

	public Integer getIsPostMarked() {
		return isPostMarked;
	}

	public void setIsPostMarked(Integer isPostMarked) {
		this.isPostMarked = isPostMarked;
	}

	public Integer getIsResumeDelivered() {
		return isResumeDelivered;
	}

	public void setIsResumeDelivered(Integer isResumeDelivered) {
		this.isResumeDelivered = isResumeDelivered;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getWelfare() {
		return welfare;
	}

	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}

	public Integer getPostId() {
		return PostId;
	}

	public void setPostId(Integer postId) {
		PostId = postId;
	}

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	/*public Integer getMajor() {
		return major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}*/

	

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

/*	public Integer getPublishTime() {
		return publishTime ;
	}

	public void setPublishTime(Integer publishTime) {
		this.publishTime = publishTime;
	}*/

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Integer getWorkCity() {
		return workCity;
	}

	public void setWorkCity(Integer workCity) {
		this.workCity = workCity;
	}

	public Integer getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(Integer occupationId) {
		this.occupationId = occupationId;
	}

	public Integer getIndustryId() {
		return industryId;
	}

	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}

	

/*	public Integer getPublishType() {
		return publishType;
	}

	public void setPublishType(Integer publishType) {
		this.publishType = publishType;
	}*/



}
