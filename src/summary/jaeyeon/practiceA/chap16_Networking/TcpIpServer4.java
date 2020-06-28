package summary.jaeyeon.practiceA.chap16_Networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer4 implements Runnable {

	ServerSocket serverSocket = null;
	Thread[] threadArr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TcpIpServer4 server = new TcpIpServer4(5);
		server.start();
	}

	public TcpIpServer4(int num) {
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + " 서버가 준비되었습니다.");
			threadArr = new Thread[num];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void start() {
		for (int i = 0; i < threadArr.length; i++) {
			threadArr[i] = new Thread(this);
			threadArr[i].start();
		}
	}

	public void run() {

		while (true) {

			try {
				// 서버소켓

				System.out.println(getTime() + " 연결요청을 기다립니다.");

				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + " 로부터 연결요청이 들어왔습니다.");

				// 소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				// 원격 소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했습니다.");

				// 스트림과 소켓을 닫아준다.

				dos.close();
				socket.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// 현재시간을 문자열로 반환하는 함수
	static String getTime() {
		String name = Thread.currentThread().getName();
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date()) + name;
	}

}
