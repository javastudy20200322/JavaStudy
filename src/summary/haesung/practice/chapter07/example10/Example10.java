package summary.haesung.practice.chapter07.example10;

public class Example10
{

	public static void main(String[] args)
	{
		MyTv2 t = new MyTv2();

		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolumn(20);
		System.out.println("VOL : " + t.getVolume());
	}

}
