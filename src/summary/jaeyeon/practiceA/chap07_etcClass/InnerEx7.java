package summary.jaeyeon.practiceA.chap07_etcClass;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InnerEx7 {
	public static void main(String[] args) {

		Button b = new Button("Start");

		b.addActionListener(new EventHandler());

	}

}

class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ActionEvent occurred!!");
	}

}