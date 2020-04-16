//https://programmers.co.kr/learn/courses/30/lessons/42627
import java.util.*;

class Job implements Comparable<Job>{
	int start;
	int doing;
	
	public Job(int start, int doing) {
		this.start = start;
		this.doing = doing;
	}
	
	@Override
	public int compareTo(Job o) {
		//doing이 같을때는, 원래있던 거로 오름차순
		if(this.doing == o.doing) {
			if(this.start > o.start)
				return this.start- o.start;
			else
				return -1;
		}
		//현재 들어온 doing이 더 크면 내림차순
		else if(this.doing < o.doing)
			return -1;
		//결론 -> 현재 들어온 doing이 작으면 오름차순
		else
			return 1;
	}
	
}

public class Review {
    static public int solution(int[][] jobs) {

        PriorityQueue<Job> pq = new PriorityQueue<>();
        List<Job> list = new ArrayList<>();
        
        //job 정렬
        for(int i=0; i<jobs.length; i++)
        	pq.add(new Job(jobs[i][0], jobs[i][1]));
        
        //list에 pq 그대로  삽입
        for(int i=0; i<jobs.length; i++)
        	list.add(pq.poll());
        
        int time = 0;
        int sum = 0;
        
        while(list.size()>0) {
        	for(int i=0; i<list.size(); i++) {
        		//시작해야하는 시간이 지금 시간 time보다 작으면 시작 가능
        		if(time>= list.get(i).start) {
        			time += list.get(i).doing;
        			sum += time- list.get(i).start; //종료시각은 끝난시간 - 시작시간
        			list.remove(i);
        			break; // 한번하면 끝내기
        		}
        		//시작시간이 다  time보다 크다면 -> disk에 안들어온 것이니 지금 시작 불가능
        		//끝까지 다 봤다면
        		if(i == list.size()-1)
        			time++;
        	}
        }
        
        return sum/jobs.length;
    }
    
    public static void main(String[] args) {
    	int a[][] = {{0,3},{1,9},{2,6}};
    	
    	solution(a);
    	
	}
}