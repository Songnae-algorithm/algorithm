package T0328;

import java.util.*;

public class t1 {

	public static int solution(int A[]) {
		int arr[] = new int[100001]; //10만까지 담기위해
		boolean chk[] = new boolean[100001];
		
		int answer = 0;//초기화
		
		Arrays.sort(A);
		
		for(int i=0; i<A.length; i++) {
			int num = A[i];
			
			if(num >100000)
				continue;
			else {
				++arr[num];
				if(arr[num] == num)
					chk[num] = true;
				else
					chk[num] = false;
			}
		}
		
		for(int i=1; i<100001; i++) {
			if(chk[i])
				answer = i;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int a[] = {3,8,2,3,3,2};
		int b[] = {7,1,2,8,2};
		int c[] = {5,5,5,5,5};
		int d[] = {3,1,4,1,5};
		
		
		int f[] = new int[100001];
		
		for(int i=0;i<f.length-1; i++)
			f[i] = 100000;
		
		System.out.println(solution(f));
	}
}
