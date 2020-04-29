package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pr_1_K번째수 {

	public static int[] solution(int[] array, int[][] commands) {

		int answer[] = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();//자른 배열 저장 

			int first = commands[i][0];//각 배열의 첫번째 값
			int last = commands[i][1];//각 배열의 중간값 ( 자를 길이 ) 
			int cut = commands[i][2];//각 배열에서 추출할 값 

			for (int j = last - 1; j >= first - 1; j--) {//배열은 0부터 시작하고 얘네는 0부터가 아니라 1부터 시작하므로 1씩 빼주어야함
				list.add(array[j]);//받아온 array를 짤라서 list에 입력
			}

			Collections.sort(list);//list 정렬 
			System.out.println(list);

			answer[i] = list.get(cut - 1); //추출하고 싶은 값 저장 ( 얘도 인덱스가 배열이랑 똑같기 때문에 -1해줌 )

		}
		return answer;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		solution(arr, arr2);
	}
}
