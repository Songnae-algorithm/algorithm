package Greedy;

import java.util.*;

public class beak_회의실배정 {

	
	//드디어 compare 완벽 이해!!!!!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		//1번쨰 행렬로 오름차순 만들기
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int a[], int b[]) {
				if(a[1] == b[1]) // 끝나는 시간이 같을때는
					return a[0] - b[0]; // [0]번째 행렬 내림차순으로 정렬
				else
					return a[1] - b[1]; // [1]번째 행렬로 내림차순 -> b[1]-a[1]  ->항상 첫번째 오는게 비교 기준이다
			}
		});
		
		int answer = 0;
		int end = -1; // 
		for(int i=0;i<n;i++) {
			if(arr[i][0] >= end) {
				end = arr[i][1];
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
