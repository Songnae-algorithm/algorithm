package T0324;

import java.util.*;

//20min
public class t2 {
	
	public static int solution(int money[][]) {
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=0; i<money.length; i++) {
			for(int j=0; j<money[i][1]; j++) {
				list.add(money[i][0]);
			}
		}
		
		int compare[] = new int[2];
		
		compare[0] = list.remove(0);
		
		// list의 size로 for를 돌릴 때는, list.remove로 사이즈가 바뀌기 때문에 따로 저장해놓고 돌린다.
		int size = list.size();
		
		for(int i=0; i<size; i++) {
			if(compare[0]>compare[1])
				compare[1] += list.remove();
			else
				compare[0] += list.remove();
		}
		
		if(compare[0] > compare[1])
			return compare[0]- compare[1];
		else
			return compare[1] - compare[0];
		
	}
	
	public static void main(String[] args) {
		int arr[][] = {{2500,3}, {700,5}};
		
		System.out.println(solution(arr));
	}
}
