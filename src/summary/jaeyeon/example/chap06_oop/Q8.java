package summary.jaeyeon.example.chap06_oop;

class PlayingCard {

	int kind;			// 인스턴스변수
	int num;			// 인스턴스 변수

	static int width;	// 클래스변수
	static int height;	// 클래스변수

	PlayingCard(int k, int n) {
		kind = k;		// 지역변수 (멤버변수)
		num = n;		// 지역변수 (멤버변수)
	}
}

public class Q8 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);

		System.out.println(card.kind + "," + card.num);
	}

}
