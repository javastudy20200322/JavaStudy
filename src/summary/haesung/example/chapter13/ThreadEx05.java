package summary.haesung.example.chapter13;

public class ThreadEx05
{

	public static void main(String[] args)
	{
		ThreadEx5_1 t1 = new ThreadEx5_1();
		ThreadEx5_2 t2 = new ThreadEx5_2();
		
		// 우선순위는 쓰레드를 생성한 쓰레드의 우선순위를 상속받는다.
		// 우선순위를 따로 설정을 하지 않으면 main thread의 우선순위가 5이므로 5가 된다.
		// t2의 우선순위를 7로 설정
		t2.setPriority(7);
		
		System.out.println("Priority of t1 : " + t1.getPriority());
		System.out.println("Priority of t2 : " + t2.getPriority());
		
		t1.start();
		t2.start();
	}

}

class ThreadEx5_1 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print("-");
			for(int x=0; x<10000000; x++)
			{
				
			}
		}
	}
}

class ThreadEx5_2 extends Thread
{
	public void run()
	{
		for(int i=0; i<300; i++)
		{
			System.out.print("|");
			for(int x=0; x<10000000; x++)
			{
				
			}
		}
	}
}
