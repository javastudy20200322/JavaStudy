package summary.seungha.Ch07_Exercise;

/* Exercise 7-2. 문제 7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트하시오.
 * [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음
 * [by LSH] 6장 복습용으로 이해
 * 1. 	메서드명	: shuffle
 * 		기능		: 배열 cards에 담긴 카드의 위치를 뒤섞는다. (Math.random() 사용)
 *		반환타입	: 없음
 *		매개변수	: 없음
 * 2. 	메서드명	: pick
 * 		기능		: 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
 *		반환타입	: SutdaCard
 *		매개변수	: int index - 위치
 * 3. 	메서드명	: pick
 * 		기능		: 배열 cards에서 임의의 위치의 SutdaCard를 반환한다. (Math.random() 사용)
 *		반환타입	: SutdaCard
 *		매개변수	: 없음
 */
class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	
	SutdaDeck2() {
		/* 문제 7-1의 답 (문제에선 생략함) */
		for (int i=0; i<CARD_NUM; i++) {
			boolean isKwang = false;
			if ((i==1-1 || i==3-1 || i==8-1) && i/10==0) isKwang = true;
			cards[i] = new SutdaCard2((i)%10+1, isKwang);
		}
	}
	
	/* (1) 위에서 정의된 세 개의 메서드를 작성하시오. */
	
	/* 배열 cards에 담긴 카드의 위치를 뒤섞는다. */
	void shuffle() {
		SutdaCard2 tmp = new SutdaCard2();
		for (int i=0; i<cards.length; i++) {
			int j = (int)(Math.random()*(cards.length-1));
			tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	/* 배열 cards에서 지정된 위치의 SutdaCard를 반환한다. */
	SutdaCard2 pick(int index) {
		return cards[index];
	}
	
	/* 배열 cards에서 임의의 위치의 SutdaCard를 반환한다. */
	SutdaCard2 pick() {
		return cards[(int)(Math.random()*(cards.length-1))];
	}
	
}	// SutdaDeck

class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2()	{
		this(1, true);
	}
	
	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object클래스의 toString()을 오버라이딩
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}