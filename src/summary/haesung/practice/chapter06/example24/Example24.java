package summary.haesung.practice.chapter06.example24;

public class Example24
{

	public static void main(String[] args)
	{
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		
		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value));
	}
	
	
	public static int abs(int i)
	{
		i = (i < 0) ? i*(-1) : i;
		
		return i;
	}

}
