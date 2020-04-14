//https://programmers.co.kr/learn/courses/30/lessons/42627
import java.util.*;

public class Review {

    public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, new Comparator<int[]>() {
        	@Override
        	public int compare(int a[], int b[]) {
        		if(a[0] == b[0])
        			return a[1] - b[1];
        		else
        			return a[0] - b[0];
        	}
        });
        
        int heap[] = new int[jobs.length]; //끝나는 시간 저장
        
        for(int i=0; i<jobs.length; i++) {
        	int req = jobs[i][0];
        	int doing = jobs[i][1];
        	
        	if(i == 0)
        		heap[i] = req+doing;

        	else {
        		if(req > heap[i-1])
        			heap[i] = req+doing;
        		else
        			heap[i] = heap[i-1] + doing;
        	}
        	
        }//for
        
        for(int i=0; i<jobs.length; i++) {
        	answer += heap[i] - jobs[i][0];
        }
        
        
        return answer/heap.length;
    }
    
    public static void main(String[] args) {

	}
}