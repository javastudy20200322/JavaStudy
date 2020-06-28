package summary.jaeyeon.practiceA.chap10_DTF2;

import java.text.MessageFormat;

class MessageFormatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Name : {0} \nTel: {1} \nAge:{2} \nBirthday:{3}";

		Object[] arguments = { "이자바", "02-123-4567", "32", "07-09" };

		String result = MessageFormat.format(msg, arguments);

		System.out.println(result);
	}

}
