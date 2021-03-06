package summary.jaeyeon.practiceA.chap16_Networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

class TcpIpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String serverIp = "127.0.0.1";

			System.out.println("서버에 연결중입니다. 서버 IP : " + serverIp);

			// 소켓을 생성하여 연결을 요청한다.

			Socket socket = new Socket(serverIp, 7777);

			// 소켓의 입력스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			// 소켓으로부터 받은 ㄷ이터를 출력한다.

			System.out.println("서버로 부터 받은 메시지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");

			// 스트림과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
