package Simulation;

import java.util.*;

public class beak_로봇청소기 {
	
	static class Pos{
		int x;
		int y;
		int d;
		
		Pos(int x, int y, int d){
			this.x = x;
			this.y = y;
			this.d = d;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n][m];
		
		Pos start = new Pos(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Queue<Pos> qu = new LinkedList<Pos>();
		int answer = 0;
		int dx[] = {0, 0, 1, -1};
		int dy[] = {1,-1, 0, 0};
		qu.offer(start);

		
		//벽 - 1, 청소x - 0, 청소o - 2
		while(true) {
			//현재 위치를 청소한다.
			Pos now = qu.poll();
			arr[now.x][now.y] = 2;
			answer ++;
			System.out.println("now.x -> "+now.x + " now.y -> " + now.y + " now.d ->" +now.d);
			
			//a.왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진
			if(now.d == 0 && now.y-1>=0 && now.y-1<m && arr[now.x][now.y-1] == 0) {
				System.out.println("1");
				qu.offer(new Pos(now.x, now.y-1, 3));
				//continue;
			}
			if(now.d == 1 && now.x-1>=0 && now.x-1<n && arr[now.x-1][now.y] == 0) {
				System.out.println("2");
				qu.offer(new Pos(now.x-1, now.y, 0));
				//continue;
			}
			if(now.d == 2 && now.y+1>=0 && now.y+1<m && arr[now.x][now.y+1] == 0) {
				System.out.println("3");
				qu.offer(new Pos(now.x, now.y+1, 1));
				//continue;
			}
			if(now.d == 3 && now.x+1>=0 && now.x+1<n && arr[now.x+1][now.y] == 0) {
				System.out.println("4");
				qu.offer(new Pos(now.x+1, now.y, 2));
				//continue;
			}

			//b.왼쪽 방향에 청소할 공간이 없다면 == 벽이라면 or 청소했다면, 그 방향으로 회전하고 2번으로 돌아간다.
			if(now.d == 0 && now.y-1>=0 && now.y-1<m && (arr[now.x][now.y-1] == 1 ||arr[now.x][now.y-1] == 2)) {
				System.out.println("5");
				qu.offer(new Pos(now.x, now.y, 3));
				//continue;
			}
			if(now.d == 1 && now.x-1>=0 && now.x-1<n && (arr[now.x-1][now.y] == 1||arr[now.x-1][now.y] == 2)) {
				System.out.println("6");
				qu.offer(new Pos(now.x, now.y, 0));
				//continue;
			}
			if(now.d == 2 && now.y+1>=0 && now.y+1<m && (arr[now.x][now.y+1] == 1 ||arr[now.x][now.y+1] == 2)) {
				System.out.println("7");
				qu.offer(new Pos(now.x, now.y, 1));
				//continue;
			}
			if(now.d == 3 && now.x+1>=0 && now.x+1<n && (arr[now.x+1][now.y] == 1 || arr[now.x+1][now.y] == 2)) {
				System.out.println("8");
				qu.offer(new Pos(now.x, now.y, 2));
				//continue;
			}
			
			//c.네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
			int check = 0;
			for(int k=0;k<4;k++) {
				int new_x = now.x + dx[k];
				int new_y = now.y + dy[k];
				
				if(new_x>=0 && new_x<n && new_y>=0 && new_y<m && (arr[new_x][new_y]==1 ||arr[new_x][new_y]==2)) {
					System.out.println("9");
					check++;
				}
			}
			if(check==4) { //d.방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
				if(now.d == 0){
					System.out.println("10");
					if(arr[now.x+1][now.y] == 1)
						break;
					else
						qu.offer(new Pos(now.x+1,now.y,now.d));
				}
				if(now.d == 1){
					System.out.println("11");
					if(arr[now.x][now.y-1] == 1)
						break;
					else
						qu.offer(new Pos(now.x,now.y+1,now.d));
				}
				if(now.d == 2){
					System.out.println("12");
					if(arr[now.x-1][now.y] == 1)
						break;
					else
						qu.offer(new Pos(now.x-1,now.y,now.d));
				}
				if(now.d == 3){
					System.out.println("13");
					if(arr[now.x][now.y+1] == 1)
						break;
					else
						qu.offer(new Pos(now.x,now.y+1,now.d));
				}
				
			}
		}
		
		System.out.println("answer = " + answer);
	}
}
