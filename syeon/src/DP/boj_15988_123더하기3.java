package DP;

import java.util.*;

public class boj_15988_123더하기3 {

	public static void main(String[] args) {
			
			//출력형식을 long으로.....그리고 arr에 입력할떄부터 나눠서 입력 

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		long arr[] = new long[1000001];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;

		for (int i = 4; i < arr.length; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2] + arr[i - 3]) % 1000000009;
		}

		for (int i = 0; i < in; i++) {
			int a = sc.nextInt();
			System.out.println(arr[a]);
		}
	}

}
