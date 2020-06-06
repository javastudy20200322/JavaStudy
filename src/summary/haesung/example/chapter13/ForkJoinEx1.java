package summary.haesung.example.chapter13;

import java.util.concurrent.*;

public class ForkJoinEx1
{
	static final ForkJoinPool pool = new ForkJoinPool();

	public static void main(String[] args)
	{
		long from 	= 1L;
		long to 	= 100_000_000L;
		
		SumTask task = new SumTask(from, to);
		
		long start = System.currentTimeMillis();
		Long result = pool.invoke(task);
		
		// 작업을 나누고 합치고 하는데 시간이 걸려서 단순히 for문으로 계산한 것보다 시간이 더 걸렸다.
		System.out.println("Elapsed time(4 core):" + (System.currentTimeMillis() - start));
		System.out.printf("sum of %d~%d=%d%n", from, to, result);
		System.out.println();
		
		result 	= 0L;
		start 	= System.currentTimeMillis();
		
		for(long i=from; i<=to; i++)
		{
			result +=i;
		}
		
		System.out.println("Elapsed time(1 core):" + (System.currentTimeMillis() - start));
		System.out.printf("sum of %d~%d=%d%n", from, to, result);
	}

}

class SumTask extends RecursiveTask<Long>
{
	long from, to;
	
	SumTask(long from, long to)
	{
		this.from = from;
		this.to = to;
	}
	
	public Long compute()
	{
		long size = to - from + 1;
		
		if(size <= 5)
		{
			return sum();
		}
		
		long half = (from + to) / 2;
		
		SumTask leftSum 	= new SumTask(from, half);
		SumTask rightSum 	= new SumTask(half+1, to);
		
		leftSum.fork();
		
		return rightSum.compute() + leftSum.join();
	}
	
	long sum()
	{
		long tmp = 0L;
		
		for(long i=from; i<=to; i++)
		{
			tmp += i;
		}
		
		return tmp;
	}
}
