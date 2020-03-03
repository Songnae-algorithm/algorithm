package String;

public class prog_2_문자열압축 {

    public int solution(String s) {
        int answer = 0;
        
        int out_len = s.length()/2;
        
        int real = 100000000;
        
        for(int i=1; i<=out_len; i++) {//1개부터, s/2까지 돌려볼 수 있다
        	String result = "";
        	int count = 1;
        	
        	String tmp = s.substring(0, i);
        	
        	for(int j=i; j<s.length(); j=j+i) {
        		
        		if(tmp.equals(s.substring(j, j+i))) {
        			count++;
        		}
        		else {
        			if(count == 1) 
        				result += tmp;
        			else
        				result += count+tmp;
        			
        			tmp = s.substring(j,j+1);
        		}
        	}
        	
			if(count == 1) 
				result += tmp;
			else
				result += count+tmp;
    	
			
        	if(real > result.length())
        		real = result.length();
        	
        }
        return real;
    }
    
    public static void main(String[] args) {
		
	}
	
}
