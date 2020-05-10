package summary.hyunjin.example;

import java.io.File;

import com.sun.org.apache.bcel.internal.generic.ClassObserver;

//8-1
class ExceptionEx1 {
	public static void main() {
		try {
			try {	} catch (Exception e) {	}		
		} catch (Exception e) {
			try {	} catch (Exception e2) {	}	//에러. 변수e가 중복선언
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
			result = number / (int)(Math.random() * 10);	//random으로 0이 나오면 exception발생
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
				result = number / (int)(Math.random() * 10);	//random으로 0이 나오면 exception발생
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
			System.out.println(0/0); //고의로 ArithmeticException발생
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
			System.out.println(0/0); //고의로 ArithmeticException발생
			System.out.println(4);
		} catch (Exception e) {	//ArithmeticException대신 Exception사용
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
			System.out.println(4);		//실행되지 않는다.
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {			//ArithmeticException을 제외한 모든예외처리가 된다.
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
			System.out.println(4);		//실행되지 않는다.
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메세지 : " + ae.getMessage());
		}
		System.out.println(6);
	}
}

//8-9
class ExceptionEx9 {
	public static void main() {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;	//예외를 발생시킥ㅁ
//			throw new Exception("고의로발생시켰음 ");	//위의 두줄을 한줄로 요약가능
		} catch (Exception e) {
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상종료되었음.");
	}
}

//8-10
class ExceptionEx10 {
	public static void main() {
//		throw new Exception(); 예외처리가 되어있지 않아 컴파일완료조차 되지않음
//		컴파일러가 예외처리를 확인하는 checked예외
	}
}

//8-11
class ExceptionEx11 {
	public static void main() {
		throw new RuntimeException();	
//		RuntimeException을 고의로 발생시킴 -> 컴파일완료됨. why? 프로그래머의 실수로 발생하는 것이기 때문에 강제로 예외처리하지 않음
//		컴파일러가 예외처리를 확인하지 않은 unchecked예외, 메서드에 예외선언시 쓰이지않음
	}
}

//8-12
//throws에 명시하는 것은 예외처리하는 것이 아니라 자신을 호출한 메소드에 예외를 전달하여 예외처리를 떠 맡기는 거임
//아래의 예제는 method2에서 main까지 예외를 떠 맡겨서 프로그램이 비정상적으로 종료된다. 따라서 이 메소들중 어느 한곳에 try_catch로 예외처리를 해줘야한다.
class ExceptionEx12 {
	public static void main() throws Exception{ 
		method1();	//같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능
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
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
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
			System.out.println("main메소드에서 예외가 처리되었습니다.");
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
			File f = createFile(args[0]); //createFile메소드에서 값을 받으므로 값을 보내는 main메소드에서 예외처리함
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "다시 입력해 주시기 바랍니다.");
		}
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");
	
		File f = new File(fileName);	//File클래스의 객체를 만든다.
		//File객체의 createFile메소드를 이용해서 실제 파일을 생성한다.
		createNewFile(f);
		return f;	//생성된 객체의 참조를 반환한다.
	
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
//		command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
	}
	
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
		} catch (Exception e) {
			//fileName이 부적절한 경우, 파일이름을 '제목없음.txt'로 한다.
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName);	//File클래스의 객체를 만든다.
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
		//프로그램 설치에 필요한 준비를 하는 코드를 적는다.
	}
	static void copyFiles() {
		//파일들을 복사하는 코드를 적는다 
	}
	
	static void deleteTempFiles() {
		//임시파일들을 삭제하는 코드를 적는다.
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
		//프로그램 설치에 필요한 준비를 하는 코드를 적는다.
	}
	static void copyFiles() {
		//파일들을 복사하는 코드를 적는다 
	}
	
	static void deleteTempFiles() {
		//임시파일들을 삭제하는 코드를 적는다.
	}
}


//8-19
class FinallyTest3 {
	public static void main() {
		//method1()은 static메소드이므로 인스턴스 생성없이 직접호출이 가능하다.
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메소드로 돌아왔습니다.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;		//현재 실행중인 메소드를 종료한다.
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	}
}

//8-20
class TryWithResourceEx {
	public static void main() {
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(false);	//예외가 발생하지 않는다.
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true);	//예외가 발생한다.
		}  catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
	}
}

class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")가 호출됨");
		
		if(exception) 
			throw new WorkException("WorkException발생!!!");
	}
	
	public void close() throws CloseException {
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생!!!");
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
			startInstall();		//프로그램설치에 필요한 준비를한다.
			copyFiles();		//파일들을 복사한다.
		} catch (SpaceException e) {
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후 다시설치하시길 바랍니다.");
		} catch (MemoryException e) {
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
			System.gc();		//Gargage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시설치를 시도하세요.");
		} finally {
			deleteTempFiles(); //프로그램설치에 사용된 임시파일들을 삭제한다.
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		
		if(!enoughMemory())
			throw new SpaceException("메모리가 부족합니다.");
	}
	
	static void copyFiles() { /*파일들을 복사하는 코드를 적는다*/}
	static void deleteTempFiles() { /*임시파일들을 삭제하는 코드를 적는다*/}
	
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다
		return false;
	}
	
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리공간이 이쓴지 확인하는 코드를 적는다.
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
			System.out.println("main메소드에서 예외가 처리되었습니다.");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메소드에서 예외가 처리되었습니다/");
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
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();		//프로그램설치에 사용된 임시파일들을 삭제한다.
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		
		if(!enoughMemory())
			throw new SpaceException("메모리가 부족합니다.");
	}
	
	static void copyFiles() { /*파일들을 복사하는 코드를 적는다*/}
	static void deleteTempFiles() { /*임시파일들을 삭제하는 코드를 적는다*/}
	
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다
		return false;
	}
	
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리공간이 이쓴지 확인하는 코드를 적는다.
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



















