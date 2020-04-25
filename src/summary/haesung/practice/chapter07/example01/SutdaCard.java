package summary.haesung.practice.chapter07.example01;

public class SutdaCard
{
	// 값이 변경되면 안되므로 final
	final int 		NUM;		// 카드 번호
	final boolean 	IS_KWANG;	// 광 카드 여부
	
	// 기본 생성자.
	SutdaCard()
	{
		this(1, true);
	}

	// 매개변수로 int, boolean 값을 받는 생성자 오버로딩
	SutdaCard(int num, boolean isKwang)
	{
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	// SutdaCard 객체의 정보를 출력하는 매소드.
	public String toString()
	{
		return NUM + (IS_KWANG ? "K" : "");
	}
	
}
