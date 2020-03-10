package Dfs_Bfs;

import java.util.*;

public class beak_알파벳 {

	static int arr[][];
	static boolean alpa[] = new boolean[26];	 //A=0, B=1, C=2 ...
	static int answer= 1;
	static int count = 1;
	
	static void dfs(int i, int j) {
		int c = arr[i][j];
		alpa[c] = true; //방문했으니까 1로바꿔줌
		
		int dx[] = {0, 0, 1, -1};
		int dy[] = {1,-1, 0, 0};
		
		for(int k=0;i<4;i++) {
			int x = i + dx[k];
			int y = j + dy[k];
			
			if(x>=0 && x<arr.length && y>=0&& y<arr[0].length && !alpa[arr[x][y]]) {
				answer = Math.max(answer, ++count);
				dfs(x,y);
			}
		}
		
		//갔다 나왔으면 cnt--해주고, visited도 false로 만들어 줘야 다음으로 갈 수 있다.
		count--;
		alpa[c] = false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		sc.nextLine();
		
		arr = new int[r][c];
		
		for(int i=0; i<r; i++) {
			String s = sc.nextLine();
			for(int j=0; j<c; j++) {
				arr[i][j] = s.charAt(j)-65;
			}
		}
		
		dfs(0,0);
		
		System.out.println(answer);
	}
}
