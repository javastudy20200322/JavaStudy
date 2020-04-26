package summary.haesung.example.chapter07;


class Car
{
	String 	color;
	int 	door;
	
	void drive()
	{
		System.out.println("drive, Brrrr~");
	}
	
	void Stop()
	{
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car
{
	void water()
	{
		System.out.println("water!!!");
	}
}


public class CastingTest
{

	public static void main(String[] args)
	{
		Car 		car 	= null;
		Car 		car2 	= new Car();
		FireEngine 	fe 		= new FireEngine();
		FireEngine 	fe2 	= null;
		
		fe.water();
		
		car = fe;
//		car.water(); 	// Car타입의 참조변수는 water()를 사용할 수 없다.
		
		// car는 null이고, car2는 Car타입.
		// null인 fe2에 FireEngine타입 car를 저장 후에는 Car타입의 인스턴스를 참조할 수 없다.
		fe2 = (FireEngine)car; 	// fe2는 FireEngine타입이므로 water()를 사용할 수 있다.
		fe2 = (FireEngine)car2; // 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는것은 허용되지 않는다.
		fe2.water();
	}

}
