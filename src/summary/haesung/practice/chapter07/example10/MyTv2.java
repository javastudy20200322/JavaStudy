package summary.haesung.practice.chapter07.example10;

public class MyTv2
{
	// 값이 변경될 수 있는 멤버변수
	boolean isPowerOn;
	int 	channel;
	int 	volume;
	
	// static이 붙은 변수는 값의 변경이 불가하고, 아무데서나 호출가능하다.
	// final이 붙은 변수는 값의 변경이 불가하고, 상속과 오버라이딩이 불가하다.
	final int MAX_VOLUME 	= 100;
	final int MIN_VOLUME 	= 0;
	final int MAX_CHANNEL 	= 100;
	final int MIN_CHANNEL 	= 1;
	
	// 이전채널을 저장하는 변수
	int prevChannel = 0;
	
	
	public void setVolumn(int volume)
	{
		this.volume = volume;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setChannel(int channel)
	{
		this.prevChannel 	= this.channel;
		this.channel 		= channel;
	}
	
	public int getChannel()
	{
		return channel;
	}
	
	public void gotoPrevChannel()
	{
		int temp = this.channel;
		this.channel = this.prevChannel;
		this.prevChannel = temp;
	}
}
