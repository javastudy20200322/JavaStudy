package summary.haesung.example.chapter12;

enum Direction_
{
	EAST(1, ">"), SOUTH(5, "v"), WEST(-1, "<"), NORTH(10, "^");
	
	private static final Direction_[] DIR_ARR = Direction_.values();
	
	private final int 		value;
	private final String 	symbol;
	
	Direction_(int value, String symbol)
	{
		this.value 	= value;
		this.symbol = symbol;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public String getSymbol()
	{
		return this.symbol;
	}
	
	public static Direction_ of(int dir)
	{
		// 1~4 이외의 숫자면 예외발생
		if(dir < 1 || dir > 4)
		{
			throw new IllegalArgumentException("Invalid value : " + dir);
		}
		
		return DIR_ARR[dir - 1];
	}
	
	public Direction_ rotate(int num)
	{
		num = num % 4;
		
		if(num < 0)
		{
			num += 4;
		}
		
		return DIR_ARR[(value-1+num) % 4];
	}
	
	public String toString()
	{
		return name() + getSymbol();
	}
}

public class EnumEx2
{

	public static void main(String[] args)
	{
		for(Direction_ d : Direction_.values())
		{
			System.out.println(d.name() + " " + d.getValue());
		}
		
		Direction_ d1 = Direction_.EAST;
		Direction_ d2 = Direction_.of(1);
		
		System.out.println(d1.name() + " " + d1.getValue());
		System.out.println(d2.name() + " " + d2.getValue());
		
		System.out.println(Direction_.EAST.rotate(1));
		System.out.println(Direction_.EAST.rotate(2));
		System.out.println(Direction_.EAST.rotate(-1));
		System.out.println(Direction_.EAST.rotate(-2));
	}

}
