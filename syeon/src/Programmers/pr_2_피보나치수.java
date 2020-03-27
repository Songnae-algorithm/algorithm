package Programmers;

public class pr_2_피보나치수 {

	public static int solution(int n) {

		int a = 0;
		int b = 1;

		int ans = 0;
		for (int i = 2; i <= n; i++) {
			ans = (a + b) % 1234567;
			a = b % 1234567;
			b = ans % 1234567;

		}

		return ans;

	}

	/*
	 * public long fibonacci(int num) { long answer = 0; long[] dp = new
	 * long[num+1]; dp[0]=0;dp[1]=1;
	 * 
	 * for(int i = 2 ; i<=num;i++){ dp[i] = dp[i-1]+dp[i-2]; }
	 * 
	 * return dp[num]; }
	 * 
	 */

	public static void main(String[] args) {

		solution(3);
		solution(5);
	}

}
