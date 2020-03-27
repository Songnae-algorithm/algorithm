package String;

import java.io.*;
import java.util.*;


public class beak_문자열폭발 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String pattern = br.readLine();
		
		Stack<Character> stk = new Stack<>();
		
		for(int i=s.length()-1; i>=0; i--) {
			
			stk.push(s.charAt(i));// 일단 넣고
			
			if(stk.peek() == pattern.charAt(0) &&stk.size() >= pattern.length()) {// 같은 경우에는
				boolean ck = false;

					for(int j=1 ;j<pattern.length(); j++) {
						if(pattern.charAt(j) != stk.get(stk.size()-1-j)) {
							ck = true;
							break;
						}
					}
					
					if(ck == false) { // 같다는거니까 패턴만큼 pop
						for(int j=0; j<pattern.length(); j++)
							stk.pop();
					}
				
			}
		}//for
	
		if(stk.size() ==0)
			System.out.println("FRULA");
		else {
			int size = stk.size();
			for(int i=0; i<size; i++)
				System.out.print(stk.pop());
		}
		
	}
}

/*
 public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String pattern = bf.readLine();
		
		while(true) {
			boolean ck = false;
			
			if(s.length() == 0){
				System.out.println("FRULA");
				break;
			}
			else {
				if(s.contains(pattern))
					s = s.replaceAll(pattern, ""); // 소름... 치환한거 다시 넣어줘야지
				else {
					System.out.println(s);
					break;
				}
			}
			
		}//while
		
	}
 */
