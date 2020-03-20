package Dfs_Bfs;

import java.util.*;
public class beak_케빈베이컨의6단계법칙 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean connect[][] = new boolean[n+1][n+1];
		int cnt[] = new int[n+1];
		
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			connect[x][y] = connect[y][x] = true;
		}
		
		for(int i=1; i<=n; i++) {//다 넣어봐야 되니까
			Queue<Integer> q = new LinkedList<>();
			q.add(i);
			boolean visited[] = new boolean[n+1];
			int c[] = new int[n+1];
			visited[0] = visited[i] = true; // 1을 방문으로 해놓아야 하는게 아니고 i를 해놔야함
			
			while(!q.isEmpty()) {
				int x = q.poll();
				for(int j=1;j<=n; j++) {
					if(connect[x][j] && !visited[j]) {
						q.add(j);
						visited[j]= true;
						c[j] = c[x]+1; // 아 정신차리자 j도 i도 아닌 x잖아.....!
						cnt[i] += c[j];
					}
				}
			}//while
		}
		
		int min = Integer.MAX_VALUE;
		int idx = 0;
		
		for(int i=cnt.length-1; i>=1; i--) {
			if(min >= cnt[i]) {
				min = cnt[i];
				idx = i;
			}
		}
		
		System.out.println(idx);
	}
}
