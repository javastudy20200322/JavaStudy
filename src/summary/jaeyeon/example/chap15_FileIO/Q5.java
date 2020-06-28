package summary.jaeyeon.example.chap15_FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("USAGE : java Q5 TARGET_FILE RESULT_FILE");
			System.exit(0);

		}
		
		
		String inputFile = args[0];
		String outputFile = args[1];
		
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(inputFile));
			HtmlTagFilterWriter output = new HtmlTagFilterWriter(new FileWriter(outputFile));
			
			
			int ch = 0;
			while((ch = input.read()) != -1) {
				output.write(ch);
			}
			input.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class HtmlTagFilterWriter extends FilterWriter{
	
	StringWriter tmp = new StringWriter();
	boolean inTag = false;
	
	HtmlTagFilterWriter(Writer out){
		super(out);
		
	}
	
	public void write(int c) throws IOException{
		if(c == '<') {
			inTag = true;
		}else if(c =='>' && inTag) {
			inTag = false;
			tmp = new StringWriter();
			return;
		}
		
		if(inTag) {
			tmp.write(c);
			
		}else {
			out.write(c);
		}
		
		
	}
	
	
	public void close() throws IOException{
		out.write(tmp.toString());
		super.close();
	}
	
}
