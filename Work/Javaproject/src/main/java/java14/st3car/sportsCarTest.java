package java14.st3car;

public class sportsCarTest {
	
	public static void main(String[] args) {
		
		// setter�� �̿��� �ʵ� ����
		SportsCar c1 = new SportsCar();
		c1.setColor("white");
		c1.setGear(6);
		c1.setSpeed(250);
		c1.setTurbo(true);
		
		// �����ڸ� �̿��� �ʵ� ����: turbo ����
		SportsCar c2 = new SportsCar(300, 5, "green", true);
		
		// �Ű����� turbo�� ����ϴ� �����ڸ� ����ÿ�
		SportsCar c3 = new SportsCar(true);
		
		// �Ű����� color, turbo�� ����ϴ� �����ڸ� ����ÿ�
		SportsCar c4 = new SportsCar("black", true);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
	}

}
