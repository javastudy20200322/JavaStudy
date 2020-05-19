package summary.jaeyeon.example.chap08_exception;

class UnsupportedFuctionException extends RuntimeException {

	private final int ERR_CODE = 100;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UnsupportedFuctionException(String string, int i) {
		System.out.println("[" + i + "]" + string);
	}

	public UnsupportedFuctionException(String msg) {
		this(msg, 100);
	}

	public int getErrorCode() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}

}

public class Q9 {
	public static void main(String[] args) throws Exception {

		throw new UnsupportedFuctionException("지원하지않는 기능입니다.", 100);
	}
}
