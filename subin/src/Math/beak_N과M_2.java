package Math;

import java.util.Scanner;

//조합 (중복 x)
public class beak_N과M_2 {

	public static void comb(int arr[], boolean v[], int start, int n, int r) {
		if(r == 0) {
			for(int i=0; i<n; i++) {
				if(v[i] == true)
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			return ;
		}
		
		for(int i=start; i<n ;i++) {
			v[i] = true;
			comb(arr, v, i+1, n, r-1);
			v[i] = false;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = i+1;

		boolean v[] = new boolean[n];
		
		comb(arr,v,0,n,m);
		
	}
}


//https://limkydev.tistory.com/186  -> 순열, 중복순열, 조합, 중복조합