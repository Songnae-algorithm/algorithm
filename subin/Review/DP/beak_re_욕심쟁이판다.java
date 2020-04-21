package DP;

import java.util.*;
public class beak_re_욕심쟁이판다 {

	static int maze[][];
	static int root[][];
	static int n;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static public int backt(int x, int y) {
		if(root[x][y] !=0)
			return root[x][y];
		//그게 아니라면 일단 1 넣어 줌
		root[x][y] = 1;
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				if(maze[x][y] <maze[nx][ny]) {
					root[x][y] = Math.max(backt(nx,ny) + 1, root[x][y]);
				}
			}
		}
		
		return root[x][y];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		maze = new int[n][n];
		root = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(root[i][j] ==0)
					backt(i,j);
			}
		}
		
		int max = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(root[i][j] +" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				max = Math.max(max, root[i][j]);
			}
		}
		
		System.out.println(max);
	}
}
