package summary.haesung.example.chapter13;

public class ThreadEx14
{

	public static void main(String[] args)
	{
		Runnable r = new RunnableEx14();
		new Thread(r).start();
		new Thread(r).start();
	}

}

class Account
{
	private int balance = 1000;
	
	public int getBalance()
	{
		return balance;
	}
	
	// synchronized를 사용하여 여러쓰레드가 withdraw()를 동시에 호출하지 않고 대기하면서 한번식 호출한다.
	public synchronized void withdraw(int money)
	{
		if(balance >= money)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
//				e.printStackTrace();
			}
			
			balance -= money;
		}
	}
}

class RunnableEx14 implements Runnable
{
	Account acc = new Account();
	
	public void run()
	{
		while(acc.getBalance() > 0)
		{
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}
}
