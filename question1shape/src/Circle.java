import java.util.Scanner;
public class Circle extends Shape {
protected double radius;
Circle(){
	super();
	radius=1.0;
}
Circle(double radius){
	this.radius=radius;
}
Circle(double r,String c,boolean f){
	radius=r;
	color=c;
	filled=f;
}
void input() {
	Scanner input=new Scanner(System.in);
	System.out.println(" enter circle radius :");
	radius=input.nextDouble();
}
double getradius() {
	return radius;
}
void setradius(double ra) {
	radius=ra;
}
public double getArea() {
	return (22/7)*radius*radius;
}
public double getparimeter() {
	return 2*(22/7)*radius;
}
public String tostring() {
	return "A circle with radius"+radius+" which is a subclass of "+super.toString();
}
}
