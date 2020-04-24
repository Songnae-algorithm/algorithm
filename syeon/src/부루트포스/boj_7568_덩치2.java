package 부루트포스;

import java.util.*;

public class boj_7568_덩치2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();// 입력받을 갯수
		int arr[][] = new int[a][2]; // 값 입력
		int rank[] = new int[a]; // 등수 출력

		for (int i = 0; i < a; i++) {//값 입력
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			rank[i] = 1; // 등수를 1로 초기화함

		}

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < a; j++) {

				if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					rank[j]++;
				}
			}

		}
		//for 돌면서 자기 자신보다 키도작고 몸무게도 작은게 있으면 그 작은거에 rank ++		
		
		for (int i = 0; i < a; i++) {
			System.out.print(rank[i] + " ");
		}

	}

}
