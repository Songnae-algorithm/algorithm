package Test;

import java.util.*;

public class T0523_2 {

	static int solution(int x, int y, int r, int d, int[][] target) {
		int answer = -1;

		boolean chk[] = new boolean[target.length];
//		double a = Math.atan2(-1, 2) - Math.atan2(1, 0);
//		a = a * 180 / 3.14;
//		System.out.println(a);

		for (int i = 0; i < target.length; i++) {

			double deg = Math.abs((Math.atan2(x, y) - Math.atan2(target[i][0], target[i][1]))  * 180 / 3.14);
			// 두 점 사이의 각도
			System.out.println(deg);
			
			if (deg > d) {
				chk[i] = true;

			}

		}

		double len = 2 * 3.14 * r * d / 360;

		for (int i = 0; i < target.length; i++) {
			double length = Math.sqrt(target[i][0] * target[i][0] + target[i][1] * target[i][1]);
			
			
			if (length > len) {
				chk[i] = true;

			}

		}
		int cnt = 0;
		for (int i = 0; i < chk.length; i++) {

			if (!chk[i]) {
				cnt++;

			}
		}
		answer=cnt;
		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int a[][] = { { 0, 1 }, { -1, 1 }, { 1, 0 }, { -2, 2 } };
		solution(-1, 2, 2, 60, a);
	}

}
