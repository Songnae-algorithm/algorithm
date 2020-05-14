package Dynamic_programming;

import java.util.*;
public class beak_오르막수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//n이 1000까지면, 자리수가 1000...? 이건 배열로도 못만드는데....?
		
		int dp[][] = new int[n+1][10]; //0,1,2,3,4,5,6,7,8,9
		
		//한자리일때는, 자기자신보다 크거나 작은 수가 없으므로 1
		//따라서 한자리일때 계산은 dp[1][]층의 값을 전부 더하면 된다
		for(int i=0; i<10; i++)
			dp[1][i] = 1;
		
		for(int i=2; i<=n; i++) {//i층 =행
			for(int j=0; j<10; j++) {//j =열
				for(int k=0; k<=j; k++) {
					dp[i][j] += dp[i-1][k];
				}
				//나누기 필수
				dp[i][j] %= 10007;
			}
		}
		
		int sum = 0;
		for(int i=0; i<10; i++)
			sum += dp[n][i];
		
		System.out.println(sum);
		
	}//main
}

//참고 블로그
//https://fbtmdwhd33.tistory.com/74