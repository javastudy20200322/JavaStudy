package summary.haesung.example.chapter14;

// 람다식을 다루기 위한 인터페이스(함수형 인터페이스)를 선언
@FunctionalInterface
interface MyFunction
{
	void run();
}

public class LambdaEx1
{
	static void execute(MyFunction f)
	{
		f.run();
	}
	
	static MyFunction getMyFunction()
	{
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	// 람다식을 변수(함수형 인터페이스 타입의 참조변수)에 담아서 사용할 수 있다는 것을 보여주는 듯.
	public static void main(String[] args)
	{
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(() -> System.out.println("run()"));
		
		
		System.out.println();
		
		
		MyFunction 	f4 	= () -> {};
		Object 		obj = (MyFunction) (() -> {});
		String 		str = ((Object) (MyFunction) (() -> {})).toString();
		
		// 람다식의 타입은 '외부클래ㅅ이름$$Lambda$번호'의 형식
		System.out.println(f4);
		System.out.println(obj);
		System.out.println(str);
		
		
	}

}
