package DP;

import java.util.*;
public class beak_re_퇴사 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int t[] = new int[n+2];
		int p[] = new int[n+2];
		
		for(int i=1; i<=n;i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
	
		int dp[] = new int[n+2];
		for(int i=n; i>0; i--) {//끝에서부터
			int day = i +t[i]; //일 끝나는 시간
			
			if(day <=n+1) // 끝나는 시간이 n안쪽이면 (k라면) k 날의 값도 가질 수 있다
				dp[i] = Math.max(p[i] + dp[day], dp[i+1]);
			else // 시간안에 못끝나는 일이면
				dp[i] = dp[i+1]; // 자기자신은 값을 못가지니까 다음날의 값, 만약 다음날도 값이 없다면? 계속 0이겠지
		}
		
		System.out.println(dp[1]);
		
	}
}
