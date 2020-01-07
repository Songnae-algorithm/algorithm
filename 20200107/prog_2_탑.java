package programmers;

import java.util.*;

//스택, 큐
public class prog_2_탑 {

	static public int[] solution(int[] heights) {
		int size = heights.length;
		int arr[] = new int[size+1]; // index 헷갈리지 않기 위해서 size+1 만큼 만듦
		boolean check = false;
		
		ArrayList<Integer> list  = new ArrayList<Integer>();
		list.add(0);
		
		for(int i=0;i<size;i++) 
			arr[i+1] = heights[i];
		
		for(int i=2; i<=size; i++) { //1층은 0이니까 2층부터 확인
			for(int j=i-1; j>=1; j--) { // i-1층부터 차례차례 밑 확인
				if(arr[i] <arr[j]) { //현재층보다 큰게 있다면
					list.add(j); //답에 넣어주고
					check = true;
					break;
				}
			}
			
			if(check== false) //걸리는거 하나 없이 나온다면-> 큰게 없다는거
				list.add(0); //그럼 답에 0 추가
			
			check = false; // check에 true걸려있을 수도 있으니까 false로 처리
		}
		
		return list.stream().mapToInt(k->k).toArray(); // list to Array
		
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
