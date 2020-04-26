package summary.jaeyeon.example.chap06_oop;
/*
 * 변수의 종류 		선언위치				생성시기
 * 클래스 변수		클래스 영역				클래스가 메모리에 올라갈 때
 * 인스턴스 변수		클래스 영역				인스턴스가 생성되었을 때
 * 지역변수		클래스 영역 이외의 영역		변수 선언문이 수행되었을 때
 */
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

	public static void main(String[] args) { 		// args 지역변수
		PlayingCard card = new PlayingCard(1, 1); 	// card 지역변수

		System.out.println(card.kind + "," + card.num);
	}

}
