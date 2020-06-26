package summary.haesung.practice.chapter16;

/**
 * <pre>
 * Date		: 2020. 6. 24.
 * Author 	: pureboyz
 * 
 * ip주소가 192.168.10.100이고 서브넷 마스크(subnet mask)가 255.255.255.0일때,
 * 네트워크 주소와 호스트 주소를 계산하여 화면에 출력하는 프로그램을 작성하시오.
 * 단, 비트연산자를 사용해서 계산해야 한다.
 * 
 * [실행결과]
 * 네트워크 주소:192.168.10.0.
 * 호스트 주소:0.0.0.100.
 * </pre>
 */
public class Example1
{

	// 네트워크주소와 호스트주소의 개념을 잘 모르겠다.. 담에 다시 공부해보자..
	public static void main(String[] args)
	{
		byte[] ip 			= {(byte)192,(byte)168,(byte)10,(byte)100};
		byte[] subnet 		= {(byte)255,(byte)255,(byte)255,(byte)0};
		
		byte[] nwAddress 	= new byte[4]; // 네트워크 주소
		byte[] hostAddress 	= new byte[4]; // 호스트 주소
		
		System.out.print("네트워크 주소:");
		
		for(int i=0; i < ip.length;i++)
		{
			nwAddress[i] = (byte)(ip[i] & subnet[i]); // &연산을 수행한다.
			System.out.print(nwAddress[i] >=0 ?
			nwAddress[i] : nwAddress[i]+256);
			System.out.print(".");
		}
		
		System.out.println();
		
		System.out.print("호스트 주소:");
		
		for(int i=0; i < ip.length;i++)
		{
			hostAddress[i] = (byte)(ip[i] & ~subnet[i]); // &연산을 수행한다.
			System.out.print(hostAddress[i] >=0 ?
			hostAddress[i] : hostAddress[i]+256);
			System.out.print(".");
		}
		
		System.out.println();
	}

}
