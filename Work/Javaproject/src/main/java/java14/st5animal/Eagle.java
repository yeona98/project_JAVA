package java14.st5animal;

public class Eagle extends Animal {
	private String wings;
	
	public void fly() {
		
	}

	public String getWings() {
		return wings;
	}

	public void setWings(String wings) {
		this.wings = wings;
	}

	public Eagle() {
		super();
	}

	public Eagle(String wings) {
		super();
		this.wings = wings;
	}

	public Eagle(int weight, String picture, String wings) {
		super(weight, picture);
		this.wings = wings;
	}

	@Override
	public String toString() {
		return "Eagle [wings=" + wings + "]";
	}
	
	
	

}
