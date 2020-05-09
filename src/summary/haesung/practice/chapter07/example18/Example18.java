package summary.haesung.practice.chapter07.example18;

public class Example18
{
	static void action(Robot r)
	{
		// DanceRobot이면 dance()를 호출
		if(r instanceof DanceRobot)
		{
			((DanceRobot) r).dance();
		}
		// SingRobot이면 sing()를 호출
		else if(r instanceof SingRobot)
		{
			((SingRobot) r).sing();
		}
		// DrawRobot이면 draw()를 호출
		else if(r instanceof DrawRobot)
		{
			((DrawRobot) r).draw();
		}
	}

	public static void main(String[] args)
	{
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++)
		{
			action(arr[i]);
		}
	}

}
