package Dfs_Bfs;

import java.util.*;
public class beak_re_체스판다시칠하기 {
	static StringBuilder even1;
	static StringBuilder even2;
	
	static int even(char arr[][]) {
		int sum = 0;	
		int num = 1;
		
		for(int i=0; i<8; i++, num++) {
			if(num%2==0) {
				for(int j=0; j<8; j++) {
					if(even1.charAt(j) != arr[i][j])
						sum++;
				}
			}
			
			else {
				for(int j=0; j<8; j++) {
					if(even2.charAt(j) != arr[i][j])
						sum++;
				}
			}
		}
		return sum;
	}
	
	static int odd(char arr[][]) {
		int sum = 0;
		int num = 1;
		
		for(int i=0; i<8; i++, num++) {
			if(num%2==0) {
				for(int j=0; j<8; j++) {
					if(even2.charAt(j) != arr[i][j])
						sum++;
				}
			}
			
			else {
				for(int j=0; j<8; j++) {
					if(even1.charAt(j) != arr[i][j])
						sum++;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.nextLine();
		
		char arr[][] = new char[n][m];
		even1 = new StringBuilder();
		even2 = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			for(int j=0; j<m; j++)
				arr[i][j] = s.charAt(j);
		}
		
		int num = 1;
		for(int i=0; i<m; i++, num++) {
			if(num%2==0) {
				even1.append("B");
				even2.append("W");
			}
			else {
				even1.append("W");
				even2.append("B");
			}
		}
		
		char copy_arr[][] = new char[8][8];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<n-8+1; i++) {//행을 내리고
			for(int j=0; j<m-8+1; j++) {
				for(int k=0; k<8; k++) {
					for(int l=0; l<8; l++) {
						copy_arr[k][l] = arr[k+i][l+j];
					}
				}
				
				int n1 = even(copy_arr);
				int n2 = odd(copy_arr);
				
				min = Math.min(min, Math.min(n1, n2));	
			}
		}
		
		System.out.println(min);
	}
}
