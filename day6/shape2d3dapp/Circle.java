package shape2d3dapp;

public class Circle extends Shape implements Shape2D
{
	double radius;

	public Circle(String colour, double radius)
	{
		super(colour);
		this.radius = radius;
	}

	@Override
	public double getArea()
	{
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [ Radius = " + radius + ", Colour = " + colour + ", Area = " + getArea() + ", Perimeter = "
				+ getPerimeter() + " ]";
	}
}
