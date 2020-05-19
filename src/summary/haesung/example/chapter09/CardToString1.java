package summary.haesung.example.chapter09;

public class CardToString1
{

	public static void main(String[] args)
	{
		Card c1 = new Card();
		Card c2 = new Card();
		
		// toString을 오버라이딩 하지 않고 사용하면, 해당 객체의 16진수 hashCode를 return한다.
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}

class Card
{
	String 	kind;
	int 	number;
	
	Card()
	{
		this("SPADE", 1);
	}
	
	Card(String kind, int number)
	{
		this.kind 	= kind;
		this.number = number;
	}
}
