package T0228;

import java.util.*;

public class t3 {

	  public int solution(int n, int[] v) {
	      int answer = -1;
	      
	      int max = 0;
	      int max_idx = 0;
	      
	      for(int i=0; i<n; i++) {
	    	  if(max < v[i]) {
	    		  max = v[i];
	    		  max_idx = i;
	    	  }
	      }
	      
	      int dp[] = new int[n];
	      int min = -1000000000;
	      for(int i=0; i<n-1; i++) {
	    	  dp[i] = v[i] - v[i+1];
	    	  min = Math.max(min, dp[i]);
	      }
	      
	      if(max_idx == n-1) {
	    	  answer = min;
	      }
	      else {
	    	  for(int i=max_idx+1; i<n;i++) {
	    		  answer = Math.max(answer, v[max_idx] - v[i]);
	    	  }
	    	  
	      }
	      return answer;
	  }
	
	public static void main(String[] args) {
		
	}
}
