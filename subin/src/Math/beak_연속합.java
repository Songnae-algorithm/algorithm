package Math;

import java.util.*;

//30min
public class beak_연속합 {
	
	//당연하게도 10만씩 for돌리면 100억이라서 에러나는 문제..
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dp[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        dp[0] = arr[0];
        
        for(int i=1;i<n;i++){//내 전과 더한게 크면 넣고 or 내가 더크면 나부터 다시 시작!
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
        }
        
        int max = dp[0]; // max값을 당연히 0으로 초기화하면 값이 틀릴 수 도 있다는 점!!!
        for(int i=1;i<n;i++)
            max = Math.max(max, dp[i]);
        
        
        System.out.println(max);
    }
}
