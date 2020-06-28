package summary.jaeyeon.practiceA.chap10_DTF2;

import java.text.MessageFormat;

class MessageFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tableName = "CUST_INFO";

		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";

		Object[][] arguments = { { "이자바", "02-123-4567", "32", "07-09" }, { "김프로", "032-123-4567", "36", "07-16" } };

		for (int i = 0; i < arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}

}
