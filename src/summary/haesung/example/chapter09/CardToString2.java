package summary.haesung.example.chapter09;

public class CardToString2
{

	public static void main(String[] args)
	{
		Card_ c1 = new Card_();
		Card_ c2 = new Card_();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		// Cloneable을 구현하지 않은 클래스에서 사용하면 어떻게 되는지 확인..
//		Card_ c3 = null;
//		try
//		{
//			c3 = (Card_) c1.clone();
//		}
//		catch (CloneNotSupportedException e)
//		{
//			e.printStackTrace();
//		}
//		
//		System.out.println(c3);
//		System.out.println(c3.equals(c1));
	}

}

class Card_
{
	String 	kind;
	int 	number;
	
	Card_()
	{
		this("SPADE", 1);
	}
	
	Card_(String kind, int number)
	{
		this.kind 	= kind;
		this.number = number;
	}
	
	public String toString()
	{
		return "kind : " + kind + ", number : " + number;
	}
	
	// Cloneable을 구현하지 않은 클래스에서 사용하면 어떻게 되는지 확인..
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
}
