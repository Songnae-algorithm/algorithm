package Simulation;

import java.util.*;

public class beak_색종이3 {

	static class Pos{
		int right;
		int down;
		
		Pos(int right, int down){
			this.right = right;
			this.down = down;
		}
	}
	
	static int arr[][];
	
	public static int right(int x, int y){
		int cnt = 0;
		
		for(int i=y; i<=100; i++) {
			if(arr[x][i] == 1)
				cnt++;
			else
				break;
		}
		return cnt;
	}
	
	public static int down(int x, int y){
		int cnt = 0;
		
		for(int i=x; i<=100; i++) {
			if(arr[i][y] == 1)
				cnt++;
			else
				break;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		arr= new int[101][101];
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		Pos parr[][] = new Pos[101][101];
		
		for(int i=1; i<=100; i++) {
			for(int j=1; j<=100; j++)
				if(arr[i][j] == 1) {
					int r = right(i,j);
					int d = down(i,j);
					parr[i][j] = new Pos(r,d);
				}
				else
					parr[i][j] = new Pos(0,0);
			
		}
		
		for(int i=1; i<28; i++) {
			for(int j=1; j<28; j++)
				System.out.print(parr[i][j].right + "," + parr[i][j].down + "  ");
			System.out.println(" ");
		}
		
		int max = 0;
		
		//오른쪽으로
		for(int i=1; i<=100; i++) {
			int dp_r[] = new int[101];
			
			for(int j=1; j<=100; j++) {
				dp_r[parr[i][j].down]++;
			}
			
			for(int k=1; k<=100; k++) {
				max = Math.max(max, dp_r[k]*k);
			}
		}
		
		System.out.println(max);
		
		for(int i=1; i<=100; i++) {
			int dp_r[] = new int[101];
			
			for(int j=1; j<=100; j++) {
				dp_r[parr[j][i].right]++;
			}
			
			for(int k=1; k<=100; k++) {
				if(dp_r[k] * k !=0)
					System.out.println(k + " " + dp_r[k]);
				max = Math.max(max, dp_r[k]*k);
				}
		}
		
		System.out.println(max);
	}
}
