package Dynamic_programming;

import java.util.*;

//50min
public class beak_가장긴증가하는부분수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int dp [] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int max_idx = 1;
		
		dp[0] = 1;
		
		for(int i=1; i<n; i++) {
			dp[i] = 1; // 필수!
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j] && dp[i] <= dp[j])
					dp[i] = dp[j]+1;
				else if(arr[i] == arr[j])
					dp[i] = dp[j];
				
				max_idx = Math.max(max_idx, dp[i]);
			}
		}
		
		System.out.println(max_idx);
	}
}

//https://developer-mac.tistory.com/71

/*
 		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int max = arr[0]; int idx =0; int answer=0;
		while(idx < n-1) {
			if(max < arr[idx+1]){
				max = arr[idx];
				idx = idx+1;
				answer++;
			}
			else
				idx++;

		}//while
 */

