package summary.haesung.example.chapter13;

import javax.swing.JOptionPane;

public class ThreadEx09
{

	public static void main(String[] args)
	{
		ThreadEx9_1 th1 = new ThreadEx9_1();
		
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		
		System.out.println("입력한 값은 " + input);
		
		th1.interrupt();

		// th1이 종료되기 전에 입력하면 true가, 종료 후에 입력하면 false가 나온다.
		// th1이 sleep상태일때 interrupt시키면 InterruptedException이 발생하면서 false가 나온다.
		System.out.println("isInterrupted() : " + th1.isInterrupted());
	}

}

class ThreadEx9_1 extends Thread
{
	public void run()
	{
		int i = 10;
		
		while(i != 0 && !isInterrupted())
		{
			System.out.println(i--);
//			for(long x=0; x<5000000000L; x++)
//			{
//				
//			}
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
//				e.printStackTrace();
			}
		}
		
		System.out.println("카운트가 종료되었습니다.");
	}
}
