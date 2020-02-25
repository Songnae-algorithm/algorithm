package String;

import java.util.*;

public class beak_그룹단어체커 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int an = 0;
		
		sc.nextLine();
		
		for(int i=0;i<n; i++) {
			int arr[] = new int[26];
			boolean check = false;
			
			String a = sc.nextLine();
			
			for(int j=1; j<a.length(); j++) {
				
				arr[a.charAt(j-1)-'a'] = 1;
				
				if(a.charAt(j) != a.charAt(j-1)) {//나랑 전 단어가 같을 때는 상관 없고!! 나랑 전 단어가 다를 때, 내 전단어는 1표시 돼있고
												 //전 단어는 나랑 다르니까 새로운 내가 이미 전에 나왔었는지 확인해본다 
					if(arr[a.charAt(j)-'a'] !=0)
						check = true;
				}
			}
			
			if(check != true)
				an++;
			
		}//for
		
		System.out.println(an);
		
	}
}
