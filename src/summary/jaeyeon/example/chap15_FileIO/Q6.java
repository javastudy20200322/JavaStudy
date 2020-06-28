package summary.jaeyeon.example.chap15_FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q6 {
	static String[] argArr;
	static File curDir;

	static {
		try {
			curDir = new File(System.getProperty("user.dir"));

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {

			try {
				String prompt = curDir.getCanonicalPath() + ">>";
				System.out.print(prompt);

				String input = s.nextLine();

				input = input.trim();
				argArr = input.split(" +");

				String command = argArr[0].trim();

				if ("".equals(command)) {
					continue;
				}

				command = command.toLowerCase();

				if (command.equals("q")) {
					System.exit(0);
				} else if (command.equals("q")) {
					cd();
				} else {
					for (int i = 0; i < argArr.length; i++) {
						System.out.println(argArr[i]);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void cd() {
		if (argArr.length == 1) {
			System.out.println(curDir);
			return;
		} else if (argArr.length > 2) {
			System.out.println("USAGE : java Q5 TARGET_FILE RESULT_FILE");
			return;
		}
		
		String subDir = argArr[1];
		
		
		
	}
}
