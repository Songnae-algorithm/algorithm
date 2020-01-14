package Number_Change;

import java.util.*;

public class prog_2_다음큰숫자 {

	static int size = 0;
	static int check = 0;
	
	static int binary_num(int n) {
	    int hold = 0;
	    int num = 0;
	    
	    while(n>0) {
	    	num++;
	    	  if(n%2 == 1)
	    		  hold++;

	    	  n=n/2;
	      }
	    
	    if(check==0) {
	    	size = num;
	    	check = 1;
	    }
	    return hold; 
	}
	
	  static public int solution(int n) {	      
	      int bn = binary_num(n);
	      
		  while(true) {
			  n++;
			  
			  if(binary_num(n) == bn)
				  break;
		  }
	      
	      return n;
	  }
	
	public static void main(String[] args) {
		
		System.out.println(solution(15));
	}
}
