package summary.jaeyeon.practiceA.chap15_IO_A;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("sample_jaeyeon.dat");
			dos = new DataOutputStream(fos);

			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);

			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
