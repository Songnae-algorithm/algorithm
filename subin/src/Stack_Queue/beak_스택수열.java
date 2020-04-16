package Stack_Queue;

import java.util.*;

public class beak_스택수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Queue<Integer> qu = new LinkedList<>();
		Stack<Integer> stk = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			qu.add(sc.nextInt());
		}
		
		//qu -> 4 3 6 8 7 5 2 1
		
		int x = 1;
		
		while(x<=n) {
				//일단 넣고
				stk.add(x);
				sb.append("+\n");
				while(!stk.isEmpty()&& !qu.isEmpty()&&stk.peek().intValue() == qu.peek().intValue()) {
						stk.pop();
						qu.poll();
						sb.append("-\n");
				}//while

			x++;
		}//while
		
		if(!stk.isEmpty())
			System.out.println("NO");
		else
			System.out.println(sb.toString());
			
	}
}
