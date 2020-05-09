package summary.dohyun.chapter07.Example;

public class InnerEx1 {
	class InstaceInner {
		int iv = 100;
//		static int cv = 100;  //에러!  STATIC변수를 선언할 수 없다.
		final static int CONST = 100; // final static은 상수이므로 허용
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static 클래스만 static멤버를 정의 할수 있다.
	}
	
	void myMehod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300; //에러!  STATIC변수를 선언할 수 없다.
			final static int CONST = 300; // final static은 상수이므로 허용
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstaceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
