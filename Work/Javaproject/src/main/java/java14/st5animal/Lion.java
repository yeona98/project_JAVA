package java14.st5animal;

public class Lion extends Animal {
	private String wings;
	
	public void roar() {
		
	}

	public String getWings() {
		return wings;
	}

	public void setWings(String wings) {
		this.wings = wings;
	}

	public Lion() {
		super();
	}

	public Lion(String wings) {
		super();
		this.wings = wings;
	}

	public Lion(int weight, String picture, String wings) {
		super(weight, picture);
		this.wings = wings;
	}

}
