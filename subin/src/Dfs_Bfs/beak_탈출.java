package Dfs_Bfs;

import java.util.*;

public class beak_탈출 {
	static class Pos{
		int x;
		int y;
		int cnt;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Pos(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	
	static char maze[][];
	static boolean v[][];
	static int r;
	static int c;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static void flood() {
		//*찾기
		ArrayList<Pos> list = new ArrayList<>();
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(maze[i][j] == '*')
					list.add(new Pos(i,j));
			}
		}
		
		while(!list.isEmpty()) {
			Pos p = list.remove(0);
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx>=0 && nx<r && ny>=0 && ny<c && maze[nx][ny] == '.' && !v[nx][ny])
					maze[nx][ny] = '*';
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		c = sc.nextInt();
		
		sc.nextLine();
		maze = new char[r][c];
		v= new boolean[r][c];
		
		int sx = 0, sy = 0;
		int lx = 0, ly = 0;
		boolean b = false;
		
		for(int i=0; i<r; i++) {
			String s = sc.nextLine();
			for(int j=0; j<c; j++) {
				char cc = s.charAt(j);
				maze[i][j] = cc;
				if(cc == 'S') {
					sx = i;
					sy = j;
				}
				if(cc == 'D') {
					lx = i;
					ly = j;
				}
				if(cc == '*')
					b = true;
			}
		}
		
		Queue<Pos> qu = new LinkedList<>();
		qu.add(new Pos(sx,sy,0));
		int answer = -1;
		//물부터 범람하고
		//갈수있는곳으로가고
		
		while(!qu.isEmpty()) {
			Pos p = qu.poll();
			v[p.x][p.y] = false;
			
			if(p.x == lx && p.y == ly) {
				answer = p.cnt;
				break;
			}
			
			if(b == true)
				flood();
			
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx>=0 && nx<r && ny>=0 && ny<c && (maze[nx][ny] == '.'||maze[nx][ny] =='D')&& !v[nx][ny]) {
					qu.add(new Pos(nx,ny, p.cnt+1));
					v[nx][ny] = true;
				}
				
			}//for
		}//while
		
		if(answer == -1)
			System.out.println("KAKTUS");
		else
			System.out.println(answer);
	}
}
