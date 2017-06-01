package com.campus.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

/**
 * TResume entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_resume", catalog = "jobspace")
public class TResume implements java.io.Serializable {

	// Fields

	private Integer pkResumeId;
	private Integer studentId;
	private String name; //
	private String university;//
	private String major;//
	private Integer degree;//
	private String inyear;//
	private String tel;//
	private String email;
	private String resumeName;//
	private String creatTime;
	private Integer sex; //
	private String photo;
	private String birth;//
	private Integer age=0;
	private String nativePlace;
	private String domicile;
	private Integer politicalStatus;
	private String evaluation;
	private float completeDegree;
	private Integer personalInfoCompleteFlg;
	private Integer jobIntensionCompleteFlg = 0;
	private Integer workExperienceCompleteFlg = 0;
	private Integer trainExperienceCompleteFlg = 0;
	private Integer languageAbilityCompleteFlg = 0;
	private Integer certificateCompleteFlg = 0;
	private Integer projectExperienceCompleteFlg = 0;
	private Integer technicalAbilityCompleteFlg = 0;
	private String degreeName;
	private String politicalName;
	private String salary;
	// Constructors

	/** default constructor */
	public TResume() {
	}

	/** minimal constructor */
	public TResume(String name, String university, String major,
			Integer degree, String inyear, String tel, String email,
			Integer age, float completeDegree,String salary) {
		this.name = name;
		this.university = university;
		this.major = major;
		this.degree = degree;
		this.inyear = inyear;
		this.tel = tel;
		this.email = email;
		this.age = age;
		this.completeDegree = completeDegree;
		this.salary = salary;
	}

	/** full constructor */
	public TResume(Integer studentId, String name, String university,
			String major, Integer degree, String inyear, String tel,
			String email, String resumeName, String creatTime, Integer sex,
			String photo, String birth, Integer age, String nativePlace,
			String domicile, Integer politicalStatus, String evaluation,
			float completeDegree, Integer personalInfoCompleteFlg,
			Integer jobIntensionCompleteFlg, Integer workExperienceCompleteFlg,
			Integer educationExperienceCompleteFlg,
			Integer trainExperienceCompleteFlg,
			Integer languageAbilityCompleteFlg,
			Integer practiceExperienceCompleteFlg,
			Integer certificateCompleteFlg,
			Integer projectExperienceCompleteFlg,
			Integer technicalAbilityCompleteFlg, Integer awardsCompleteFlg) {
		this.studentId = studentId;
		this.name = name;
		this.university = university;
		this.major = major;
		this.degree = degree;
		this.inyear = inyear;
		this.tel = tel;
		this.email = email;
		this.resumeName = resumeName;
		this.creatTime = creatTime;
		this.sex = sex;
		this.photo = photo;
		this.birth = birth;
		this.age = age;
		this.nativePlace = nativePlace;
		this.domicile = domicile;
		this.politicalStatus = politicalStatus;
		this.evaluation = evaluation;
		this.completeDegree = completeDegree;
		this.personalInfoCompleteFlg = personalInfoCompleteFlg;
		this.jobIntensionCompleteFlg = jobIntensionCompleteFlg;
		this.workExperienceCompleteFlg = workExperienceCompleteFlg;
		this.trainExperienceCompleteFlg = trainExperienceCompleteFlg;
		this.languageAbilityCompleteFlg = languageAbilityCompleteFlg;
		this.certificateCompleteFlg = certificateCompleteFlg;
		this.projectExperienceCompleteFlg = projectExperienceCompleteFlg;
		this.technicalAbilityCompleteFlg = technicalAbilityCompleteFlg;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "pk_resume_id", unique = true, nullable = false)
	public Integer getPkResumeId() {
		return this.pkResumeId;
	}

	public void setPkResumeId(Integer pkResumeId) {
		this.pkResumeId = pkResumeId;
	}
	@Column(name = "salary")
	public String getSalary(){
		return this.salary;
	}
	
	public void setSalary(String salary){
		this.salary = salary;
	}
	@Column(name = "student_id")
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "university", nullable = false, length = 100)
	public String getUniversity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Column(name = "major", nullable = false, length = 20)
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column(name = "degree", nullable = false)
	public Integer getDegree() {
		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	@Column(name = "inyear", nullable = false, length = 20)
	public String getInyear() {
		return this.inyear;
	}

	public void setInyear(String inyear) {
		this.inyear = inyear;
	}

	@Column(name = "tel", nullable = false, length = 50)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "resume_name", length = 20)
	public String getResumeName() {
		return this.resumeName;
	}

	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}

	@Column(name = "creat_time", length = 20)
	public String getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "photo", length = 100)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "birth", length = 20)
	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Column(name = "age", nullable = false)
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "native_place", length = 100)
	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	@Column(name = "domicile", length = 100)
	public String getDomicile() {
		return this.domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	@Column(name = "political_status")
	public Integer getPoliticalStatus() {
		return this.politicalStatus;
	}

	public void setPoliticalStatus(Integer politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	@Column(name = "evaluation", length = 200)
	public String getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	@Column(name = "complete_degree", nullable = false, precision = 12, scale = 0)
	public float getCompleteDegree() {
		return this.completeDegree;
	}

	public void setCompleteDegree(float completeDegree) {
		this.completeDegree = completeDegree;
	}

	@Column(name = "personal_info_complete_flg")
	public Integer getPersonalInfoCompleteFlg() {
		return this.personalInfoCompleteFlg;
	}

	public void setPersonalInfoCompleteFlg(Integer personalInfoCompleteFlg) {
		this.personalInfoCompleteFlg = personalInfoCompleteFlg;
	}

	@Column(name = "job_intension_complete_flg")
	public Integer getJobIntensionCompleteFlg() {
		return this.jobIntensionCompleteFlg;
	}

	public void setJobIntensionCompleteFlg(Integer jobIntensionCompleteFlg) {
		this.jobIntensionCompleteFlg = jobIntensionCompleteFlg;
	}

	@Column(name = "work_experience_complete_flg")
	public Integer getWorkExperienceCompleteFlg() {
		return this.workExperienceCompleteFlg;
	}

	public void setWorkExperienceCompleteFlg(Integer workExperienceCompleteFlg) {
		this.workExperienceCompleteFlg = workExperienceCompleteFlg;
	}


	@Column(name = "train_experience_complete_flg")
	public Integer getTrainExperienceCompleteFlg() {
		return this.trainExperienceCompleteFlg;
	}

	public void setTrainExperienceCompleteFlg(Integer trainExperienceCompleteFlg) {
		this.trainExperienceCompleteFlg = trainExperienceCompleteFlg;
	}

	@Column(name = "language_ability_complete_flg")
	public Integer getLanguageAbilityCompleteFlg() {
		return this.languageAbilityCompleteFlg;
	}

	public void setLanguageAbilityCompleteFlg(Integer languageAbilityCompleteFlg) {
		this.languageAbilityCompleteFlg = languageAbilityCompleteFlg;
	}


	@Column(name = "certificate_complete_flg")
	public Integer getCertificateCompleteFlg() {
		return this.certificateCompleteFlg;
	}

	public void setCertificateCompleteFlg(Integer certificateCompleteFlg) {
		this.certificateCompleteFlg = certificateCompleteFlg;
	}

	@Column(name = "project_experience_complete_flg")
	public Integer getProjectExperienceCompleteFlg() {
		return this.projectExperienceCompleteFlg;
	}

	public void setProjectExperienceCompleteFlg(
			Integer projectExperienceCompleteFlg) {
		this.projectExperienceCompleteFlg = projectExperienceCompleteFlg;
	}

	@Column(name = "technical_ability_complete_flg")
	public Integer getTechnicalAbilityCompleteFlg() {
		return this.technicalAbilityCompleteFlg;
	}

	public void setTechnicalAbilityCompleteFlg(
			Integer technicalAbilityCompleteFlg) {
		this.technicalAbilityCompleteFlg = technicalAbilityCompleteFlg;
	}
	
	@Formula("(select t.degree from t_degree t where t.pk_degree_id = degree)")  
	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	@Formula("(select t.political_name from t_political t where t.pk_political_id = political_status)")  
	public String getPoliticalName() {
		return politicalName;
	}

	public void setPoliticalName(String politicalName) {
		this.politicalName = politicalName;
	}

}