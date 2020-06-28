package summary.jaeyeon.practiceA.chap15_IO_B;

import java.io.IOException;
import java.io.PipedReader;
import java.io.StringWriter;

class PipedReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	InputThread inThread = new InputThread("InputThread");	
		
	}

}

class InputThread extends Thread{
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	InputThread(String name){
		super(name);
	}
	
	public void run() {
		
		try {
			int data = 0 ;
			while((data = input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(getName() + " received : " + sw.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}