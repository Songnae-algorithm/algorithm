package Simulation;

import java.util.*;

public class beak_로봇청소기 {
	
	static class Pos{
		//초기화 하는거 잊지 말자
		int x=0;
		int y=0;
		int d=0;
		
		Pos(int x, int y, int d){
			this.x = x;
			this.y = y;
			this.d = d;
		}
		
	}
	
	static int rotate(int d) {
		if(d==0)
			return 3;
		else
			return d-1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n][m];
		Queue<Pos> qu = new LinkedList<Pos>();
		
		qu.offer(new Pos(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//왼쪽으로
		int dx[] = {-1,0,1,0};
		int dy[] = {0,1,0,-1};
		
		
		//벽 - 1, 청소x - 0, 청소o - 2
		int answer = 0;
		
		for(int j=0; j<70; j++) {
			//현재 위치를 꺼내서 청소한다.
			int cantClean = 0;
			Pos now = qu.poll();
			
			if(arr[now.x][now.y] == 0) {
				arr[now.x][now.y] = 2;
				answer++;
			}
			
			System.out.println("x " + now.x + " y " + now.y);
			
			//현재 방향에서 왼쪽 4개 다 탐색
			for(int i=0;i<4; i++) {//회전하고 전진이니까 now.d = 0일경우 3으로 바꿔준 애의 왼쪽부터
				int tox = now.x + dx[rotate(now.d)];
				int toy = now.y + dy[rotate(now.d)];
				
				//a. 청소 안한 곳 있으면 회전하고 continue
				if(tox>=0 && tox<n && toy>=0 && toy<m && arr[tox][toy]== 0) {
					qu.offer(new Pos(tox, toy, rotate(now.d)));
					cantClean = 0;
					break;
				}
				
				else if(tox>=0 && tox<n && toy>=0 && toy<m && (arr[tox][toy]== 1|| arr[tox][toy]==2)) {
					qu.offer(new Pos(now.x, now.y, rotate(now.d)));
					cantClean++;
				}
			}
			
			if(cantClean == 4) { // 왼쪽으로 네번 다 돌았는데  1벽이거나 2 청소가 돼있으면 방향 유지한 채 후진한다
				int back_x = now.x - dx[now.d];
				int back_y = now.y- dy[now.d];
				qu.offer(new Pos(back_x, back_y, now.d));
		
				//만약 후진한 곳이 벽이라면 끝낸다 - 종료
				if((back_x<0 || back_x>=n || back_y <0 || back_y>=m)  || arr[back_x][back_y] == 1) {
					break;
				}
			}
			
			
		}//while
		
		System.out.println(answer);
	}
}








//int answer = 0;
//int dx[] = {0, 0, 1, -1};
//int dy[] = {1,-1, 0, 0};
//qu.offer(start);
//
//
////벽 - 1, 청소x - 0, 청소o - 2
//while(true) {
//	//현재 위치를 청소한다.
//	Pos now = qu.poll();
//	if(arr[now.x][now.y] == 0) {
//		arr[now.x][now.y] = 2;
//		answer ++;
//	}
//	
//	System.out.println("now.x -> "+now.x + " now.y -> " + now.y + " now.d ->" +now.d);
//	
//	//a.왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진
//	if(now.d == 0 && now.y-1>=0 && now.y-1<m && arr[now.x][now.y-1] == 0) {
//		System.out.println("1");
//		qu.offer(new Pos(now.x, now.y-1, 3));
//		continue;
//	}
//	if(now.d == 1 && now.x-1>=0 && now.x-1<n && arr[now.x-1][now.y] == 0) {
//		System.out.println("2");
//		qu.offer(new Pos(now.x-1, now.y, 0));
//		continue;
//	}
//	if(now.d == 2 && now.y+1>=0 && now.y+1<m && arr[now.x][now.y+1] == 0) {
//		System.out.println("3");
//		qu.offer(new Pos(now.x, now.y+1, 1));
//		continue;
//	}
//	if(now.d == 3 && now.x+1>=0 && now.x+1<n && arr[now.x+1][now.y] == 0) {
//		System.out.println("4");
//		qu.offer(new Pos(now.x+1, now.y, 2));
//		continue;
//	}
//
//	//b.왼쪽 방향에 청소할 공간이 없다면 == 벽이라면 or 청소했다면, 그 방향으로 회전하고 2번으로 돌아간다.
//	if(now.d == 0 && now.y-1>=0 && now.y-1<m && (arr[now.x][now.y-1] == 1 ||arr[now.x][now.y-1] == 2)) {
//		System.out.println("5");
//		qu.offer(new Pos(now.x, now.y, 3));
//		//continue;
//	}
//	if(now.d == 1 && now.x-1>=0 && now.x-1<n && (arr[now.x-1][now.y] == 1||arr[now.x-1][now.y] == 2)) {
//		System.out.println("6");
//		qu.offer(new Pos(now.x, now.y, 0));
//		//continue;
//	}
//	if(now.d == 2 && now.y+1>=0 && now.y+1<m && (arr[now.x][now.y+1] == 1 ||arr[now.x][now.y+1] == 2)) {
//		System.out.println("7");
//		qu.offer(new Pos(now.x, now.y, 1));
//		//continue;
//	}
//	if(now.d == 3 && now.x+1>=0 && now.x+1<n && (arr[now.x+1][now.y] == 1 || arr[now.x+1][now.y] == 2)) {
//		System.out.println("8");
//		qu.offer(new Pos(now.x, now.y, 2));
//		//continue;
//	}
//	
//	//c.네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
//	int check = 0;
//	for(int k=0;k<4;k++) {
//		int new_x = now.x + dx[k];
//		int new_y = now.y + dy[k];
//		
//		if(new_x>=0 && new_x<n && new_y>=0 && new_y<m && (arr[new_x][new_y]==1 ||arr[new_x][new_y]==2)) {
//			System.out.println("9");
//			check++;
//		}
//	}
//	if(check==4) { //d.방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
//		if(now.d == 0){
//			System.out.println("10");
//			if(arr[now.x+1][now.y] == 1)
//				break;
//			else
//				qu.offer(new Pos(now.x+1,now.y,now.d));
//		}
//		if(now.d == 1){
//			System.out.println("11");
//			if(arr[now.x][now.y-1] == 1)
//				break;
//			else
//				qu.offer(new Pos(now.x,now.y-1,now.d));
//		}
//		if(now.d == 2){
//			System.out.println("12");
//			if(arr[now.x-1][now.y] == 1)
//				break;
//			else
//				qu.offer(new Pos(now.x-1,now.y,now.d));
//		}
//		if(now.d == 3){
//			System.out.println("13");
//			if(arr[now.x][now.y+1] == 1)
//				break;
//			else
//				qu.offer(new Pos(now.x,now.y+1,now.d));
//		}
//		
//	}
//}
//
//System.out.println("answer = " + answer);
//}