package java08;

public class jv08_01_String메서드 {
	
	public static void main(String[] args) {
		
		String prov = "A barking Dog";
		
		// 문자열 길이 : length()
		System.out.println(prov.length());
		
		// 문자열 추출 : substring()
		System.out.println(prov.substring(2, 5));
		System.out.println(prov.substring(10, 13));
		System.out.println(prov.substring(0, 12));
		
		// 한개 문자 추출
		// substring() --> 문자열 반환
		System.out.println(prov.substring(2, 3));
		// charAt() --> 문자 한개 반환
		System.out.println(prov.charAt(2));
		
		// 문자열 결합 : +
		System.out.println(prov + " never Bites!");
		
		// 빈 문자열 확인 : 변수.isEmpty()
		System.out.println(prov.isEmpty());
		
		String prov2 = "Cat";
		// 문자열 포함 여부 확인 : contains()
		System.out.println(prov.contains(prov2));
		
		// 문자열 치환 : replace()
		System.out.println(prov.replace("Dog", "Cat"));
		
		//
		
		// 문자열 자르기
 	}

	

}
