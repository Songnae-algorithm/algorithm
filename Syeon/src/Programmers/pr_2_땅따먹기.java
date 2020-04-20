package Programmers;
import java.util.*;

public class pr_2_땅따먹기 {

	static int solution(int[][] land) {
		int answer = 0;

		for (int i = 0; i < land.length; i++) {
			for(int j=0;j<land[i].length;j++) {
				int max = firstmax(land[0][0], land[0][1], land[0][2], land[0][3]);
				int idx=0;
				if(max==land[i][j]) {
					idx=j;
					
					break;
				}
				
				
		}

	}

	return answer;

	}
	// Collections.max(list)

	public static int Maximum(int a, int b, int c) {

		int max1 = Math.max(a, b);
		max1 = Math.max(max1, c);

		return max1;

	}

	public static int firstmax(int a, int b, int c, int d) {

		int max1 = Math.max(a, b);
		max1 = Math.max(max1, c);
		max1 = Math.max(max1, d);

		return max1;

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		solution(arr);
	}
}
