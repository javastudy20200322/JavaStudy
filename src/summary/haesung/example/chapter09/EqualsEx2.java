package summary.haesung.example.chapter09;

public class EqualsEx2
{

	public static void main(String[] args)
	{
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1 == p2)
		{
			System.out.println("p1과 p2는 같은 사람입니다.");
		}
		else
		{
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if(p1.equals(p2))
		{
			System.out.println("p1과 p2는 같은 사람입니다.");
		}
		else
		{
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}

}

class Person
{
	long id;
	
	Person(long id)
	{
		this.id = id;
	}
	
	// 두 객체가 참조하는 인스턴스의 주소를 비교하는 것이 아닌 객체의 내용을 비교한다.
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			return id == ((Person) obj).id;
		}
		else
		{
			return false;
		}
	}
}
