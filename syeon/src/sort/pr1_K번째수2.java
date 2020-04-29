package sort;

import java.util.*;

public class pr1_K번째수2 {

	// 4/27 22:20 start ~ 22:32 fin

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int [commands.length];
		
		
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < commands.length; i++) {
			int fir = commands[i][0] - 1; // 시작
			int fin = commands[i][1] - 1; // 끝
			int K = commands[i][2] - 1;

			ArrayList<Integer> list = new ArrayList<>();

			for (int j = fir; j <= fin; j++) {
				list.add(array[j]);

			}
			list.sort(null);

			ans.add(list.get(K));

		}
		
		for(int i=0;i<ans.size();i++) {
			answer[i]=ans.get(i);
			
		}
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 6, 3, 7, 4 };
		int arr1[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		solution(arr, arr1);

	}

}
