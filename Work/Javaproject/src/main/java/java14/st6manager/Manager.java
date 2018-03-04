package java14.st6manager;

public class Manager extends Employee {
	private int bonus;
	
	public void test() {
		System.out.println(toString());
		return;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	

	public Manager() {
		super();
	}

	public Manager(int bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager(String name, String address, int salary, String rrn) {
		super(name, address, salary, rrn);
	}

	public Manager(String name, String address, int salary, String rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [toString()=" + super.toString() + "]";
	}

}
