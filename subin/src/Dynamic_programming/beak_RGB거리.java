package Dynamic_programming;

import java.util.*;


//10min
public class beak_RGB거리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int arr[][] = new int[n][3];
		
		for(int i=0;i <n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<3; j++) {
				if(j==0)
					arr[i][j] = Math.min(arr[i][j] + arr[i-1][1], arr[i][j] + arr[i-1][2]);
				if(j==1)
					arr[i][j] = Math.min(arr[i][j] + arr[i-1][0], arr[i][j] + arr[i-1][2]);
				if(j==2)
					arr[i][j] = Math.min(arr[i][j] + arr[i-1][0], arr[i][j] + arr[i-1][1]);
			}
		}
		
		int min = Math.min(Math.min(arr[n-1][0], arr[n-1][1]), arr[n-1][2]);
		
		System.out.println(min);
	}
}
