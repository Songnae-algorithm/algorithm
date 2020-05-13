package T0509;

import java.util.*;

public class t2 {
	static LinkedList<String> list;
	
	static long do_once(long n) {
		long sum = 0;
		
		if(n == 1) {
			for(String x : list) {
				if(x.equals("+"))
					continue;
				sum += Integer.parseInt(x);
			}
		}
		
		else if(n == 2) {
			for(String x : list) {
				if(x.equals("-"))
					continue;
				sum -= Integer.parseInt(x);
			}
		}
		
		else if(n == 3) {
			for(String x : list) {
				if(x.equals("*"))
					continue;
				sum *= Integer.parseInt(x);
			}
		}
		
		return sum;
	}
	
	static long do_twice(char c1, char c2) {
		long sum = 0;
		
		
		
		
		return sum;
	}
	
    public static long solution(String expression) {
        long answer = 0;
        
        boolean ex[] = new boolean[3];
     
        for(int i=0; i<expression.length(); i++) {
        	if( expression.charAt(i) == '+')
        		ex[0] = true;
        	
        	if( expression.charAt(i) == '-')
        		ex[1] = true;

        	if( expression.charAt(i) == '*')
        		ex[2] = true;
        }
        
        list = new LinkedList<>();
        
        String temp ="";
        for(int i=0; i<expression.length(); i++) {
        	char c = expression.charAt(i);
        	if(c== '*' || c=='+' || c=='-') {
        		list.add(temp);
        		temp ="";
        		list.add(String.valueOf(c));
        	}
        	else
        		temp += c;
        }
        
        if(!temp.equals(""))
        	list.add(temp);
        
        
        if(ex[0] && !ex[1] && !ex[2]) {
        	//+만 있는 경우
        	answer = do_once(1);
        }
        
        else if(!ex[0] && ex[1] && !ex[2]) {
        	//-만 있는 경우
        	answer = do_once(2);
        }
        
        if(!ex[0] && !ex[1] && ex[2]) {
        	// *만 있는 경우
        	answer = do_once(3);
        }
        
        if(ex[0] && ex[1] && !ex[2]) {
        	// + -
        	do_twice('+', '-');
        }
        
        if(!ex[0] && ex[1] && ex[2]) {
        	//- *
        	do_twice('-', '*');
        }
        
        if(ex[0] && !ex[1] && ex[2]) {
        	//+ *
        	do_twice('+', '*');
        }
        
        if(ex[0] && ex[1] && ex[2]) {
        	// + - *
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
		
    	solution("100-200*300-500+20");
	}
}
