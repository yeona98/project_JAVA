package java12;

public class Car {
	public Car() {
		super();
		setId(++numberOfCars);
	}
	public Car(String color, int speed, int gear) {
		super();
		this.color = color;
		this.speed = speed;
		this.gear = gear;
		// �ڵ����� ������ �����ϰ� id ��ȣ�� �Ҵ��Ѵ�.
		setId(++numberOfCars);
	}
	
	private String color;
	private int speed;
	private int gear;
	// �ڵ����� �ø��� ��ȣ
	private int id;
	// ��üȭ�� Car ��ü�� ������ ���� ���� ����
	private static int numberOfCars = 0;
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	public static void setNumberOfCars(int numberOfCars) {
		Car.numberOfCars = numberOfCars;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
