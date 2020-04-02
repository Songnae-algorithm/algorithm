package T0328;

import java.util.*;

public class t4 {

	public static String solution(String S, String C) {
		String SS = S;
		S = S.toLowerCase();
		C = C.toLowerCase() + ".com";
		
		String SS_a[] = SS.split("; ");
		String arr[] = S.split("; ");
		String reals = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			//first, middle, last 구분
			String s[] = arr[i].split(" ");
			String first = s[0]; String last = "";
			
			if(s.length == 3) {
				if(s[2].contains("-")) {
					s[2]=s[2].replace("-", "");
				}
				last = s[2];
			}
			else if(s.length == 2) {
				if(s[1].contains("-")) {
					s[1]=s[1].replace("-", "");
				}
				last = s[1];
			}
			
			String name = last +"_" + first;
			
			if(map.containsKey(name)) {
				int l = map.get(name);
				l++;
				map.put(name, l);
				
				reals += SS_a[i] + " <" + name+l + "@" + C + ">; ";
				
			}
			else {
				map.put(name, 1);
				
				reals += SS_a[i] + " <" + name + "@" + C + ">; ";
			}
		}
		
		int size = reals.length();
		
		return reals.substring(0, size-2);
	}
	
	public static void main(String[] args) {
		String a = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brain Parker";
		String aa = "John Doe; John Doe; John Doe; John Doe";
		
		
		String b = "Example";
		
		System.out.println(solution(aa,b));
		
	}
}
