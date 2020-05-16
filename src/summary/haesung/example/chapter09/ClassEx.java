package summary.haesung.example.chapter09;

public class ClassEx
{

	public static void main(String[] args) throws Exception
	{
		Card1 c1 = new Card1("HEART", 3);
		Card1 c2 = Card1.class.newInstance();
		
		// Class 클래스는 클래스의 정보를 얻을 수 있는 클래스다.
		Class cObj = c1.getClass();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}

}

final class Card1
{
	String 	kind;
	int 	num;
	
	Card1()
	{
		this("SPADE", 1);
	}
	
	Card1(String kind, int num)
	{
		this.kind 	= kind;
		this.num 	= num;
	}
	
	public String toString()
	{
		return kind + ":" + num;
	}
}
