package Dfs_Bfs;

import java.util.*;

//23min
public class beak_유기농배추 {
	
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static void dfs(int arr[][], int i, int j) {
		arr[i][j] = 0; // 방문한 것으로 바꿈
		
		for(int k=0;k<4; k++) {
			int nowi = i + dx[k];
			int nowj = j + dy[k];
			
			if(nowi>=0 && nowi<arr.length && nowj>=0 && nowj<arr[0].length && arr[nowi][nowj] == 1) {
				dfs(arr,nowi,nowj);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tt=0;tt<t;tt++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int answer = 0;
			
			int arr[][] = new int[m][n];
			
			for(int i=0; i<k; i++) {
				arr[sc.nextInt()][sc.nextInt()] = 1;
			}
					
			for(int i=0;i<m; i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j] == 1) {
						dfs(arr,i,j);
						answer++;
					}
				}
			}

			System.out.println(answer);
		}
		
	}
	
}
