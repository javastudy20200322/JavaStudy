package summary.haesung.example.chapter02;

public class PrintfEx1
{

	public static void main(String[] args)
	{
		int age 	= 14;
		int year 	= 2017;
		
		// 지시자의 수와 변수의 수가 일치해야한다.
		// 변수 age와 year가 지시자에 순서대로 대입된다.
		System.out.printf("age:%d year:%d%n", age, year);
		
		int finger = 10;
		System.out.printf("finger = [%5d]%n", finger);	// 5자리의 공간확보.
		System.out.printf("finger = [%05d]%n", finger);	// 빈 공간을 0으로 채움.
		
		double d = 1.23456789;
		// 14자리의 공간 중 10자리는 소수점이하에 할당.
		// 정수부분의 빈자리는 공백으로 채우고, 소수점 이하는 0으로 채운다.
		System.out.printf("d=%14.10f%n", d);
	}

}
