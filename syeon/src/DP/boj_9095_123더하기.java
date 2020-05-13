package DP;

import java.util.*;


import java.util.Scanner;

public class boj_9095_123더하기 {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();

		int arr[] = new int[11];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;

		for (int i = 4; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
		}

		for (int i = 0; i < in; i++) {
			int a = sc.nextInt();
			System.out.println(arr[a]);
		}
	}

}
