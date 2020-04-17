package Dfs_Bfs;

import java.util.*;

public class beak_탈출 {
	static class Pos{
		int x;
		int y;
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static int r,c;
	static boolean v[][];
	static char maze[][];
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static int lx;
	static int ly;
	
	static Queue<Pos> waters = new LinkedList<>();
	static Queue<Pos> qu = new LinkedList<>();
	
    static boolean isRange(int x, int y) {
        if( x < 0 || x >= r || y < 0 || y >= c) return false;
        return true;
    }
	
	public static void water() {
		int size = waters.size();
		for(int i=0; i<size; i++) {
			Pos p = waters.poll();
			for(int j=0; j<4; j++) {
				int nx = p.x + dx[j];
				int ny = p.y + dy[j];
                if(!isRange(nx, ny) || maze[nx][ny] != '.')
                    continue;
				
                maze[nx][ny] = '*';
				waters.add(new Pos(nx,ny));
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		c = sc.nextInt();
		
		maze = new char[r][c];
		v = new boolean[r][c];
		
		sc.nextLine();
		for(int i=0; i<r; i++) {
			String s = sc.nextLine();
			for(int j=0; j<c; j++) {
				char ch = s.charAt(j);
				maze[i][j] = ch;
				
				if(ch == 'S') {
					qu.add(new Pos(i,j));
					v[i][j] = true;
				}
				
				if(ch == '*')
					waters.add(new Pos(i,j)); //초기화 - 초반에 물 다 넣어주기
				
				if(ch == 'D') {
					lx = i;
					ly = j;
				}
				
			}
		}//for - maze에 값들 넣기
		
		int answer = 0;
		int cnt = 0;
		boolean b = false;
		
		while(!qu.isEmpty()) {
			water();
			
			//bfs
			int qsize = qu.size();
			for(int i=0; i<qsize; i++) {
				Pos p = qu.poll();
				if(p.x == lx && p.y == ly){
					answer = cnt;
					b = true;
					break;
				}
				for(int j=0; j<4; j++) {
					int nx = p.x + dx[j];
					int ny = p.y + dy[j];
					
					if(!isRange(nx, ny)  || v[nx][ny] || maze[nx][ny] == '*' || maze[nx][ny] == 'X')
                        continue;
					v[nx][ny] = true;
					qu.add(new Pos(nx,ny));
				}
			}//qu 빼주기
			
			if(b == true)
				break;
			
			cnt++;
		}
		if(answer != 0)
			System.out.println(cnt);
		else
			System.out.println("KAKTUS");
	}
}
