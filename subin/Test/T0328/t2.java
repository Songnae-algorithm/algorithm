package T0328;

import java.util.Arrays;

public class t2 {

	public static int calc(int n) {
		int remain = 0;
		while(n!=0) {
			remain += n%10;
			n = n/10;
		}
		
		return remain;
	}
	
	public static int solution(int A[]) {
		int arr[][] = new int[82][2];
		
		Arrays.sort(A);
		
		for(int i=0; i<A.length; i++) {
			int n = calc(A[i]);
			
			if(arr[n][0] == 0)
				arr[n][0] = A[i];
			
			else if(arr[n][0] !=0 && arr[n][1] ==0)
				arr[n][1] = A[i];
			
			else if(arr[n][0] !=0 && arr[n][1] !=0) {
				int temp = arr[n][1];
				arr[n][1] = A[i];
				arr[n][0] = temp;
			}
		}
		
		int max = -1;
		
		for(int i=1; i<82; i++) {
			if(arr[i][0] !=0 && arr[i][1] !=0)
				max = Math.max(max, arr[i][0] + arr[i][1]);
		}
		
		return max; // 20억까지는 감당 가능하다 
	}
	
	public static void main(String[] args) {
		int a[] = {51,71,17,42};
		int b[] = {42,33,60};
		int c[] = {51,32,43};
		int d[] = {1000000000,1000000000, 10, 10};
		int e[] = {999999999,999999999};
		
		int f[] = new int[200000];
		
		for(int i=0;i<f.length; i++)
			f[i] = 1000000000;
		
		System.out.println(solution(f));
	}
}
