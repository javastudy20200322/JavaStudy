package summary.jaeyeon.practiceA.chap15_IO_A;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

class DataOutputStreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] score = {100,90,95,85,50};
		

		try {
			FileOutputStream fos = new FileOutputStream("score_jaeyeon.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			
			for(int i = 0 ; i< score.length ; i++) {
				dos.writeInt(score[i]);
			}
			
			dos.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
