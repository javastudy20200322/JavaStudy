package summary.jaeyeon.practiceA.chap15_IO_A;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class DataInputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int score = 0;

		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("score_jaeyeon.dat");
			dis = new DataInputStream(fis);

			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("점수의 총합은 "+ sum + "입니다. ");
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			ie.printStackTrace();
		} finally {
			try {
				if (dis != null) {
					dis.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
