package Heap;

import java.util.*;

public class 더맵게 {

    static public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0; i<scoville.length; i++)
        	pq.offer(scoville[i]);
        
        
        while(K>=pq.peek()){
            int sum = pq.remove() + pq.remove()*2;
            pq.offer(sum);
            answer++;
            
            if(pq.size() ==1 && sum <K)
            {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
