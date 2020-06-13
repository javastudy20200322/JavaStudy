package summary.haesung.example.chapter14;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2
{

	public static void main(String[] args)
	{
		File[] fileArr = {
				 new File("Ex1.java")
				,new File("Ex1.bak")
				,new File("Ex2.java")
				,new File("Ex1")
				,new File("Ex1.txt")
		};
		
		Stream<File> 	fileStream 		= Stream.of(fileArr);
		Stream<String> 	filenameStream 	= fileStream.map(File::getName);
		
		filenameStream.forEach(System.out::println);
		
		// 스트림은 일회용이기 때문에 다시 생성.
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
			.filter(s -> s.indexOf('.') != -1)			// 확장자가 없는 것은 제외
			.map(s -> s.substring(s.indexOf('.')+1))	// 확장자만 가져옴
			.map(String::toUpperCase)					// 대문자로 변경
			.distinct()									// 중복제거
			.forEach(System.out::println);				// 출력
	}

}
