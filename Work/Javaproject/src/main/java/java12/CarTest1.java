package java12;

public class CarTest1 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(3);
		
		System.out.println(myCar.getId());
		
		System.out.println("현재 자동차의 색상은 " + myCar.getColor());
		System.out.println("현재 자동차의 속도는 " + myCar.getSpeed());
		System.out.println("현재 자동차의 기어는 " + myCar.getGear());
		
		Car c1 = new Car("blue", 100, 1);
		System.out.println(c1.getId());
		Car c2 = new Car("white", 0, 1);
		System.out.println(c2.getId());
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
		
	}

}
