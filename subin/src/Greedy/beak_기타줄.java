package Greedy;

import java.util.*;

public class beak_기타줄 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int set[] = new int[m];
		int one[] = new int[m];
		
		for(int i=0;i<m;i++) {
			set[i] = sc.nextInt();
			one[i] = sc.nextInt();
		}
		
		Arrays.sort(set);
		Arrays.sort(one);

		int min=Integer.MAX_VALUE;
		
		//가장 싼 6팩짜리로만 전부 vs 가장싼 낱개로 전부 구매
		//n/6 후 +1 해주는것 잊지 말기!
		min = Math.min(((n/6)+1) * set[0], one[0] *n);

		//여기서는 몫과 나머지 정확하게 계산해야한다.
		min = Math.min((n/6)*set[0] + (n%6)*one[0], min);
		
		System.out.println(min);
	}
}
