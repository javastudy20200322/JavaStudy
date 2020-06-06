package summary.haesung.example.chapter13;

class ThreadEx12
{
	
	public static void main(String args[])
	{
		ThreadEx12_1 th1 = new ThreadEx12_1("*");
		ThreadEx12_1 th2 = new ThreadEx12_1("**");
		ThreadEx12_1 th3 = new ThreadEx12_1("***");
		
		th1.start();
		th2.start();
		th3.start();

		try
		{
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		}
		catch (InterruptedException e)
		{
//			e.printStackTrace();
		}
	}
}

class ThreadEx12_1 implements Runnable
{
	boolean suspended = false;
	boolean stopped   = false;

	Thread th;

	ThreadEx12_1(String name)
	{
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}

	public void run()
	{
		String name =th.getName();

		while(!stopped)
		{
			if(!suspended)
			{
				System.out.println(name);
				
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println(name + " - interrupted");
				}			
			}
			else
			{
//				System.out.println("@@@");
				
				// 우선순위가 같거나 높은 쓰레드가 실행되도록 양보하고, 자신은 실행대기상태가 된다. ??? 잘 이해가 안된다.
				Thread.yield();				// 다른 쓰레드한테 양보한다고 while문이 안도는건 아닌듯
				System.out.println("###");	// yield()를 호출한 뒤 이 줄이 출력된다.
			}
		}
		
		System.out.println(name + " - stopped");
	}

	public void suspend()
	{
		suspended = true;
		
		th.interrupt();
		
		System.out.println(th.getName() + " - interrupt() by suspend()");
	}

	public void resume()
	{
		suspended = false;
	}

	public void stop()
	{
		stopped = true;
		
		// 쓰레드를 멈춤.
		// sleep 상태인 경우에 interrupt()를 호출하지 않으면 sleep이 끝날때까지 기다리지만
		// interrupt()를 호출하면 InterruptException이 발생하면서 쓰레드가 즉시 종료된다.
		th.interrupt();
		
		System.out.println(th.getName() + " - interrupt() by stop()");
	}

	public void start()
	{
		th.start();
	}
	
}
