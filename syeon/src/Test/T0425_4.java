package Test;

public class T0425_4 {

	static int mac[][] = { { 1, 1 }, { 2, 1 }, { 1, 2 }, { 3, 3 }, { 6, 4 }, { 3, 1 }, { 3, 3 }, { 3, 3 }, { 3, 4 },
			{ 2, 1 } };

	static int hang1 = 1;
	static int hang2 = 1;
	static int hang3 = 1;
	static int hang4 = 1;
	static int hang5 = 1;
	static int hang6 = 1;

//mac[i][0] 는 입력하는 열을 나타냄, mac[i][1]은 입력하는 색깔  

	static int map[][] = new int[7][7]; // 1부터 시작

	int cnt=0;
	
	private static void dfs(int cnt) {
		int dx[]= {-1,1,0,0};
		int dy[]= {0,0,1,-1};
		
		for(int i=0;i<)
	}
	public static void main(String[] args) {

		for (int i = 0; i < mac.length; i++) {
			if (mac[i][0] == 1 && map[hang1][mac[i][0]] == 0) {

				map[hang1][mac[i][0]] = mac[i][1];
				hang1++;

			} // 1열이고, 1열의 행의값이 =0일 때(아무도 안방문했을때)
			else if (mac[i][0] == 2 && map[hang2][mac[i][0]] == 0) {

				map[hang2][mac[i][0]] = mac[i][1];
				hang2++;

			} else if (mac[i][0] == 3 && map[hang3][mac[i][0]] == 0) {

				map[hang3][mac[i][0]] = mac[i][1];
				hang3++;

			} else if (mac[i][0] == 4 && map[hang4][mac[i][0]] == 0) {

				map[hang4][mac[i][0]] = mac[i][1];
				hang4++;

			} else if (mac[i][0] == 5 && map[hang5][mac[i][0]] == 0) {

				map[hang5][mac[i][0]] = mac[i][1];
				hang5++;

			} else if (mac[i][0] == 6 && map[hang6][mac[i][0]] == 0) {

				map[hang6][mac[i][0]] = mac[i][1];
				hang6++;

			}

			dfs(0);
		}//for

	}

}
