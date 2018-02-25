package java11;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speedUp(100);
		myCar.speedPrint();
		
		// getter & setter�� �̿�
		Car yourCar = new Car();
		yourCar.setColor("blue");
		yourCar.setSpeed(60);
		yourCar.setGear(3);
		yourCar.speedPrint();
		
		System.out.println(yourCar.toString());
		
		// �����ڸ� �̿�
		Car otherCar = new Car("blue", 60, 3);
		
		System.out.println(otherCar.toString());
	}
}
