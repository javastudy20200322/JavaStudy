package summary.dohyun.chapter07.Exercise;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exercise28 {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}






//class EventHandler extends WindowAdapter {
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//	}

//exercise29  **** 몰라서 찾아봄
/*
 * Q. 지역클래스에서 외부클래스의 인스턴스멤버와 static멤버에 모두 접근할 수 있지만, 지역변수는 final이 붙은 상수만 접근할 수
 * 있는 이유는 무엇인가?
 * 
 * A. 메서드가 수행을 마쳐서 지역변수가 소명된 시점에도, 지역클래스의 인스턴스가 소멸된 지역변수를 참조하려는 경우가 발생할수 있기
 * 때문이다.
 * 
 * Q. 그렇다면 final이 붙은 지역변수는 소멸이 안되나?
 * 
 * A. 지역변수는 final 로 지정하면 JVM constant pool 에서 따로 변수를 관리한다. 따라서 지역클래스를 포함하고 있는
 * 메서드와 메서드 안의 'final' 지역변수는 생명주기가 달라진다. 이 이유로 메서드가 가비지 컬렉터에 반납되어도 메서드 안의 final
 * 지역변수는 constant pool에서 계속 보관하고 있기 때문에 이를 참조하고 있는 지역클래스의 인스턴스는 문제없이 동작할 수 있다.
 */
