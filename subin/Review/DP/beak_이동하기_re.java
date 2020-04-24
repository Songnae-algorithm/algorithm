package DP;

import java.util.*;

public class beak_이동하기_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++)
				arr[i][j] = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i == 1)
					arr[i][j] += arr[i][j-1];
				
				else if(j==1)
					arr[i][j] += arr[i-1][j];
				
				else
					arr[i][j] += Math.max(Math.max(arr[i-1][j-1], arr[i-1][j]),arr[i][j-1]);
			}
		}

		int answer = Integer.MIN_VALUE;
		for(int i=1; i<=m; i++) {
			answer = Math.max(answer, arr[n][i]);
		}
		
		System.out.println(answer);
	}
}
