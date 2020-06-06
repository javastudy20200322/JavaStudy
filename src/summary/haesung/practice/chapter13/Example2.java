package summary.haesung.practice.chapter13;

/**
 * <pre>
 * Date		: 2020. 6. 6.
 * Author 	: pureboyz
 * 
 * 다음 코드의 실행결과로 옳은 것은?
 * 
 * a. 01021233454567689789처럼 0부터 9까지의 숫자가 섞여서 출력된다.
 * b. 01234567890123456789처럼 0부터 9까지의 숫자가 순서대로 출력된다.
 * c. IllegalThreadStateException이 발생한다.
 * </pre>
 */
public class Example2
{

	public static void main(String[] args) 
	{
		Thread2 t1 = new Thread2();
		t1.run();
		
		for(int i=0; i<10; i++)
		{
			System.out.print(i);
		}
		
//		정답 : b
//		start()로 실행하면 a처럼 나오고, run()으로 실행하면 쓰레드가 아닌 일반 메소드호출이므로 b처럼 나온다.
	}

}

class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.print(i);
		}
	}
}
