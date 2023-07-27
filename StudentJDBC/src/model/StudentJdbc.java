package model;

public class StudentJdbc {
	private int rollno;
	private String name;
	private String collegename;
	private String city;
	private double percentage;
	public StudentJdbc(int rollno, String name, String collegename, String city, double percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.collegename = collegename;
		this.city = city;
		this.percentage = percentage;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public StudentJdbc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "StudentJdbc [rollno=" + rollno + ", name=" + name + ", collegename=" + collegename + ", city=" + city
				+ ", percentage=" + percentage + "]";
	}
	public StudentJdbc(String name, String collegename, String city, double percentage) {
		super();
		this.name = name;
		this.collegename = collegename;
		this.city = city;
		this.percentage = percentage;
	}

}
