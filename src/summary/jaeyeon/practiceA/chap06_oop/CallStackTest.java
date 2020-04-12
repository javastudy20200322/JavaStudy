package summary.jaeyeon.practiceA.chap06_oop;

public class CallStackTest {

	public static void main(String[] args) {
		System.out.println("main(String[] args) 이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args) 이 종료되었음.");

	}

	static void firstMethod() {
		System.out.println("firstMethod() 가 시작되었음.");
		secondMethod();
		System.out.println("firstMethod() 가 시작되었음.");
	}

	static void secondMethod() {
		System.out.println("secondMethod() 가 시작되었음.");
		System.out.println("SecondMethod");
		System.out.println("secondMethod() 가 시작되었음.");
	}
}
