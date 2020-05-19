package summary.haesung.example.chapter09;

public class ShallowDeepCopy
{

	public static void main(String[] args)
	{
		Circle c1 = new Circle(new Point1(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		
		// c1과 c2는 참조하고있는 Point객체가 서로 같으므로 얕은복제
		// c1과 c2는 참조하고있는 Point객체가 서로 다르므로 깊은복제
		// 얕은복제는 같은 객체를 참조하므로 하나가 변경되면 다른 하나도 같이 변경되므로 완전한 복제가 아니다.
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}

}

class Point1
{
	int x, y;
	
	Point1(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "("+x+", "+y+")";
	}
}

class Circle implements Cloneable
{
	Point1 p;
	double r;
	
	Circle(Point1 p, double r)
	{
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy()
	{
		Object obj = null;
		
		try
		{
			// 얕은 복사.
			obj = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return (Circle) obj;
	}
	
	public Circle deepCopy()
	{
		Object obj = null;
		
		try
		{
			// 깊은 복사.
			obj = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		Circle c = (Circle) obj;
		c.p = new Point1(this.p.x, this.p.y);
		
		return c;
	}
	
	public String toString()
	{
		return "[p="+p+", r="+r+"]";
	}
}
