package BruteForce;

import java.util.*;

public class beak_덩치 {

	//35min
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][2];
		int rank[] = new int[n];
		
		for(int i=0;i<n; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j)
					continue;
				
				if(arr[i][0] >arr[j][0] && arr[i][1] >arr[j][1])
					rank[j]++;
			}
		}
		
		for(int i=0; i<rank.length; i++)
			System.out.print(rank[i]+1 + " ");
		
	}
}
