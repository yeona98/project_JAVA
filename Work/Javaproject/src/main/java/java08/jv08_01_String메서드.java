package java08;

public class jv08_01_String�޼��� {
	
	public static void main(String[] args) {
		
		String prov = "A barking Dog";
		
		// ���ڿ� ���� : length()
		System.out.println(prov.length());
		
		// ���ڿ� ���� : substring()
		System.out.println(prov.substring(2, 5));
		System.out.println(prov.substring(10, 13));
		System.out.println(prov.substring(0, 12));
		
		// �Ѱ� ���� ����
		// substring() --> ���ڿ� ��ȯ
		System.out.println(prov.substring(2, 3));
		// charAt() --> ���� �Ѱ� ��ȯ
		System.out.println(prov.charAt(2));
		
		// ���ڿ� ���� : +
		System.out.println(prov + " never Bites!");
		
		// �� ���ڿ� Ȯ�� : ����.isEmpty()
		System.out.println(prov.isEmpty());
		
		String prov2 = "Cat";
		// ���ڿ� ���� ���� Ȯ�� : contains()
		System.out.println(prov.contains(prov2));
		
		// ���ڿ� ġȯ : replace()
		System.out.println(prov.replace("Dog", "Cat"));
		
		//
		
		// ���ڿ� �ڸ���
 	}

	

}
