package summary.haesung.example.chapter13;

public class ThreadEx02
{

	public static void main(String[] args)
	{
		// 호출스택의 첫 method가 run()
//		ThreadEx2_1 t1 = new ThreadEx2_1();
//		t1.start();
		
		// 호출스택의 첫 method가 main
		ThreadEx2_2 t2 = new ThreadEx2_2();
		t2.run();
	}

}

class ThreadEx2_1 extends Thread
{
	public void run()
	{
		throwException();
	}
	
	public void throwException()
	{
		try
		{
			throw new Exception();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

class ThreadEx2_2 extends Thread
{
	public void run()
	{
		throwException();
	}
	
	public void throwException()
	{
		try
		{
			throw new Exception();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
