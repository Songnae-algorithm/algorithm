package Sort;

import java.util.*;

public class beak_회의실배정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][2];
		
		for(int i=0;i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int a[], int b[]) {
				if(a[1] == b[1])
					return a[0] - b[0]; // 오름차순
				else
					return a[1] - b[1]; // 오름차순
			}
		});
		
		
		int answer = 1;
		int now = arr[0][1];
		
		for(int i=1; i<n; i++) {
			if(arr[i][0] >= now){
				answer++;
				now = arr[i][1];
			}
		}//for
		
		System.out.println(answer);
	}
}
