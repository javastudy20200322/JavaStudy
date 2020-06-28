package summary.jaeyeon.practiceA.chap15_IO_B;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[1]);

			int data = 0;

			while ((data = fr.read()) != -1) {
				if (data != '\t' && data != '\n' && data != ' ' && data != '\r') {
					fw.write(data);
				}
			}
			fr.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
