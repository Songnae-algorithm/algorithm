package Math;

import java.util.*;

public class beak_N과M_1 {

	public static void perm(LinkedList<Integer> list, int chk[], int n, int r) {
		if(list.size() == r) {
			for(int i: list)
				System.out.print((i+1) + " ");
			
			System.out.println();
			return;
		}
		
		for(int i = 0; i<n; i++) {
			if(chk[i] == 0) {
				chk[i] = 1;
				list.add(i);
				perm(list, chk, n, r);
				list.removeLast();
				chk[i] = 0;
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int chk[] = new int[n];
		LinkedList<Integer> list = new LinkedList<>();
		
		perm(list, chk, n,m);
		
	}
}
