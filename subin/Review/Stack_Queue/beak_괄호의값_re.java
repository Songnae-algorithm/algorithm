package Stack_Queue;

import java.util.*;

public class beak_괄호의값_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String s = sc.nextLine();
		Stack<Character> stk = new Stack();
		
		int sum = 0;
		int divider =1;
		boolean b = false;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			switch(c) {
			case '(': // 무조건 stk에 (만 넣는다
				stk.add('(');
				divider = divider*2;
				break;
				
			case '[': // 무조건 stk에 [만 넣는다
				stk.add('[');
				divider = divider*3;
				break;
				
			case ')': //stk에는 (나 ]만 있으므로, )일 때
				if(stk.isEmpty() || stk.peek() == '[') {//stk에서는 (를 팝해야함
					b = true;
					break;
				}
				
				if(s.charAt(i-1) == '(') // 앞이 (면 계산해주는거니까 sum에 넣고
					sum += divider;
				
				//다 수행했다면 
				stk.pop();
				divider /= 2;
				break;
				
			case ']':
				//무조건 얘를 먼저 수행해줘야 한다
				if(stk.isEmpty() || stk.peek() == '(') {
					b = true;
					break;
				}
				
				if(s.charAt(i-1) == '[')
					sum += divider;
				
				//다 수행했다면 
				stk.pop();
				divider /= 3;
				break;
			}
			
			if(b == true)
				break;
			
		}//for
		
		//어쨌든 나오면 sum에 똥값이 들어있던, 정상값이 들어있던 한다!
		//중요한건 stk가 empty인지 아닌지!
		if(stk.isEmpty() && b == false)
			System.out.println(sum);
		else
			System.out.println(0);
	}
}
