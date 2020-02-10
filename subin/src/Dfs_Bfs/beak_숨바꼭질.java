package Dfs_Bfs;

import java.util.*;

public class beak_숨바꼭질 {

	//다 넣고 넣고 해봐도 찾을 수 있다. But 단 한번! 들렀던 곳의 움직임 횟수가 죄소라는 것을 명심하자. 따라서 한번 pop해 움직인 곳은 여러번 움직여도 최소가 될 수 없다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int subin[] = new int[100001];
		
		Queue<Integer> qu = new LinkedList<Integer>();
		
		qu.offer(n);
		
		while(!qu.isEmpty()) {
			int now = qu.poll();
			
			if(now == k) {
				System.out.println(subin[now]);
				break;
			}
			int next = 0;
			
			for(int i=0;i<3;i++) {
				if(i==0)
					next = now-1;
				if(i==1)
					next = now+1;
				if(i==2)
					next = now*2;
				
				//방문 했던 곳을 또 방문한다면 최소로 갈 수 없다
				if(next>=0 && next<=100000 && subin[next]==0){
					qu.offer(next);
					subin[next] = subin[now] +1;
				}
			}
		}//while
		
	}
}
