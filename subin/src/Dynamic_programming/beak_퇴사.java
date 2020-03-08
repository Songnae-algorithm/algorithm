package Dynamic_programming;

import java.util.*;

public class beak_퇴사 {

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
			
			if(day <=n) //시간안에 끝나면
				dp[i] = Math.max(p[i] + dp[day], dp[i+1]);
			else // 시간안에 못끝나는 일이면
				dp[i] = dp[i+1]; //다음날부터 가질수있는 최대값을 넣는다
		}
		
		System.out.println(dp[1]);
		
	}
}
