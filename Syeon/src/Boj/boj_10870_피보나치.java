package Boj;

import java.util.*;

public class boj_10870_피보나치 {
	static int ans = 0;

	public static int fib(int a) {

		if (a <= 1) {
			ans = a;//1보다 작거나 같을때 a 리턴 (f(0)=0, f(1) = 1 리턴 ) 
		}

		else {
			ans = fib(a - 1) + fib(a - 2); //2보다 클 때
		}

		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		fib(a);
		System.out.println(ans);

	}

}
