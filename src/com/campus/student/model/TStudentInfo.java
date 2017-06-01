package com.campus.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

/**
 * TStudentInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_student_info", catalog = "jobspace")
public class TStudentInfo implements java.io.Serializable {

	// Fields

	private Integer pkStudentId;
	private String account;
	private String password;
	private Integer universityId;
	private Integer academyId;
	private Integer majorId;
	private Integer classId;
	private String username;
	private Integer sex;
	private String studentNo;
	private String telephone;
	private String email;
	private String qq;
	private String nickname;
	private String enrollmentYear;
	private String photo;
	private Integer addFrendsCfg;
	private Integer allowSearchFlg;
	private Integer tenTwitterFlg;
	private Integer recommendStragety;
	private Integer regTime;
	private Integer trendNum;
	private Integer messageNum;
	private String vip;
	private String deviceToken;
	private String jpushTag;
	private String universityName;
	private String academyName;
	private String majorName;
	private String className;
	// Constructors

	/** default constructor */
	public TStudentInfo() {
	}

	/** minimal constructor */
	public TStudentInfo(String studentNo, Integer regTime) {
		this.studentNo = studentNo;
		this.regTime = regTime;
	}

	/** full constructor */
	public TStudentInfo(String account, String password, Integer universityId,
			Integer academyId, Integer majorId, Integer classId,
			String username, Integer sex, String studentNo, String telephone,
			String email, String qq, String nickname, String enrollmentYear,
			String photo, Integer addFrendsCfg, Integer allowSearchFlg,
			Integer tenTwitterFlg, Integer recommendStragety, Integer regTime,
			Integer trendNum, Integer messageNum, String vip,
			String deviceToken, String jpushTag) {
		this.account = account;
		this.password = password;
		this.universityId = universityId;
		this.academyId = academyId;
		this.majorId = majorId;
		this.classId = classId;
		this.username = username;
		this.sex = sex;
		this.studentNo = studentNo;
		this.telephone = telephone;
		this.email = email;
		this.qq = qq;
		this.nickname = nickname;
		this.enrollmentYear = enrollmentYear;
		this.photo = photo;
		this.addFrendsCfg = addFrendsCfg;
		this.allowSearchFlg = allowSearchFlg;
		this.tenTwitterFlg = tenTwitterFlg;
		this.recommendStragety = recommendStragety;
		this.regTime = regTime;
		this.trendNum = trendNum;
		this.messageNum = messageNum;
		this.vip = vip;
		this.deviceToken = deviceToken;
		this.jpushTag = jpushTag;
		
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "pk_student_id", unique = true, nullable = false)	
	public Integer getPkStudentId() {
		return this.pkStudentId;
	}

	public void setPkStudentId(Integer pkStudentId) {
		this.pkStudentId = pkStudentId;
	}
	
	@Column(name = "account", length = 20)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	@Column(name = "password", length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "university_id")
	public Integer getUniversityId() {
		return this.universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	@Column(name = "academy_id")
	public Integer getAcademyId() {
		return this.academyId;
	}

	public void setAcademyId(Integer academyId) {
		this.academyId = academyId;
	}

	@Column(name = "major_id")
	public Integer getMajorId() {
		return this.majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	@Column(name = "class_id")
	public Integer getClass_id() {
		return this.classId;
	}

	public void setClass_id(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "username", length = 20)
	public String getUserName() {
		return this.username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "student_no", nullable = false, length = 20)
	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Column(name = "telephone", length = 20)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "qq", length = 20)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "nickname", length = 20)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "enrollment_year", length = 20)
	public String getEnrollmentYear() {
		return this.enrollmentYear;
	}

	public void setEnrollmentYear(String enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}

	@Column(name = "photo", length = 100)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "add_frends_cfg")
	public Integer getAddFrendsCfg() {
		return this.addFrendsCfg;
	}

	public void setAddFrendsCfg(Integer addFrendsCfg) {
		this.addFrendsCfg = addFrendsCfg;
	}

	@Column(name = "allow_search_flg")
	public Integer getAllowSearchFlg() {
		return this.allowSearchFlg;
	}

	public void setAllowSearchFlg(Integer allowSearchFlg) {
		this.allowSearchFlg = allowSearchFlg;
	}

	@Column(name = "ten_twitter_flg")
	public Integer getTenTwitterFlg() {
		return this.tenTwitterFlg;
	}

	public void setTenTwitterFlg(Integer tenTwitterFlg) {
		this.tenTwitterFlg = tenTwitterFlg;
	}

	@Column(name = "recommend_stragety")
	public Integer getRecommendStragety() {
		return this.recommendStragety;
	}

	public void setRecommendStragety(Integer recommendStragety) {
		this.recommendStragety = recommendStragety;
	}

	@Column(name = "reg_time", nullable = false)
	public Integer getReg_time() {
		return this.regTime;
	}

	public void setReg_time(Integer regTime) {
		this.regTime = regTime;
	}

	@Column(name = "trend_num")
	public Integer getTrendNum() {
		return this.trendNum;
	}

	public void setTrendNum(Integer trendNum) {
		this.trendNum = trendNum;
	}

	@Column(name = "message_num")
	public Integer getMessageNum() {
		return this.messageNum;
	}

	public void setMessageNum(Integer messageNum) {
		this.messageNum = messageNum;
	}

	@Column(name = "vip")
	public String getVip() {
		return this.vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	@Column(name = "device_token", length = 40)
	public String getDevice_token() {
		return this.deviceToken;
	}

	public void setDevice_token(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	@Column(name = "jpush_tag", length = 200)
	public String getjPushTag() {
		return this.jpushTag;
	}

	public void setjPushTag(String jpushTag) {
		this.jpushTag = jpushTag;
	}

	@Formula("(select t.university_name from t_university_info t where t.pk_university_id = university_id)")
	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Formula("(select t.college_name from t_college t where t.pk_college_id = academy_id and t.university_id=university_id)")
	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	@Formula("(select t.major_name from t_major t where t.pk_major_id = major_id and t.college_id=academy_id)")
	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	@Formula("(select t.class_name from t_class t where t.pk_class_id = class_id)")
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}