package java04;

public class ex04_04_for실습예제 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i = i + 1)
		{
			if(i <= 8) {
				System.out.print("2*" + i + "=" + 2*i + ", ");
			}
			else {
				System.out.print("2*" + i + "=" + 2*i + ".");
			}
		}
	}

}
