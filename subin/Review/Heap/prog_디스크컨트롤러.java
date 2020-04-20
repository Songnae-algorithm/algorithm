package Heap;

import java.util.*;
public class prog_디스크컨트롤러 {

	//comparator아니고 comparable
	static class Disk implements Comparable<Disk>{
		int sec;
		int job;
		
		Disk(int sec, int job){
			this.sec = sec;
			this.job = job;
		}
		
		@Override
		public int compareTo(Disk d) {
			//일하는 시간이 같으면 빨리들어오는애를! 오름차순으로
			if(this.job == d.job) {
				if(this.sec > d.sec)
					return 1;
				else
					 return -1;
			}
			//지금 들어온 애가 일하는시간이 더 크면! 반대로! 내림차순!
			else if(this.job < d.job)
				return -1;
			//지금 들어온 애가 작으면 오름차순!
			else
				return 1;
		}
	}
	
    static public int solution(int[][] jobs) {
    	int answer = 0;
    	
    	//정렬하고 안하고의 어떤 효과?!
    	PriorityQueue<Disk> ll = new PriorityQueue<>();
    	List<Disk> pq = new LinkedList<>();
    	
    	
    	for(int i=0; i<jobs.length; i++)
    		ll.add(new Disk(jobs[i][0], jobs[i][1]));
    	
    	for(int i=0; i<jobs.length; i++) {
    		pq.add(new Disk(ll.peek().sec, ll.peek().job));
    		ll.poll();
    	}
    	
    	int time = 0;
    	
    	while(!pq.isEmpty()) {
    		//pq.get(i).sec가 time보다 작거나 같을때만 동작한다
    		for(int i=0; i<pq.size(); i++) {
    			if(time >= pq.get(i).sec) {
    				time += pq.get(i).job;
    				answer += (time - pq.get(i).sec);
    				pq.remove(i);
    				break;
    			}
    			
        		//sec가 time보다 크면 그 차례가 올때까지 기다리기
        		if(i == pq.size()-1)
        			time++;
    		}
    	}
    	
    	return answer/jobs.length;
    }	
    
}
