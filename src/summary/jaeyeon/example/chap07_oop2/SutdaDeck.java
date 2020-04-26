package summary.jaeyeon.example.chap07_oop2;

/* 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck 클래스)을 정의한 것이다.
*단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고, 숫자가 1,3,8 인 경우에는
*둘 중의 한 장은 광(Kwang) 이어야한다, 
*즉 SutdaCard 의 인스턴스 변수 isKwang 의 값이 true 이어야한다.
*
*
*
*/

class SutdaDeck {

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		// 7-1배열 SutdaCard 를 적절히 초기화 하시오.
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	// 7-2
	void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = (int) (Math.random() * cards.length);

			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}

	SutdaCard pick(int index) {
		//매개변수가 있는 메서드는 반드시 작업전에 유효성 검사를 해야한다
		if (index < 0 || index >= CARD_NUM) { //index 의 유효성을 검사하기
			return null;
		}
		return cards[index];

	}

	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return pick(index);

	}

}

class SutdaCard {
	
	/*
	 * Q14 섯다 카드의 종류와 숫자는 사실 한번 값이 지정되면 변경되어서는 안되는 값이다.
	 * 카드의 숫자가 한번 잘못바뀌면 똑같은 카드가 두 장이 될 수 도 있기 때문이다. 
	 * 이러한 문제점이 발생하지 않도록 수정해보기
	 */
	final int NUM;
	final boolean IS_KWANG;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}

	// info() 대신 Object 클래스의 toString() 을 오버라이딩했다.

	public String toString() {
		return NUM + (IS_KWANG ? "K" : "");
	}
}
