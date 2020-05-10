package summary.hyunjin.example;

import java.io.File;

import com.sun.org.apache.bcel.internal.generic.ClassObserver;

//8-1
class ExceptionEx1 {
	public static void main() {
		try {
			try {	} catch (Exception e) {	}		
		} catch (Exception e) {
			try {	} catch (Exception e2) {	}	//����. ����e�� �ߺ�����
		}
		
		try {
			
		} catch (Exception e) {

		}
	
	}
}

//8-2
class ExceptionEx2 {
	public static void main() {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			result = number / (int)(Math.random() * 10);	//random���� 0�� ������ exception�߻�
			System.out.println(result);
		}
	}
}

//8-3
class ExceptionEx3 {
	public static void main() {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random() * 10);	//random���� 0�� ������ exception�߻�
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
		}
	}
}

//8-4 & 8-5
class ExceptionEx4_5 {
	public static void main() {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //���Ƿ� ArithmeticException�߻�
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}

//8-6
class ExceptionEx6 {
	public static void main() {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //���Ƿ� ArithmeticException�߻�
			System.out.println(4);
		} catch (Exception e) {	//ArithmeticException��� Exception���
			System.out.println(5);
		}
		System.out.println(6);
	}
}

//8-7
class ExceptionEx7 {
	public static void main() {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 
			System.out.println(4);		//������� �ʴ´�.
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {			//ArithmeticException�� ������ ��翹��ó���� �ȴ�.
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}

//8-8
class ExceptionEx8 {
	public static void main() {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 
			System.out.println(4);		//������� �ʴ´�.
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("���ܸ޼��� : " + ae.getMessage());
		}
		System.out.println(6);
	}
}

//8-9
class ExceptionEx9 {
	public static void main() {
		try {
			Exception e = new Exception("���Ƿ� �߻�������.");
			throw e;	//���ܸ� �߻���ű��
//			throw new Exception("���Ƿι߻������� ");	//���� ������ ���ٷ� ��డ��
		} catch (Exception e) {
			System.out.println("�����޼��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ��������Ǿ���.");
	}
}

//8-10
class ExceptionEx10 {
	public static void main() {
//		throw new Exception(); ����ó���� �Ǿ����� �ʾ� �����ϿϷ����� ��������
//		�����Ϸ��� ����ó���� Ȯ���ϴ� checked����
	}
}

//8-11
class ExceptionEx11 {
	public static void main() {
		throw new RuntimeException();	
//		RuntimeException�� ���Ƿ� �߻���Ŵ -> �����ϿϷ��. why? ���α׷����� �Ǽ��� �߻��ϴ� ���̱� ������ ������ ����ó������ ����
//		�����Ϸ��� ����ó���� Ȯ������ ���� unchecked����, �޼��忡 ���ܼ���� ����������
	}
}

//8-12
//throws�� ����ϴ� ���� ����ó���ϴ� ���� �ƴ϶� �ڽ��� ȣ���� �޼ҵ忡 ���ܸ� �����Ͽ� ����ó���� �� �ñ�� ����
//�Ʒ��� ������ method2���� main���� ���ܸ� �� �ðܼ� ���α׷��� ������������ ����ȴ�. ���� �� �޼ҵ��� ��� �Ѱ��� try_catch�� ����ó���� ������Ѵ�.
class ExceptionEx12 {
	public static void main() throws Exception{ 
		method1();	//���� Ŭ�������� static����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}


//8-13
class ExceptionEx13 {
	public static void main(){
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
}

//8-14
class ExceptionEx14 {
	public static void main() throws Exception{
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main�޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception();
	}
}

//8-15
class ExceptionEx15 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]); //createFile�޼ҵ忡�� ���� �����Ƿ� ���� ������ main�޼ҵ忡�� ����ó����
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
	
