package summary.haesung.example.chapter07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx6
{
	// 익명클래스
	Object iv = new Object() {
		void method() {}
	};
	
	// 익명클래스
	static Object cv = new Object() {
		void method() {}
	};
	
	void myMethod()
	{
		// 익명클래스
		Object lv = new Object() { void method() {} };
	}
	
	public static void main(String[] args)
	{
		Button b = new Button("Start");
		
		// 아래 두개는 같은것.
		// 위는 EventHandler클래스를 매개변수로.
		// 아래는 익명클래스를 매개변수로.
		b.addActionListener(new EventHandler());
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
	
}

class EventHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("ActionEvent occurred!!!");
	}
}
