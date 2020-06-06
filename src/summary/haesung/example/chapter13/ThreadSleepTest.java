package summary.haesung.example.chapter13;

import java.time.LocalTime;

public class ThreadSleepTest
{

	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();
		
		// 모르게따...
		// main 스레드가 쉬든말든 t1, t2는 3초/5초마다 출력하는데?
		for(int i=0; i<1000; i++)
		{
			try
			{
//				Thread.sleep(500);
				Thread.sleep(1000);
				System.out.println("["+i+"] " + LocalTime.now());
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}

class Thread1 extends Thread
{
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(3000);
				System.out.print("Thread1");
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(5000);
				System.out.print("Thread2");
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
