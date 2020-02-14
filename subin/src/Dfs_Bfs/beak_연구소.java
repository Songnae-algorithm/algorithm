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
	static public void comb(LinkedList<Poss> list,boolean visited[], int depth, int n, int r) {
		if(r==0) {
			//출력
			for(int i=0;i<n;i++) {
				if(visited[i] == true)
					System.out.print("x=" + list.get(i).x + " y=" + list.get(i).y + " | ");	
			}
			System.out.println(" ");
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
		
	}
	
	
	
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
		
		
		boolean visited[] = new boolean[pos.size()];
		//2. pos에 있는거 3개씩 꺼내서 순열 만들기
		comb(pos, visited, 0, pos.size(), 3);

		
	}
}