		File f = new File(fileName);	//FileŬ������ ��ü�� �����.
		//File��ü�� createFile�޼ҵ带 �̿��ؼ� ���� ������ �����Ѵ�.
		createNewFile(f);
		return f;	//������ ��ü�� ������ ��ȯ�Ѵ�.
	
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {		}
	}
}

//8-16
class ExceptionEx16 {
	public static void main(String[] args) {
//		command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		File f = createFile(args[0]);
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
	}
	
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		} catch (Exception e) {
			//fileName�� �������� ���, �����̸��� '�������.txt'�� �Ѵ�.
			fileName = "�������.txt";
		} finally {
			File f = new File(fileName);	//FileŬ������ ��ü�� �����.
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {		}
	}
}

//8-17
class FinallyTest {
	public static void main() {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		//���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.
	}
	static void copyFiles() {
		//���ϵ��� �����ϴ� �ڵ带 ���´� 
	}
	
	static void deleteTempFiles() {
		//�ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.
	}
}

//8-18
class FinallyTest2 {
	public static void main() {
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		//���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.
	}
	static void copyFiles() {
		//���ϵ��� �����ϴ� �ڵ带 ���´� 
	}
	
	static void deleteTempFiles() {
		//�ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.
	}
}


//8-19
class FinallyTest3 {
	public static void main() {
		//method1()�� static�޼ҵ��̹Ƿ� �ν��Ͻ� �������� ����ȣ���� �����ϴ�.
		FinallyTest3.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼ҵ�� ���ƿԽ��ϴ�.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;		//���� �������� �޼ҵ带 �����Ѵ�.
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
	}
}

//8-20
class TryWithResourceEx {
	public static void main() {
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(false);	//���ܰ� �߻����� �ʴ´�.
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true);	//���ܰ� �߻��Ѵ�.
		}  catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
	}
}

class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")�� ȣ���");
		
		if(exception) 
			throw new WorkException("WorkException�߻�!!!");
	}
	
	public void close() throws CloseException {
		System.out.println("close()�� ȣ���");
		throw new CloseException("CloseException�߻�!!!");
	}
}

class WorkException extends Exception {
	WorkException(String msg) { super(msg);	}
}

class CloseException extends Exception {
	CloseException(String msg) { super(msg);	}
}

//8-21
class NewExceptionTest {
	public static void main() {
		try {
			startInstall();		//���α׷���ġ�� �ʿ��� �غ��Ѵ�.
			copyFiles();		//���ϵ��� �����Ѵ�.
		} catch (SpaceException e) {
			System.out.println("�����޼��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �� �ٽü�ġ�Ͻñ� �ٶ��ϴ�.");
		} catch (MemoryException e) {
			System.out.println("�����޼��� : " + e.getMessage());
			e.printStackTrace();
			System.gc();		//Gargage Collection�� �����Ͽ� �޸𸮸� �÷��ش�.
			System.out.println("�ٽü�ġ�� �õ��ϼ���.");
		} finally {
			deleteTempFiles(); //���α׷���ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		
		if(!enoughMemory())
			throw new SpaceException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles() { /*���ϵ��� �����ϴ� �ڵ带 ���´�*/}
	static void deleteTempFiles() { /*�ӽ����ϵ��� �����ϴ� �ڵ带 ���´�*/}
	
	static boolean enoughSpace() {
		//��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�
		return false;
	}
	
	static boolean enoughMemory() {
		//��ġ�ϴµ� �ʿ��� �޸𸮰����� �̾��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}

//8-22
class ExceptionEx17 {
	public static void main() {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main�޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1�޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�/");
			throw e;
		}
	}
}

//8-23
class ChainedExceptionEx {
	public static void main() {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();		//���α׷���ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		
		if(!enoughMemory())
			throw new SpaceException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles() { /*���ϵ��� �����ϴ� �ڵ带 ���´�*/}
	static void deleteTempFiles() { /*�ӽ����ϵ��� �����ϴ� �ڵ带 ���´�*/}
	
	static boolean enoughSpace() {
		//��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�
		return false;
	}
	
	static boolean enoughMemory() {
		//��ġ�ϴµ� �ʿ��� �޸𸮰����� �̾��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
	}	
}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String msg) {
		super(msg);
	}
}



















