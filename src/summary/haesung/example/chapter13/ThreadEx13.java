package summary.haesung.example.chapter13;

 class ThreadEx13
 {
	static long startTime = 0;

	public static void main(String args[])
	{
		ThreadEx13_1 th1 = new ThreadEx13_1();
		ThreadEx13_2 th2 = new ThreadEx13_2();

		th1.start();
		th2.start();
		
		startTime = System.currentTimeMillis();

		try
		{
			// th1이 종료될 때까지 기다린다.
			th1.join();
			
			// th2가 종료될 때까지 기다린다.
			th2.join();
		}
		catch(InterruptedException e)
		{
//			e.printStackTrace();
		}

		// th1, th2는 별도의 쓰레드이지만, join() 때문에 th1, th2가 종료된 이후에 출력을 한다.
		System.out.print("소요시간 : " + (System.currentTimeMillis() - ThreadEx13.startTime));
	}
}

class ThreadEx13_1 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx13_2 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print(new String("|"));
		}
	}
}
