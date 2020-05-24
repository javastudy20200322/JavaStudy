package summary.collectionframework;

import java.util.StringTokenizer;

import com.sun.xml.internal.ws.util.StringUtils;

public class FrameworkUtils
{
	public static String convCamelCase(String _str){
		String newColumnName=null;
		if(_str.indexOf("_")==-1){
			if(_str.matches("(.+)?[A-Z](.+)?")&&_str.matches("(.+)?[a-z](.+)?")) return _str;
			return _str.toLowerCase();
		}else{
			StringBuffer sb=new StringBuffer();
			boolean isFirst=true;
			StringTokenizer tokenizer=new StringTokenizer(_str,"_");
			while(tokenizer.hasMoreTokens()){
				if(isFirst) sb.append(tokenizer.nextToken().toLowerCase());
				else{
					sb.append(StringUtils.capitalize(tokenizer.nextToken().toLowerCase()));
				}
				isFirst=false;
			}
			newColumnName=sb.toString();
		}
		return newColumnName;
	}
}
