package Sort;

import java.util.*;
public class beak_re_보물 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int answer = 0;
		for(int i=0; i<n; i++) {
			answer += a[i] * b[n-i];
		}
		
		System.out.println(answer);
	}
	
}
