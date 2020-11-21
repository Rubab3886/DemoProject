import java.util.Scanner;
public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public Rectangle() {
	super();
	this.width = 1;
	this.length = 1;
	}
	
	public Rectangle(double width, double length) {
	super();
	this.width = width;
	this.length = length;
	}
	public Rectangle(String color, boolean filled, double width, double length) {
	super(color, filled);
	this.width = width;
	this.length = length;
	}
	
	public String toString() {
	return "A Rectangle with width = " + width +
	" and length = " + length + " which is sub class of " +
	super.toString();
	}
	
	public double getArea() {
	return width * length;
	}
	public double getPerimeter() {
	return 2 * (width + length);
	}
	
	public double getWidth() {
	return width;
	}
	public void setWidth(double width) {
	this.width = width;
	}
	public double getLength() {
	return length;
	}
	public void setLength(double length) {
	this.length = length;
	}
void input() {
	Scanner input=new Scanner(System.in);
	System.out.println(" enter rectangle length :");
	length=input.nextDouble();
	System.out.println(" enter rectangle width :");
	width=input.nextDouble();
}
}
