package summary.jaeyeon.example.chap15_FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

class Hexaviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 1) {
			System.out.println("USAGE : java HexaViewer FILENAME");
			System.exit(0);

		}

		String inputFile = args[0];

		try {
			FileInputStream input = new FileInputStream(inputFile);
			PrintStream output = new PrintStream(System.out);
			int data = 0;
			int i = 0;

			while ((data = input.read()) != -1) {
				output.printf("%02x ", data);
				if (++i % 16 == 0) {
					output.println();

				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
