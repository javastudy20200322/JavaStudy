package summary.haesung.example.chapter09;

public class EqualsEx1
{

	public static void main(String[] args)
	{
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		// equals는 같은 객체이면 true를 다른 객체이면 false를 반환한다.
		if(v1.equals(v2))
		{
			System.out.println("v1과 v2는 같습니다.");
		}
		else
		{
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		// v1객체를 v2변수에 저장.
		// 두 객체가 참조하는 인스턴스의 주소가 같아진다.
		v2 = v1;
		
		// 같은 인스턴스의 주소를 참조하므로 true
		if(v1.equals(v2))
		{
			System.out.println("v1과 v2는 같습니다.");
		}
		else
		{
			System.out.println("v1과 v2는 다릅니다.");
		}
	}

}

class Value
{
	int value;
	
	Value(int value)
	{
		this.value = value;
	}
}
