package Stack_Queue;

import java.util.*;
public class beak_스택수열_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stk = new Stack();
		LinkedList<Integer> qu = new LinkedList();
		
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++)
			qu.add(sc.nextInt());
		
		int x = 1;
		while(x <= n) {
			//무조건 push하고
			stk.push(x);
			sb.append("+\n");
			
			//같은동안 계속 pop
			while(!stk.isEmpty() && qu.peek().intValue() == stk.peek().intValue()) {
				stk.pop();
				qu.poll();
				sb.append("-\n");
			}
			
			x++;
		}
		
		if(stk.isEmpty())
			System.out.println(sb.toString());
		else
			System.out.println("NO");
		
	}
}
