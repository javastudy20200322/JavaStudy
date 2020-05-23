package summary.collectionframework;
import java.util.LinkedHashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class MyMap extends LinkedHashMap<Object,Object>
{
	private static final long serialVersionUID = -7964609600835164119L;

	public Object put(Object key,Object value)
	{
		return super.put(key,value);
	}

	public String getStr(Object key)
	{
		Object oValue = super.get(key);

		return String.valueOf(oValue);
	}

	public String getStr(Object key,String def)
	{
		Object oValue = super.get(key);
		String convStr = (oValue==null)?"":String.valueOf(oValue);

		return (convStr.equals("")) ? def:convStr.trim();
	}

	public int getInt(Object key)
	{
		Object oValue = super.get(key);
		String convStr = (oValue==null)?"":String.valueOf(oValue);

		return Integer.valueOf(convStr);
	}

	public int getInt(Object key,int def)
	{
		Object oValue = super.get(key);
		String convStr = (oValue==null)?"":String.valueOf(oValue);

		return (convStr.equals("")) ? def:Integer.valueOf(convStr);

	}

	public long getLong(Object key)
	{
		Object oValue = super.get(key);
		String convStr = (oValue==null)?"":String.valueOf(oValue);

		return Long.valueOf(convStr);
	}

	public long getLong(Object key,long def)
	{
		Object oValue = super.get(key);
		String convStr = (oValue==null)?"":String.valueOf(oValue);

		return (convStr.equals("")) ? def:Long.valueOf(convStr);
	}

	public List<MyCamelMap> getListMyCamelMap(Object key)
	{
		return (List<MyCamelMap>)super.get(key);
	}

	public List<MyMap> getListMyMap(Object key)
	{
		return (List<MyMap>)super.get(key);
	}

	public MyMap getMyMap(Object key)
	{
		return (MyMap)super.get(key);
	}

	public JSONObject getJSONObject(Object key)
	{
		return (JSONObject)super.get(key);
	}

	public JSONArray getJSONArray(Object key)
	{
		return (JSONArray)super.get(key);
	}

	public String[] getStrArray(Object key)
	{
		return objectToStringArray(super.get(key));
	}

	public int[] getIntArray(Object key)
	{
		return objectToIntArray(super.get(key));
	}

	public String[] objectToStringArray(Object _Array)
	{
		String[] arr=null;
		try{
			arr=(String[])_Array;
		}catch(Exception e){
			arr=new String[0];
		}
		return arr==null?new String[0]:arr;
	}

	public int[] objectToIntArray(Object _Array)
	{
		int[] arr=null;
		try{
			arr=(int[])_Array;
		}catch(Exception e){
			arr=new int[0];
		}
		return arr==null?new int[0]:arr;
	}
}