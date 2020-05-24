package summary.hyunjin.practice.Chapter11_Collection;
import java.util.*;

//[11-14] ������ ����ó�� ���α׷��� �Ϻ��̴�. ScannerŬ������ �̿��ؼ� ȭ�����κ��� �����͸� �Է��ϰ� �����ִ� ����� �ϼ��Ͻÿ�.
class Exercise11_14 {
	static ArrayList record = new ArrayList(); // ���������͸� ������ ����
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		while(true) {
			switch(displayMenu()) {
			case 1 : inputRecord(); break;
			case 2 : displayRecord(); break;
			case 3 : System.out.println("���α׷��� �����մϴ�.");
					 System.exit(0);
			}
		} // while(true)
	}
	
	// menu�� �����ִ� �޼���
	static int displayMenu(){
		System.out.println("**************************************************");
		System.out.println("* ���� ���� ���α׷� *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1. �л����� �Է��ϱ� ");
		System.out.println();
		System.out.println(" 2. �л����� ����");
		System.out.println();
		System.out.println(" 3. ���α׷� ���� ");
		System.out.println();
		System.out.print("���ϴ� �޴��� �����ϼ���.(1~3) : ");
		int menu = 0;System.out.print("���ϴ� �޴��� �����ϼ���.(1~3) : ");
		do {
			try {
				menu = Integer.parseInt(s.nextLine().trim());
				if(1 <= menu && menu <= 3) {
					break;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
	} while(true);
		return menu;
	} // public static int displayMenu(){
	// �����͸� �Է¹޴� �޼���
	
	static void inputRecord() {
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println("�̸�,��,��ȣ,�����,�����,���м���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		while(true) {
			System.out.print(">>");
			try {
				String input = s.nextLine().trim();
				if(!input.equalsIgnoreCase("q")) {
					// Scanner�� �̿��ؼ� ȭ������ ���� �����͸� �Է¹޴´�.(','�� �����ڷ�)
					Scanner s2 = new Scanner(input).useDelimiter(",");
					// �Է¹��� ������ Student�ν��Ͻ��� �����ϰ� record�� �߰��Ѵ�.
					record.add(new Student(s2.next(), s2.nextInt(), s2.nextInt(),s2.nextInt(), s2.nextInt(), s2.nextInt()));
					System.out.println("���ԷµǾ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���.");
				} else {
					// �Է¹��� ���� q �Ǵ� Q�̸� �޼��带 �����Ѵ�.
					return;
				}
			} catch(Exception e) {
				// �Է¹��� �����Ϳ��� ���ܰ� �߻��ϸ�, "�Է¿����Դϴ�."�� �����ְ� �ٽ� �Է¹޴´�.
				System.out.println("�Է¿����Դϴ�. �̸�, ��, ��ȣ, �����, �����, ���м���'�� ������ �Է��ϼ���.");
			}
		} // end of while
	} // public static void inputRecord() {
	
	// ������ ����� �����ִ� �޼���
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		
		if(length > 0) {
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			System.out.println("====================================================");
			for (int i = 0; i < length ; i++) {
				Student6 Student6 = (Student6)record.get(i);
				System.out.println(Student6);
				koreanTotal += Student6.kor;
				mathTotal += Student6.math;
				englishTotal += Student6.eng;
				total += Student6.total;
			}
			System.out.println("====================================================");
			System.out.println("����: "+koreanTotal+" "+englishTotal	+" "+mathTotal+" "+total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println(" �����Ͱ� �����ϴ�.");
			System.out.println("====================================================");
		}
	} // static void displayRecord() {
}

class Student6 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;
	int classRank; // �ݵ��
	
	Student6(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student6) {
			Student6 tmp = (Student6)o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}
	public String toString() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+getTotal()
		+","+getAverage()
		+","+schoolRank
		+","+classRank
		;
	}
} // class Student6