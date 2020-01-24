package Dfs_Bfs;

import java.util.*;

public class beak_미로탐색 {

	static class Pos{
		int x;
		int y;
		int count = 0;
		
		Pos(int x,int y,int count){
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n+1][m+1];
		
		for(int i=1;i<n+1; i++) {
			String a = sc.next();
			String s[] = a.split("");
			for(int j=1;j<m+1;j++)
				arr[i][j] = Integer.parseInt(String.valueOf(a.charAt(j-1)));
		}
		
		Queue<Pos> qu = new LinkedList<Pos>();
		int dx[] = {0, 0, 1,-1};
		int dy[] = {1,-1, 0, 0};
		

		qu.add(new Pos(1,1,1));
		arr[1][1] = 0;

		int answer = 0;
		
		while(!qu.isEmpty()) {
			Pos now = qu.poll();
			int x = now.x;
			int y = now.y;
			
			
			if(x == n && y == m){
				answer = now.count;
				break;
			}

			for(int k=0; k<4; k++) {
				int xx = x + dx[k];
				int yy = y + dy[k];
				if(xx>0 && xx<n+1 && yy>0 && yy<m+1 && arr[xx][yy] == 1) {
					qu.add(new Pos(xx,yy,now.count+1));
					arr[xx][yy] = 0;
				}
			}//for
		}//while
		
		System.out.println(answer);
	}
	
}
