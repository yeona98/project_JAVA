package java13.st5emp;

import java.util.Scanner;

public class EmployeeTestArray {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Employee[] employees = new Employee[3];
		
		/*
		Employee e1 = new Employee();
		e1.setName(keyboard.next());
		e1.setAddress(keyboard.next());
		e1.setSalary(keyboard.nextInt());
		e1.setRrn(keyboard.next());
		employees[0] = e1;
		*/
		
		for(int i = 0; i <= 2; i++) {
			employees[i] = new Employee();
			System.out.print("Name : ");
			employees[i].setName(keyboard.next());
			System.out.print("Address : ");
			employees[i].setAddress(keyboard.next());
			System.out.print("Salary : ");
			employees[i].setSalary(keyboard.nextInt());
			System.out.print("Rrn : ");
			employees[i].setRrn(keyboard.next());
			
			System.out.println(employees[i].toString());
		}
		
		
	
	}

}
