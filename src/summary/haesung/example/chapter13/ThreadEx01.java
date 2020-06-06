package summary.haesung.example.chapter13;

public class ThreadEx01
{

	public static void main(String[] args)
	{
		ThreadEx1_1 t1 	= new ThreadEx1_1();
		
		Runnable 	r 	= new ThreadEx1_2();
		Thread 		t2 	= new Thread(r);
		
		t1.start();
//		t1.start();	// 두 번 이상 호출하면 IllegalThreadStateException이 발생한다.
		t2.start();
		
		t1.run();
		r.run();	// 이 놈만 main 쓰레드를 사용하네..
	}

}

class ThreadEx1_1 extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.print("Thread..");
			// 조상 클래스 Thread의 getName()을 호출
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.print("Runnable..");
			// Thread.currentThread()는 현재 실행 중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
