package Dfs_Bfs;

import java.util.*;

class Poss{
	int x;
	int y;
	
	Poss(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class beak_연구소 {
	
	static LinkedList<Poss> real = new LinkedList<Poss>();
	
	static public void comb(LinkedList<Poss> list,boolean visited[], int depth, int n, int r) {
		if(r==0) {
			//출력
			for(int i=0;i<n;i++) {
				if(visited[i] == true)
					real.add(new Poss(list.get(i).x, list.get(i).y));
					//System.out.print("x=" + list.get(i).x + " y=" + list.get(i).y + " | ");
			}
			return;
		}
		
		if(depth == n)
			return;
		
		else {
			visited[depth] = true;
			comb(list,visited,depth+1,n,r-1);
			
			visited[depth] = false;
			comb(list,visited,depth+1, n,r);
		}
		
	}//comb
	
	
	static void dfs(int arr[][], int x, int y) {
		arr[x][y] = 2;
		
		int dx[] = {0, 0, 1, -1};
		int dy[] = {1,-1, 0, 0};
		
		for(int i=0;i<4;i++) {
			int nowx = x + dx[i];
			int nowy = y + dy[i];
			
			if(nowx>=0 && nowx<arr.length && nowy>=0 && nowy<arr[0].length && arr[nowx][nowy] == 0)
				dfs(arr,nowx,nowy);
		}
	}//dfs
	
	
	//안전영역 최대
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n][m];
		LinkedList<Poss> pos = new LinkedList<>();
		
		//1. 배열에 0, 1, 2 넣는 동시에 0의 좌표 list에 넣어놓기
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int k = sc.nextInt();
				arr[i][j] = k;
				if(k == 0)
					pos.add(new Poss(i,j));	

			}
		}
		
		//2. pos에 있는거 3개씩 꺼내서 순열 만들기
		boolean visited[] = new boolean[pos.size()];
		comb(pos, visited, 0, pos.size(), 3);

		//3. 한번씩 다 해보기 - 3개씩 꺼낼거니까 /3만큼
		int answer = -1;
		
		while(!real.isEmpty()) {
			int copy_arr[][] = new int[n][m]; //arr로 초기화하고 시작
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++)
					copy_arr[i][j] = arr[i][j];
			}
			
			int max = 0;

			for(int i=0;i<3;i++) {
				int a =  real.get(0).x;
				int b =  real.get(0).y;
				
				real.remove(0);
				
				copy_arr[a][b] = 1; // 세개 벽 만들기
			}
			
			//dfs 돌리기 -> 바이러스 퍼트리기
			for(int i=0;i<copy_arr.length; i++) {
				for(int j=0;j<copy_arr[0].length; j++) {
					if(copy_arr[i][j] == 2)
						dfs(copy_arr,i,j);
				}
			}

			//0 개수 구하기
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(copy_arr[i][j] == 0)
						max++;
				}
			}
			
			answer = Math.max(answer, max);
			
		}
		
		System.out.println(answer);
	}
}