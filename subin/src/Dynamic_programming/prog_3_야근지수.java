package Dynamic_programming;

import java.util.*;

public class prog_3_야근지수 {

	//1h
    static public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        //PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        
        
        int len = 0;
        for(int i=0;i<works.length; i++) {
        	len += works[i];
        	qu.add(-1 * works[i]); //min힙이니까 -1 곱해줘서 풀어주고
        }
        
        
        if(len <= n)
        	return 0;
        
        else {
        	while(n>0) {
        		int max = qu.poll();
        		System.out.println(max);
        		qu.add(max+1); //-를 곱해놨으니까 +1해줘야 빼지는 개념
        		n--;
        	}
        }
        
        int size = qu.size();
        for(int i=0;i<size; i++) {
        	answer += Math.pow(-1 * qu.poll(), 2); // -1해줬던걸 다시 +로 바꿔준뒤 제곱해준다
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int w[] = {4,3,3};
		
		System.out.println(solution(4,w));
	}
}
