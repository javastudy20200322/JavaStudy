package summary.dohyun.chapter06.Example;

public class Ch6Example5 {

	public static void main(String[] args) {

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height); // 클래스 변수는 객체 생성없이 '클래스이름.클래스변수'로 직접 사용 가능

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";   //인스턴스변수의 값을 변경한다.
		c2.number = 4;		//인스턴스변수의 값을 변경한다.
		
		System.out.println("c1은" + c1.kind + "," + c1.number + "이며 , 크기는 (" + c1.width+ "," + c1.height + ")");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며 , 크기는 (" + c2.width+ "," + c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;   //클래스 변수의 값을 변경한다.
		c1.height = 80;  //클래스 변수의 값을 변경한다.
		

		System.out.println("c1은" + c1.kind + "," + c1.number + "이며 , 크기는 (" + c1.width+ "," + c1.height + ")");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며 , 크기는 (" + c2.width+ "," + c2.height + ")");
		
		//Card인스터스인 c1과 c2는 클래스 변수인 width와 heigth를 공유하기때문에 c1의 width와 heigth를 변경하면 c2의 width와 heigth값도 바뀐것과 같은 결과를 얻는다
		// Card.width, c1.width, c2.width 는 모두 같은 저장공간을 참조하므로 항상 같은 값을 갖는다.

	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}