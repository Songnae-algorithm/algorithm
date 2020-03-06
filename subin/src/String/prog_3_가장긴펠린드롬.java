package String;

public class prog_3_가장긴펠린드롬 {

    static public int solution(String s){
        int answer = 0;

        if(s.length() == 1)
        	return 1;

        if(s.length() == 0)
        	return 0;

        //홀수라고 가정
        for(int i=1; i<s.length()-1; i++) {
        	int len = 0;
        	int front = i-1;
        	int back = i+1;
            int ck=0;
        	
        	while(true) {
	        	if(front >=0 && back<s.length()) { //조건 걸어주고
	        		if(s.charAt(front) == s.charAt(back)) {
	        			if(ck==0) {
	        				len = 1;
	        				ck++;
	        			}
	        			len = len+2;
	        			front--; back++;
	        		}
	        		else
	        			break;
	        	}
	        	else 
	        		break;
        	}//while
        	
        	answer = Math.max(answer,len);
        }
        
        //짝수라고 가정
        for(int i=1; i<s.length(); i++) {
        	int len = 0;
        	int front = i-1;
        	int back = i;
        	
        	while(true) {
	        	if(front >=0 && back<s.length()) { //조건 걸어주고
	        		if(s.charAt(front) == s.charAt(back)) {
	        			len = len+2;
	        			front--; back++;
	        		}
	        		else
	        			break;
	        	}
	        	else 
	        		break;
        	}//while
        	
        	answer = Math.max(answer,len);
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		System.out.println(solution("bbbbaaaaabbbb"));
	}
}
