package Sort;

import java.util.*;

//10min
public class beak_보물 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		Integer a[] = new Integer[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		
		for(int i=0; i<n; i++)
			b[i] = sc.nextInt();
		
		Arrays.sort(b);
		//int를 내림차순으로 정렬하고싶다면 -> Integer 클래스 사용
		Arrays.sort(a, Collections.reverseOrder());
		
		int answer = 0;
		for(int i=0; i<n; i++)
			answer += a[i]*b[i];
		
		System.out.println(answer);
	}
}
