package Dynamic_programming;

import java.util.Scanner;

public class beak_2xn타일링 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//[n+1]로 하지말고 [1001]로 해야 런타임 에러 안남!
		int arr[] = new int[1001];
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i=3;i<=n;i++) {
			//괄호 조심하자
			arr[i] = arr[i-1] + arr[i-2] % 10007;
		}
		
		System.out.println(arr[n]%10007);
	}
}

//참고 https://lmcoa15.tistory.com/5