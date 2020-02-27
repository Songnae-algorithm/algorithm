package BOJ;

import java.util.*;

public class boj_2486_안전영역 {

	
	int dx[]= {0,0,-1,1};
	int dy[]= {1,-1,0,0};
	//상,하,좌,우
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int arr[][] = new int[a][a];
//		boolean chk[] = new boolean[arr.length];// boolean을 선언하면 모두 다 false로 되어있음 따로 초기화 x

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
	
	}
}
