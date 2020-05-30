package summary.haesung.example.chapter12;

enum Direction
{
//	EAST, SOUTH, WEST, NORTH
	
	// 상수의 값은 괄호안에 적어주고, 생성자를 추가한다.
	EAST(1), SOUTH(5), WEST(-1), NORTH(10);
	
	private final int value;
	
	Direction(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
}

public class EnumEx1
{

	public static void main(String[] args)
	{
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println();
		
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d3));
		System.out.println(d1.compareTo(d2));	// ordinal(열거된 상수가 정의된 순서) 값의 차이?
		System.out.println(d1.compareTo(d3));
		
		switch(d1)
		{
			case EAST:
				System.out.println("The Direction is EAST.");
				break;
			case SOUTH:
				System.out.println("The Direction is SOUTH.");
				break;
			case WEST:
				System.out.println("The Direction is WEST.");
				break;
			case NORTH:
				System.out.println("The Direction is NORTH.");
				break;
		}
		
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr)
		{
			System.out.println(d.name() + " " + d.ordinal());
		}
	}

}
