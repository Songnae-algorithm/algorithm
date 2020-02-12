package Greedy;

import java.util.*;

class beak_동전0{
	//20min
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[] = new int[n]; int idx = 0;
        
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            //같은 자리수라는게 1000 5000도 될 수 있다. 그치만... 될거 같았는데ㅠ
//            if(String.valueOf(arr[i]).length() == String.valueOf(k).length())
//                idx = i;
        }
        
        int answer = 0;
        for(int i = n-1; i>=0; i--){
            if(k>=arr[i]) {
	            answer = answer + k/arr[i];
	            k = k%arr[i];
	        }
        }
        
        System.out.println(answer);
    }
}