package greeedy;

public class prog_조이스틱_re {
    
	static public int solution(String name) {
    	int answer = 0;
		
    	int big = name.length()-1;
    	
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
    		answer += Math.min('Z'-c+1, c-'A' -1);
    		
    		int next = i+1;
    		while(next<name.length() && name.charAt(next) == 'A')
    			next++;
    		
    		big = Math.min(big , i+i+name.length()-next);
    	}
		
		
		return answer;
    }
    
	public static void main(String[] args) {
		
	}
}
