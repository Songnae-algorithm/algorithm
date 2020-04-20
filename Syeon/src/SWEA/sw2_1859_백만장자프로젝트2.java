package SWEA;

import java.util.*;

public class sw2_1859_백만장자프로젝트2 {
	public static void main(String[] args) {
	
		
		//끝에서부터 해야함 -> 어떤문제를 끝에서부터 봐줘야할까?
		
		//long 으로 해야함
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		for (int i = 1; i <= in; i++) {

			int a = sc.nextInt();// 입력 할 갯수

			int arr[] = new int[a];
			for (int j = 0; j < a; j++) {
				arr[j] = sc.nextInt();

			}
			long sum = 0;
			long max = 0;

			for (int j = arr.length - 1; j >= 0; j--) {
				if (max < arr[j]) {
					max = arr[j];
				} // max값보다 크면 max를 바꿔줌

				if (arr[j] < max) {
					sum += max - arr[j];
				} else {
					continue;
				}

			}

			System.out.println("#" + i + " " + sum);

		} // in

	}

}
