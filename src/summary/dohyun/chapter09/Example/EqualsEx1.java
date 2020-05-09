package summary.dohyun.chapter09.Example;

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(20);

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		} else
			System.out.println("v1과 v2는 다릅니다");		
		
		v2 = v1;   //v2도 v1과 같은 주소값이 저장된다. 
		
		if(v1.equals(v2)) {
			System.out.println("같습니다 v1과 v2");
		}else {
			System.out.println("다릅니다 v2 v1");
		}

	}
	
}

class Value {
	int value;

	public Value(int value) {
		this.value = value;
	}
}
