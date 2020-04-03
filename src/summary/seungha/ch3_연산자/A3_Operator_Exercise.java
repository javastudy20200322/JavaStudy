/*
 * Chapter3. Operator
 * Answer about Exercise
 * 2020. 04. 03
 * written by LSH
 */
 
class A3_Operator_Exercise {
	public static void main(String[] args) {
	
		/* Exercise 3_1. 다음 연산의 결과를 적으시오 */
		int x = 2;
		int y = 5;
		char c = 'A';	// 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);			// 1+x=1+2=3, 3은 2진수로 11
													// 33=32*1+1 에서 왼쪽 시프트 1만큼 처리
													// 1*2^2 + 1*2^1 = 6
		System.out.println(y>=5 || x<0 && x>2);		// true || false 에서, true
		System.out.println(y += 10 - x++);			// 10에서 2(이후 1 더함)를 뺀 후 y 값인 5에 더하므로 13 
		System.out.println(x += 2);					// 위에서 x는 1이 더해진 상태이므로 3+2 = 5
		System.out.println(!('A'<=c && c<='Z'));	// !(true)이므로 false
		System.out.println('C'-c);					// 2
		System.out.println('5'-'0');				// 5
		System.out.println(c+1);					// 66 int형 출력
		System.out.println(++c);					// 67 char형 출력 : 'B'
		System.out.println(c++);					// 67 char형 출력되고 그 후에 1 더해짐 : 'B'
		System.out.println(c);						// 68 char형 출력 : 'C'
	}
}