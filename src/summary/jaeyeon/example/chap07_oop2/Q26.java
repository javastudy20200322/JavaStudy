package summary.jaeyeon.example.chap07_oop2;
//Outer 클래스의 내부 클래스 Inner 의 멤버변수 iv 의 값을 출력하시오

class Outer2 {
	static class Inner {
		int iv = 100;
	}
}

class Q26 {
	public static void main(String[] args) {
		Outer2 o = new Outer2();

	}
}
