package Ssocar;

import java.util.*;

public class t3 {
	
	static public int solution(int nums[]) {
		int stop[] = new int[nums.length];
		int stopnum = nums.length-1;
		
		boolean check = false;
		Queue<Integer> qu = new LinkedList<Integer>();
		
		qu.offer(0);
		
		while(!qu.isEmpty()) {
			int pop = nums[qu.peek()];
			int idx = qu.poll();
			
			int front = idx + pop;
			int back = idx - pop;
			
			if(front == stopnum || back ==stopnum) {
				if(front == stopnum)
					return stop[idx] + 1;
				else
					return stop[idx] + 1;	
			}
			
			//+0 -0이기 때문에 더 갈 곳이 없으므로 pop 해준다
			if(pop == 0)
				continue;
			
			if(front>=0 && front<nums.length && (back<0 || back>=nums.length)) {
				//front만
				qu.offer(front);
				stop[front] = stop[idx] + 1;
				
			}
			else if(back>=0 && back<nums.length && (front<0 || front>=nums.length)) {
				//back만
				qu.offer(back);
				stop[back] = stop[idx] + 1;
			}
			else if((front>=0 && front<nums.length) && (back>=0 && back<nums.length)) {
				//front & back 둘 다
				qu.offer(front);
				qu.offer(back);
				
				stop[front] = stop[idx] + 1;
				stop[back] = stop[idx] + 1;
			}
		}
		
		//qu가 return에 걸리는 것 없이 empty돼서 빠져나오면 도달 못한다는 뜻이니까 -1 return한다...는 무한루프 해결 못함
		return -1;
	}
	
	public static void main(String[] args) {
		int n[] = {4,1,2,3,1,0,5};
		
		System.out.println("answer = " + solution(n));
	}
}
