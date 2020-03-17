package Dfs_Bfs;

import java.util.*;

public class beak_벽부수고이동하기 {

	static class Pos{
		int x; int y; int c; int d;
		
		Pos(int x, int y, int c, int d){
			this.x = x;
			this.y = y;
			this.c = c;
			this.d = d;
		}
	}

	static int answer;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.nextLine();
		
		int arr[][] = new int[n][m];
		//방문의 최소값을 visit할때마다 담을거니까, 방문의 값을 전부 max로 만든다
		int visited[][] = new int[n][m];
		
		
		for(int i=0;i<n; i++) {
			String s = sc.nextLine();
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		
		
		answer = Integer.MAX_VALUE; // 최대값으로 초기화 해놓은 후, n-1 m-1 만날때 마다 min 비교
		
		//bfs
		Queue<Pos> q = new LinkedList<>();
		
		q.add(new Pos(0,0,1,0)); //시작 위치, 이동거리는 1부터, 아직 벽을 안만났으니 0
		
		while(!q.isEmpty()) {
			Pos p = q.poll();
			
			int x = p.x; int y = p.y; int c = p.c;
			
			System.out.println(x + " " + y + " " + c);
			
			if(x == n-1 && y == m-1) { //도달하지않으면 answer 바뀌지않음
				answer = p.c;
				break;
			}
			
			
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				//visited[x][y] = 무한대, 0, 1 만 존재할 수 있고, p.d = 0,1 만 가능
				if(nx>=0 && nx<n && ny>=0 && ny<m) {
//					System.out.println(nx +" " + ny +" " +visited[nx][ny] + " " + p.d);
					
					if(visited[nx][ny] > p.d) { //현재의 drill이 visited보다 작을때만 수행한다.
						
						if(arr[nx][ny] == 0) {//벽이 아니라면
							q.add(new Pos(nx,ny,c+1,p.d));
							visited[nx][ny] = p.d; // 0이면 갈 수 있는거고, 아니면 밑의 else를 타야하기때문에
						}
						else {//벽일 때 ->d가 0일때만 들어오기때문에 p가 1초과일 수는 없다!!!
							if(p.d == 0) {
								q.add(new Pos(nx,ny,c+1, p.d+1)); //d+1증가
								visited[nx][ny] = p.d+1;
							}
						}
					}
				}
			}//for
			
		}//while
		
		if(answer == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(answer);
		
	}
}
