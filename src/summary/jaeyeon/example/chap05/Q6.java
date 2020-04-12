package summary.jaeyeon.example.chap05;

public class Q6 {
	public static void main(String[] args) {

		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		
		int [] coinUnit = {500,100,50,10};
		
		int money = 3710;
		int five_hundred = 0;
		int one_hundred = 0;
		int fifty = 0;
		int ten = 0;
		int change = 0;
		System.out.println("money = " + money);
		
		for(int i = 0 ; i< coinUnit.length;i++) {
			//System.out.println(coinUnit[i]);
			if(coinUnit[i] == 500) {
				change = money % coinUnit[i];
				five_hundred = money / coinUnit[i];
				money = change;
			}else if(coinUnit[i] == 100) {
				change = money % coinUnit[i];
				one_hundred = money / coinUnit[i];
				money = change;
			}else if(coinUnit[i] == 50) {
				change = money % coinUnit[i];
				fifty = money / coinUnit[i];
				money = change;
			}else {
				change = money % coinUnit[i];
				ten = money / coinUnit[i];
				money = change;
			}
			
		}
		System.out.println("500원 : " + five_hundred);
		System.out.println("100원 : " + one_hundred);
		System.out.println("50원 : " + fifty);
		System.out.println("10원 : " + ten);
	}
}
