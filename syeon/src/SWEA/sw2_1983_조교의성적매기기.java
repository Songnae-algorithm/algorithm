package SWEA;

import java.util.*;

public class sw2_1983_조교의성적매기기 {
	static String grade[] = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();

		for (int a = 1; a <= in; a++) {
			int N = sc.nextInt(); // 사람수
			int K = sc.nextInt();// 선택할 K

			double arr[] = new double[N + 1];

			// int

			// int rank[] = new int[N + 1];
			int cnt = 0;

			for (int i = 1; i <= N; i++) {
				int fir = sc.nextInt();
				int se = sc.nextInt();
				int fin = sc.nextInt();

				arr[i] = fir * 0.35 + se * 0.45 + fin * 0.2;

			}
			// 값 계산해서 데이터 입력(1~N까지)

//			for (int i = 1; i <= N; i++) {
//				for (int j = 1; j <= N; j++) {
//					if (arr[i] < arr[j]) {
//						rank[i]++;
//
//					}
//				}
//			} // 순위를 입력 1등일경우 여기서는 rank값이 0임
			// 나보다 큰게 있으면 순위를 ++

			// 근데 굳이 모두의 등수를 구할 필요가 없었네?내가 원하는 애가 다른애들보다 얼만큼이나 작은지만 알면 된다 그럼 for문을 1번만 돌아도
			// 되네..?

			for (int i = 1; i <= N; i++) {
				if (arr[i] > arr[K]) {
					cnt++;
				}
			}

			System.out.println("#" + a + " " + grade[cnt / (N / 10)]);

		} // in
	}

}
