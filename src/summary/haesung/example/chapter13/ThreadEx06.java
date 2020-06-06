package summary.haesung.example.chapter13;

public class ThreadEx06
{

	public static void main(String[] args)
	{
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		// 쓰레드그룹 grp1의 자식그룹 subGrp1을 생성.
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
		
		// grp1의 최대우선순위를 3으로 설정.
		// 자동으로 subGrp1도 최대우선순위가 3이 된다.
		grp1.setMaxPriority(3);
		
		Runnable r = new Runnable()
		{
			public void run()
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
//					e.printStackTrace();
				}
			}
		};
		
		new Thread(grp1, 	r, "th1").start();
		new Thread(subGrp1, r, "th2").start();
		new Thread(grp2, 	r, "th3").start();
		
		System.out.println("List of ThreadGroup : " + main.getName()
			+ ", Active ThreadGroup : " + main.activeGroupCount()
			+ ", Active Thread : " + main.activeCount());
		
		main.list();
	}

}
