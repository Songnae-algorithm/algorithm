package Dfs_Bfs;

import java.util.*;

//40min
public class beak_나이트의이동 {

	static class Pos{
		int x;
		int y;
		int cnt;
		
		Pos(int x,int y,int cnt){
			this.x =x;
			this.y =y;
			this.cnt = cnt;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			int arr[][] = new int[m][m];
			
			sc.nextLine();
			
			Queue<Pos> qu = new LinkedList<>();
			String a[] = sc.nextLine().split(" ");
			qu.add(new Pos(Integer.parseInt(a[0]),Integer.parseInt(a[1]),0));
			arr[Integer.parseInt(a[0])][Integer.parseInt(a[1])] = 1;
			
			String b[] = sc.nextLine().split(" ");
			int endx = Integer.parseInt(b[0]); int endy = Integer.parseInt(b[1]);
			
			while(!qu.isEmpty()) {
				Pos now = qu.poll();
				int nowx = now.x;
				int nowy = now.y;
				
				if(nowx == endx && nowy == endy) {
					System.out.println(now.cnt);
					break;
				}
				
				int dx[] = {-2,-2,-1,-1, 1,1, 2,2};
				int dy[] = {-1, 1,-2, 2,-2,2,-1,1};
				
				for(int j=0; j<8; j++) {
					int nx = nowx + dx[j];
					int ny = nowy + dy[j];
					
					if(nx>=0&&nx<m &&ny>=0&&ny<m && arr[nx][ny]==0){
						arr[nx][ny] = 1;
						qu.add(new Pos(nx,ny,now.cnt+1));
					}
				}
				
			}//while
			
		}
	}
}
