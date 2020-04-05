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
					return a[0] - b[0];
				}
			}); // 오름차순 정렬

			int answer = 0;
			
			for(int j =arr.length-1; j>=0; j--) {
				int now = arr[j][1];
				boolean ck = false;
				
				for(int k = j-1; k>=0; k--) {
					if(now > arr[k][1]) {//나보다 작은게 하나라도 있으면
						ck =true;
						break;
					}
				}
				
				if(ck == false)
					answer++;
			}
			
			System.out.println(answer);
		}
	}
}
