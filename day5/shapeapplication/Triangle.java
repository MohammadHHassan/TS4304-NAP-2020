package day5.shapeapplication;

public class Triangle extends Shape
{
	double base;
	double height;

	public Triangle(String colour, double base, double height)
	{
		super(colour);
		this.base = base;
		this.height = height;
	}
	
	public double getArea()
	{
		return 0.5*base*height;
	}
	
	public double getPerimeter()
	{
		double c = Math.sqrt((base*base)+(height*height));
		return base+height+c;
	}

}
