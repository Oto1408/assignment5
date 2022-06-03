package ge.tbcit.assignment5;

public class Rectangle extends Figure{
	private int width;
	private int height;
	
	public void setWidth(int newWidth) {
		width=newWidth;
	}
	
	public void setHeight(int newHeight) {
		height=newHeight;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
   public int getPerimeter() {
	   return (width + height)*2;
   }
   
   public int getArea() {
	   return width*height;
   }
   
   public Rectangle (int width, int height) {
	   setWidth(width);
	   setHeight(height);
   }
   
   public Rectangle() {
	   this(3,4);
   }
   
   protected int getPerimeter(int a,int b) {
	   return (a+b)*2;
   }
   
    protected int getArea(int a, int b) {
	   return a*b;
   }
}
