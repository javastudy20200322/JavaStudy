package summary.haesung.example.chapter13;

public class ThreadEx03
{
	static long startTime = 0;

	public static void main(String[] args)
	{
		startTime = System.currentTimeMillis();
		
//		singleThread();	// 소요시간1과 소요시간2의 차이가 있다.
		
		multiThread();	// 소요시간1과 소요시간2의 차이가 거의 없다.
	}
	
	static void singleThread()
	{
		
		for(int i=0; i<300; i++)
		{
			System.out.printf("%s", new String("-"));
		}
		
		System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));
		
		for(int i=0; i<300; i++)
		{
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("소요시간2 : " + (System.currentTimeMillis() - startTime));
	}
	
	static void multiThread()
	{
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.start();
		
		for(int i=0; i<300; i++)
		{
			System.out.printf("%s", new String("-"));
		}
		
		System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));
	}

}

class ThreadEx3_1 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("소요시간2 : " + (System.currentTimeMillis() - ThreadEx03.startTime));
	}
}
