package summary.seungha.Ch14_Exercise;

/* [문제] 메서드를 람다식으로 변환하여 아래의 표를 완성하시오. */
public class Exercise14_1 {

	int max(int a, int b) {
		return a > b ? a : b;
	}
	/*
	(int a, int b) -> a > b ? a : b
	*/
	
	void printVar(String name, int i) {
		System.out.println(name+"="+i);
	}
	/*
	(String name, int i) -> 
	System.out.println(name+"="+i)
	 */
	
	int square(int x) {
		return x*x;
	}
	/*
	 (int x) -> x*x
	 */
	
	int roll() {
		return (int)(Math.random() * 6);
	}
	/*
	() -> (int)(Math.random() * 6)
	 */
	
	int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr) 
			sum += i;
		return sum;
	}
	/*
	(int[] arr) -> { 
    int sum = 0;
    for(int i : arr)
        sum += i;
    return sum;
 	}
	 */
	
	int[] emptyArr() {
		return new int[] {};
	}
	/*
	() -> new int[]{}
	 */
}
