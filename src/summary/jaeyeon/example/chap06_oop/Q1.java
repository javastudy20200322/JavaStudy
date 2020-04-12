package summary.jaeyeon.example.chap06_oop;
class SutdaCard{
	
	int num;
	boolean isKwang;
	
	String info() {
		if(isKwang) {
			return num + "K";
			
		}
		else {
			return num + "";
		}
		
	}
	
	SutdaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	
	
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
