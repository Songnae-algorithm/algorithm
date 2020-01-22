package Number_Change;

import java.util.*;

public class prog_2_숫자의표현 {
	
	//12 min
	  static public int solution(int n) {
		  int answer = 0;
		  
		  for(int i=1; i<=n ; i++) {
			  int j = i; int sum = 0;
			  while(sum <= n) {
				  sum = sum + j;
				  if(sum%n ==0 && sum/n==1) {
					  answer++;
					  break;
				  } 
				  j++;
			  }
		  }
		  return answer;
	  }
	
	
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
}
