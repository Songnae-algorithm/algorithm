package Dynamic_programming;

import java.util.*;

public class beak_re_정수삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i=1; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == 0)
					arr[i][j] = arr[i][j] + arr[i-1][j];
				else if(j == n-1)
					arr[i][j] = arr[i][j] + arr[i-1][j-1];
				else 
					arr[i][j] =  arr[i][j] + Math.max(arr[i-1][j], arr[i-1][j-1]);
			}
		}
		
		int max = 0;
		for(int i=0; i<n; i++)
			max = Math.max(max, arr[n-1][i]);
	
		System.out.println(max);
		
	}
}
