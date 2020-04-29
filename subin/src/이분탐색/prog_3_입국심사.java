package 이분탐색;

import java.util.*;

public class prog_3_입국심사 {

	static public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        
        long left = 0;
        long right = 0;
        long mid;
        
        for (int time : times) {
            if (time > right) {
                right = time;
            }
        }

        right *= n; //최대 오래걸리는 사람이 다 계산할 경우
        
        while(left<=right) {
        	mid = (left+right)/2;
        	
        	System.out.println("mid "+mid + " l " + left + " r " +right);
        	
        	long temp = 0;
        	for(int time:times) {
        		System.out.println(mid/time);
        		temp += mid/time;
        	}
        	if(temp <n)
        		left = mid+1;
        	else {
        		if(mid<answer)//mid가 더 작으면 answer에 넣는다
        			answer = mid;
        		
        		right = mid-1;
        	}
        	
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int t[] = {7,10};
		
		System.out.println(solution(6,t));
	}
}
