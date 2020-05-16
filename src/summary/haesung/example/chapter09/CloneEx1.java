package summary.haesung.example.chapter09;

public class CloneEx1
{

	public static void main(String[] args)
	{
		Point original 	= new Point(3, 5);
		Point copy 		= (Point) original.clone();
		
		System.out.println(original);
		System.out.println(copy);
		
		System.out.println(original.equals(copy));
	}

}

class Point implements Cloneable
{
	int x, y;
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "x=" + x + ", y=" + y;
	}
	
	// Object의 clone()을 오버라이딩하면, 접근제어자가 protected이므로 상속관계가 없는 다른 클래스에서 clone()을 호출 할 수 없다.
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	// 기존의 인스턴스를 복제하여 새로운 인스턴스를 생성한다.
	public Object clone()
	{
		Object obj = null;
		
		try
		{
			// Cloneable을 구현한 클래스에서만 사용이 가능하며, 그렇지 않으면 CloneNotSupportedException이 발생한다.
			// clone()은 반드시 예외처리를 해야한다.
			obj = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return obj;
	}
}
