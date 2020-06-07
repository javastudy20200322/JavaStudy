package summary.jaeyeon.example.chap12_GEA;

public class Ch12_MultipleChoice {
	
	//12-1 오류가 발생하는 문장은? 경고가 발생하는 문장은?
	class Box<T> { 
		T item;
		
		void setItem(T item) {this.item = item;}
		T getItem() { return item;}
			
	}

	void test() {
		Box<Object> b = new Box<Object>();
		Box<Object> c = new Box<Object>();
		new Box<String>().setItem("ABC");
		//new Box<String>().setItem(new Object());
	}
	
	
	
	/*12-2 지네릭 메서드 makeJuice() 가 아래와 같이 정의되어 있을 때,
	*이 메서드를 올바르게 호출한 문장을 모두 고르시오
	*(Apple 과 Grape 는 Fruit 의 자손이라고 가정하자)
	*/
	


	
	/* a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
	 * b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
	 * c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
	 * d. Juicer.makeJuice(new FruitBox<Apple>());
	 * e. Juicer.makeJuice(new FruitBox<Object>());
	 */
	
	/*
	 * 12-3 다음 중 올바르지 않은 문장을 모두 고르시오.
	 */
	
	
	/*
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	//메타 애너테이션은 '애너테이션을 위한 애너테이션', 즉 애너테이션에 붙이는 애너테이션
	//애너테이션을 정의할 때 애너테이션의 적용대상(target) 이나 유지기간(retention) 을 지정하는데 사용된다.
	/*
	 * 12-6 다음 중 메타 애너테이션이 아닌 것을 모두 고르시오.
	 * a. Documented
	 * b. Target
	 * c. Native   :  표준 애너테이션
	 * d. Inherited
	 * 
	 */
}

