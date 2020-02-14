import java.util.*;

class Review{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> qu = new LinkedList<>();
        
        qu.add(n);
        int dp[] = new int[n+1];
        
        while(!qu.isEmpty()){
           int a = qu.remove(0);
           
            if(a == 1){
                System.out.println(dp[a]);
                break;
            }
            
            //1
            if(a%3 == 0 && dp[a/3] == 0){
                qu.add(a/3);
                dp[a/3] = dp[a] + 1;
            }
            //2 
            if(a%2 == 0 && dp[a/2] == 0){
                qu.add(a/2);
                dp[a/2] = dp[a] + 1;
            }
            
            //3
            if(dp[a-1] == 0) {
	            qu.add(a-1);
	            dp[a-1] = dp[a] + 1;
            }
        }//while
        
    }

}