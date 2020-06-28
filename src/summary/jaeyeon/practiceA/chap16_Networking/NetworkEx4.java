package summary.jaeyeon.practiceA.chap16_Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

class NetworkEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url = null;
		BufferedReader input = null;
		String address = "http://www.codechobo.com/main";
		String line = "";

		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = input.readLine()) != null) {

				System.out.println(line);

			}
			input.close();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
