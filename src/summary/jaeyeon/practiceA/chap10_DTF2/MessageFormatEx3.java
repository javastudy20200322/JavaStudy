package summary.jaeyeon.practiceA.chap10_DTF2;

import java.text.MessageFormat;

class MessageFormatEx3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] data = { 
				"INSERT INTO CUST_INFO VALUES ('이자바','02-123-4567',27,'07-06');",
				"INSERT INTO CUST_INFO VALUES ('김프로','032-123-4567',32,'07-09');"
				};
	
		
		String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3})";
		
		MessageFormat mf = new MessageFormat(pattern);
		
		for(int i = 0; i<data.length;i++) {
			Object[] objs = mf.parse(data[i]);
			for(int j = 0 ;j<objs.length;j++) {
				System.out.print(objs[j]+",");
			}
			System.out.println();
		}
		
	}
}
