package summary.jaeyeon.example.chap16_Networking;

public class Q1 {

	
	/*
	 * ip주소가 192.168.10.100 이고 서브넷 마스크(subnet mask) 가 255.255.255.0 일때 네트워크 주소와 호스트
	 * 주소를 계산하여 화면에 출력하는 프로그램을 작성하시오 단, 비트연산자를 사용해서 계산해야한다.
	 * 
	 */
	public static void main(String[] args) {

		byte[] ip = {};
		byte[] subnet = {};

		byte[] nwAddress = new byte[4];
		byte[] hostAddress = new byte[4];

		System.out.println("네트워크 주소 : ");
		for (int i = 0; i < ip.length; i++) {
			nwAddress[i] = (byte) (ip[i] & subnet[i]); // &연산을 수행한다.
			System.out.println(nwAddress[i] >= 0 ? nwAddress[i] : nwAddress[i] + 256);
			System.out.println(".");
		}

		System.out.println();
		System.out.println("호스트 주소 : ");

		for (int i = 0; i < ip.length; i++) {
			hostAddress[i] = (byte) (ip[i] & ~subnet[i]);
			System.out.println(hostAddress[i] >= 0 ? hostAddress[i] : hostAddress[i] + 256);
			System.out.println(".");
		}
		System.out.println();
	}
}
