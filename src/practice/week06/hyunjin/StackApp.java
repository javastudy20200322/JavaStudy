package practice.week06.hyunjin;
import java.util.Scanner;


interface Stack {
	int length();						// Stack�� ����� �׸��� ���� ��ȯ
	int capacity();						// Stack�� ���� ������ �׸��� ���� ��ȯ
	String pop();						// Stack���� �׸��� ������ �̸� ��ȯ
	boolean push(String str);			// Stack�� �׸��� �����ϰ� ���������� �����ϸ� true��, �����ϸ� false�� ��ȯ
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
		System.out.print("���ÿ� ����� ��� ���ڿ� ��� : ");
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
			} catch(IndexOutOfBoundsException e) {							// [����] IndexOutOfBoundsException ���ܸ� ó���ϴ� try-catch���� �����Ͻÿ�.
				System.out.println("Stack�� ���� ���� ���� �� �����ϴ�.");
				return result;
			} catch(Exception e) {
				System.out.println("Stack�� ���� ���� �� �����ϴ�.");
				return result;
			}
		}
	}
	
}

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ���� ������ ũ�� �Է� >>");

		int size = sc.nextInt();	
		
		StringStack st = new StringStack(size);

		do {
			System.out.println("���ڿ� �Է� (����� 0) >>");
			String str = sc.next();
			try {
				if(!st.push(str)) {
					st.pop();
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("������ ������ �߻��߽��ϴ�.");
			}
		}while(true);
	}

}
