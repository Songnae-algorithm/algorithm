package Dynamic_programming;

import java.util.*;

public class line_나잡아봐라 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int co = sc.nextInt();
		int br = sc.nextInt();
		
		int pos[] = new int[200001]; // day 취급
		int answer = -1;
		
		Queue<Integer> qu = new LinkedList<>();
		
		qu.add(br);
		
		while(true) {
			int num = qu.poll();
			
			int time = pos[num];
			int cony = 0;
			for(int i=1; i<=time; i++)
				cony += i;
			
			if(num == co + cony) {
				answer = pos[num];
				break;
			}
			
			int next=0;
			for(int i=0; i<3; i++) {
				if(i==0)
					next = num-1;
				if(i==1)
					next = num+1;
				if(i==2)
					next = num*2;
				
				if(next>=0 && next<200001 && pos[next] ==0) {
					qu.add(next);
					pos[next] = pos[num]+1;
				}
			}
		}
		
		System.out.println("answer " + answer);
	}
}
