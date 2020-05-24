package summary.dohyun.chapter07.Example;

/*
 * new 조상클래스이름() {
 * 멤버변수
 * }
 * 
 * 또는
 * 
 * new 구현인터페이스이름() {
 * 멤버 선언
 * }
 */

public class InnerEx6 {
	Object iv = new Object() {
		void method() {
		};
	}; // 익명클래스
	static Object cv = new Object() {
		void method() {
		};
	};// 익명클래스
	
	void myMethod () {
		Object lv = new Object() {void method() {} }; //익명클래스 
	}

}
