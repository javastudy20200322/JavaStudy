package summary.jaeyeon.example.chap16_Networking;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

class SourceViewer extends Frame{
	TextField tf =  new TextField();
	TextArea ta = new TextArea();
	
	
	SourceViewer(String title){
		super(title);
		
		add(tf, "North");
		add(ta,"Center");
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				displaySource();
			}
			
			
		});
		
		
	}
	void displaySource() {
		URL url = null;
		BufferedReader input = null;
		String address = tf.getText().trim();
		String line ="";
		ta.setText("");

		try {
			if(!address.startsWith("http://")) {
				address = "http://" + address;
			}
			// 소스를 작성 하여 완성하시오
			
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			
			while((line = input.readLine()) != null) {
				ta.append(line);
				ta.append("\n");
			}
			
			
			
			
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SourceViewer mainWin = new SourceViewer("Source Viewer");
		
	}
}