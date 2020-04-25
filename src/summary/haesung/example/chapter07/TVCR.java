package summary.haesung.example.chapter07;


class VCR
{
	boolean power;
	int 	counter = 0;
	
	void power() { power = !power; }
	void play() {  }
	void stop() {  }
	void rew() {  }
	void ff() {  }
}

// Tv클래스를 조상으로 하고, VCR클래스를 포함시켜 사용.
public class TVCR extends Tv
{
	VCR vcr 	= new VCR();
	int counter = vcr.counter;
	
	void play()
	{
		vcr.play();
	}
	
	void stop()
	{
		vcr.stop();
	}
	
	void rew()
	{
		vcr.rew();
	}
	
	void ff()
	{
		vcr.ff();
	}
}
