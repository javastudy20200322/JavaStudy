package reference.collectionframework;

import org.json.simple.JSONObject;

public class TestClass
{

	public static void main(String[] args)
	{
		JSONObject jObj = new JSONObject();
		jObj.put("test1", "test2");
		
		MyMap myMap = new MyMap();
		myMap.put("jObj", jObj);
		
		JSONObject jObj2 = myMap.getJSONObject("jObj");
		System.out.println("===== MyMap JSONObject =====");
		System.out.println(jObj2.toString());
		System.out.println(jObj2.toJSONString());
		
		System.out.println();
		
		MyCamelMap myCamelMap = new MyCamelMap();
		myCamelMap.put("TEST_KEY", "TEST_VALUE");
		
		System.out.println("===== MyCamelMap =====");
		System.out.println(myCamelMap.keySet());
		System.out.println(myCamelMap.getStr("testKey"));
		
	}

}
