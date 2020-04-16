package summary.haesung.example.chapter06;

class Card
{
	String 	kind;
	int 	number;
	
	static int width 	= 100;
	static int height 	= 250;
}

public class CardTest
{

	public static void main(String[] args)
	{
		// static 변수는 객체생성 없이 '클래스이름.클래스변수'로 직접사용이 가능하다.
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind 	= "Heart";
		c1.number 	= 7;
		
		Card c2 = new Card();
		c2.kind 	= "Spade";
		c2.number 	= 4;
		
		// c1의 인스턴스변수와 c2의 인스턴스변수는 서로 연관되지 않는다.
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c1은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
		c1.width 	= 50;
		c1.height 	= 80;
		
		// static변수는 모든 객체가 동일한 값을 가진다.
		// c1의 static변수가 변경되면 c2의 static변수도 변경된다.
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c1은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
	}

}
