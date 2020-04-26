package summary.haesung.example.chapter07;


class Point2
{
	int x = 10;
	int y = 20;
	
	Point2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	String getLocation()
	{
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point2
{
	int z = 30;
	
	Point3D()
	{
		this(100, 200, 300);
	}
	
	Point3D(int x, int y, int z)
	{
		// 이렇게 사용하면 super();(조상클래스의 기본생성자) 를 먼저 호출하게 되는데, 조상클래스의 기본생성자가 없으므로 에러가 난다.
//		this.x = x;
//		this.y = y;
//		this.z = z;
		
		// 조상클래스에 기본생성자를 추가하던지, 아래처럼 사용하면된다.
		super(x, y);
		this.z = z;
	}
	
	String getLocation()
	{
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}


public class PointTest
{

	public static void main(String[] args)
	{
		Point3D p3 = new Point3D();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}

}
