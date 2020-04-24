package Dfs_Bfs;

import java.util.*;

public class beak_빙산_re {
	static class Pos{
		int x;
		int y;
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static int arr[][];
	static boolean visited[][];
	static int n;
	static int m;
	static LinkedList<Pos> tozero;
	static LinkedList<Pos> notzero;
	
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static boolean melt() {
		boolean b = false;
		
		int a_size = notzero.size();
		for(int i=0; i<a_size; i++) {
			//사방 보면서 0이되면 tozero에 넣고, 0보다 크면 값 바꿔주고 위치 다시 넣고
			Pos p = notzero.poll();
			int cnt = 0;
			for(int j=0; j<4; j++) {
				int nx = p.x + dx[j];
				int ny = p.y + dy[j];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny] == 0)
					cnt++;
			}
			
			if(arr[p.x][p.y] - cnt > 0) {
				arr[p.x][p.y] -= cnt;
				notzero.add(new Pos(p.x, p.y));
				b = true;
			}
			else
				tozero.add(new Pos(p.x,p.y));
		}
		
		int b_size = tozero.size();
		for(int i=0; i<b_size; i++) {
			Pos p = tozero.poll();
			arr[p.x][p.y] = 0;
			visited[p.x][p.y] = false;
		}
		
		return b; // false라는건 0만 있다는 뜻
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr= new int[n][m];
		
		tozero = new LinkedList<>();
		notzero = new LinkedList<>();
		visited= new boolean [n][m];
		
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String s[] = sc.nextLine().split(" ");
			for(int j=0; j<m; j++) {
				int x = Integer.parseInt(s[j]);
				arr[i][j] = x;
				if(x !=0) {
					notzero.add(new Pos(i,j));
					visited[i][j] = true;
				}
			}
		}

		
		int year = 0;
		while(true) {
			
			if(!melt()) {
				year = 0;
				break;
			}
			//visited
			boolean ck[][] = new boolean [n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++)
					ck[i][j] = visited[i][j];
			}
			

			int size = 0;
			int c_size = notzero.size();
			for(int i=0; i<c_size; i++) {
				Pos p = notzero.get(i);
				if(ck[p.x][p.y] == true) {
					size++;
					Queue<Pos> qu = new LinkedList<>();
					qu.add(p);
					ck[p.x][p.y] = false;
					while(!qu.isEmpty()) {
						Pos pp = qu.poll();
						for(int j=0; j<4; j++) {
							int nx = pp.x + dx[j];
							int ny = pp.y + dy[j];
							
							if(nx>=0 && nx<n && ny>=0 && ny<m && ck[nx][ny] == true) {
								qu.add(new Pos(nx,ny));
								ck[nx][ny] = false;
							}
						}
					}

				}
				
			}
			
			year++;
			
			if(size >=2)
				break;
		}
		
		System.out.println(year);
	}
}
