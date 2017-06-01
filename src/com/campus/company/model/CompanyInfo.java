package com.campus.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

/*
 * pk_company_id    | int(11)      | NO   | PRI | NULL    | auto_increment |
| company_name     | varchar(50)  | YES  |     | NULL    |                |
| account          | varchar(20)  | YES  |     | NULL    |                |
| password         | varchar(32)  | YES  |     | NULL    |                |
| company_nature   | int(11)      | YES  |     | NULL    |                |
| company_scale    | int(11)      | YES  |     | NULL    |                |
| company_welfare  | varchar(20)  | NO   |     | NULL    |                |
| industry         | int(11)      | YES  |     | NULL    |                |
| province         | int(11)      | YES  |     | NULL    |                |
| city             | int(11)      | YES  |     | NULL    |                |
| location         | varchar(200) | YES  |     | NULL    |                |
| homepage         | varchar(100) | YES  |     | NULL    |                |
| phone            | varchar(120) | YES  |     | NULL    |                |
| mobile           | varchar(20)  | YES  |     | NULL    |                |
| fax              | varchar(20)  | YES  |     | NULL    |                |
| email            | varchar(50)  | YES  |     | NULL    |                |
| contact          | varchar(20)  | YES  |     | NULL    |                |
| business_licence | varchar(100) | YES  |     | NULL    |                |
| register_date    | varchar(20)  | YES  |     | NULL    |                |
| audit_date       | varchar(20)  | YES  |     | NULL    |                |
| audit_status     | int(11)      | YES  |     | 0       |                |
| reject_reason    | varchar(100) | YES  |     | NULL    |                |
| audit_uint       | int(11)      | YES  |     | NULL    |                |
| company_logo     | varchar(120) | NO   |     | NULL    |                |
| info             | text         | NO   |     | NULL    |                |
| audit_file       | varchar(500) | NO   |     | NULL    |                |
| uptime           | int(11)      | NO   |     | NULL    |                |
| tags           
 * */
@Entity
@Table(name = "t_company_info", catalog = "jobspace")
public class CompanyInfo {
	@Id
	@Column(name = "pk_company_id", unique = true, nullable = false)	
	private Integer companyId;	
	@Column(name = "company_name", nullable = false)	
	private String companyName;
	@Column(name = "company_nature")
	private Integer company_nature;
	@Formula("(select t.company_nature from t_company_nature t where t.pk_company_nature_id = company_nature)")  
	private String natureName;
	@Column(name = "company_scale")
	private Integer company_scale;
	@Formula("(select t.company_scale from t_company_scale t where t.pk_company_scale_id = company_scale)")  
	private String scaleName;
//	@Column(name = "company_welfare")
//	private Integer company_welfare;
//	@Formula("(select t.welfare from t_recruitment t where t.company_id = pk_company_id)")  
//	private String welfareName;
	@Column(name = "industry")
	private Integer industry;
	@Formula("(select t.industry from t_industry t where t.pk_industry_id = industry)")  
	private String industryName;
	@Column(name = "location")
	private String location;
	@Column(name = "homepage")
	private String homepage;
	@Column(name = "company_logo")
	private String company_logo;
	@Column(name = "info")
	private String info;
	@Column(name = "audit_status")
	private Integer audit_status;  //3已通过
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getCompany_nature() {
		return company_nature;
	}
	public void setCompany_nature(Integer company_nature) {
		this.company_nature = company_nature;
	}
	public Integer getCompany_scale() {
		return company_scale;
	}
	public void setCompany_scale(Integer company_scale) {
		this.company_scale = company_scale;
	}
	public String getNatureName() {
		return natureName;
	}
	public void setNatureName(String natureName) {
		this.natureName = natureName;
	}
	public String getScaleName() {
		return scaleName;
	}
	public void setScaleName(String scaleName) {
		this.scaleName = scaleName;
	}
//	public String getWelfareName() {
//		return welfareName;
//	}
//	public void setWelfareName(String welfareName) {
//		this.welfareName = welfareName;
//	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
//	public Integer getCompany_welfare() {
//		return company_welfare;
//	}
//	public void setCompany_welfare(Integer company_welfare) {
//		this.company_welfare = company_welfare;
//	}
	public Integer getIndustry() {
		return industry;
	}
	public void setIndustry(Integer industry) {
		this.industry = industry;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getCompany_logo() {
		return company_logo;
	}
	public void setCompany_logo(String company_logo) {
		this.company_logo = company_logo;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getAudit_status() {
		return audit_status;
	}
	public void setAudit_status(Integer audit_status) {
		this.audit_status = audit_status;
	}
}
