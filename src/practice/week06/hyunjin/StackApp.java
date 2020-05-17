package practice.week06.hyunjin;
import java.util.Scanner;


interface Stack {
	int length();						// Stack에 저장된 항목의 개수 반환
	int capacity();						// Stack에 저장 가능한 항목의 개수 반환
	String pop();						// Stack에서 항목을 꺼내고 이를 반환
	boolean push(String str);			// Stack에 항목을 저장하고 성공적으로 저장하면 true를, 실패하면 false를 반환
}

class StringStack implements Stack{
	int size;
	String[] str;
	
	StringStack(){
		this(0);
	}
	
	StringStack(int size){
		this.size = size;
		str = new String[size];
	}
		
	@Override
	public int length() {		
		return size;
	}

	@Override
	public int capacity() {
		return str.length - size;
	}

	@Override
	public String pop() {
		System.out.print("스택에 저장된 모든 문자열 출력 : ");
		return str[--size];
	}

	@Override
	public boolean push(String st) {
		if("0".equals(str)) {
			System.exit(0);
			pop();
			return true;
		}else {
			boolean result = false;
			try {
				str[size] = st;
				return result=true;
			} catch(IndexOutOfBoundsException e) {							// [조건] IndexOutOfBoundsException 예외를 처리하는 try-catch문을 포함하시오.
				System.out.println("Stack이 가득 차서 넣을 수 없습니다.");
				return result;
			} catch(Exception e) {
				System.out.println("Stack에 값을 넣을 수 없습니다.");
				return result;
			}
		}
	}
	
}

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >>");

		int size = sc.nextInt();	
		
		StringStack st = new StringStack(size);

		do {
			System.out.println("문자열 입력 (종료는 0) >>");
			String str = sc.next();
			try {
				if(!st.push(str)) {
					st.pop();
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("저장중 오류가 발생했습니다.");
			}
		}while(true);
	}

}
