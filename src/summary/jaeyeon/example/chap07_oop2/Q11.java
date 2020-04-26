package summary.jaeyeon.example.chap07_oop2;

public class Q11 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();

		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());

		t.setChannel(20);
		
		System.out.println("PrevCH : " + t.getPrevChannel());
		System.out.println("CH : " + t.getChannel());

		t.gotoPrevChannel();
		System.out.println("PrevCH : " + t.getPrevChannel());
		System.out.println("CH : " + t.getChannel());

		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
	}

}
