package review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Store {
	int x;
	int y;
	int cnt;

	Store(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}

public class b_2178_미로탐색3 {

	// 17:52 시작
	static int answer = 0;

	public static void bfs(int arr[][], int x, int y) {

		Queue<Store> qu = new LinkedList<Store>();// class를 저장할 store qu...!
		qu.add(new Store(x, y, 1));// 0,0,1입력 (0,0)부터 시작하고 처음 간 곳은 무조건 1로 설정해주니까

		int dx[] = { 0, 0, 1, -1 };
		int dy[] = { -1, 1, 0, 0 };

		while (!qu.isEmpty()) {

			Store s = qu.poll();
			int a = s.x;
			int b = s.y;
			int count = s.cnt;
			answer = count;
			//qu에 class를 이용해서 넣은 값을 하나하나 뺴주는 것...! 
			
			if (a == arr.length - 1 && b == arr[1].length - 1) {
				
				break;
			}//a가 마지막칸으로 가면 break

			for (int i = 0; i < 4; i++) {
				int nx = a + dx[i];
				int ny = b + dy[i];

				if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[1].length && arr[nx][ny] == 1) {
					arr[nx][ny] = 0;
					qu.add(new Store(nx, ny, count + 1));
					// 여기서 그냥 count++하면 안되고 count +1 또는 s.cnt+1로 넣어주어야한다ㅜㅜ
					//연결된 값을 qu에 add해 줌 

				}
			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();// 4
		int b = sc.nextInt();// 6

		int arr[][] = new int[a][b];

		for (int i = 0; i < a; i++) {
			String s = sc.next();
			for (int j = 0; j < b; j++) {
				arr[i][j] = s.charAt(j) - '0';

			}
		}
		// 배열입력
		bfs(arr, 0, 0);

		System.out.println(answer);
	}
}
