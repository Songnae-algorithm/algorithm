package DP;

import java.util.*;

public class beak_123더하기_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 n을 1,2,3으로 나타내는 법
		int dp[] = new int[11];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
			
		for(int j=4; j<=10; j++) {
			dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
		}
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			System.out.println(dp[num]);
		}

	}
}
