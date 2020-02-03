package day6.improvedshapeapplication;

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

	@Override
	public double getArea()
	{
		return 0.5*base*height;
	}

	@Override
	public double getPerimeter()
	{
		double c = Math.sqrt((base*base) + (height*height));
		return base+height+c;
	}

	@Override
	public String toString() {
		return "Triangle [ Base = " + base + ", Height = " + height + ", Colour = " + colour + ", Area = " + getArea()
				+ ", Perimeter = " + getPerimeter() + " ]";
	}
}
