package DP;

import java.util.*;
public class prog_re_야근지수 {

	static public long solution(int n,int works[]) {
		long res = 0;
		
		PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
		
        long sum = 0;
		for(long work: works) {
			pq.add(work);
            sum += work;
		}
		
        if(sum <=n)
            return 0;
        
		for(int i=0; i<n; i++) {
			long now = pq.poll();
			pq.add(now-1);
		}
		
		
		for(long i : pq)
			res += (i*i);
		
		
		return res;
	}
	
}
