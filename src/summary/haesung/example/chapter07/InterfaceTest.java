package summary.haesung.example.chapter07;


class A
{
	// I를 상속받은 클래스들을 매개변수로 사용할 수 있다.
	public void autoPlay(I i)
	{
		i.play();
	}
}

interface I
{
	public abstract void play();
}

class B implements I
{
	public void play()
	{
		System.out.println("Play in B class");
	}
}

class C implements I
{
	public void play()
	{
		System.out.println("Play in C class");
	}
}


public class InterfaceTest
{

	public static void main(String[] args)
	{
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
	}

}
