package java12;

public class CarTest1 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(3);
		
		System.out.println(myCar.getId());
		
		System.out.println("���� �ڵ����� ������ " + myCar.getColor());
		System.out.println("���� �ڵ����� �ӵ��� " + myCar.getSpeed());
		System.out.println("���� �ڵ����� ���� " + myCar.getGear());
		
		Car c1 = new Car("blue", 100, 1);
		System.out.println(c1.getId());
		Car c2 = new Car("white", 0, 1);
		System.out.println(c2.getId());
		int n = Car.getNumberOfCars();
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
		
	}

}
