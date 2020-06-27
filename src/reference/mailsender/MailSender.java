package reference.mailsender;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * <pre>
 * Date		: 2020. 6. 26.
 * Author 	: pureboyz
 * 
 * Socket 통신을 이용하여 Mail을 보내는 프로그램.
 * 
 * '|'를 구분자로하여 sendTo, title, contents를 받아
 * sendTo 주소로 title을 제목, contents를 내용으로하는 메일을 발송한다.
 * </pre>
 */
public class MailSender
{
	static int 		count 		= 0;						// 요청이 들어온 횟수
	
	static String 	user 		= "mail@naver.com"; 		// 보내는 계정 메일주소
	static String 	password 	= "password";   			// 보내는 계정 비밀번호
	
	static String 	hostName 	= "";						// 호스트 이름
	static int 		hostPort 	= 587;						// 호스트 포트

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		if(0 < args.length)
		{
			hostName = args[0];
		}
		else
		{
			System.out.println("메일 서버 HOST가 지정되지 않았습니다.");
			System.exit(0);
		}
		
		ServerSocket serverSocket = null;

		try
		{
			serverSocket = new ServerSocket(8080);
			System.out.println("****************************************");
			System.out.println(" [ Mail Sender ] Started..");
			System.out.println(" * Version      : 20200626_001");
			System.out.println(" * Server Info");
			System.out.println("     URL        : " + "www.pureboyz.ml");
			System.out.println("     Port       : " + serverSocket.getLocalPort());
			System.out.println("****************************************");
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
		while(true)
		{
			try
			{
				// 소켓 생성
				Socket socket = serverSocket.accept();
				
				// data를 받을 준비
				InputStream 	is 	= socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				// 받은 data
				String packet = dis.readUTF();
				System.out.println("[order " + ++count + "] connected!!");
				System.out.println("[order " + count + "] packet                      = {" + packet + "}");
				
				// 클라이언트에게 보낼 결과 메세지
				String result = null;
				
				// 유효성검사 Start..
				int separator = 0;
				for(int i=0; i<packet.length(); i++)
				{
					if(packet.charAt(i) == '|')
					{
						separator++;
					}
				}
				
				// 사용하는 parameter가 3개이므로 구분자가 2개여야한다.
				if(separator != 2)
				{
					result = "===== Invalid Parameters.. =====";
					
					System.out.println("[order " + count + "] result                      = [ " + result + " ]");
					
					SendResponseMessage(socket, result);
					
					continue;
				}
				// 유효성검사 End..
				
				// 받은 data에서 필요한 parameter 추출
				String[] 	packetArr 	= packet.split("\\|");
				String 		sendTo 		= packetArr[0];		// 수신자메일주소
				String 		title 		= packetArr[1];		// 메일 제목
				String 		contents 	= packetArr[2];		// 메일 내용

				StringBuffer sb = new StringBuffer();
				sb.append("[order " + count + "] Request Message             = ");
				sb.append("{sendTo:" + sendTo + "}");
				sb.append(", {title:" + title + "}");
				sb.append(", {contents:" + contents + "}");
				System.out.println(sb.toString());
				
				// SMTP 서버 정보를 설정한다.
				Properties prop = new Properties();
				prop.put("mail.smtp.host", hostName);	// 메일서버 이름
				prop.put("mail.smtp.port", hostPort); 	// 메일서버 포트
				prop.put("mail.smtp.auth", "true"); 	// 이 옵션을 true로 하면 아래의 인증을 사용하게 된다.
		        
				// user, password 정보로 사용자 인증.
				Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(user, password);
					}
				});
				
				try
				{
					// 보낼 메세지 세팅
					MimeMessage message = new MimeMessage(session);
					message.setFrom(new InternetAddress(user));										// 보내는 메일 주소
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(sendTo)); 	// 받는 메일 주소
					message.setSubject(title);														// 제목
					message.setContent(contents, "text/html");										// 내용(type이 "text/html"라서 html태그도 적용된다.)
					
					// 메일 발송
					Transport.send(message);
					
					result = "Message sent successfully!!   [" + user + "] to [" + sendTo + "]";
					
					System.out.println("[order " + count + "] " + result);
					
					SendResponseMessage(socket, result);
				}
				catch (MessagingException e)
				{
					result = "Message send failed because.. [ " + e.getMessage() + " ]";
					
					System.out.println("[order " + count + "] " + result);
					
					SendResponseMessage(socket, result);
				}
				
				dis.close();
				is.close();
				socket.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * <pre>
	 * MethodName	: SendResponseMessage
	 * Date 		: 2020. 6. 26.
	 * Author		: pureboyz
	 * 
	 * Params		: Socket socket, String result
	 * ReturnType	: void
	 * 
	 * 클라이언트에게 연결된 socket을 이용하여 result를 전달한다.
	 * </pre>
	 */
	static void SendResponseMessage(Socket socket, String result)
	{
		try
		{
			OutputStream 		os 	= socket.getOutputStream();
			DataOutputStream 	dos = new DataOutputStream(os);
			
			dos.writeUTF(result);
			
			dos.close();
			os.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
