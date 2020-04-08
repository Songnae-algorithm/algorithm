package Dfs_Bfs;

import java.util.*;

//50min -> dfs로 인한 시간초과..ㅎ
//bfs로 다시
public class beak_빙산 {

	static class Pos{
		int x;
		int y;
		
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	
	static int arr[][];
	static int visited[][];
	static int n;
	static int m;
	
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static boolean melt() {	
		boolean b = true;
		
		Queue<Pos> qu = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				
				if(arr[i][j] != 0) {
					b = false;
					int chk = 0;
					for(int k=0; k<4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx>=0 &&nx<n && ny>=0 && ny<m && arr[nx][ny] ==0)
							chk++;
					}
					
					if(arr[i][j] - chk <= 0)
						qu.add(new Pos(i,j));
					else
						arr[i][j] -= chk;
				}
			}
		}
		
		while(!qu.isEmpty()) {
			Pos p = qu.poll();
			arr[p.x][p.y] = 0;
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr= new int[n][m];
		visited = new int[n][m];

		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			String sp[] = s.split(" ");
			
			for(int j=0; j<m; j++)
				arr[i][j] = Integer.parseInt(sp[j]);
		}
		
		int answer = 0;
		int year = 1;
		
		while(true) {
			//하나라도 안걸리면 전부 0이라는 소리니까 빠져 나가기
			if(melt())
				break; // 빙산 녹이기

			int size = 0;

			Queue<Pos> qu = new LinkedList<>();
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					//visited에는 전년도값, year은 이번년도 값이기때문에, visited가 같거나 크면 continue;
					if(arr[i][j] == 0 || visited[i][j] >= year)
						continue;
					//아니면 빙하가 있는거니까
					size++;
					visited[i][j] = year;
					qu.add(new Pos(i,j));
					
					//qu랑 닿아있는부분 전부 year로 교체
					while(!qu.isEmpty()) {
						Pos p = qu.poll();
						
						for(int k =0; k<4; k++) {
							int nx = p.x +dx[k];
							int ny = p.y +dy[k];
							
							//visited에는 전년도값, year은 이번년도 값이기때문에,전년도가 이번보다 작을때만 들어감
							if(nx>=0 &&nx<n && ny>=0 && ny<m && arr[nx][ny] !=0 && visited[nx][ny] < year){
								visited[nx][ny] = year;
								qu.add(new Pos(nx,ny));
							}
						}
					}//while
				}//in for
			}//out for
			
			
			if(size>=2) {
				answer = year;
				break;
			}
			
			year++;
		}//while
		
		//year가 아니고 answer을 넣어야함
		System.out.println(answer);
	}
}