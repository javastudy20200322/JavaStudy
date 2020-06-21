package summary.haesung.practice.chapter15;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

/**
 * <pre>
 * Date 	: 2020. 6. 20.
 * Author	: pureboyz
 *
 * 다음의 코드는 대화내용을 파일에 저장할 수 있는 채팅 프로그램이다.
 * ‘저장’버튼을 누르면 대화내용이 저장되도록 알맞은 코드를 넣어 완성하시오.
 * </pre>
 */
public class Example07 extends Frame
{
	String 		nickname 	= "";
	TextArea 	ta 			= new TextArea();
	Panel 		p 			= new Panel();
	TextField 	tf 			= new TextField(30);
	Button 		bSave 		= new Button("저장");
	
	Example07(String nickname)
	{
		super("Chatting");
		this.nickname = nickname;
		
		setBounds(200, 100, 300, 200);
		
		p.setLayout(new FlowLayout());
		p.add(tf);
		p.add(bSave);
		
		add(ta, "Center");
		add(p, "South");
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		bSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				FileDialog fileSave = new FileDialog(Example07.this,"파일저장", FileDialog.SAVE);
				fileSave.setVisible(true);
				String fileName = fileSave.getDirectory() + fileSave.getFile();
				saveAs(fileName);
			}
		});
		
		EventHandler handler = new EventHandler();
		
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		ta.setText("#" + nickname + "님 즐거운 채팅되세요.");
		ta.setEditable(false);
		setResizable(false);
		setVisible(true);
		tf.requestFocus();
	}
	
	void saveAs(String fileName)
	{
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		try
		{
			FileWriter 		fw = new FileWriter(fileName);
			BufferedWriter 	bw = new BufferedWriter(fw);
			
			bw.write(ta.getText());
			
			try
			{
				if(bw!=null)
				{
					bw.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
//		if(args.length != 1)
//		{
//			System.out.println("USAGE : java ChatWin NICKNAME");
//			System.exit(0);
//		}
//		
//		new Example07(args[0]);
		
		new Example07("메롱");
	}

	class EventHandler extends FocusAdapter implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			String msg = tf.getText();
			
			if("".equals(msg))
			{
				return;
			}
			
			ta.append("\r\n" + nickname +">"+ msg);
			tf.setText("");
		}
		
		public void focusGained(FocusEvent e)
		{
			tf.requestFocus();
		}
	}

}
