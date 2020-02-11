package Dynamic_programming;

import java.util.*;

public class beak_피보나치함수 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			
			if(a==0)
				System.out.println("1 0");
			else if(a==1)
				System.out.println("0 1");
			else {
				int arr[][] = new int[a+1][2];
				arr[0][0] = 1; arr[0][1] = 0;
				arr[1][0] = 0; arr[1][1] = 1;
				
				//f(5) a=5까지 구하고싶으면 j<=a까지로 해야하고 배열의 크기는 [a+1] 출력할때는 [a][0] + [a][1]
				for(int j=2; j<=a; j++) {
					arr[j][0] = arr[j-1][0] + arr[j-2][0];
					arr[j][1] = arr[j-1][1] + arr[j-2][1];
				}
				
				System.out.println(arr[a][0] +" " + arr[a][1]);
			}
		}//for	
	}
}
