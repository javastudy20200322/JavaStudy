package summary.haesung.example.chapter09;

import java.util.StringJoiner;

public class StringEx2
{

	public static void main(String[] args) throws Exception
	{
		String str = "가";
		
		byte[] bArr1 = str.getBytes("UTF-8");	// UTF-8을 사용하여 문자열 str을 byte로 나누어 배열 bArr1에 저장.
		byte[] bArr2 = str.getBytes("CP949");
		
		System.out.println(joinByteArr(bArr1));
		System.out.println(joinByteArr(bArr2));
		
		System.out.println(new String(bArr1, "UTF-8"));	// byte 배열을 문자열로 변환한다.
		System.out.println(new String(bArr2, "CP949"));
	}
	
	static String joinByteArr(byte[] bArr)
	{
		StringJoiner sj = new StringJoiner(":", "[", "]");
		
		for(byte b : bArr)
		{
			sj.add(String.format("%02X", b));
		}
		
		return sj.toString();
	}

}
