package Stack_Queue;

import java.util.*;

public class prog_2_올바른괄호 {

   static boolean solution(String s) {
        boolean answer = true;
        
        //애초에 stk에는 (밖에 없음 )는 나오는 즉시 제거할지 말지에만 관여하기때문
        Stack<Character> stk = new Stack<Character>();
        
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) == '(')
        		stk.push('(');
        	
        	else { //들어갈 준비중인게 )
        		if(stk.isEmpty())
        			return false;
        		
        		stk.pop();
//        		else if(stk.pop() != '(')
//        			return false;
        	}
        }
        
        if(!stk.isEmpty())
        	return false;
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		System.out.println(solution("()()"));
	}
}
