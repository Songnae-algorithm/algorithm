package Backtracking;

import java.util.*;

public class back_re_암호만들기 {
	static int n;
	static int m;
	static LinkedList<String> arr;
	static LinkedList<String> list;
	static LinkedList<String> result;
	
	public static int vo(String s) {
		int num = 0;
		String v = "aeiou";
		for(int i=0; i<s.length(); i++) {
			if(v.contains(String.valueOf(s.charAt(i))))
					num++;
		}
		return num;
	}
	
	//mCn
	public static void Combination(int num) {
		if(num == n) {
			String a = "";
			for(String s : result) {
				a +=s;
			}
			int numb=vo(a);
			if(numb>=1 && n-numb>=2)
				list.add(a);
				
			return;
		}
		else {
			for(int i=0; i<arr.size(); i++) {
				if(result.contains(arr.get(i)))
					continue;
				//result가 empty가 아닐때!!
				if(!result.isEmpty() && i<=arr.indexOf((result.getLast())))
					continue;
				
				result.add(arr.get(i));
				Combination(num+1);
				result.removeLast();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		list = new LinkedList<>();
		result = new LinkedList<>();
		arr = new LinkedList<>();
		
		String s[] = sc.nextLine().split(" ");
		
		for(int i=0; i<m; i++) 
			arr.add(s[i]);
		
		//미리 정렬한다! (조합으로 풀면 정렬순서가 섞일일이 없다)
		arr.sort(null);
		//mCn으로 구할 수 있는 string 전부 구한다
		Combination(0);
		//다 구하면  1.최소한개의 모음 2.최소 두개의 자음으로 구성인지
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}
}
