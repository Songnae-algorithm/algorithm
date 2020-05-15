package Dfs_Bfs;

import java.util.*;

public class beak_아기상어 {
	static class Pos{
		int x;
		int y;
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static int arr[][];
	static Pos baby;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int [n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int k = sc.nextInt();
				arr[i][j] = k;
				if(k == 9)
					baby = new Pos(i,j);
			}				
		}
		
		
		
		
	}
}
