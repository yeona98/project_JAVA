package java12;

public class DateTest {
	public static void main(String[] args) {
		
		Date myDate1 = new Date();
		myDate1.setYear(2017);
		myDate1.setMonth("10¿ù");
		myDate1.setDay(10);
	
		myDate1.printDate();
		Date myDate2 = new Date(2015, "8¿ù", 10);
		myDate2.printDate();
		Date myDate3 = new Date(1900, "1¿ù", 1);
		myDate3.printDate();
		
	}

}
