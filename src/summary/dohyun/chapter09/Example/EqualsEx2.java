package summary.dohyun.chapter09.Example;
// == 주소값 비교 equals 값 비교 

class Person {
	long id;

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person) obj).id;
		} else {
			return false;
		}
	}

	public Person(long id) {
		this.id = id;
	}
}

public class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(801108111222L);
		Person p2 = new Person(801108111222L);

		if (p1 == p2) { //주소 값 비교
			System.out.println("same person");
		} else {
			System.out.println("different pERSON");
		}

		if (p1.equals(p2)) { // 값을 비교 
			System.out.println("p1 p2 same ");
		} else {
			System.out.println("p1 p2 different");
		}
	}
}