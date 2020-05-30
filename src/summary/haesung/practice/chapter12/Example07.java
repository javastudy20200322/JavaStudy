package summary.haesung.practice.chapter12;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * 애너테이션 TestInfo가 다음과 같이 정의되어 있을 대, 이 애너테이션이 올바르게 적용되지 않은 것은?
 * </pre>
 */
public class Example07
{

	public static void main(String[] args)
	{
//		@interface TestInfo
//		{
//			int count() default 1;
//			String[] value() default "aaa";
//		}
		
//		a. @TestInfo class Exercise12_7 {}
//		b. @TestInfo(1) class Exercise12_7 {}
//		c. @TestInfo("bbb") class Exercise12_7 {}
//		d. @TestInfo("bbb","ccc") class Exercise12_7 {}
		
//		정답 : b, d
//		b -> 요소의 이름이 생략되어 1은 value요소의 값이 되는데 문자열타입이 아니다.
//		d -> 값을 여러개 지정할 때에는 배열을 사용해야한다.
	}

}
