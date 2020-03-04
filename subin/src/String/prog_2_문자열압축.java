package String;

public class prog_2_문자열압축 {

	static int solution(String s) {
 		int out_len = s.length()/2;
        
        int real = 10000;
        
        if(s.length() ==1)
        	return 1;
        
        for(int i=1; i<=out_len; i++) {//1개부터, s/2까지 돌려볼 수 있다
        	String result = "";
        	int count = 1;
        	
        	String tmp = s.substring(0, i);
        	
        	boolean chk= false; int idx = 0;
        	for(int j=i; j<s.length(); j=j+i) {
        		if(j+i>s.length()) {
        			idx=j;
        			chk= true;
        			break;
        		}
            	
        		if(tmp.equals(s.substring(j, j+i))) {
        			count++;
        		}
        		else {
        			if(count == 1) 
        				result += tmp;
        			else
        				result += count+tmp;
        			
        			count = 1;
        			tmp = s.substring(j,j+i); // 아이씨...
        			
        		}
        	}
        	       	
			if(count == 1) 
				result += tmp;
			else
				result += count +tmp;

			if(chk == true) // 끝까지 간게 아니라면
				result = result + s.substring(idx, s.length());
			
			
        	if(real > result.length())
        		real = result.length();

        }
        return real;
    }
    
    public static void main(String[] args) {
		System.out.println(solution("abcabcdede"));
	}
	
}