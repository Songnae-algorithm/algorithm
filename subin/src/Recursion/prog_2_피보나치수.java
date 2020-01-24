package Recursion;

public class prog_2_피보나치수 {
	
	
	//시간 초과........!! (답은 맞음)
	static public int fib(int n) {
		int answer = 0;

		if(n == 0)
			return 0;
		
		if(n == 1)
			return 1;
		
		answer = fib(n-1)%1234567 + fib(n-2)%1234567;
		
		return answer %1234567;
	}
	
	
	  static public int solution(int n) {
	      int answer = 0;
	      
	      if(n == 1)
	    	  return 1;
	      
	      int a = 0; // n-1 값 넣기
	      int b = 1; // n-2 값 넣기
	      
	      for(int i=2; i<=n; i++) {

	    	  answer = a + b;
	    	  
	    	  a = b% 1234567;
	    	  b = answer% 1234567;
	      } // a= b; b = a+b; 를 하니까 b = b+b 가 되었는데.. 그것도 모르고 계속 저렇게 함...
	      
	      return answer % 1234567;
	  }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(fib(3));
	}
}
