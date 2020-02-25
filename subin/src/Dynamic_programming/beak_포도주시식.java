package Dynamic_programming;

import java.util.*;

//30min
public class beak_포도주시식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}
				
		//1. dp1의 최대는 1잔 마셨을 경우
		dp[1] = arr[1];
		
		//2. dp2의 최대는 -> 1잔 + 2잔
		if(n>1) // n이 1일 수도 있기 때문에, n이 1일때는 arr[2] 없으므로 -> n>1라는 조건 걸어준다.
			dp[2] = arr[1] + arr[2];
		
		//3. dp3 부터는 계산 가능
		//연속으로 0잔 마실 경우 || 연속으로 1잔 || 연속으로 2잔   ->>마신 경우들의 max 값 넣기
		for(int i=3; i<=n; i++) { // i로 초기화했으면 i를 써야지 n을 쓰면 어떡하니!
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
		}
		
		System.out.println(dp[n]);
	}
}

// https://limkydev.tistory.com/112
