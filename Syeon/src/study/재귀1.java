package study;

//https://programmingfbf7290.tistory.com/entry/2-간단하고-쉬운-재귀Recursion-알고리즘-문제-풀이?category=675680

import java.util.*;

public class 재귀1 {

	public static void main(String[] args) {
		// x^n

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		// int n = sc.nextInt();

//		int x_n = (x_n(x, n));
//		int fib = fib(x);
//		int gdc = gdc(x, n);

		//String str = sc.next();
		//Str(str);
		// System.out.println(gdc);

		two(x);
	}

	private static int x_n(int x, int n) {
		if (n == 0) {
			return 1;
		}

		return x_n(x, n - 1) * x;
	}

	private static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	private static int gdc(int x, int y) { // 기본 : x<y일때
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}

		if (x % y == 0) {
			return y;

		}
		return gdc(x, x % y);
	}

	private static void Str(String str) {
		if (str.length() == 0) {
			return;
		} else {
			System.out.println(str.charAt(0));
			Str(str.substring(1)); // substring 하면 지정숫자 (1)부터 끝 까지

		}
	}

	private static void two(int x) {
		if (x < 2) {
			System.out.print(1);

		} else {
			two(x / 2);
			System.out.print(x % 2);

		}
	}

}
