package summary.haesung.practice.chapter06.example01;

public class SutdaCard
{
	int 	num;
	boolean isKwang;
	
	/**
	 * 매개변수가 없는 생성자를 호출하면
	 * num = 1, isKwang = true 인 SutdaCard 객체가 생성된다.
	 */
	public SutdaCard()
	{
		this(1, true);
	}
	
	public SutdaCard(int num, boolean isKwang)
	{
		this.num 		= num;
		this.isKwang 	= isKwang;
	}
	
	public String info()
	{
		return num + (isKwang ? "K" : "");
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
