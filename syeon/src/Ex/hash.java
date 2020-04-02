package Ex;

import java.util.*;

public class hash {

	private class HastTest {
		int value1, value2, value3;
		String key;

		HastTest(String key, int a, int b, int c) {
			this.key = key;
			this.value1 = a;
			this.value2 = b;
			this.value3 = c;
		}
	}

	public static void main(String args[]) {
//		   Map<String, hasttest=""> mHastTest = new HastMap<String, hasttest="">();
//		   {
//		   HastTest hastTest = new HastTest("testKey", 10, 20, 30);
//		    
//		   mHastTest.put("testKey", hastTest);
//		 
//		   for(String key : mHastTest.keySet()) {
//		      System.out.println("Result : " + key + ", " + mHastTest.get(key).value1 + ", " + mHastTest.get(key).value2 + ", " + mHastTest.get(key).value3);
//		   }

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("foo", "bar");
		map.put("foo", "boo");
		list.add(map);
		System.out.println(map.values());

	}
}
