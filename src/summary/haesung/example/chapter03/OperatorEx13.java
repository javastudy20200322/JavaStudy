package summary.haesung.example.chapter03;

public class OperatorEx13
{
	public static void main(String[] args)
	{
		int hex 	= 0xABCD;
		int mask 	= 0xF;
		
		System.out.println("hex : " + (hex & mask));
		
		hex = hex >> 4;
		
		System.out.println("hex : " + (hex & mask));
		
		hex = hex >> 4;
		
		System.out.println("hex : " + (hex & mask));
		
		hex = hex >> 4;
		
		System.out.println("hex : " + (hex & mask));
	}
}
