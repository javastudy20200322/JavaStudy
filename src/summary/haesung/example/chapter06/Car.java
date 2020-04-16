package summary.haesung.example.chapter06;

public class Car
{
	String 	color;
	String 	gearType;
	int 	door;
	
	Car()
	{
		this("white", "auto", 4);
//		Car("white", "auto", 4);	// 생성자가 아닌 Car메소드를 호출한다.
	}
	
	Car(String color)
	{
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door)
	{
		this.color 		= color;
		this.gearType 	= gearType;
		this.door 		= door;
	}
	
	// 인스턴스의 복사를 위한 생성자.
	Car(Car c)
	{
		color 		= c.color;
		gearType 	= c.gearType;
		door 		= c.door;
	}

	public static void main(String[] args)
	{
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car(c1);	// c1의 복사본 c3를 생성한다.
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		System.out.println("c3의 color = " + c3.color + ", gearType = " + c3.gearType + ", door = " + c3.door);
		
		c1.door = 100;
		
		// c1의 door를 변경해도 c3의 door가 변하지 않는다. (복사만 했을뿐 같은 객체가 아니다.)
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		System.out.println("c3의 color = " + c3.color + ", gearType = " + c3.gearType + ", door = " + c3.door);
	}

}
