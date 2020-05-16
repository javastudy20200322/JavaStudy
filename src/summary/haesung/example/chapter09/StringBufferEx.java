package summary.haesung.example.chapter09;

public class StringBufferEx
{

	public static void main(String[] args)
	{
		// StringBuffer는 버퍼의 크기를 지정해주지 않으면, 크기가 16인 버퍼가 생성된다.
		// 만약 내용의 크기가 16을 넘어서버리면, StringBuffer 내부에서 자동으로 버퍼의 크기를 늘리는 작업을 한다.
		// StringBuffer는 멀티쓰레드에 안전하도록 동기화 되어있다.
		// StringBuffer에서 동기화만 빼면 StringBuilder가 된다.
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		// StringBuffer에 담긴 내용을 비교하려면
		// toString()을 이용하여 String인스턴스를 얻은 다음 비교해야한다.
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
