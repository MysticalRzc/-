package com.campus.structural;

public class Work {
	private String workPlace;
	private String money;
	private String major;
	private int province;
	private double value;
	private int pk_recruitment_id;
	private int company_id;
	private int degree;
	private int listLength;
	private int employerIndexList[] = new int[10];

	public int getPk_recruitment_id() {
		return pk_recruitment_id;
	}

	public void setPk_recruitment_id(int pk_recruitment_id) {
		this.pk_recruitment_id = pk_recruitment_id;
	}
	
	public int getListNumber(int index){
		return employerIndexList[index];
	}
	
	public int getListLength() {
		return listLength;
	}

	public void setListLength(int listLength) {
		this.listLength = listLength;
	}

	public int[] getEmployerIndexList() {
		return employerIndexList;
	}

	public void setEmployerIndexList(int[] employerIndexList) {
		this.employerIndexList = employerIndexList;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
