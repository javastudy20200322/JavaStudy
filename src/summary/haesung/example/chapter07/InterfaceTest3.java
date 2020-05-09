package summary.haesung.example.chapter07;


class A_
{
	void methodA()
	{
		// getInstance가 반환하는 인스턴스만 변경하면 참조할 인스턴스를 쉽게 바꿀 수 있다.
		I_ i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I_
{
	public abstract void methodB();
}

class B_ implements I_
{
	public void methodB()
	{
		System.out.println("methodB in B class");
	}
	
	public String toString()
	{
		return "class B";
	}
}

class C_ implements I_
{
	public void methodB()
	{
		System.out.println("methodB in C class");
	}
	
	public String toString()
	{
		return "class C";
	}
}

class InstanceManager
{
	public static I_ getInstance()
	{
		return new C_();
	}
}


public class InterfaceTest3
{

	public static void main(String[] args)
	{
		A_ a = new A_();
		a.methodA();
	}

}
