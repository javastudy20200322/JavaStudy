package summary.haesung.practice.chapter07.example01;

public class Example01
{

	public static void main(String[] args)
	{
		// SutdaDeck 생성.
		SutdaDeck deck = new SutdaDeck();
		
		// SutdaDeck 모든 카드의 정보를 출력.
		for(int i=0; i<deck.cards.length; i++)
		{
			System.out.print(deck.cards[i] + ", ");
		}
	}

}
