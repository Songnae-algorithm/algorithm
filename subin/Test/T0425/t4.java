package T0425;

import java.util.*;

public class t4 {
	static int mac[][] = { { 1, 1 }, { 2, 1 }, { 1, 2 }, { 3, 3 }, { 6, 4 }, { 3, 1 }, { 3, 3 }, { 3, 3 }, { 3, 4 },
	         { 2, 1 } };
	
	static int pan[][] = new int[7][7];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
	
	static void push(int row, int color) {	
		for(int j=7; j>=1; j--) {
				if(pan[j][row] ==0)
					pan[j][row] =color; 
		}
	}
	
	
	static void dfs(int x, int y, int color, boolean v[][]) {
		v[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=1&& nx<7 && ny>=1&& ny<7 && pan[nx][ny] == color && !v[nx][ny])
				dfs(nx,ny,color,v);
		}
	}
	
	public String[] solution(int mac[][]) {
		String answer[] = {};
		
		for(int i=0; i<mac.length; i++) {
			//아래까지 넣은거
			push(mac[i][0], mac[i][1]);
			
			//pan !=0
			for(int j=1; j<7;j++) {
				for(int k=1; k<7; k++) {
					if(pan[j][k] !=0) {
						boolean v[][] = new boolean[7][7];
						dfs(j,k,pan[j][k],v);
					}
				}
			}
		}
		
		
		
		
		return answer;
	}
	
}
