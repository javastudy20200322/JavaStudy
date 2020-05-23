package summary.haesung.practice.chapter11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx
{

	public static void main(String[] args)
	{
		// PriorityQueue는 우선순위가 높은 것부터 꺼낸다.
		// 숫자를 기준으로 작은 수가 우선순위가 높다.
		Queue pq = new PriorityQueue();
		
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		System.out.println(pq);
		
		Object obj = null;
		
		while((obj = pq.poll()) != null)
		{
			System.out.println(obj);
		}
	}

}
