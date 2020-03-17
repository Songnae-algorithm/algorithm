package Dfs_Bfs;

import java.util.*;

public class beak_촌수계산 {
	
	static class Pos{
		int x;
		int  cnt;
		
		Pos(int x, int cnt){
			this.x = x;
			this.cnt = cnt;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n+1][2];
		int visited[] = new int[n+1];
		
		int x = sc.nextInt(); int y = sc.nextInt();// 찾아야할 촌수
		
		int answer = -1;
		
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}//for
		
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x,0)); // 시작점 넣기

		//bfs
		while(!q.isEmpty()) {
			Pos p = q.poll();
			int px = p.x;
			visited[px] = 1;
			
			if(px == y) {
				answer = p.cnt;
				break;
			}
			
			for(int i=1; i<=n; i++) {
				if(arr[i][0] == px && visited[arr[i][1]] == 0)
					q.add(new Pos(arr[i][1], p.cnt+1));
				else if(arr[i][1] == px && visited[arr[i][0]] ==0)
					q.add(new Pos(arr[i][0], p.cnt+1));
			}
			
		}//while
		
		System.out.println(answer);
	}
}
