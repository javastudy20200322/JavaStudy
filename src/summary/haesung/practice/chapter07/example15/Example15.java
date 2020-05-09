package summary.haesung.practice.chapter07.example15;

public class Example15
{

	public static void main(String[] args)
	{
		example15();
		example16();
	}
	
	static void example15()
	{
//		클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
		
//		class Unit {}
//		class AirUnit extends Unit {}
//		class GroundUnit extends Unit {}
//		class Tank extends GroundUnit {}
//		class AirCraft extends AirUnit {}
//		
//		Unit u = new GroundUnit();
//		Tank t = new Tank();
//		AirCraft ac = new AirCraft();
		
//		a. u = (Unit)ac;
//		b. u = ac;
//		c. GroundUnit gu = (GroundUnit)u;
//		d. AirUnit au = ac;
//		e. t = (Tank)u;
//		f. GroundUnit gu = t;
		
//		정답 : e
//		Unit타입의 인스턴스를 자손클래스인 Tank타입의 인스턴스로 형변환은 할 수 없다.
//		c는 u가 참조하는 객체가  GroundUnit이므로 가능하다.
	}
	
	static void example16()
	{
//		다음 중 연산결과가 true가 아닌 것은?
		
//		class Car {}
//		class FireEngine extends Car implements Movable {}
//		class Ambulance extends Car {}
//		
//		FireEngine fe = new FireEngine();
		
//		a. fe instanceof FireEngine
//		b. fe instanceof Movable
//		c. fe instanceof Object
//		d. fe instanceof Car
//		e. fe instanceof Ambulance
		
//		정답 : e
	}
	
	

}
