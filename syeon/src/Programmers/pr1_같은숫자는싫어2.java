package Programmers;

import java.util.*;

public class pr1_같은숫자는싫어2 {

	// 4/27 12:55 start 13:04 fin 
	//구우우욷이 스택말고 list를 이용해서 getLast로 가져오는 방법도 있을것같다..
	//아니면 list에 arr0번째값을 미리 넣고, for문의 i를 1부터 돌려서 i-1과 비교하는 방법도 ! 

	public static int[] solution(int[] arr) {

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			if (st.isEmpty()) { // 비었으면 무조건 넣기
				st.push(arr[i]);
			} else if (!st.isEmpty() && st.peek() != arr[i]) {
				st.push(arr[i]);
			}
		}

		int[] answer = new int[st.size()];

		for (int i = answer.length-1; i >=0; i--) {

			answer[i] = st.pop();
			//스택은 끝에서부터 pop하니까 answer 에 넣어줄 때 index의 맨 끝에서부터 넣어주는 것 잊지 말기 
			
		}
		
		return answer;
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 1, 3, 3, 0, 1, 1 };

		solution(arr1);

		int arr2[] = { 4, 4, 4, 3, 3 };
		solution(arr2);

	}

}
