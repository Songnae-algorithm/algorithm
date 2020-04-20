package sort;

import java.sql.Array;
import java.util.*;

public class boj_11650_좌표정렬하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int arr[][] = new int[a][2];

		for (int i = 0; i < a; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][i] = sc.nextInt();
		} // 배열 입력

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int a[], int b[]) {
				if (a[0] == b[0]) // 0번째 행렬이 같을 때는
					return a[1] - b[1]; // 뒤에거로 오름차순
				else
					return a[0] - b[0]; // 0번째행렬로 오름차순
			}
		});

//		Arrays.sort(arr, new Comparator<int[]>() {
//			@Override
//			public int compare(int a[], int b[]){
//				if(a[0] == b[0]) //0번째 행렬이 같을 때는
//					return b[1]- a[1]; // 뒤에거로 내림차순
//				else
//					return b[0] - a[0]; //0번째행렬로 내림차순
//			}
//		});
//		
//		Arrays.sort(arr, new Comparator<int[]>() {
//			@Override
//			public int compare(int a[], int b[]){
//				if(a[0] == b[0]) //0번째 행렬이 같을 때는
//					return a[1]-b[1]; // 뒤에거로 오림차순
//				else
//					return b[0] - a[0]; //0번째행렬로 내림차순
//			}
//		});

		for (int i = 0; i < a; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
