package summary.dohyun.chapter06.Example;

class Data3 {
	int x;
}
 
public class ReferenceReturnEx {
	
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x =10;
		
		Data3 d2 = copy(d); //static Data3 copy(Data3  d)
		//copy 메서드 내에서 생성한 객체를 사용할수 있으려면 , 이렇게 새로운 객체의 주소를 반환해줘야한다.
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		
		return tmp;
	}

}
