package summary.haesung.example.chapter09;

public class StringEx3
{

	public static void main(String[] args) throws Exception
	{
		int 	iVal 	= 100;
		String 	strVal1 = String.valueOf(iVal);
		
		double 	dVal 	= 200.0;
		String 	strVal2 = dVal + "";
		
		// "+"는 부호를 나타낸다.
		double sum1 = Integer.parseInt("+" + strVal1) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal1) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",  strVal1, "+", strVal2, "=") + sum1);
		System.out.println(strVal1 + "+" + strVal2 + "=" + sum2);
		
	}

}
