package summary.haesung.example.chapter07;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx
{

	public static void main(String[] args)
	{
		// static import를 선언하면 아래처럼 사용할 수 있다.
		out.println(random());
		
		out.println("Math.PI : " + PI);
	}

}
