package Stack_Queue;

import java.util.*;

public class prog_2_쇠막대기 {

	//23 min
	static public int solution(String arrangement) {
		Stack<Character> stk = new Stack<Character>();
		int answer = 0;
		
		int idx = 1;
		stk.add(arrangement.charAt(0));
		
		while(idx < arrangement.length()) {
			char now = arrangement.charAt(idx);
			
			if(now == '(') 
				stk.push('(');
			else if(now == ')' && !stk.isEmpty()) {
				stk.pop();
				
				if(arrangement.charAt(idx-1) == ')')
					answer = answer + 1;
				else
					answer = answer + stk.size();	
			}
			
			idx++;
		}//while
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution("()(((()())(())()))(())"));
	}
}
