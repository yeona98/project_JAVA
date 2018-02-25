package java11;

public class Box {
	
	
	public Box(int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}

	// ������, �ʵ�, �������
	private int width;
	private int length;
	private int height;
	
	public int getVolumn() {
		int v = width * length * height;
		return v;
	}
	
	public void printVolumn() {
		int volumn = getVolumn();
		System.out.println(volumn);
	}
	
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + "]";
	}
}
