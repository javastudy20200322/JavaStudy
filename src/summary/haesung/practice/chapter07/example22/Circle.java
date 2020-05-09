package summary.haesung.practice.chapter07.example22;

public class Circle extends Shape
{
	double r;	// 반지름
	
	Circle(double r)
	{
		this.r = r;
	}

	@Override
	double calcArea()
	{
		return this.r*this.r*Math.PI;
	}
	
}
