package Dynamic_programming;

import java.util.*;

public class beak_1로만들기 {

	//50 min
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dp[] = new int[n+1];
		Queue<Integer> qu = new LinkedList<>();
		qu.add(n);
		
		while(!qu.isEmpty()) {
			n = qu.poll();
			
			if(n == 1) {
				System.out.println( dp[1] );
				break;
			}
			
			
			if(n%3==0 && dp[n/3]==0) { //dp[n]==0일떄 방문해야 최소, 방문했던곳은 안간다 -> n은 이미 방문했던 곳이라 값이 있고 n/2, n/3을 확인해야한
				int k = n/3;
				dp[k] = dp[n] +1;
				qu.offer(k);
			}
			if(n%2==0 && dp[n/2]==0) {
				int k = n/2;
				dp[k] = dp[n] +1;
				qu.offer(k);
			}
			if(dp[n-1]==0) { //n 아니고  n-1이잖아 조건 잘 봐줘!
				int k = n-1;
				dp[k] = dp[n] +1;
				qu.offer(k);
			}
			
			
		}//while
		
	}
}
