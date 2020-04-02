package Dfs_Bfs;

import java.util.*;

public class beak_보물섬 {

	static class Pos{
		int x;
		int y;
		int cnt=0;
		
		Pos(int x, int y, int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	
	static String arr[][];
	static boolean visited[][];
	static int n; static int m;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static int bfs(int x, int y) {
		visited = new boolean[n][m]; // bfs일 때 마다, 초기화
		
		Queue<Pos> qu = new LinkedList<Pos>();
		
		qu.add(new Pos(x,y,0));
		int cnt = 0;
		
		while(!qu.isEmpty()) {
			Pos p = qu.poll();
			int nx = p.x;
			int ny = p.y;
			visited[nx][ny] = true; // 갔으면 true
			
			for(int i=0; i<4; i++) {
				int rx = nx+dx[i];
				int ry = ny+dy[i];
				
				if(rx>=0 && rx<n && ry>=0 && ry<m) {
					if(arr[rx][ry].equals("L") && visited[rx][ry] == false) {
						qu.add(new Pos(rx,ry, p.cnt+1));
						cnt = Math.max(cnt, p.cnt+1);
						visited[rx][ry] = true;
					}
				}
			}
			
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new String[n][m];
		
		int answer = 0;
		
		sc.nextLine();
		
		for(int i=0;i<n; i++) {
			String s = sc.nextLine();
			arr[i] = s.split("");
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int temp = 0;
				if(arr[i][j].equals("L"))
					temp = bfs(i,j);
				
				answer = Math.max(answer, temp);
			}
		}
		
		System.out.println(answer);
	}
}
