package Programmers;

public class pr3_멀리뛰기 {

	public static long solution(int n) {
		long answer = 0;

		long arr[] = new long[2001];

		arr[1] = 1;
		arr[2] = 2;

		for (int i = 3; i <= n; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
			// System.out.println(arr[i]);
		}

		System.out.println(arr[n]);
		return arr[n];

	}

	public static void main(String[] args) {
		solution(4);// 5
	}
}
