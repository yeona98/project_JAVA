package java12;

public class Date {
	public Date() {
		super();
	}
	public Date(int year) {
		super();
		this.year = year;
	}
	public Date(int year, String month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	private int year;
	private String month;
	private int day;
	
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	public void printDate() {
		System.out.println(toString());
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
	

}
