package 부루트포스;

import java.util.*;

public class boj_7568_덩치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		int arr[][] = new int[in][2];
		int rank[] = new int[in];


		for (int i = 0; i < in; i++) {
			rank[i] = 1;// 전부 1로 초기화
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		// 배열입력

		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++) {
				if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					rank[j] = rank[j] + 1; // 키, 몸무게가 모두 자기자신보다 크면 rank에 ++
				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
	}

}
