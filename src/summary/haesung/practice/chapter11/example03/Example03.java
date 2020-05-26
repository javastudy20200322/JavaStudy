package summary.haesung.practice.chapter11.example03;

/**
 * <pre>
 * Date		: 2020. 5. 23.
 * Author 	: pureboyz
 * 
 * 다음 중 ArrayList에서 제일 비용이 많이 드는 작업은?
 * 단, 작업도중에 ArrayList의 크기 변경이 발생하지 않는다고 가정한다.
 * 
 * a. 첫 번째 요소 삭제
 * b. 마지막 요소 삭제
 * c. 마지막에 새로운 요소 추가
 * d. 중간에 새로운 요소 추가
 * </pre>
 */
public class Example03
{

	public static void main(String[] args)
	{
		// 정답 : a
		// a : ArrayList의 길이 - 1 만큼의 요소가 영향을 받음
		// b : 마지막 요소 하나만 영향을 받음
		// c : 추가된 요소 하나만 영향을 받음
		// d : 새로운 요소가 추가된 index부터 마지막 index의 요소까지 영향을 받음
		
		// 크기변경이 제일 비용이 많이 든다.
	}

}
