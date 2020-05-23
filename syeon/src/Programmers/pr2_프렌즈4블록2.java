package Programmers;

public class pr2_프렌즈4블록2 {

	class Node {

		int x;
		int y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;

		}
	}

	private static void find(int i, int j, Character character) {
		

	}

	public static int solution(int m, int n, String[] board) {
		// 5/19 12:47

		int answer = 0;

		Character arr[][] = new Character[m][n];

		for (int i = 0; i < m; i++) {
			String s = board[i];
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] != '0') {// '0'이 아니면 사각형 찾기
					find(i, j, arr[i][j]);
				}
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		String arr[] = { "CCBDE", "AAADE", "AAABF", "CCBBF" };
		String arr1[] = { "TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ" };

		// solution(4, 5, arr);
		solution(6, 6, arr1);
		// solution(6,2, String a[]={"AA", "AA", "CC", "AA", "AA", "DD"};);
	}

}
