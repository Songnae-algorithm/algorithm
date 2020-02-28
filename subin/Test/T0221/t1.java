package T0221;

import java.util.*;

public class t1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int min = 100000000;
		for(int i=0;i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				min = Math.min(min, arr[j]-arr[i]);
			}
		}
		
		System.out.println(min);
	}
}
