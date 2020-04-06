package Greedy;

import java.util.*;

public class beak_신입사원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			int m = sc.nextInt();
			
			int arr[][] = new int[m][2];
			
			for(int j=0; j<m; j++) {
				arr[j][0] = sc.nextInt();
				arr[j][1] = sc.nextInt();
			}
			
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int a[], int b[]) {
					return a[0] - b[0]; // 0번쨰 행으로 오룸차순
				}
			}); // 오름차순 정렬

			int answer = 0;
			int min = Integer.MAX_VALUE;
			
			for(int j=0; j<arr.length; j++) {
				if(min>arr[j][1]) {
					min = arr[j][1];
					answer++;
				}
			}
			
			
			System.out.println(answer);
		}
	}
}
