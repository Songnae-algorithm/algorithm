package Simulation;

import java.util.*;

//30min
public class beak_색종이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[101][101];
		
		int dp[] = new int[101];
		
		//다 더하고 겹치는 부분만 뺴면 되는거 아니야?
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					arr[j][k] += 1;
				}
			}
		}
		
		int total = n*100;
		int f = 0;
		
		for(int i=1; i<=100; i++) {
			for(int j=1; j<=100; j++) {
				dp[arr[i][j]]++;
			}
		}
		
		for(int i=1; i<=100; i++)
			f += dp[i] *(i-1);
		
		System.out.println(total - f);	
	}
}
