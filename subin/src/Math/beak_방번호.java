package Math;

import java.util.*;

public class beak_방번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int arr[] = new int[10];
		
		for(int i=0;i<s.length();i++) {
			int k = s.charAt(i)-'0';			
			if(k==9)
				arr[6]++;
			else
				arr[k]++;
		}

        
		int max = 0;
        arr[6] = Math.round(arr[6]/2.0f); // 반올림!!!!!!!
        for(int i=0;i<10;i++)
            max=Math.max(max, arr[i]);
        
		System.out.println(max);
	}
}
