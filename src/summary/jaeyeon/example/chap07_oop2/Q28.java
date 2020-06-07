package summary.jaeyeon.example.chap07_oop2;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Q28 {

	
	public static void main(String[] args) {
		
		
		Frame f = new Frame();
		
		
		f.addWindowListener(new EventHandler());
	}
	
}

//EventHandler 클래스를 익명 클래스로 변경하시오. 너무 어렵자너ㅜㅜ
class EventHandler extends WindowAdapter{
	
	
	public void windowClosing(WindowEvent e ) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
	
}