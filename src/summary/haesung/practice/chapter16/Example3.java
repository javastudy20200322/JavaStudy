package summary.haesung.practice.chapter16;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

/**
 * <pre>
 * Date		: 2020. 6. 24.
 * Author 	: pureboyz
 * 
 * TextField에 URL을 입력하고 Enter키를 누르면 해당 페이지의 소스를 보여주는'Source Viwer'프로그램이다.
 * 예제16-4를 참고해서 (1)에 알맞은 코드를 넣어 완성하시오.
 * </pre>
 */
public class Example3 extends Frame
{
	TextField 	tf = new TextField();
	TextArea 	ta = new TextArea();

	Example3(String title)
	{
		super(title);
		
		add(tf, "North");
		add(ta, "Center");
		
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				displaySource();
			}
		});
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		setBounds(500, 200, 500, 300);
		setVisible(true);
	}
	
	void displaySource()
	{
		URL 			url 	= null;
		BufferedReader 	input 	= null;
		String 			address = tf.getText().trim();
		String 			line 	= "";
		
		ta.setText("");
		
		try
		{
			if(!address.startsWith("http://"))
			address = "http://"+address;
			/*
			(1) 알맞은 코드를 넣어 완성하시오.
			*/
			
			url 	= new URL(address);
			input 	= new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			
			while((line = input.readLine()) != null)
			{
				ta.append(line);
				ta.append("\n");
			}
			
			input.close();
		}
		catch(Exception e)
		{
			ta.setText("유효하지 않은 URL입니다.");
		}
	}
	
	public static void main(String[] args)
	{
		Example3 mainWin = new Example3("Source Viewer");
	}

}
