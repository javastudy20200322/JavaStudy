package summary.haesung.example.chapter07;


class Card_
{
	// 상수를 초기화하지 않고 생성자가 호출될 때 초기화하도록 만듦.
	final int 		NUMBER;
	final String 	KIND;
	
	static int width 	= 100;
	static int height 	= 250;
	
	Card_(String kind, int num)
	{
		KIND 	= kind;
		NUMBER 	= num;
	}
	
	Card_()
	{
		this("HEART", 1);		
	}
	
	public String toString()
	{
		return KIND + " " + NUMBER;
	}
}


public class FinalCardTest
{

	public static void main(String[] args)
	{
		Card_ c = new Card_("HEART", 10);
//		c.NUMBER = 5;	// 상수를 변경할 수 없다.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}
