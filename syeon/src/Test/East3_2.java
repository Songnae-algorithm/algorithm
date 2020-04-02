package Test;

import java.util.*;

public class East3 {
	public static int solution(int[] A) {
		int answer = 0;

		boolean chk = true;
		for (int i = 0; i < A.length - 2; i++) {
			if (A[i] > A[i + 1] && A[i + 1] < A[i + 2] || A[i] < A[i + 1] && A[i + 1] > A[i + 2]) {

				// 121 또는 212 가 만족하면

			} else {
				chk = false; // 한번이라도 아니면 false
			}

		}
		if (chk == true) {
		
			return answer;
		}
		//한번에 끝나면 return으로 0 반환하고 나감
		
		//하나씩 빼야하는 경우 
		
		int k = 0; //몇번 돌지 체크해주기 위해
		while (k != A.length) {
			System.out.println(k + " k " + answer);

			ArrayList<Integer> list = new ArrayList<Integer>();

			// boolean chk = true;
			for (int j = 0; j < A.length; j++) {

				if (j == k) {
					continue;
				}
				list.add(A[j]);
			}
			System.out.println(list);
			System.out.println();
			chk = false;
			for (int l = 0; l < list.size() - 2; l++) {
				if (list.get(l) > list.get(l + 1) && list.get(l + 1) < list.get(l + 2)
						|| list.get(l) < list.get(l + 1) && list.get(l + 1) > list.get(l + 2)) {

					System.out.println("엘 " + l);
					chk = true;
				} else {
					chk = false;
					break;

				}

			}
			System.out.println(chk);
			if (chk == true) {
				answer++;
			}
			k++;

		}

		if (chk == false && answer == 0)

		{
			answer = -1;
		}
		System.out.println(chk);
		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int arr1[] = { 3, 4, 5, 3, 7 };
		int arr2[] = { 1, 2, 3, 4 };
		int arr3[] = { 1, 3, 1, 2 };

		int arr4[] = { 3, 5, 5, 2, 1 };

		int arr5[] = { 5, 5, 4, 2, 6 };

		int arr7[] = { 6, 7, 2, 5, 7 };

		solution(arr5);
	}
}
