package summary.haesung.example.chapter02;

public class StringEx
{

	public static void main(String[] args)
	{
		// String은 클래스이므로 new 연산자를 이용하여 객체를 생성한다.
		String name1 	= new String("Java");
		
		// String은 특별히 new 연산자를 사용하지 않고 아래처럼 사용가능하다.
		String str1 	= "Java";
		
		// 덧셈 연산자를 이용하여 문자열을 결합할 수 있다.
		// 피연산자 중 어느 한 쪽이 String이면 나머지 한 쪽을 String으로 변환한 다음 두 String을 결합한다.
		String name2 	= "Ja" + "va";	// Java
		String str2 	= name2 + 8.0;	// Java8.0
		
		System.out.println(name2);
		System.out.println(str2);
		
		// 모두 피연산자 중에 String이 포함되어 있으므로 두 피연산자를 결합시킨다.
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		
		// 연산은 왼쪽부터 이루어진다는 것을 알 수 있다.
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}

}
