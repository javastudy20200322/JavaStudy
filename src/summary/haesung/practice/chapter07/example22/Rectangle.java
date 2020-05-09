package summary.haesung.practice.chapter07.example22;

public class Rectangle extends Shape
{
	double width;	// 폭
	double height;	// 높이
	
	Rectangle(double width, double height)
	{
		this.width 	= width;
		this.height = height;
	}
	
	@Override
	double calcArea()
	{
		return width*height;
	}
	
	boolean isSquare()
	{
		return (width == height);
	}
}
