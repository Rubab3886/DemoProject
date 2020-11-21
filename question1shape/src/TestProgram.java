import java.util.Scanner;
public class TestProgram {
	public static void main(String args[]) {
	Shape sh=new Shape();
	Rectangle r=new Rectangle();
	Circle c=new Circle();
	Square s=new Square();
	int i;
	do {
	System.out.println(" press 1 for shape :");
	System.out.println(" press 2 for circle :");
	System.out.println(" press 3 for rectangle :");
	System.out.println(" press 4 for square :");
	Scanner input=new Scanner(System.in);
	System.out.println(" enter your choice ");
	i=input.nextInt();
	if(i==1) {
		sh.setColor("Green");
		sh.setFilled(true);
		System.out.println(sh.toString());
}
	else if(i==2) {
		c.setradius(11.98);
		c.setFilled(true);
		c.setColor(" orange ");
		
		System.out.println(c.toString());
		System.out.println("Area of circle is" +c.getArea());
		System.out.println("perimeter of circle is" +c.getparimeter());

	}
	else if(i==3) {
		r.setWidth(12.22);
		r.setLength(29.09);
		r.setFilled(true);
		r.setColor("orange ");
		
		System.out.println(r.toString());
		System.out.println("Area of rectangle is" +r.getArea());
		System.out.println("Perimeter of rectangle is" +r.getPerimeter());
	}
	else if(i==4) {
		s.setFilled(true);
		s.setColor(" purple ");
		s.setside(10.0);
		
		System.out.println(s.toString());
		System.out.println("Area of square is" +s.getArea());
		System.out.println("Perimeter of rectangle is" +s.getPerimeter());

	}
	}while(true);
}
}