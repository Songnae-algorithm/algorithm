package Dfs_Bfs;

import java.util.*;


//35 min
public class beak_적록색약 {
	
	static void is_dfs(char arr[][], char k, int x, int y) {
		arr[x][y] = 'i';
		
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 &&nx<arr.length && ny>=0&&ny<arr.length && arr[nx][ny] == k)
					is_dfs(arr,k,nx,ny);
		}
	}
	
	static void not_dfs(char arr[][], char k, int x, int y) {
		arr[x][y] = 'i';
		
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 &&nx<arr.length && ny>=0&&ny<arr.length && arr[nx][ny] == k)
				not_dfs(arr,k,nx,ny);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char arr[][] = new char [n][n];
		char arr_copy[][] = new char[n][n];
		
		
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String a = sc.nextLine();
			for(int j=0;j<n;j++) {
				arr[i][j] = a.charAt(j);
				
				if(a.charAt(j) == 'R')
					arr_copy[i][j] = 'G';
				else
					arr_copy[i][j] = a.charAt(j);
			}
		}
		
		int is = 0;
		int not = 0;
		
		//char 배열 만듦 -> 들어갔다 나오면 'i'로 바꿔주기
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] != 'i') {
					not_dfs(arr,arr[i][j],i,j);
					not++;
				}
			}
		}
		
		//G와 B만 있음
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr_copy[i][j] != 'i') {
					is_dfs(arr_copy,arr_copy[i][j],i,j);
					is++;
				}
			}
		}
		
		System.out.println(not + " " + is);	
	}
	
}
