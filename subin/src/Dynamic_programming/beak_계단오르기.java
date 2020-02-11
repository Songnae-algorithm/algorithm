package Dynamic_programming;

import java.util.*;

public class beak_계단오르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n+1]; 
		int dp[] = new int[n+1]; //계단이 가지는 최대값
		
		for(int i=1;i<=n;i++) 
			arr[i] = sc.nextInt();
		
		//배얼에 넣고 최댓값 구하기
		dp[1] = arr[1];
		dp[2] = arr[2] + dp[1];
		
		for(int i=3; i<=n;i++) {
			dp[i] = Math.max(arr[i] + dp[i-2], arr[i] + arr[i-1] + dp[i-3]);
		}
		
		System.out.println(dp[n]);
	}
}
