package summary.haesung.practice.chapter07.example05;

/**
 *
 * Date		: 2020. 2. 29.
 * Author	: pureboyz
 *
 * 조상클래스인 Product를 상속 받은 자손클래스
 * 
 */
public class Tv extends Product
{
	// Tv(){ super(); }와 동일하다.
	// super(); -> product()를 호출하여 조상클래스의 인스턴스 변수들을 초기화한다.
	Tv(){}
	
	public String toString()
	{
		return "Tv";
	}
}
