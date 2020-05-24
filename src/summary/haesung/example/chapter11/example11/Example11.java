package summary.haesung.example.chapter11.example11;

import java.util.HashSet;

/**
 * <pre>
 * Date		: 2020. 5. 23.
 * Author 	: pureboyz
 * 
 * 다음은 SutdaCard클래스를 HashSet에 저장하고 출력하는 예제이다.
 * HashSet에 중복된 카드가 저장되지 않도록 SutdaCard의 hashCode()를 알맞게 오버라이딩하시오.
 * 
 * [Hint] String클래스의 hashCode()를 사용하라.
 * </pre>
 */
public class Example11
{

	public static void main(String[] args)
	{
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		SutdaCard c3 = new SutdaCard(1,true);
		
		HashSet set = new HashSet();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
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
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// String클래스의 hashCode()를 사용하라.
	public int hashCode()
	{
		return toString().hashCode();
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof SutdaCard)
		{
			SutdaCard c = (SutdaCard)obj;
			return num==c.num && isKwang==c.isKwang;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return num + ( isKwang ? "K":"");
	}
}
