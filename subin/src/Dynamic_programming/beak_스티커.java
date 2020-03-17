package Dynamic_programming;

import java.util.*;

//1h
class beak_스티커{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int size = sc.nextInt();
            int arr[][] = new int[2][size];
            int dp[][] = new int[2][size];
            
           sc.nextLine();
            
            for(int j=0; j<2; j++){
                String s = sc.nextLine();
                String ss[] = s.split(" ");
                
                for(int k=0; k<size; k++)
                    arr[j][k] = Integer.parseInt(ss[k]);
            }
            
            dp[0][0] = arr[0][0]; 	dp[1][0] = arr[1][0];
            dp[0][1] = arr[0][1] + dp[1][0];
            dp[1][1] = arr[1][1] + dp[0][0];
            
            for(int j=2; j<size; j++){
                dp[0][j] = Math.max(Math.max(dp[1][j-1], dp[0][j-2]), dp[1][j-2]) + arr[0][j];
                dp[1][j] = Math.max(Math.max(dp[0][j-1], dp[1][j-2]), dp[0][j-2]) + arr[1][j];
            }
            
            System.out.println(Math.max(dp[0][size-1], dp[1][size-1]));
        
        }//for
    }   
}
