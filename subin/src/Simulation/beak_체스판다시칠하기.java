package Simulation;

import java.util.*;

public class beak_체스판다시칠하기 {

	static char arr[][];
	static char wb[][];
	
    private static int draw(int x, int y) {
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < 2; i++) { // 0,1 두번
            int cnt = 0;
            for(int j = 0; j < wb[0].length; j++) { // 0~7까지
                for(int k = 0; k < wb[0].length; k++) { // 0~7까지
                    if(arr[x+j][y+k] != wb[(i+j)%2][k]) { // 들어온 값 x +(0~7)까지 더하고, y+(0~7)까지 더한다
                        cnt++;
                    }
                }
            }
            min = Math.min(min, cnt);
        }
        return min;
    }
	
    
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new char[n][m];
		
		sc.nextLine();
		
		//arr에 char형으로 전부 넣어놓기
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			for(int j=0; j<m; j++)
				arr[i][j] = s.charAt(j);
		}
		
		wb= new char[2][8];
		wb[0] = "WBWBWBWB".toCharArray();
		wb[1] = "BWBWBWBW".toCharArray();
		
		int min = Integer.MAX_VALUE; //무한대
		
		for(int i=0; i<= n-8; i++) {
			for(int j=0; j<= m-8; j++)
				min = Math.min(min, draw(i,j));
		}
	
		System.out.println(min);
	}
}
