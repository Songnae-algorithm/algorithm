package greeedy;

import java.util.*;
public class beak_신입사원_re {

	//10:44 - 11:01
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			int arr[][] = new int[m][2];
			
			for(int j=0; j<m; j++) {
				arr[j][0] = sc.nextInt();
				arr[j][1] = sc.nextInt();
			}
			
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int a[], int b[]) {
					return a[0]-b[0];
				}
			});
			
			int answer = 1;
			int min = arr[0][1];
			
			for(int j=1; j<m; j++) {
				if(min > arr[j][1]) {
					min = arr[j][1];
					answer++;
				}
			}
			
			System.out.println(answer);
		}
		
	}
}
