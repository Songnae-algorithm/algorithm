package T0405;

import java.util.*;


//20min
public class t1 {
    public static int solution(String inputString) {
        int answer = -1;
        
        int an = 0;
        boolean chk = false;
        LinkedList<Character> stk = new LinkedList<>();
        
        for(int i=0;i<inputString.length(); i++) {
        	char c = inputString.charAt(i);
        	
        	if(c == ')' || c == '}' || c == ']' || c=='>') {
        		chk = true;
        		
        		if(!stk.isEmpty() && c == ')' && stk.contains('(')) {
        			int idx = stk.indexOf('(');
        			stk.remove(idx);
        			
        			an++;
        		}
        		
        		if(!stk.isEmpty() && c=='}' && stk.contains('{')) {
        			int idx = stk.indexOf('{');
        			stk.remove(idx);

        			an++;
        		}
        		if(!stk.isEmpty()&& c==']' && stk.contains('[')) {
        			int idx = stk.indexOf('[');
        			stk.remove(idx);
        			an++;
        		}
        		if(!stk.isEmpty() && c=='>' && stk.contains('<')) {
        			int idx = stk.indexOf('<');
        			stk.remove(idx);
        			
        			an++;
        		}
        	}
        	
        	else if(c == '(' || c == '{' || c == '[' || c=='<') {
        		stk.push(c);
        		chk = true;
        	}
        		
        }
        
        if(chk == false)
        	return 0;
        
        if(stk.isEmpty())
        	answer = an;
        
        return answer;
    }
    
    public static void main(String[] args) {
		
    	String input = ">_<";
    	
    	System.out.println(solution(input));
    	
    	
	}
}
