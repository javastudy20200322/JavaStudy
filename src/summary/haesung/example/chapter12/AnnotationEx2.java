package summary.haesung.example.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101", hhmmss="235959"))
class AnnotationEx2 {
	public static void main(String args[]) {
		// AnnotaionEx5의 Class객체를 얻는다.
		Class<AnnotationEx2> cls = AnnotationEx2.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
      	System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());

		for(String str : anno.testTools())
			System.out.println("testTools="+str);

		System.out.println();
		
		// AnnotationEx5에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations();

		for(Annotation a : annoArr)
			System.out.println(a);
	} // main의 끝
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정 
@interface TestInfo {
	int       count()	    default 1;
	String    testedBy();
	String[]  testTools()   default "JUnit";
	TestType  testType()    default TestType.FIRST;
	DateTime  testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }
