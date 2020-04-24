package summary.dohyun.chapter06.Practice;

public class Ex8 {

	public static void main(String[] args) {

		PlayingCard card = new PlayingCard(1, 1); //card 지역변수 (메서드영역이니깐)
//놓친건 : args도 지역변수라는것 ㅎㅎ  
		
	}

}

class PlayingCard {
	int kind; // 인스턴스
	int num; // 인스턴스

	static int width; // 클래스변수
	static int height; // 클래스변수

	PlayingCard(int k, int n) {
		kind = k; // 지역변수
		num = n; // 지역변수
	}
}
