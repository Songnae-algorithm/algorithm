import java.util.*;

class Review {

    static public int solution(String name) {
        int answer = 0;
        for(int i = 0; i<name.length(); i++) {
        	if(name.charAt(i) -'A' <13)
        		answer += name.charAt(i)- 'A';
        	else
        		answer += 'Z' - name.charAt(i)+1;
        }
        
        int min_move = name.length()-1;
        
        for(int i=0; i<name.length()-1; i++) {
        	int next = i+1;
        	
        	while(next<name.length() && name.charAt(next) == 'A')
        		next++;
        
        	min_move = Math.min(min_move, i+name.length()-next);	
        }
        return answer + min_move;
    }
	
    public static void main(String[] args) {
		String s = "JEROEN";
		
		System.out.println(solution(s));
	}
}