package Dynamic_programming;

import java.util.*;

public class beak_카드구매하기 {
	
	//40min
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int dp[] = new int[n];
		
		dp[0] = arr[0];
		dp[1] = Math.max(dp[0]*2, arr[1]);
		
		for(int i=2; i<n; i++) {
			
			int k=i-1;
			for(int j=0; j< (i+1/2); j++, k--) {
				int p = dp[i];
				if(j == i) 
					dp[i] = Math.max(dp[j]*2, p);
				else
					dp[i] = Math.max(dp[j] + dp[k], p);
			}
			
			dp[i] = Math.max(dp[i], arr[i]);
		}
		
		System.out.println(dp[n-1]);
		
	}
}
