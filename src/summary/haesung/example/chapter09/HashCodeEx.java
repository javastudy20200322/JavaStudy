package summary.haesung.example.chapter09;

public class HashCodeEx
{

	public static void main(String[] args)
	{
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		// String 객체 내부에 오버라이딩 된 hashCode()
		// 문자열의 내용이 같으면 동일한 hsahCode를 반환한다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// System.identityHashCode(Object x)는 Object클래스의 hashCode()처럼 모든 객체에 대해서 항상 다른 hashCode값을 반환한다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
