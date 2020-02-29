package BOJ;

import java.util.*;

class Pos {
	int x;
	int y;
	int count;

	Pos(int x, int y, int count) {
		this.x = x;
		this.y = y;
		this.count = count;
	}
}

//한번에 여러개를 받음....

public class boj_7576_토마토 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 열6
		int b = sc.nextInt(); // 행 4

		int arr[][] = new int[b][a];

		Queue<Pos> qu = new LinkedList<>();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				int k = sc.nextInt();
				arr[i][j] = k;

				if (k == 1)//배열에 1인게 포함되면....
					qu.add(new Pos(i, j, 0));//qu에 값 입력할 떄 이렇게 new 를 이용.....
			}
		}

		int answer = 0;
		// bfs
		while (!qu.isEmpty()) {
			Pos p = qu.remove(); //qu에서 값을 뺌과 동시에 Pos 형태의 p 에 저장... (int p = qu.remove 로 쓰는것처럼)
			int x = p.x;//p의 x값 
			int y = p.y; //p의 y값
			int count = p.count;//p의 count 값 
			answer = count;//count를 받아서 answer에 넣어줌 

			//
			
			int dx[] = { -1, 1, 0, 0 };
			int dy[] = { 0, 0, 1, -1 };

			//사방을 봐줌 
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < b && ny >= 0 && ny < a && arr[nx][ny] == 0) {
					//범위 내에있고 새로운 배열값이 0일때 
					arr[nx][ny] = 1; //1로 바꿔주기
					qu.add(new Pos(nx, ny, count + 1));//다시 qu에 새로운 값 저장 
				}
			}

		}

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				if (arr[i][j] == 0) { //하나라도 안익은게있으면 -1리턴
					answer = -1;
				}

			}
		}
		System.out.println( answer);

	}

}
