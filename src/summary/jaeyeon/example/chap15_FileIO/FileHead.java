package summary.jaeyeon.example.chap15_FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int lineNum = Integer.parseInt(args[0]);
			String fileName = args[1];

			File f = new File(fileName);

			if (f.exists() & !f.isDirectory()) {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				String line = "";
				int i = 1;
				while ((line = br.readLine()) != null && i <= lineNum) {
					System.out.println(i + " : " + line);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "은/는 디렉토리이거나 , 존재하지 않는 파일입니다.");

			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("USAGE : java FileHead 10 FILENAME");
		}

	}
}
