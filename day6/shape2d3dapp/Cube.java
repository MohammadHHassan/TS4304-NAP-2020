package shape2d3dapp;

public class Cube extends Shape implements Shape3D
{
	double side;

	public Cube(String colour, double side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public double getSurfaceArea()
	{
		return 6*side*side;
	}

	@Override
	public double getVolume()
	{
		return Math.pow(side, 3);
	}

	@Override
	public String toString() {
		return "Cube [ Side = " + side + ", Colour = " + colour + ", Surface Area = " + getSurfaceArea() + ", Volume = "
				+ getVolume() + " ]";
	}
}
