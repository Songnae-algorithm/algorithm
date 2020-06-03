package Programmers;

public class pr2_숫자의표현 {

	
	   public int solution(int n) {
	        //0604 12:40-43
	        int answer = 0;
	        
	        for(int i=0;i<n;i++){
	            int sum=0;
	            for(int j=i+1;j<=n;j++){
	                sum+=j;
	                if(sum==n){
	                    answer++;
	                    break;
	                }
	                else if(sum>n){
	                    break;
	                }
	            }
	        }
	        
	        return answer;
	    }
}
