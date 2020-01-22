package Number_Change;

import java.util.*;

public class prog_2_124나라 {

	static public String solution(int n) {
	      String answer = "";
	      
	      int rest = 0;
	      while(n>0) {
	    	 //rest가 0일때랑 아닐때랑 구분해서 문제를 해결한다.
	    	 rest = n%3;
	    	 n = n/3;
	    	 
	    	 //어차피 나머지는 무조건 0,1,2 중 하나다
	    	 if(rest==0) {
	    		 rest = 4; // 밑에서 더해줄거니까 4로 바꿔주고
	    		 n = n-1; // 몫은  3%3 6%3 9%3 구간 등 때  필요
	    	 }
	    	 
	    	 answer = rest + answer;
	    	  
	      }
	      
	      
	      return answer;
	}
	
	  
	public static void main(String[] args) {
	
		System.out.println(solution(11));
	}
}