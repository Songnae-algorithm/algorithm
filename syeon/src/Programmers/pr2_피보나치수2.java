package Programmers;

public class pr2_피보나치수2 {

	
public int solution(int n) {
        
        //0604 00:31-
        int arr[]=new int [n+1];
        
        arr[0]=0;
        arr[1]=1;
        
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]%1234567 +arr[i-2]%1234567;
        }
        int answer=arr[n]%1234567;
        return answer;
    }
}

/*class Solution {
    
    public static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
            
        }
        return fib(n-1)%1234567 +fib(n-2)%1234567;
    }
    public int solution(int n) {
        
        //0604 00:31-
        int answer =fib(n)%1234567;
        return answer;
    }
}
*/
