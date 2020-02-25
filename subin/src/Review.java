import java.util.*;

public class Review {
	
    static public void solution(int[] arr, int k) {
    	Arrays.sort(arr);
    	int min = 100000;
    	
    	for(int i=0;i<arr.length-k+1;i++) {
    		int now = arr[i+k-1] - arr[i];
    		
    		if(now<min)
    			min= now;
    	}
    	System.out.println(min);
        
    }
    
    public static void main(String[] args) {
		int arr[] = {9,11,9,6,4,19};
		//4 6 9 9 11 19
		
		solution(arr,4);
    	
	}
}