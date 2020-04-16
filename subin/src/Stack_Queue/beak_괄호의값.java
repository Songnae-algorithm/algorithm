package Stack_Queue;

import java.util.*;

public class beak_괄호의값 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		Stack<Character> stk = new Stack<>();
		
		int mul = 1; int result = 0;
		
		for(int i=0; i<s.length(); i++) {
			switch(s.charAt(i)) {
			
			case '(':
				stk.push('(');
				mul = mul*2;
				break;
				
			case '[':
				stk.push('[');
				mul = mul*3;
				break;
				
			case ')':
				//반드시 앞에 (가 존재해야한다!
				if(stk.isEmpty() || stk.peek() !='(') {
					result = 0;
					break;
				}
				
				//내 바로앞이 (일때만 result에 넣어준다
				if(s.charAt(i-1) == '(')
					result = result + mul;
				
				//위의 경우 || s.charAt(i-1)이 '('가 아닌경우
				stk.pop();
				mul = mul/2;
				break;
				
			case ']':
				//반드시 앞에 [가 존재해야한다!
				if(stk.isEmpty() || stk.peek() !='[') {
					result = 0;
					break;
				}

				//내 바로앞이 [일때만 result에 넣어준다
				if(s.charAt(i-1) == '[')
					result = result+mul;	

				//위의 경우 || s.charAt(i-1)이 '['가 아닌경우
				stk.pop();
				mul= mul/3;
				break;
				
			}//switch
		}
		
		if(!stk.isEmpty())
			System.out.println(0);
		else
			System.out.println(result);
		
	}
}

//참고
//https://blog.naver.com/PostView.nhn?blogId=yongyos&logNo=221454435252