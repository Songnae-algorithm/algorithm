package Dfs_Bfs;

import java.util.*;
public class beak_보물섬_re {
	static char arr[][];
	static int n;
	static int m;
	
	static class Pos{
		int x;
		int y;
		int cnt;
		Pos(int x, int y, int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static int bfs(int x, int y) {
		int an=0;
		boolean visited[][] = new boolean[n][m];
		
		Queue<Pos> qu = new LinkedList<>();
		qu.add(new Pos(x,y,0));
		visited[x][y] = true;
		
		while(!qu.isEmpty()) {
			Pos p = qu.poll();
			
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx>=0&&nx<n&&ny>=0&&ny<m&&arr[nx][ny] == 'L' &&!visited[nx][ny]) {
					visited[nx][ny] = true;
					qu.add(new Pos(nx,ny,p.cnt+1));
					an = Math.max(an, p.cnt+1);
				}
			}
			
		}
		
		return an;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new char[n][m];
		
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String a = sc.nextLine();
			for(int j=0; j<m; j++) {
				arr[i][j] = a.charAt(j);
			}
		}
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j] == 'L') {
					int temp = bfs(i,j);
					answer = Math.max(answer, temp);
				}
			}
		}
		
		System.out.println(answer);
		
	}
}
