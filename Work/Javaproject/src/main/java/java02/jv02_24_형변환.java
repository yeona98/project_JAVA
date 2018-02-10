package java02;

public class jv02_24_Çüº¯È¯ {
	
	public static void main(String[] args) {
		int result = 0;
		
		// result = 1 + '2';
		result = 1 + '2';
		System.out.println(result);
		
		// result = '2' + true;
		result = '2' + ( (true)? 1 : 0 ); 
		System.out.println(result);
		
		// result = "15" - 5;
		result = Integer.parseInt("15") - 5;
		System.out.println(result);
		
		// result = "1" + '2';
		result = Integer.parseInt("1") + '2';
		System.out.println(result);
		
		// result = false + true;
		result = ( (false)? 1 : 0 ) + ( (true)? 1 : 0 );
		System.out.println(result);
		
	}

}
