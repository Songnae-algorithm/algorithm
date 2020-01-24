package Stack_Queue;

import java.util.*;

public class prog_2_기능개발 {
	
    static public int[] solution(int[] progresses, int[] speeds) {
    	
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	Queue<Integer> qu = new LinkedList<Integer>();
    	int idx = 0;
    	int day = 0;
    	
    	
    	for(int i=0; i<progresses.length; i++)
    		qu.offer(progresses[i]);
    	
    	while(!qu.isEmpty()) {
    		day++;
    		
    		int answer = 0;

    		
    		while(!qu.isEmpty() && qu.peek() + speeds[idx]*day >=100){
    			answer++;
    			idx++;
    			qu.poll();

    		}
    		
    		if(answer != 0)
    			list.add(answer);
    		
    	}//while
    	
    	return list.stream().mapToInt(i->i).toArray();
    }
	
	public static void main(String[] args) {
		int p[] = {93,30,55};
		int s [] = {1,30,5}; 
		
		int n[] = solution(p,s);
		
		for(int i=0; i<n.length; i++)
			System.out.println(n[i]);
	}
}
