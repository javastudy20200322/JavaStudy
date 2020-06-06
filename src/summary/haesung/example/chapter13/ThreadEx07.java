package summary.haesung.example.chapter13;

public class ThreadEx07 implements Runnable
{
	static boolean autoSave = false;

	public static void main(String[] args)
	{
		Thread t = new Thread(new ThreadEx07());
		
		// t를 데몬 쓰레드로 지정
		t.setDaemon(true);
		t.start();
		
		for(int i=0; i<=10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
//				e.printStackTrace();
			}
			
			System.out.println(i);
			
			if(i == 5)
			{
				autoSave = true;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(3*1000);
			}
			catch (InterruptedException e)
			{
//				e.printStackTrace();
			}
			
			// 3초에 한 번씩 autoSave의 값을 확인하여 true이면 autoSave()를 실행.
			// 데몬쓰레드가 되면서 한번만 autoSave()를 실행하고 종료된다.. 이해가 잘 안된다..
			if(autoSave)
			{
				autoSave();
			}
		}
	}
	
	public void autoSave()
	{
		System.out.println("작업파일이 자동저장 되었습니다.");
	}

}
