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
public class Example5
{

	public static void main(String[] args) throws Exception
	{
		Thread3 th1 = new Thread3();
		th1.start();
		
		try
		{
			Thread.sleep(5*1000);
		}
		catch(Exception e)
		{
//			e.printStackTrace();
		}
		
		throw new Exception("꽝~!!!");
		
//		정답
//		0
//		1
//		2
//		3
//		4
//		5
//		Exception발생		<- 여기서 Exception이 발생해도 th1은 계속 실행된다. 부모쓰레드에서 Exception이 발생해도 자식쓰레드는 영향이 없네.
//		6
//		7
//		8
//		9
}

}

class Thread3 extends Thread
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
//				e.printStackTrace();
			}
		}
	}
}
