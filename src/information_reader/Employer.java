package information_reader;

public class Employer {
	private String workPlace;
	private double workEducation;
	private String workMajor;
	private double workMoney;
	private double value;
	private int listNumber;
	private int workIndexList[];

	public Employer() {
		this.value = 0.0;
	}

	public int getListNumber() {
		return listNumber;
	}

	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
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
