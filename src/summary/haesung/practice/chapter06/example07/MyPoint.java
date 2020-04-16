package summary.haesung.practice.chapter06.example07;

public class MyPoint
{
	int x;
	int y;
	
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	// 인스턴스 변수(this.x, this.y)를 사용했기 때문에 static 선언을 할 수 없다.
	// 요놈은 instance 메소드.
	public double getDistance(int x, int y)
	{
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
	}
	
	public static void main(String[] args)
	{
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
	}
	
}
