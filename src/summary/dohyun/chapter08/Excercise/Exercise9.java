package summary.dohyun.chapter08.Excercise;
//틀림..

public class Exercise9 {

	public static void main(String[] args) throws Exception {
		throw new UnsupportedFunctionException("지원하지않음", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException {
	private final int ERR_CODE;

	public UnsupportedFunctionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}

	public UnsupportedFunctionException(String msg) {
		this(msg, 100);
	}

	public int getErrorCode() {
		return ERR_CODE;
	}

	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
