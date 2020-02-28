package T0221;

import java.util.*;

public class t4 {
	static int count = 0;
	
	static void Hanoi(int n, int first, int mid, int last) {
		if(n == 1)
			++count;
		else {
			Hanoi(n-1,first,last,mid);
			++count;
			Hanoi(n-1,mid,first,last);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Hanoi(n, 1,2,3);
		
		System.out.println(count);
	}
	
}
