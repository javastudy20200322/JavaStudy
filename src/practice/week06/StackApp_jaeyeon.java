package practice.week06;

import java.util.Scanner;

public class StackApp_jaeyeon implements Stack {
	
	//변수 선언
	private int num; // 저장 가능한 갯수
	private int set; // 저장 인덱스
	private String[] stack; // stack 배열

	
	//초기화
	public StackApp_jaeyeon(int num) {
		this.num = num;
		this.set = 0;
		stack = new String[num];
	}
	
	
	//Stack 인터페이스 메소드 구현하기
	@Override
	public int length() {
		return set;
	}//Stack에 저장된 항목의 갯수 반환

	@Override
	public int capacity() {
		return stack.length;
	}//Stack에 저장 가능한 항목의 갯수 반환

	@Override
	public String pop() {

		if (set - 1 < 0)	//stack 에 아무것도 넣지 않았을 때
			return null;
		set--;				//stack 한칸을 내려줌.(stack[set] 은 빈공간을 가리키고 있음)
		String s = stack[set]; // 맨위의 값

		return s;
	}//Stack 에서 항목을 꺼내고 이를 반환

	@Override
	public boolean push(String val) {

		if (set < num) {
			stack[set] = val;   // 맨위에 문자열을 넣어줌.
			set++;				// stack 한칸올려줌.
			return true;
		} else

			return false;
	}//Stack에 항목을  저장하고 성공적으로 저장하면 true를 , 실패하면 false 를 반환

	/*
	 * 일반적으로 Scanner 객체를 사용하여 값을 입력 받도록 함.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >>>");
		int num = sc.nextInt();
		
		//받은 값으로 초기화함.
		StackApp_jaeyeon sajy = new StackApp_jaeyeon(num);
		
		//서브로 입력가능 갯수를 세기 위해 임시변수 생성
		int cnt = num;
		while (true) {
			System.out.print("문자열 입력(종료는 0, 입력가능갯수 : " + cnt + " ) >>");
			String val = sc.next();
			cnt--;
			if (val.equals("0"))//어떤 경우에 종료할 수 있는지
				break;
			if (!sajy.push(val)) {
				System.out.println("스택이 가득 차서 푸시불가.");
			}

		}

		System.out.println("스택에 저장된 모든 문자열 : ");
		int len = sajy.length();
		for (int i = 0; i < len; i++) {
			String s = sajy.pop();
			System.out.print(s + " ");
		}
		sc.close();
	}

}
