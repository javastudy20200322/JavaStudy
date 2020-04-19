package practice.week04.haesung;

public class Human
{
	String 	name;
	int 	year;
	int 	month;
	int 	day;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString()
	{
		return this.name + " " + this.day + " " + this.month + " " + this.year;
	}
	
	public static Human getYoungerHuman(Human h1, Human h2)
	{
		return getOlderHuman(h1, h2).equals(h1) ? h2 : h1;
	}
	
	public static Human getOlderHuman(Human h1, Human h2)
	{
		if(h1.getYear() < h2.getYear())
		{
			return h1;
		}
		else if(h1.getYear() == h2.getYear())
		{
			if(h1.getMonth() < h2.getMonth())
			{
				return h1;
			}
			else if(h1.getMonth() == h2.getMonth())
			{
				if(h1.getDay() < h2.getDay())
				{
					return h1;
				}
				else
				{
					return h2;
				}
			}
			else
			{
				
			}return h2;
		}
		else
		{
			return h2;
		}
	}
}
