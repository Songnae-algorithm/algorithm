package Greedy;

import java.util.*;

public class boj_1138_한줄로서기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int arr[] = new int[in + 1];
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = arr.length - 1; i > 0; i--) {
			list.add(arr[i], i);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
