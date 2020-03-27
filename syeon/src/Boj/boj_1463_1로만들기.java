package Boj;

import java.util.*;

public class boj_1463_1로만들기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int d[] = new int[a + 1];

		d[0] = 0;
		d[1] = 0;

		for (int i = 2; i <= a; i++) {
			if (i % 3 == 0 && i % 2 == 0) {// 3과 2로 둘다나눠질 때

				d[i] = Math.min(d[i / 3], Math.min(d[i / 2], d[i - 1])) + 1;

				// d[i]에는 3으로 나눈값과 (2로나눈값,-1한값의 최솟값) 의 최솟값 +1
			} else if (i % 3 == 0) {
				d[i] = Math.min(d[i / 3], d[i - 1]) + 1;
				// d[i]에는 3으로 나눈값과 -1한 값의 최솟값 +1

			} else if (i % 2 == 0) {
				d[i] = Math.min(d[i / 2], d[i - 1]) + 1;
				// 2로나눈값과 -1한값의 최솟값 +1
			} else {
				d[i] = d[i - 1] + 1;

			}
		}
		System.out.println(d[a]);

	}

}
