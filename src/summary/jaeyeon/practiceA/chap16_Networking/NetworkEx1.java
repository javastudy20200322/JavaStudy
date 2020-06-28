package summary.jaeyeon.practiceA.chap16_Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

class NetworkEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터넷이 연결되어있어야 제대로 결과가 나옴.
		
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() : " + ip.toString());
			
			byte[] ipAddr = ip.getAddress();
			
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			
			String result ="";
			
			for(int i = 0 ; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i] ;
				result += ".";
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	try {
		ip = InetAddress.getLocalHost();
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		ipArr = InetAddress.getAllByName("www.naver.com");
		
		for(int i = 0 ; i < ipArr.length; i++) {
			System.out.println("ipArr["+i+"] : " + ipArr[i]);
		}
		
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	}

}
