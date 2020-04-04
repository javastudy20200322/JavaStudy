package summary.haesung.example.chapter02;

public class VarEx1
{

	public static void main(String[] args)
	{
		// 변수를 선언한 뒤 초기화
		int year;
	 	year = 0;
	 	
	 	// 변수를 선언하면서 동시에 초기화
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		// age의 값을 읽어와서 2000을 더한 값을 year에 저장
		year 	= age + 2000;
		age 	= age + 1;
		
		System.out.println(year);
		System.out.println(age);
		
//		// 변수 선언
//		int birthday;
//		
//		// 초기화를 하지 않은 변수 읽기
//		System.out.println(birthday);
	}

}
