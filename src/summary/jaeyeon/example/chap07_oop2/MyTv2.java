package summary.jaeyeon.example.chap07_oop2;

/*Q10
 * 멤버변수 isPowerOn , channel , volume 을
 * 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
 * 대신 이 멤버들을 어디서나 읽고 변경할 수 있도록 getter & setter 메서드를 추가하라.
 * 
 * Q11 이전 채널(previous channel) 로 이동하는 기능의
 * 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오
 * 
 */
public class MyTv2 {
	/*
	 * boolean isPowerOn; int channel; int volume;
	 */
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		
		//this.prevChannel = getChannel();
		prevChannel = this.channel; // 현재채널을 이전채널에 저장한다.
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	
	public int getPrevChannel() {
		return prevChannel;
	}

	public void setPrevChannel(int prevChannel) {
		this.prevChannel = prevChannel;
	}

	public void gotoPrevChannel(){
		//this.setChannel(getPrevChannel());
		setChannel(prevChannel);		//현재채널을 이전 채널로 변경한다.
	}
	

}
