package summary.jaeyeon.practiceA.chap12_Anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class AnnotationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<AnnotationEx5> cls = AnnotationEx5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
	
		System.out.println("anno.testedBy() = " + anno.testedBy());
	}

}

@Retention(RetentionPolicy.RUNTIME) // 실행시에 사용가능하도록 저장.
@interface TestInfo {
	int count() default 1;

	String testedBy();

	String[] testTools() default "JUnit";

	TestType testType() default TestType.FIRST;

	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) // 실행시에 사용가능하도록 저장.
@interface DateTime {
	String yymmdd();

	String hhmmss();
}

enum TestType {
	FIRST, FINAL
}