package summary.jaeyeon.practiceA.chap14_Lambda_A;

@FunctionalInterface
interface MyFunction2 {
	// void run();// public abstract void run();
	void myMethod();
}

class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunction2 f = () -> {
		};

		Object obj = (MyFunction2) (() -> {
		});

		String str = ((Object) (MyFunction2) (() -> {
		})).toString();

		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		// System.out.println(()->{});

		System.out.println((MyFunction2) (() -> {
		}));
		// System.out.println((MyFunction)(()->{}).toString());
		System.out.println(((Object) (MyFunction2) (() -> {
		})).toString());

	}

}
