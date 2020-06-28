package summary.jaeyeon.practiceA.chap15_IO_A;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("123.txt");

			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
