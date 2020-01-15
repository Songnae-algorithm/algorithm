package BruteForce;

public class prog_2_카펫 {

   static public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        
        int sum = brown + red;
        
        for(int i=1; i< (sum/2) ; i++) {
        	if(sum%i == 0) {
        		int p = sum/i;
        		if((p-2)*(i-2) == red) {
        			answer[0] = Math.max(p, i);
        			answer[1] = Math.min(p, i);;
        		}
        		
        	}
        }
   
        return answer;
    }
	
	public static void main(String[] args) {
		solution(24,24);
	}
}
