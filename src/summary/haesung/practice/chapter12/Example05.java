package summary.haesung.practice.chapter12;

public class Example05
{

	/**
	 * <pre>
	 * MethodName	: main
	 * Date 		: 2020. 5. 30.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: void
	 * 
	 * 아래는 예제7-3에 열거형 Kind와 Number를 새로 정의하여 적용한 것이다.
	 * (1)에 알맞은 코드를 넣어 예제를 완성하시오.
	 * (Math.random()을 사용했으므로 실행결과가 달라질 수 있다.)
	 * </pre>
	 */
	public static void main(String[] args)
	{
		Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
		
		System.out.println(c); // System.out.println(c.toString());과 같다.
		
		d.shuffle(); // 카드를 섞는다.
		
		c = d.pick(0); // 섞은 후에 제일 위의 카드를 뽑는다.
		
		System.out.println(c);
	}
	
}

class Deck
{
	final int 	CARD_NUM 	= Card.Kind.values().length * Card.Number.values().length; // 카드의 개수
	Card 		cardArr[] 	= new Card[CARD_NUM]; // Card객체 배열을 포함
	
	Deck ()
	{
		/*
		(1) 알맞은 코드를 넣어서 완성하시오.
		Deck의 카드를 초기화한다.
		*/
		Card.Kind[] 	kindArr 	= Card.Kind.values();
		Card.Number[] 	numberArr 	= Card.Number.values();
		
		int cnt = 0;
		for(Card.Kind kind : kindArr)
		{
			for(Card.Number number : numberArr)
			{
				cardArr[cnt] = new Card(kind, number);
				cnt++;
			}
		}
	}
	
	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
	Card pick(int index)
	{
		return cardArr[index];
	}
	
	Card pick()
	{ // Deck에서 카드 하나를 선택한다.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle()
	{ // 카드의 순서를 섞는다.
		for(int i=0; i < cardArr.length; i++)
		{
			int r = (int)(Math.random() * CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
} // Deck클래스의 끝

	// Card클래스
class Card
{
	enum Kind { CLOVER, HEART, DIAMOND, SPADE }
	enum Number
	{
		ACE, TWO, THREE, FOUR, FIVE,
		SIX, SEVEN, EIGHT, NINE, TEN,
		JACK, QUEEN, KING
	}
	
	Kind kind;
	Number num;
	
	Card()
	{
		this(Kind.SPADE, Number.ACE);
	}
	
	Card(Kind kind, Number num)
	{
		this.kind = kind;
		this.num = num;
	}
	
	public String toString()
	{
		return "[" + kind.name() + "," + num.name() + "]";
	} // toString()의 끝
} // Card클래스의 끝
