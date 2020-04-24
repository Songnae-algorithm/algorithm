package Greedy;

import java.util.*;

public class boj_1946_신입사원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int arr[] = new int[b + 1];
			boolean chk[] = new boolean[b + 1];
			int answer = 0;

			for (int j = 0; j < b; j++) {
				int idx = sc.nextInt(); // 서류점수를 인덱스로 이용한다.
				arr[idx] = sc.nextInt();
			}

			int midx = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 1) {
					midx = j;
				}
			}
			// 면접순위 1인것의 인덱스

			for (int j = b; j >= 2; j--) {
				if (arr[j] > arr[1] || j > midx) { // arr[1], 즉 서류순위가 1인것의 값보다 크거나, index의 값이 midx보다(면접순위)보다 클 때 true로
					// 바꿔줌
					chk[j] = true;
				}

			}
			for (int j = 1; j < chk.length; j++) {
				if (chk[j] == false) {
					answer++;
				}
			} // false인 경우 answer ++;
			System.out.println(answer);
		} // here

	}

}

//왜 틀렸을까요 ? 
