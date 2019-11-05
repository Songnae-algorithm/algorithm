package swea;

import java.util.*;

public class sw2072_홀수만더하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int num[] = new int[10];

		int sum[] = new int[k];

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 10; j++) {
				num[j] = sc.nextInt();

				if (!(num[j] % 2 == 0)) {
					sum[i] += num[j];
				}

			}
		}

		for (int i = 0; i < k; i++) {
			System.out.println("#"+(i+1)+" "+sum[i]);
		}
	}
}
