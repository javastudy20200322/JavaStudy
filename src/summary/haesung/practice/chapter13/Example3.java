package summary.haesung.practice.chapter13;

/**
 * <pre>
 * Date		: 2020. 6. 6.
 * Author 	: pureboyz
 * 
 * 다음 중 쓰레드를 일시정지 상태(WAITING)로 만드는 것이 아닌 것은? (모두 고르시오)
 * </pre>
 */
public class Example3
{

	public static void main(String[] args)
	{
//		a. suspend()
//		b. resume()
//		c. join()
//		d. sleep()
//		e. wait()
//		f. notify()
		
//		정답 : b,f
//		
//		suspend()로 실행을 멈추면, resume()으로 실행대기상태로 만들 수 있다.
//		wait()로 대기상태가되면, notify()로 실행시킬 수 있다.
//		join()은 다른 쓰레드가 종료될 때까지 대기
//		sleep()은 해당 시간만큼 대기
	}

}
