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
			if(this.job == d.job)
					return this.sec- d.sec;
			else 
				return this.job - d.job;
		}
	}
	
    static public int solution(int[][] jobs) {
    	int answer = 0;

    	PriorityQueue<Disk> pq = new PriorityQueue<>();
    	LinkedList<Disk> list = new LinkedList<>();

    	for(int i=0; i<jobs.length; i++)
    		pq.add(new Disk(jobs[i][0], jobs[i][1]));

    	for(int i=0; i<jobs.length; i++) {
    		list.add(pq.poll());
    	}
    	
    	int time = 0;
    	
        while(!list.isEmpty()) {
        	for(int i=0; i<list.size(); i++) {
        		if(time>= list.get(i).sec) {
        			time += list.get(i).job;
        			answer += time- list.get(i).sec; //종료시각은 끝난시간 - 시작시간
        			list.remove(i);
        			break; // 한번하면 끝내기
        		}
        		//시작시간이 다  time보다 크다면 -> disk에 안들어온 것이니 지금 시작 불가능
        		//끝까지 다 봤다면
        		if(i == list.size()-1)
        			time++;
        	}
        }
    	
    	return answer/jobs.length;
    }
    
    public static void main(String[] args) {
		int j[][] = {{0,3},{1,9},{2,6}};
		int jj[][] = {{0,3},{1,9},{500,6}};
		
		solution(jj);
	}
    
}
