package T0425;

import java.util.*;

public class t4 {
	static class Pos{
		int x;
		int y;
		Pos(int x, int y){
			this.x = x ;
			this.y = y;
		}
	}
	static int pan[][] = new int[7][7];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
	
	static void push(int row, int color) {	
		for(int j=6; j>=1; j--) {
				if(pan[j][row] == 0) {
					pan[j][row] =color;
					break;
				}
			}
	}

	static void down() {	
		for(int k=1; k<7; k++) {
			for(int i=5; i>=1; i--) {
				for(int j=1; j<7; j++) {
					if(pan[i][j] !=0 && pan[i+1][j]==0) {
						pan[i+1][j] = pan[i][j];
						pan[i][j] = 0;
					}
				}
			}
		}
	}
	
	static LinkedList<Pos> list = new LinkedList<>();
	static void dfs(int x, int y, int color, boolean v[][]) {
		v[x][y] = true;
		list.add(new Pos(x,y));
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=1&& nx<7 && ny>=1&& ny<7 && pan[nx][ny] == color && !v[nx][ny])
				dfs(nx,ny,color,v);
		}
	}
	
	static public String[] solution(int mac[][]) {
		String answer[] = {"","","","","",""};
		
		int num = 0;
		while(num<100) {
			if(num < mac.length) {
				push(mac[num][0], mac[num][1]);
			}	
			
			//pan !=0
			for(int j=1; j<7;j++) {
				for(int k=1; k<7; k++) {
					if(pan[j][k] !=0) {
						list.clear();
						boolean v[][] = new boolean[7][7];
						dfs(j,k,pan[j][k],v);
					}
					
					if(list.size()>=3) {
						while(!list.isEmpty()) {
							Pos p =list.poll();
							pan[p.x][p.y] = 0;
						}
						
						down();
					}
				}
				
			}
			
			num++;
		}
		
		for(int i=1; i<7; i++) {
			for(int j=1; j<7;j++)
				answer[i-1] += String.valueOf(pan[i][j]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		//int mac[][] = { { 1, 1 }, { 2, 1 }, { 1, 2 }, { 3, 3 }, { 6, 4 }, { 3, 1 }, { 3, 3 }, { 3, 3 }, { 3, 4 },{ 2, 1 } };
		
		int mac[][] = { {1,1},{1,2},{1,4},{2,1},{2,2},{2,3},{3,4},{3,1},{3,2},{3,3},{ 3,4 }, { 4,4 }, { 4,3 }, { 5,4 }, { 6,1 } };
		
		
		String an[] = solution(mac);
		for(int i=0; i<6;i++)
			System.out.println(an[i]);
	}
	
}
