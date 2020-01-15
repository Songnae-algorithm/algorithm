package Number_Change;

import java.util.*;

public class prog_2_소수찾기 {

	static int answer = 0;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static void swap(int arr[], int dep, int i) {
		int temp = arr[dep];
		arr[dep] = arr[i];
		arr[i] = temp;
	}

	static void sosu(int n) {
		if(n == 1 || n == 0)
			;
		else{
			boolean check = false;
	         for(int i=2;i<n;i++) {
	        	 if(n%i == 0) {
	        		 check = true;
	        		 break;
	        	 }
	         }
	         
	         if(check==false)
	        	 answer++;
		}//else
	}
	
	//n개중에 r개 순서없이 뽑는 것 -> 순열 -> nPr depth는 0부터 시작
	static void perm(int arr[], int depth, int n, int r) {
		//기저조건
		if(depth == r) { // depth가 0부터 ++ 돼서 r까지 도달하면 stop
			String s = "";
			for(int i=0; i<r; i++) 
				s = s + arr[i];
			
			int a = Integer.parseInt(s);
			
			if(!list.contains(a)) {
				list.add(a);
				sosu(a);
			}
			
			return;
		}
		
		for(int i = depth; i<n ; i++) {
			swap(arr,depth,i);
			perm(arr,depth+1,n,r);
			swap(arr,depth,i);
		}
	}
	
	
	
    static public int solution(String numbers) {
    	//조합 한 후, 소수인지 계산
    	
    	int arr[] = new int[numbers.length()];
    	
    	for(int i=0;i<numbers.length();i++)
    		arr[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
    	
    	for(int i=1; i<=arr.length; i++) {
    		perm(arr, 0, arr.length,i);
    	}
    	
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution("17"));
		
	}
}
