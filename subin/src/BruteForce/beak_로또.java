package BruteForce;

import java.util.*;

public class beak_로또 {

	static void comb(int arr[],boolean visited[], int start, int n, int r) {
		if(r==0) {
			for(int i=0; i<n; i++) {
				if(visited[i] == true)
					System.out.print(arr[i] + " ");
			}

			System.out.println();
			return ;
		}
		
		for(int i=start; i<n; i++) {
			visited[i] = true;
			comb(arr,visited,i+1,n,r-1);
			visited[i] = false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String a = sc.nextLine();
			if(a.equals("0"))
				break;
			
			String s[] = a.split(" ");
			int size = Integer.parseInt(s[0]);
			int arr[] = new int[size];
			
			for(int i=0; i<size; i++)
				arr[i] = Integer.parseInt(s[i+1]);
			
			boolean visited[] = new boolean[size];
			
			comb(arr,visited, 0,size,6); // start, n, r
			System.out.println();
		}//while
		
	}
}
