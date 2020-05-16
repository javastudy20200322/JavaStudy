package summary.haesung.practice.chapter09.example01;

/**
 * <pre>
 * Date		: 2020. 5. 16.
 * Author 	: pureboyz
 * 
 * 다음과 같은 실행결과를 얻도록 SutdaCard클래스의 equals()를
 * 멤버변수인 num, isKwang의 값을 비교하도록 오버라이딩하고 테스트 하시오.
 * </pre>
 */
public class Example01
{

	public static void main(String[] args)
	{
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c1.equals(c2) : " + c1.equals(c2));
	}

}

class SutdaCard
{
	int 	num;
	boolean isKwang;
	
	SutdaCard()
	{
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang)
	{
		this.num 		= num;
		this.isKwang 	= isKwang;
	}
	
	// 매개변수로 넘겨진 객체의 num, isKwang과 멤버변수 num, isKwang을 비교하도록 오버라이딩 하시오.
	public boolean equals(Object obj)
	{
		boolean result = false;
		
		if(obj instanceof SutdaCard)
		{
			SutdaCard card = (SutdaCard) obj;
			if((card.num == this.num) && (card.isKwang == this.isKwang))
			{
				return true;
			}
		}
		
		return result;
	}
	
	public String toString()
	{
		return num + (isKwang ? "K" : "");
	}
}
