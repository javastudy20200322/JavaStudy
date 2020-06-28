package summary.jaeyeon.practiceA.chap15_IO_A;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);

			int data = 0;

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
