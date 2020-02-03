package shape2d3dapp;

public class Sphere extends Shape implements Shape3D
{
	double radius;

	public Sphere(String colour, double radius)
	{
		super(colour);
		this.radius = radius;
	}

	@Override
	public double getSurfaceArea()
	{
		return 4*Math.PI*radius*radius;
	}

	@Override
	public double getVolume()
	{
		return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public String toString() {
		return "Sphere [ Radius = " + radius + ", Colour = " + colour + ", Surface Area = " + getSurfaceArea()
				+ ", Volume = " + getVolume() + " ]";
	}
}
