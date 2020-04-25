package summary.haesung.practice.chapter07.example01;

public class SutdaDeck
{
	final int 	CARD_NUM 	= 20;						// 카드의 갯수
	SutdaCard[] cards 		= new SutdaCard[CARD_NUM];	// 카드 덱
	
	// 기본 생성자
	SutdaDeck()
	{
		// 카드 덱을 초기화
		// 같은 번호의 카드가 각 2장씩 존재.
		for(int i=0; i<10; i++)
		{
			// 번호가 같은 첫번째 카드.
			// i번째 카드에 번호가 i+1인 카드를 넣는다.
			cards[i] = new SutdaCard(i+1, false);
			
			// 번호가 같은 두번째 카드.
			// 번호가 1, 3, 8이면 광 카드를 넣는다.
			if((i+1 == 1) || (i+1 == 3) || (i+1 == 8))
			{
				cards[i+10] = new SutdaCard(i+1, true);
			}
			// 번호가 1, 3, 8이 아니면 숫자 카드를 넣는다.
			else
			{
				cards[i+10] = new SutdaCard(i+1, false);
			}
		}
	}
	
	void shuffle()
	{
		// 카드의 갯수만큼 섞는다.
		for(int i=0; i<this.cards.length; i++)
		{
			int 		index 	= (int) (Math.random()*this.cards.length);
			SutdaCard 	temp 	= null;
			
			temp 				= this.cards[index];
			this.cards[index] 	= this.cards[i];
			this.cards[i] 		= temp;
		}
	}
	
	SutdaCard pick(int index)
	{
		return this.cards[index];
	}
	
	SutdaCard pick()
	{
		return this.cards[(int) (Math.random()*this.cards.length)];
	}

}
