package Simulation;

import java.util.*;

public class beak_색종이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[101][101];
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++)
					arr[j][k] = 1;
			}
		}
		
		int cnt = 0;
		
		int dx[] = {-1,1,0,0};
		int dy[] = {0,0,1,-1};
		
		for(int i=1; i<=100; i++) {
			for(int j=1; j<=100; j++) {
				if(arr[i][j] == 1) {
					for(int k=0; k<4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx>=1&&nx<=100&&ny>=1&&ny<=100 && arr[nx][ny] == 0)
							cnt++;
						else if(nx<1 || nx>100 || ny<1 || ny>100)
							cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}
