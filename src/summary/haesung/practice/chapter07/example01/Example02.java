package summary.haesung.practice.chapter07.example01;

public class Example02
{

	public static void main(String[] args)
	{
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
		{
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
