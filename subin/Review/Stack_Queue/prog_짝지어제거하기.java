package Stack_Queue;

import java.util.*;
public class prog_짝지어제거하기 {

	public int solution(String s) {
		int answer = 0;
		
		Stack<Character> stk = new Stack<>();
		
		for(int i= s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			if(!stk.isEmpty() && stk.peek() == c)
				stk.pop();
			else
				stk.push(c);
		}
		
		if(stk.isEmpty())
			answer = 1;
		
		return answer;
	}
}
