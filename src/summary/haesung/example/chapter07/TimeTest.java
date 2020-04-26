package summary.haesung.example.chapter07;

class Time
{
	private int hour, minute, second;
	
	Time(int hour, int minute, int second)
	{
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setMinute(int minute)
	{
		this.minute = minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public void setSecond(int second)
	{
		this.second = second;
	}
	
	public String toString()
	{
		return hour + ":" + minute + ":" + second;
	}
}

public class TimeTest
{
	public static void main(String[] args)
	{
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		
//		t.hour = 13;	// private 제어자가 붙은 변수는 해당 클래스 내에서만 접근할 수 있다.
		
		t.setHour(t.getHour() + 1);
		System.out.println(t);
	}
}
