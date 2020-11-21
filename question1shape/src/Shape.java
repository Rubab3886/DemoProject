import java.util.Scanner;
public class Shape {
	protected String color;
	protected boolean filled;
	public Shape() {
	this.color = "green";
	this.filled = true;
	}
	public Shape(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
	}
	
	public String toString() {
	return "A " + ((filled == true) ? "filled" : "not filled") +
	" shape with " + color + " color";
	}
	
	public double getArea() {
	return 0;
	}
	public double getPerimeter() {
	return 0;
	}
	public String getColor() {
	return color;
	}
	public void setColor(String color) {
	this.color = color;
	}
	public boolean isFilled() {
	return filled;
	}
	public void setFilled(boolean filled) {
	this.filled = filled;
	}
	void input() {
		Scanner input=new Scanner(System.in);
		System.out.println(" enter the color of the shape :");
		color=input.nextLine();
		System.out.println(" shape is filled (true/false:");
		filled=input.nextBoolean();
	}
}
