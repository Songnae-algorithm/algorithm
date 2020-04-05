package Dynamic_programming;

import java.util.Scanner;

public class beak_욕심쟁이판다 {
	static int arr[][];
	static int dp[][];
	static int n;
	
	public static int move(int x, int y) {
		if(dp[x][y] !=0)
			return dp[x][y];
		

		//기저조건에 안걸려서 for문에 들어가겠다는 뜻은 첫날이라는 뜻이다
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};

		dp[x][y] = 1;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				if(arr[nx][ny] > arr[x][y]) {
					dp[x][y] = Math.max(dp[x][y], move(nx,ny)+1);
				}
			}
		}
		
		return dp[x][y];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][n];
		
		sc.nextLine();
		
		for(int i=0;i<n; i++) {
			String s = sc.nextLine();
			String ss[] = s.split(" ");
			for(int j=0;j<n; j++)
				arr[i][j] = Integer.parseInt(ss[j]);
		}


		int answer = 0;
		dp = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				answer = Math.max(answer, move(i,j)); // 전부 다 돈다
		}
		

		
		System.out.println(answer);
		
	}
}
