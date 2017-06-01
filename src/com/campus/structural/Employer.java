package com.campus.structural;

public class Employer {
	private String money;
	private String major;
	private int degree;
	private int student_id;
	private int pk_resume_id;
	private String domicile; // סַ
	private double value;
	private int listLength;
	private int workIndexList[] = new int[10];

	public int getListNumber(int index){
		return workIndexList[index];
	}
	
	public int getListLength() {
		return listLength;
	}

	public void setListLength(int listLength) {
		this.listLength = listLength;
	}

	public int[] getWorkIndexList() {
		return workIndexList;
	}

	public void setWorkIndexList(int[] workIndexList) {
		this.workIndexList = workIndexList;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getDomicile() {
		return domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getPk_resume_id() {
		return pk_resume_id;
	}

	public void setPk_resume_id(int pk_resume_id) {
		this.pk_resume_id = pk_resume_id;
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
