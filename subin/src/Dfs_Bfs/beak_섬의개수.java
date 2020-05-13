package Dfs_Bfs;

import java.util.*;

public class beak_섬의개수 {
	
	public static void dfs(int arr[][], int x, int y) {
		arr[x][y] = 0;
		
		int dx[] = {-1,-1,-1, 0, 0, 1, 1, 1};
		int dy[] = {-1, 0, 1,-1, 1,-1, 0, 1};
		
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && nx<arr.length && ny>=0 && ny<arr[0].length
					&& arr[nx][ny] !=0)
				dfs(arr, nx,ny);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			if(n == 0 && m==0)
				break;
			
			if(n ==1 && m==1) {
				int k = sc.nextInt();
				if(k == 0)
					System.out.println(0);
				else
					System.out.println(1);
				
				continue;
			}
			
			int arr[][] = new int[n][m];
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++)
					arr[i][j] = sc.nextInt();
			}
			
			int answer = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++){
					if(arr[i][j] !=0) {
						dfs(arr,i,j);
						answer++;
					}
				}
			}//dfs
			
			System.out.println(answer);
		}
		
	}
}
