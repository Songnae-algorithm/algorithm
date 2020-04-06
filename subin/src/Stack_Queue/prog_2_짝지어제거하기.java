package Stack_Queue;

import java.util.*;

//10min
public class prog_2_짝지어제거하기 {

    public int solution(String s){
        Stack<Character> stk = new Stack<>();
        
        for(int i=s.length()-1; i>=0; i--) {
        	char now = s.charAt(i);
        	if(!stk.isEmpty() && stk.peek() == now)
        		stk.pop();
        	else
        		stk.add(now);
        }
        
        if(stk.isEmpty())
        	return 1;
        else
        	return 0;
        
    }
}
