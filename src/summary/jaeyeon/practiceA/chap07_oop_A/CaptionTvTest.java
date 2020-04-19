package summary.jaeyeon.practiceA.chap07_oop_A;

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channerUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

class CaptionTv extends Tv {

	boolean caption; // 캡션 상태( on / off)

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}

}

public class CaptionTvTest {

	public static void main(String[] args) {

		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;		// 부모 클래스로부터 상속받은 변수
		ctv.channerUp();		// 부모 클래스로부터 상속받은 메소드
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world!");
		//System.out.println(ctv.caption);
		ctv.caption = true;		// 캡션(자막) 기능을 켠다.
		//System.out.println(ctv.caption);
		ctv.displayCaption("Hello, world!!");

	}

}
