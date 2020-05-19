package summary.jaeyeon.practiceA.chap07_interface2;
class A{
	void autoPlay(I i) {
		i.play();
	}
}


interface I{
	public abstract void play();
}

class B implements I {
	public void play() {
		System.out.println("Play in B class");
	}
	public String toSTring() {
		return "class B";
	}
}

class C implements I {
	public void play() {
		System.out.println("Play in C class");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {

		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
		
		
	}

}
