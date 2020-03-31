package Math;

import java.util.*;

//순열 (중복 O)
public class beak_N과M_3 {
	static int n;
	static int m;
	static StringBuilder sb;
	static int arr[];
	
	//nPm
	public static void perm(int x) { // 시작 idx
		if(x == m) {
			for(int i=0; i<m; i++)
				sb.append(arr[i] + " ");
			
			sb.append("\n");
		}
		
		else {
			for(int i=1; i<=n; i++) { // idx에 맞게 1부터 n까지 넣기
				arr[x] = i; // x번째에 i넣기
				perm(x+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n];
		
		sb = new StringBuilder();
		
		perm(0); // 시작 idx를 넣는다
		
		System.out.println(sb.toString());
	}
}


/*
public static void perm(LinkedList<Integer> list, int n, int m) {
if(list.size() == m) {
	for(int i : list) {
		System.out.print((i+1) + " ");
	}
	System.out.println();
	
	return;
}

for(int i= 0; i<n; i++) {
		list.add(i);
		perm(list, n, m);
		list.removeLast();
}

}
*/