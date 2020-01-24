package Dfs_Bfs;

import java.util.*;

class Pos{
	int x;
	int y;
	
	Pos(int x,int y){
		this.x = x;
		this.y = y;
	}
}

public class beak_단지번호붙이기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n+1][n+1];
		
		for(int i=1;i<n+1; i++) {
			String a = sc.next();
			String aa[] = a.split("");
			for(int j=1;j<n+1; j++)
				arr[i][j] = Integer.parseInt(String.valueOf(aa[j-1]));
		}
		
		Queue<Pos> qu = new LinkedList<Pos>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int dx[] = {-1, 0, 0, 1};
		int dy[] = { 0,-1, 1, 0};
		
		//겹치는 부분이 없을테니까 1을 0으로 만들어서 0인부분은 방문 안하는걸로 처리한다.
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				//한번 만나면 다 돌떄까지 bfs -> 나와서 다시 다른 1찾는다.. 반복
				if(arr[i][j] == 1) {
					qu.offer(new Pos(i,j));
					arr[i][j] = 0;
					int answer = 0;
					
					while(!qu.isEmpty()) {
						Pos now = qu.poll(); //넣을 때 말고 poll할때 집의 수 하나찍 check & answer++
						answer++;
						
						for(int k=0;k<4;k++) {
							int new_x = now.x + dx[k];
							int new_y = now.y + dy[k];
							
							if(new_x >0 && new_x<n+1 && new_y >0 && new_y<n+1 && arr[new_x][new_y] == 1) {
								qu.add(new Pos(new_x, new_y));
								arr[new_x][new_y] = 0;
							}
						}
						
					}
					
					list.add(answer);
				}
			}//-in for
		}//-out for
		
		list.sort(null);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
