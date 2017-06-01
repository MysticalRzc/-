package information_reader;

public class Work {
	private String workPlace;
	private double workEducation;
	private String workMajor;
	private double workMoney;
	private double value;
	private int listNumber;
	private int employerIndexList[];
	public Work(){
		value = 0.0;
	}
	
	public int getListNumber() {
		return listNumber;
	}

	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}

	public int[] getEmployerIndexList() {
		return employerIndexList;
	}

	public void setEmployerIndexList(int[] employerIndexList) {
		this.employerIndexList = employerIndexList;
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
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public double getWorkEducation() {
		return workEducation;
	}
	public void setWorkEducation(double workEducation) {
		this.workEducation = workEducation;
	}
	public String getWorkMajor() {
		return workMajor;
	}
	public void setWorkMajor(String workMajor) {
		this.workMajor = workMajor;
	}
	public double getWorkMoney() {
		return workMoney;
	}
	public void setWorkMoney(double workMoney) {
		this.workMoney = workMoney;
	}
}
