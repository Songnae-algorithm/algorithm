package Dynamic_programming;

import java.util.*;

//1h
public class beak_쉬운계단수 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long dp[][] = new long[101][11];
		
		for(int i=1;i<=9;i++)
			dp[1][i] = 1; //자리수 1은 전부 값 ->1
		
		for(int i=2;i<=n;i++) {
			dp[i][0] = dp[i-1][1];
			
			for(int j=1; j<=9; j++) { //9까지 해야 10의 값도 구할 수 있음
				dp[i][j] = (dp[i-1][j-1] +dp[i-1][j+1]) % 1000000000;
			}
			
		}
		
		long ans = 0;
		
		for(int i=0; i<=9; i++)
			ans = ans + dp[n][i];
		
		System.out.println(ans%1000000000);
	}
}

// https://zorba91.tistory.com/99
// https://mygumi.tistory.com/260