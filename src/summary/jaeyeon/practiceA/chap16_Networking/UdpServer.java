package summary.jaeyeon.practiceA.chap16_Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {
	public void start() throws IOException {
		DatagramSocket socket = new DatagramSocket(8888);

		DatagramPacket inPacket, outPacket;

		byte[] inMsg = new byte[10];
		byte[] outMsg;

		while (true) {
			// 데이터를 수신하기 위한 패킷을 생성한다.
			inPacket = new DatagramPacket(inMsg, inMsg.length);

			// 패킷을 통해 데이터를 수신(receive)한다.
			socket.receive(inPacket);

			// 수신한 패킷으로부터 client 의 IP 주소와 Port 를 얻는다.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();

			// 서버의 현재시간을 시분초 형태([hh:mm:ss]) 로 반환한다.
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes();

			// 패킷을 생성해서 client 에게 전송(send) 한다.
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);

			socket.send(outPacket);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new UdpServer().start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
