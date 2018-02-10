package java02;

public class jv02_11_산술연산자 {
	
	public static void main(String[] args) {
		int x = 4;
		int y = 5;
		int result = 0;
		
		result = x + y;
		System.out.print("더하기 = ");
		System.out.println( result ); // 출력: 더하기 = 9
		
		result = x - y;
		System.out.print("빼기 = ");
		System.out.println( result );
		
		result = x * y;
		System.out.print("곱하기 = ");
		System.out.println( result );
		
		double result1 = (double) x / y;
		System.out.print("나누기 = ");
		System.out.println( result1 );
		
		result = x % y;
		System.out.print("나머지 = ");
		System.out.println( result );
		
	}

}
