package summary.haesung.example.chapter13;

import java.util.ArrayList;

class ThreadWaitEx1
{
	public static void main(String[] args) throws Exception
	{
		Table table = new Table();

		new Thread(new Cook(table), "COOK1").start();					// 요리사1
		new Thread(new Customer(table, "donut"), "CUST1").start();		// 도넛을 먹는 손님
		new Thread(new Customer(table, "burger"), "CUST2").start();		// 버거를 먹는 손님
	
		Thread.sleep(5000);
		System.exit(0);
	}
}

class Customer implements Runnable
{
	private Table table;
	private String food;

	Customer(Table table, String food)
	{
		this.table = table;  
		this.food  = food;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
//				e.printStackTrace();
			}
			
			String name = Thread.currentThread().getName();
			
			if(eatFood())
			{
				System.out.println(name + " ate a " + food);
			}
			else
			{
				System.out.println(name + " failed to eat. :(");
			}
		}
	}

	boolean eatFood()
	{
		return table.remove(food);
	}
}

class Cook implements Runnable
{
	private Table table;
	
	Cook(Table table)
	{
		this.table = table;
	}

	public void run()
	{
		while(true)
		{
			int idx = (int)(Math.random()*table.dishNum());
		
			table.add(table.dishNames[idx]);

			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
//				e.printStackTrace();
			}
		}
	}
}

class Table
{
	String[] 	dishNames 	= { "donut","donut","burger" };
	final int 	MAX_FOOD 	= 6;
	
	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish)
	{
		if(dishes.size() >= MAX_FOOD)
		{
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");
			try
			{
				wait();	// COOK을 기다리게 한다.
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
//				e.printStackTrace();
			}
			return;
		}
		
		dishes.add(dish);
		
		notify();	// 기다리고있는 CUST를 깨우기 위함.
		
		System.out.println("Dishes:" + dishes.toString());
	}

	public boolean remove(String dishName)
	{
		synchronized (this)
		{
			while(dishes.size() == 0)
			{
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting.");
				try
				{
					wait(); // CUST를 기다리게 한다.
					Thread.sleep(500);
				}
				catch (InterruptedException e)
				{
//					e.printStackTrace();
				}
			}
			
			for(int i=0; i<dishes.size();i++)
			{
				if(dishName.equals(dishes.get(i)))
				{
					dishes.remove(i);
					
					notify();	// COOK을 깨운다.
					
					return true;
				}
			}
		}

		return false;
	}

	public int dishNum()
	{
		return dishNames.length;
	}
}
