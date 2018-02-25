package java13;

import java.util.Scanner;

public class EmployeeTestArray {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String[] employees = new String[3];
		
		Employee employee1 = new Employee();
		employee1.setName("Lee");
		employee1.setAddress("dd");
		employee1.setSalary(15);
		employee1.setRrn("rrn");
		
		Employee employee2 = new Employee();
		employee2.setName("Kim");
		employee2.setAddress("dd");
		employee2.setSalary(15);
		employee2.setRrn("rrn");
		
		Employee employee3 = new Employee();
		employee3.setName("Marie");
		employee3.setAddress("dd");
		employee3.setSalary(15);
		employee3.setRrn("rrn");
		
		
	}

}
