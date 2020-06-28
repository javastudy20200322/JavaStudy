package summary.jaeyeon.practiceA.chap15_IO_B;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String fileName = "test.txt";
			
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			while((data=fr.read()) != -1){
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
