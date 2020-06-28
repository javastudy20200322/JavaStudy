package summary.jaeyeon.practiceA.chap14_Lambda_A;

@FunctionalInterface
interface MyFunction3 {
	// void run();// public abstract void run();
	void myMethod();
}

class Outer {

	int val = 10;

	class Inner {
		int val = 20;

		void method(int i) {
			int val = 30;
			// i = 10;

			MyFunction3 f = () -> {
				System.out.println("	i : " + i);
				System.out.println("	val : " + val);
				System.out.println("	this.val : " + ++this.val);
				System.out.println("Outer.this.val : " + ++Outer.this.val);
			};
			f.myMethod();
		}

	}
}

class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer outer = new Outer();

		Outer.Inner inner = outer.new Inner();

		inner.method(100);

	}

}
