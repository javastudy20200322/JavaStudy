package summary.haesung.practice.chapter13;

/**
 * <pre>
 * Date		: 2020. 6. 6.
 * Author 	: pureboyz
 * 
 * 다음의 코드를 실행한 결과를 예측하고, 직접 실행한 결과와 비교하라.
 * 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.
 * </pre>
 */
public class Example6
{

	public static void main(String[] args)
	{
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		
		try
		{
			th1.sleep(5*1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			throw new Exception("꽝~!!!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
//		정답 : 0부터 5까지 찍히고 Exception발생하고 main쓰레드가 종료되면서 th1도 종료되고 프로그램 종료
//		문제에서는 throws로 예외처리를 직접 처리 안하기 때문에 예외처리가 되지 않아서 프로그램이 종료되지 않는것 같은데.. 맞을까?
		
	}

}

class Thread4 extends Thread
{
	public void run()
	{
		for(int i=0; i < 10; i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
