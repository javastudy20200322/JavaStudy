package summary.haesung.example.chapter13;

public class ThreadEx08
{

	public static void main(String[] args)
	{
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		th1.start();
		th2.start();
		
		try
		{
			// sleep()은 현재 실행중인 thread에 대해 작동한다.
			// 사용할 때는 아래처럼이 아닌 Thread.sleep()으로 해야한다.
			// sleep을 걸면 main, th1, th2 모두 멈춘다는건가?
			th1.sleep(2000);
		}
		catch (InterruptedException e)
		{
//			e.printStackTrace();
		}
		
		System.out.println("<<main 종료>>");
	}

}

class ThreadEx8_1 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print("-");
		}
		
		System.out.println("<<th1 종료>>");
	}
}

class ThreadEx8_2 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print("|");
		}
		
		System.out.println("<<th2 종료>>");
	}
}
