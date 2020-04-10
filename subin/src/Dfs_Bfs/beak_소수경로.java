package Dfs_Bfs;

import java.util.*;

public class beak_소수경로 {

	public static boolean sosu(int x) {
		if(x == 0 || x==1)
			return false;
		else {
			for(int i=2; i<x; i++) {
				if(x%i == 0)
					return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n][2];
		int size[] = new int[100000000];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int in = arr[i][0];
			int out = arr[i][1];
			
			System.out.println("in:" + in + " out: " + out);
			int cnt = 0;
			
			Queue<Integer> qu = new LinkedList<>();
			boolean b = false;
			
			qu.add(in);
			
			//bfs
			while(!qu.isEmpty()) {
				int now = qu.poll();
				System.out.println("now ->" + now);
				System.out.println("qu ->" + qu);
				
				if(now == out) {
					b = true;
					System.out.println(size[now]);
				}
				
				//1000의 자리
				for(int j=1; j<10; j++) {
					if(in/1000 == j)
						continue;
					else {
						int s = (in%1000) + (j*1000);
						if(s>=1000 && s<9999 && sosu(s) && size[s]!=0) {
							System.out.println("1000 ->" + s);
							qu.add(s);
							size[s] = size[now]+1;
						}
					}
				}//for
				
				//100의 자리
				for(int j=0; j<100; j++) {
					if(in/100 == j)
						continue;
					else {
						int s = (in%100) + (j*100);
						if(s>=1000 && s<9999 && sosu(s)&& size[s]!=0) {
							qu.add(s);
							size[s] = size[now]+1;
						}
					}
				}//for
				
				//10의 자리
				for(int j=0; j<1000; j++) {
					if(in/1000 == j)
						continue;
					else {
						int s = (in%1000) + (j*1000);
						if(s>=1000 && s<9999 && sosu(s)) {
							qu.add(s);
							if(size[s]!=0)
								size[s] = size[now]+1;
						}
					}
				}//for
				
				//1의 자리
				for(int j=0; j<10000; j++) {
					if(in/10000 == j)
						continue;
					else {
						int s = (in%10000) + (j*10000);
						if(s>=1000 && s<9999 && sosu(s)) {
							qu.add(s);
							if(size[s]!=0)
								size[s] = size[now]+1;
						}
					}
				}//for
				
			}//while
			
			if(b == false) {
				System.out.println("impossible");
			}
			
		}//for
		
	}//main
}
