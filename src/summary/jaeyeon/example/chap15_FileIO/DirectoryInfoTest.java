package summary.jaeyeon.example.chap15_FileIO;

import java.io.File;

class DirectoryInfoTest {

	static int totalFiles = 0;

	static int totalDirs = 0;

	static int totalSize = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 1) {
			System.out.println("USAGE : java DirectoryInfoTest DIRECTORY");
			System.exit(0);
		}

		File dir = new File(args[0]);

		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않는 디렉토리 입니다.");
			System.exit(0);
		}
		countFiles(dir);

	}

	public static void countFiles(File dir) {

		// 1. dir 의 파일목록(File[])을 가져온다.
		File[] files = dir.listFiles();
		for (int i = 0; i <= files.length; i++) {

			// 2. 가져온 파일목록의 파일 중에서 디렉토리면, totalDirs의 값을 증가시키고
			// countFiles()를 재귀호출한다.
			if (files[i].isDirectory()) {
				totalDirs++;
				countFiles(files[i]);

			} else {
				// 3. 파일이면 totalFiles를 증가시키고 파일의 크기를 totalSize에 더한다.
				totalFiles++;
				totalSize += files[i].length();

			}
		}
	}
}
