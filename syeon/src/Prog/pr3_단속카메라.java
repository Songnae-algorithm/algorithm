package Prog;

import java.util.*;

public class pr3_�ܼ�ī�޶� {

	public static int solution(int[][] routes) {
		int answer = 0;

		int min = Integer.MAX_VALUE;
		int mini = 0;
		boolean chk[] = new boolean[routes.length];

		for (int k = 0; k < routes.length; k++) {
			if (chk[k] == false) {

				for (int i = 0; i < routes.length; i++) {

					if (min > routes[i][1] && chk[i] == false) {
						min = routes[i][1];
						mini = i;// �ּڰ��ϋ��� i

					}

				}
				chk[mini] = true;
				System.out.println(routes[mini][0]);

				for (int i = 0; i < routes.length; i++) {
					if (routes[i][0] <= routes[mini][1] && chk[i] == false) {
						chk[i] = true;

					}

				}
				answer++;

			}
		}
		
		return answer;

	}

	public static void main(String[] args) {

		int arr[][] = { { -14, -5 }, { -20, 15 }, { -18, -13 }, { -5, -3 } };

		int arr2[][] = { { 0, 1 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };

		int arr3[][] = { { 0, 1 }, { 0, 1 }, { 1, 2 } };
		solution(arr);
	}
}
