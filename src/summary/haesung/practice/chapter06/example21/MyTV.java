package summary.haesung.practice.chapter06.example21;

public class MyTV
{
	boolean isPowerOn;
	int 	channel;
	int 	volume;
	
	final int MAX_VOLUME 	= 100;
	final int MIN_VOLUME 	= 0;
	final int MAX_CHANNEL 	= 100;
	final int MIN_CHANNEL 	= 1;
	
	void turnOff()
	{
		this.isPowerOn = this.isPowerOn ? false : true;
	}
	
	void volumeUp()
	{
		this.volume = (this.volume < MAX_VOLUME) ? this.volume + 1 : this.volume;
	}
	
	void volumeDown()
	{
		this.volume = (MIN_VOLUME < this.volume) ? this.volume - 1 : this.volume;
	}
	
	void channelUp()
	{
		this.channel = (this.channel < MAX_CHANNEL) ? this.channel + 1 : MIN_CHANNEL;
	}
	
	void channelDown()
	{
		this.channel = (MIN_CHANNEL < this.channel) ? this.channel - 1 : MAX_CHANNEL;
	}
	
	
	
	public static void main(String[] args)
	{
		MyTV tv = new MyTV();
		
		tv.channel 	= 100;
		tv.volume 	= 0;
		System.out.println("CH : " + tv.channel + ", VOL : " + tv.volume);
		
		tv.channelDown();
		tv.volumeDown();
		System.out.println("CH : " + tv.channel + ", VOL : " + tv.volume);
		
		tv.volume = 100;
		tv.channelUp();
		tv.volumeUp();
		System.out.println("CH : " + tv.channel + ", VOL : " + tv.volume);
	}
}
