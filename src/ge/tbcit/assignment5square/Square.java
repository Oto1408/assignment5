package ge.tbcit.assignment5square;

import ge.tbcit.assignment5.Rectangle;

public final class Square extends Rectangle {
	private int width;
	
	public int getPerimeter() {
		return super.getPerimeter(this.width, this.width);
	}
	
	public int getArea() {
		return super.getArea(this.width, this.width);
	}
	
	public int getPerimeter(int a, int b) {
		return super.getPerimeter(a, b);
	}
	
	public int getArea(int a, int b) {
		return super.getArea(a, b);
	}
	
	
}
