package Dfs_Bfs;

import java.util.*;
public class beak_PuyoPuyo {
	
	static class Pos{
		int x;
		int y;
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static char pan[][];
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static LinkedList<Pos> qu = new LinkedList<>();
	
	static void dfs(int x, int y, char c, boolean v[][]) {
		//바닥만 보면서 같은게 4개이상이면 .만들기
		v[x][y] = true;
		qu.add(new Pos(x,y));
		
		for(int i=0; i<4; i++) {
			int nx = x+ dx[i];
			int ny = y+ dy[i];
			
			if(nx>=0 &&nx<12 && ny>=0 && ny<6 && pan[nx][ny] == c && !v[nx][ny])
				dfs(nx,ny,c,v);	
		}//for
	}//dfs
	
	static void push() {		
		for(int k=0; k<12; k++) {
			for(int i=10; i>=0; i--) {
				for(int j=0; j<6; j++) {
					if(pan[i][j] !='.' && pan[i+1][j] == '.') {
						pan[i+1][j] = pan[i][j];
						pan[i][j] = '.';
					}
				}
			}
		}
	}//push
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pan= new char[12][6];
		
		for(int i=0; i<12; i++) {
			String s = sc.nextLine();
			for(int j=0; j<6; j++)
				pan[i][j] = s.charAt(j);
		}//입력
		
		int serise = 0; // 답
		
		int k=0;
		while(k<66) {
			//네개 이상이 같으면 .만들고 ->serise = 1
			boolean visited[][] = new boolean[12][6];
			boolean chk = false;
			
			for(int i=0; i<12; i++) {
				for(int j=0; j<6; j++) {
					if(pan[i][j] !='.') {
						qu.clear();//초기화하고
						dfs(i,j, pan[i][j], visited);
						
						if(qu.size() >=4) {
							//qu에 있는거 다 빼서 .로 바꿔
							while(!qu.isEmpty()) {
								Pos p = qu.poll();
								pan[p.x][p.y] = '.';
							}
							chk = true;
						}
					}//if
				}
			}//for
			
			//내가 .가 아니고 && 내 밑이 존재하면서 && 밑이 .라면
			//끝까지밀기
			push();			
			
			if(chk == true)
				serise++;
			
			k++;
		}
		
		System.out.println(serise);
	}
}
