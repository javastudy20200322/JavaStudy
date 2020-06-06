package summary.haesung.example.chapter13;

public class ThreadEx10
{

	// 쓰레드를 중지시켰다가 다시 실행시켰다가하는 내용
	// 이 부분은 몰라도 될 것 같다..
	// 실행 중에 에러가 발생하는데? 무슨 에러인지 모르겠다.. 메세지가 안뜸 ㅠ
	// 어차피 쓰지 마라는 메소드들이다
	public static void main(String[] args)
	{
		RunImplEx10 r = new RunImplEx10();
		
		Thread th1 = new Thread(r, "*");	// 매개변수는 Runnable객체, 해당 쓰레드의 이름
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try
		{
			Thread.sleep(2000);
			th1.suspend();		// th1을 잠시 중단.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();		// th1을 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop();			// th1을 강제 종료.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		}
		catch (InterruptedException e)
		{
//			e.printStackTrace();
		}
		
	}

}

class RunImplEx10 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
//				e.printStackTrace();
			}
		}
	}
}
