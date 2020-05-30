package summary.haesung.practice.chapter12;

public class Example01
{

	/**
	 * <pre>
	 * MethodName	: main
	 * Date 		: 2020. 5. 30.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: void
	 * 
	 * 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은? 경고가 발생하는 문장은?
	 * </pre>
	 */
	public static void main(String[] args)
	{
		// 지네릭 타입 T를 선언
		class Box<T> {
			T item;
			void setItem(T item) { this.item = item; }
			T getItem() { return item; }
		}
		
//		a. Box<Object> b = new Box<String>();
//		b. Box<Object> b = (Object)new Box<String>();
//		c. new Box<String>().setItem(new Object());
//		d. new Box<String>().setItem("ABC");
		
//		정답 : a,b,c
//		a -> 제네릭 타입이 다르다.
//		b -> 제네릭 타입이 다르다.
//		c -> Object는 String타입에 담을 수 없다.
	}

}
