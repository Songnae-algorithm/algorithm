package Stack_Queue;

import java.util.*;

public class beak_좋은단어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int k=0; k<n; k++) {
			String s = sc.nextLine();
			
			Stack<Character> stk = new Stack<>();
			stk.add(s.charAt(0));
			
			for(int i=1;i<s.length(); i++) {
				char c = s.charAt(i);
				
				if(!stk.isEmpty() && c ==stk.peek()) //비어있으면서의 조건을 항상 앞에 붙여줘야한다!
					stk.pop();
				else
					stk.push(c);
			}
			
			if(stk.isEmpty())
				answer++;
			
		}//for
		
		System.out.println(answer);
	}
}
