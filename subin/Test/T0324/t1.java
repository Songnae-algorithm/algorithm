package T0324;

import java.util.*;

public class t1 {
	
	static public int solution(String s, String pattern) {
		int answer = 0;
		
		int ch[] = new int[32];
		
		for(int i=0; i<pattern.length(); i++)
			ch[pattern.charAt(i)-'a']++; //0-a, 1-b, 2-c, 3-d
		
		for(int i=0; i<=s.length()-pattern.length(); i++) {
			String ss = s.substring(i, i+pattern.length());
			System.out.println(ss);
			int test[] = new int[32];
			
			for(int j=0; j<ss.length(); j++) {
				test[ss.charAt(j)-'a']++;
			}
			
			boolean ck = false;
			for(int k=0; k<32; k++) {
				if(ch[k] != test[k])
					ck = true;
			}
			
			if(ck == false)
				answer++;
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution("aaaaaa", "a"));
	}
}
