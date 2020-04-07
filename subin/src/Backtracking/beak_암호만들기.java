package Backtracking;

import java.util.*;

public class beak_암호만들기 {

	static int n;
	static int m;
	static LinkedList<String> vowel;
	
	static LinkedList<String> result = new LinkedList<>();
	
	static public int vowel_check(LinkedList<String> list) {
		int num = 0;
		
		String vo = "aeiou";
		for(int i=0; i<list.size(); i++) {
			if(vo.contains(list.get(i)))
					num++;
		}
		
		return num;
	}
	
	public static void comb(int count) {
		if(count == m) {

			int vs = vowel_check(result);
			int cs = m-vs;
			
			if(vs>=1 && cs>=2){
				String s="";
				for(String a : result)
					s += a;
				System.out.println(s);
			}
		}
		
		for(int i=0; i<n; i++) {
			if(result.contains(vowel.get(i)))
				continue;
			if(!result.isEmpty() && i<vowel.indexOf(result.getLast()))
				continue;
			
			result.add(vowel.get(i));
			comb(count+1);
			result.removeLast();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		vowel = new LinkedList<>(); //모음 - 최소 한개
		
		sc.nextLine();
		
		String s = sc.nextLine();
		String ss[] = s.split(" ");
		
		
		for(int i=0;i<c; i++) {
			vowel.add(ss[i]);
		}
		
		n = c;
		m = l;
		
		vowel.sort(null);
		
		comb(0);
	}
}