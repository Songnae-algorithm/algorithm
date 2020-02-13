package Dfs_Bfs;

import java.util.*;

public class beak_연결요소의개수 {

    static void dfs(int arr[][], int idx, boolean check[]){
        //돌고 나오면서 true로 만든다
        check[idx] = true;
        
        for(int k=1; k<arr.length; k++){
            if(arr[idx][k]==1 && check[k] ==false)
                dfs(arr,k,check);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[][] = new int[n+1][n+1];
        
        for(int i=0; i<k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        
        int answer = 0;
        
        boolean check[] = new boolean[n+1];
        for(int i=1;i<=n; i++){
                if(check[i] == false){
                    dfs(arr,i,check);
                    answer++;                    
            }
        }
        
        System.out.println(answer);
    }
	
}
