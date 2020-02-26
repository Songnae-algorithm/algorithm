package Dynamic_programming;

import java.util.*;

//16 min
public class beak_이친수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//값이 클 수 있으므로 int형이 아닌 long형으로 선언
		long dp[] = new long[91];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i=3;i<=90; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
	}
}
