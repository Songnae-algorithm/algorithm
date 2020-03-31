package Dynamic_programming;

import java.util.*;

public class beak_이동하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n][m];
		
		sc.nextLine();
		
		for(int i=0;i<n; i++) {
			String s = sc.nextLine();
			String ss[] = s.split(" ");
			
			for(int j=0; j<ss.length; j++)
				arr[i][j] = Integer.parseInt(ss[j]);
		}
		
		for(int i=1; i<m; i++) //0행 계산
			arr[0][i] = arr[0][i] + arr[0][i-1];
		
		for(int i=1; i<n; i++) //0열 계산
			arr[i][0] = arr[i][0] + arr[i-1][0];
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<m; j++) {
				arr[i][j] = arr[i][j] + Math.max(arr[i][j-1], Math.max(arr[i-1][j], arr[i-1][j-1]));
			}
		}
		
		System.out.println(arr[n-1][m-1]);
		
	}
}
