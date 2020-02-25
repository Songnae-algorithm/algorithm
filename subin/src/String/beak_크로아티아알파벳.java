package String;

import java.util.*;

public class beak_크로아티아알파벳 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		//진짜 너무 바보같다..ㅎ 같은게 있으면 *로 치환하면 그만인 것을...
		
		String words[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0;i<words.length; i++) {
			if(a.contains(words[i])) // 들어있는 모든 애들을 replace해준다! 한개만이 아니고!
				a = a.replaceAll(words[i], "*"); // replace()아니고 replaceAll()!!!!!!!!!!!!
				//그리고 치환했으면 반드시 다시 a 문자열에 넣어준다
		}
		
		System.out.println(a.length());
	}
}
