package summary.jaeyeon.practiceA.chap06_oop;

public class CallStackTest2 {

	public static void main(String[] args) {

		firstMethod();

	}

	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("SecondMethod");
	}
}
