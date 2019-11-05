import java.util.*;

public class nds_1 {

	static int min = 1000000000;
	
	static int sol(int arr[]) {
		int answer = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				map.put(arr[i], i-val);
				
				if(i-val < min)
					min = i-val;
			}
			
			else {
				map.put(arr[i], i);
			}
			                                                 
		}
		
		System.out.println("min = " + min);
		
		return answer;
	}
	
	public static int solution(int bombs[]) {
		int answer = 0;
		
		Arrays.sort(bombs);
		
		int max = 0;
		for(int i=0;i<bombs.length;i++)
			max = Math.max(max, bombs[i]);
		
		
		
		for(int i=1;i<=max;i++) {
				if(bombs[i-1] >=i)
					answer = answer +1;
		}
	
		return answer;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {2,1,3,1,4,2,2};
		
		sol(arr);
		
		//System.out.println(solution(arr));
	}
}
