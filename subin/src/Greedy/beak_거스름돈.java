package Greedy;

import java.util.*;

//8min
public class beak_거스름돈 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int m = 1000-n;
        int arr[] = {500,100,50,10,5,1};
        
        int answer = 0;
        for(int i=0;i<arr.length;i++){
            if(m>=arr[i]){
                 answer = answer + (m/arr[i]);
                 m = m%arr[i];
            }
            if(m==0)
                break;
            
        }
        System.out.println(answer);
    }
	
}
