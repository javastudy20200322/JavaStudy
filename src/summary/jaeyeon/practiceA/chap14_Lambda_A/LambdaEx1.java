package summary.jaeyeon.practiceA.chap14_Lambda_A;

@FunctionalInterface
interface MyFunction {
	void run();// public abstract void run();
}

class LambdaEx1 {

	static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction 인 메서드
		f.run();
	}

	static MyFunction getMyFunction() { // 반환 타입이 MyFunction 인 메서드
		MyFunction f = () -> System.out.println("f3.run()");
		return f;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunction f1 = () -> System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.fun()");
			}

		};

		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute(() -> System.out.println("run()"));

	}

}
