package bruteforce_re;

import java.util.*;

public class beak_re_로또 {

	static LinkedList<Integer> result;
	static LinkedList<Integer> arr;
	
	public static void comb(int num) {
		if(num == 6) {
			StringBuilder sb = new StringBuilder();
			for(int i : result)
				sb.append(i + " ");
			System.out.println(sb);
		}
		
		for(int i=0; i<arr.size(); i++) {
			if(result.contains(arr.get(i)))
				continue;
			if(!result.isEmpty() && i<arr.indexOf(result.getLast()))
				continue;
			
			result.add(arr.get(i));
			comb(num+1);
			result.removeLast();	
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals("0"))
				break;
			
			String ss[] = s.split(" ");
			int n = Integer.parseInt(ss[0]);
			
			result = new LinkedList<>();
			arr = new LinkedList<>();
			
			arr.sort(null);
			
			for(int i=1; i<=n; i++)
				arr.add(Integer.parseInt(ss[i]));
	
			comb(0);
			System.out.println("");
		}
		
	}
}
