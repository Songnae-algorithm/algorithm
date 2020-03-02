package BOJ;

import java.util.*;

public class boj_10802_팩토리얼 {

	static int ans = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		factorial(a);
		System.out.println(ans);
	}

	private static int factorial(int a) {

		if (a > 1) {

			ans = a * factorial(a - 1);
		}

		return ans;

	}
}
