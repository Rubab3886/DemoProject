
public class Square extends Rectangle{
	double side;
	public Square() {
		side=1.0;
		}
	Square (double side)
	{
		this.side = side;
	}
	Square (double side , String colour , boolean filled)
	{
		this.color= colour;
		this.filled = filled;
		this.side = side;
	}
	double getside()
	{
		return side;
	}
	public void setside(double side)
	{
		this.side = side;
	}
	void setwidth(double width)
	{
		this.width = width;
	}
	void setlength(double length)
	{
		this.length = length;
	}
	public double getArea()
	{
		return side*side;
	}
	public double getPerimeter()
	{
		return 4*side;
	}
	
	public String toString ()
	{
		return "A Square with side = " + getside() + " ,which is a subclass of " + super.toString();	
	}
}