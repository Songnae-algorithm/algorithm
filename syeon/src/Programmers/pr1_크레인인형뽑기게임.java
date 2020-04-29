package Programmers;

import java.util.*;

public class pr1_크레인인형뽑기게임 {

	public static int solution(int[][] board, int[] moves) {

		// 4/29 15:56

		int answer = 0;

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < moves.length; i++) {// 열 !!!! 입력하는 것
			int col = moves[i] - 1;
			for (int j = 0; j < board.length; j++) {// 행의 개수만큼
				if (board[j][col] != 0) {

					if (!st.isEmpty() && st.peek() == board[j][col]) {
						// 배열이 0이아니고, 스택도 안비어있고, 맨위랑 나랑 같으면
						st.pop();
						// 팝하고
						answer = answer + 2;
						// 두개가 없어졌으니까 두개더해주기!

					} else {
						st.add(board[j][col]);
					}
					board[j][col] = 0;
					break;
				}

			}

		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		int arr[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };
		int arr1[] = { 1, 5, 3, 5, 1, 2, 1, 4 };

		solution(arr, arr1);
	}

}
