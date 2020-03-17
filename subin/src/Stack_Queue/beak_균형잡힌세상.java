package Stack_Queue;

import java.util.*;

// 30min
public class beak_균형잡힌세상 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			
			if(s.equals("."))
				break;
			
			Stack<Character> stk = new Stack<>();

			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == '[')
					stk.add('[');
				
				else if(s.charAt(i) == ']') {
					if(stk.size() !=0 && stk.peek() == '[')
						stk.pop();
					else {
						stk.add(']');
						break;
					}
				}
				
				else if(s.charAt(i) == '(')
					stk.add('(');
				
				else if(s.charAt(i) == ')') {
					if(stk.size() !=0 && stk.peek() == '(')
						stk.pop();
					else {
						stk.add(']');
						break;
					}
				}
			}
			
			if(!stk.isEmpty())
				System.out.println("no");
			else
				System.out.println("yes");
			
		} //.이면 break하고 나감
		
	}
}
