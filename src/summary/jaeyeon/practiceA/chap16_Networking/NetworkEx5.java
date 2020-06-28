package summary.jaeyeon.practiceA.chap16_Networking;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

class NetworkEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url = null;

		InputStream in = null;
		FileOutputStream out = null;

		String address = "http://www.codechobo.com/book/src/javajunnsuk3_src.zip";

		int ch = 0;

		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("javajungsuk3_src.zip");

			while ((ch = in.read()) != -1) {
				out.write(ch);
			}

			in.close();
			out.close();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
