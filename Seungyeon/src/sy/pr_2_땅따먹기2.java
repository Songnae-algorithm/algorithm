package sy;

public class pr_2_땅따먹기2 {

	static int solution(int[][] land) {
		int answer = 0;

		// land[a][4];

		for (int i = 1; i < land.length; i++) {

			land[i][0] = Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3])) + land[i][0];
			land[i][1] = Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3])) + land[i][1];
			land[i][2] = Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3])) + land[i][2];
			land[i][3] = Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2])) + land[i][3];
		}

		int n = land.length;

		return Math.max(Math.max(land[n - 1][0], land[n - 1][1]), Math.max(land[n - 1][2], land[n - 1][3]));
	}

	public static void main(String[] args) {

		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		solution(land);

	}

}
