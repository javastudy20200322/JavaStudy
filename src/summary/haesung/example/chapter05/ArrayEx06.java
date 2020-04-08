package summary.haesung.example.chapter05;

public class ArrayEx06
{

	public static void main(String[] args)
	{
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = {
				 "0000", "0001", "0010", "0011"
				,"0100", "0101", "0110", "0111"
				,"1000", "1001", "1010", "1011"
				,"1100", "1101", "1110", "1111"
				};
		
		String result = "";
		
		// 배열 hex의 값(16진수)을 배열 binary와 매치시켜서 2진수로 변환.
		for(int i=0; i<hex.length; i++)
		{
			if((hex[i] >= '0') && (hex[i] <= '9'))
			{
				result += binary[hex[i]-'0'];
			}
			else
			{
				result += binary[hex[i]-'A'+10];
			}
		}
		
		System.out.println("hex : " + new String(hex));	// char타입의 배열은 주소값이 아닌 실제 저장된 값이 바로 출력된다.
		System.out.println("binary : " + result);
	}
}
