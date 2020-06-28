package summary.jaeyeon.example.chap16_Networking;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

class ChatClient extends Frame {

	String nickname = "";
	String serverIp = "";
	int serverPort = 0;

	DataOutputStream out;
	DataInputStream in;

	Panel p = new Panel();
	TextArea ta = new TextArea();
	TextField tf = new TextField();

	ChatClient(String nickname, String serverIp, String serverPort) {
		super("Chatting with " + serverIp + " : " + serverPort);
		this.nickname = nickname;
		this.serverIp = serverIp;
		this.serverPort = Integer.parseInt(serverPort);

		setBounds(600, 200, 300, 200);

		p.setLayout(new BorderLayout());
		;
		p.add(tf, "Center");

		add(ta, "Center");
		add(p, "South");

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	void startClient() {
		try {
			// (3) 아래의 로직에 맞게 코드를 작성하시오
			// 1 .소켓을 생성하여 serverIp 의 serverPort에 연결한다.
			Socket socket = new Socket(serverIp, serverPort);
			// 2. ta 에 "상대방과 연결되었습니다." 라고 보여준다.
			ta.setText("상대방과 연결되었습니다.");

			// 3. 연결된 상대방 소켓의 입력 스트림과 출력 스트림을 얻어온다.
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());

			// 4. 반복문을 이용해서 스트림이 null 이 아닌 동안 입력 스트림으로 부터 데이터를 읽어서
			while (in != null) {

				// 변수 msg 에 저장한다.
				try {
					String msg = in.readUTF();
					ta.append("\r\n" + msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 3) {
			System.out.println("USAGE : java ChatClient NICKNAME SERVER_IP SERVER_PORT");
			System.exit(0);

		}

		ChatClient chatWin = new ChatClient(args[0], args[1], args[2]);
		chatWin.startClient();

	}

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();

			if ("".equals(msg)) {
				return;
			}

			// (4) 알맞은 코드를 넣어 완성하시오
			if (out != null) {
				try {
					out.writeUTF(nickname + ">" + msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			ta.append("\r]n" + nickname + ">" + msg);
			tf.setText("");

		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	}

}
