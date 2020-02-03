package shape2d3dapp;

public class Square extends Shape implements Shape2D
{
	double side;

	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public double getArea()
	{
		return side*side;
	}

	@Override
	public double getPerimeter()
	{
		return 4*side;
	}

	@Override
	public String toString() {
		return "Square [ Side = " + side + ", Colour = " + colour + ", Area = " + getArea() + ", Perimeter = "
				+ getPerimeter() + " ]";
	}
}
