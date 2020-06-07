package summary.haesung.practice.chapter13;

/**
 * <pre>
 * Date		: 2020. 6. 6.
 * Author 	: pureboyz
 * 
 * 다음의 코드는 쓰레드 th1을 생성해서 실행시킨 다음 6초 후에 정지시키는 코드이다.
 * 그러나 실제로 실행시켜보면 쓰레드를 정지시킨 다음에도 몇 초가 지난 후에서야멈춘다.
 * 그 이유를 설명하고, 쓰레드를 정지시키면 지체없이 바로 정지되도록 코드를 개선하시오.
 * </pre>
 */
public class Example7
{
	static boolean stopped = false;
	
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		
		Thread5 th1 = new Thread5();
		th1.start();
		
		try
		{
			Thread.sleep(6*1000);
		}
		catch(Exception e)
		{
//			e.printStackTrace();
		}
		
		stopped = true; // 쓰레드를 정지시킨다. System.out.println("stopped");
		
		// 차이가 없다..
		th1.interrupt();
		System.out.println("stopped : " + (System.currentTimeMillis() - start));
	}
	
}

class Thread5 extends Thread
{
	public void run()
	{
		// Example7.stopped의 값이 false인 동안 반복한다.
		for(int i=0; !Example7.stopped; i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(3*1000);
			}
			catch(Exception e)
			{
//				e.printStackTrace();
			}
		}
	} // run()
}
