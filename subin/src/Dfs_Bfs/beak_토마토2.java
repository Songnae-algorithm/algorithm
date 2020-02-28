package Dfs_Bfs;

import java.util.*;


//1h - half success
class Poos{
	int x;
	int y;
	int z;
	int day;
	
	Poos(int x, int y, int z, int day){
		this.x = x;
		this.y = y;
		this.z = z;
		this.day = day;
	}
	
}

public class beak_토마토2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n[] = sc.nextLine().split(" ");
		
		int y = Integer.parseInt(n[0]); // 열 -> 가로로 y개라는 뜻
		int x = Integer.parseInt(n[1]); // 행 -> 세로로 x개라는 뜻
		int z = Integer.parseInt(n[2]); // 높이
		
		int maze[][][] = new int[z][x][y]; // 맵에 데이터 넣기
		
		Queue<Poos> tomato = new LinkedList<>();
		
		//행개수만큼 넣고 -> 열 -> 높이
		for(int i=0;i<z;i++) {
			for(int j=0;j<x; j++) {
				//한줄씩 받아온거 행에 넣기 ->행 개수만큼
				String a[] = sc.nextLine().split(" ");
				for(int k=0;k<y; k++) {
					maze[i][j][k] =Integer.parseInt(a[k]);
					
					if(maze[i][j][k] == 1)
						tomato.add(new Poos(j,k,i,0));
				}//for - k
			}//for - j
		}//for - i
		
		int realday = 0;
		
		//bfs
		while(!tomato.isEmpty()) {
			Poos nowp = tomato.poll();
			realday = Math.max(realday, nowp.day);
			
			//꺼내서 6방향 살펴서 -> 0이면 1로만들고, tomato에 넣기
			int dx[] = {1,-1,0,0,0,0};
			int dy[] = {0,0,1,-1,0,0};
			int dz[] = {0,0,0,0,1,-1};
			
			for(int i=0; i<6;i++) {
				int nx = nowp.x + dx[i];
				int ny = nowp.y + dy[i];
				int nz = nowp.z + dz[i];
				
				if(nx>=0&&nx<x &&ny>=0&&ny<y &&nz>=0&&nz<z && maze[nz][nx][ny] == 0) {
					maze[nz][nx][ny] = 1; //익혀주고
					tomato.add(new Poos(nx,ny,nz, nowp.day+1));
				}
			}
		}
		
		boolean chk = false;
		
		for(int i=0;i<z;i++) {
			for(int j=0;j<x; j++) {
				for(int k=0;k<y; k++) {
					if(maze[i][j][k] == 0) {
						System.out.println("-1");
						chk=true;
						break;
					}
				}//for - k
			}//for - j
		}//for - i
		
		if(chk == false)
			System.out.println(realday);
		
	}
}

//https://fbtmdwhd33.tistory.com/33
