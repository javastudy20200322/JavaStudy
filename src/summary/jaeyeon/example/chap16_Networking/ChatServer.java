package summary.jaeyeon.example.chap16_Networking;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import com.sun.corba.se.pept.transport.EventHandler;

class ChatServer extends Frame {

	String nickname = "";

	DataOutputStream out;
	DataInputStream in;

	Panel p = new Panel();

	TextArea ta = new TextArea();
	TextField tf = new TextField();

	ChatServer(String nickname) {
		super("Chatting");
		this.nickname = nickname;

		p.setLayout(new BorderLayout());
		p.add(tf, "Center");

		add(ta, "Center");
		add(p, "South");

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);

		ta.setEditable(false);
		setBounds(200, 200, 300, 200);
		setVisible(true);
		tf.requestFocus();

	}
	
	void startServer() {
		try {
			ServerSocket serverSocket = null;
			Socket socket = null;
			
			 // (1) 아래의 로직에 맞게 코드를 작성하시오
			//1. 서버소켓을 생성하여 7777번 포트와 결합시킨다.
			serverSocket = new ServerSocket(7777);
			//2. ta에 "서버가 준비되었습니다." 라고 보여준다.
			ta.setText("서버가 준비되었습니다.");
			//3. 상대방의 연결을 기다린다.
			socket = serverSocket.accept();
			//4.ta 에 "상대방과 연결되었습니다." 라고 보여준다.
			
			ta.append("\r\n" + " 상대방과 연결되었습니다.");
			
			//5. 연결된 상대방 소켓의 입력스트림과 출력스트림을 얻어온다.
			
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			
			
			//6반복문을 이용해서 입력 스트림이 null 이 아닌 동안
			
			while (in != null) {

				try {
				// 입력스트림으로 부터 데이터를 읽어서 변수 msg 에 저장한다.
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
		if (args.length != 1) {
			System.out.println("USAGE : java ChatServer NICKNAME");
			System.exit(0);
		}
		
		ChatServer chatWin = new ChatServer(args[0]);
		chatWin.startServer();
	}

	class EventHandler extends FocusAdapter implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if("".equals(msg)) {
				return;
			}
			
			//(2) 알맞은 코드를 넣어 완성하시오
			if(out != null) {
				try {
					out.writeUTF(nickname + ">" + msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			ta.append("\r\n"+nickname +">" + msg);
		tf.setText("");
		}
		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	}
}
