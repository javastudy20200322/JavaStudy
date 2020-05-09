package summary.haesung.practice.chapter07.example22;

/**
 *
 * Date		: 2020. 3. 1.
 * Author	: pureboyz
 *
 * abstract : 추상화
 * 
 */
public abstract class Shape
{
	Point p;
	
	Shape()
	{
		this(new Point(0, 0));
	}
	
	Shape(Point p)
	{
		this.p = p;
	}
	
	// 도형의 면적을 계산해서 반환하는 메서드
	/**
	 *
	 * MethodName	: calcArea
	 * Date			: 2020. 3. 1.
	 * Author		: pureboyz
	 * 
	 * ParamsType	: 
	 * ReturnType	: double
	 *
	 * 추상화메소드.
	 * Shape 클래스를 상속받으면 해당 메소드를 반드시 오버라이딩 해야한다.
	 * 
	 */
	abstract double calcArea();
	
	Point getPosition()
	{
			return p;
	}
	
	void setPosition(Point p)
	{
		this.p = p;
	}
}
