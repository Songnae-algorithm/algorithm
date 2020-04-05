package Dynamic_programming;

import java.util.*;

public class line_나잡아봐라 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int co = sc.nextInt();
		int br = sc.nextInt();
		
		int pos[] = new int[400000]; // day 취급
		int answer = -1;
		
		Queue<Integer> qu = new LinkedList<>();
		
		qu.add(br);
		
		int cony[] = new int[100000];
		
		for(int i=1; i<cony.length; i++) {
			cony[i] = cony[i-1] + i;
		}
		
		
		int day = 0;
		while(!qu.isEmpty() && day<100) {
			int num = qu.poll();
			
			if(num == cony[num]) {
				answer = pos[num];
				break;
			}
			
			if(num >=0 && num<400000) {
				if(num-1 >=0 && num-1<400000) {
					pos[num-1] = pos[num]+1;
					qu.add(num-1);
				}
				
				if(num+1 >=0 && num+1<400000) {
					pos[num+1] = pos[num]+1;
					qu.add(num+1);
				}
				
				if(num*2 >=0 && num*2<400000) {
					pos[num*2] = pos[num]+1;
					qu.add(num*2);
				}
			}
			
			day++;
		}
		
		System.out.println("answer " + answer);
	}
}
