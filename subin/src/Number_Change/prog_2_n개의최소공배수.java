package Number_Change;


public class prog_2_n개의최소공배수 {

	//2h
	static int gcd(int m, int n) {
		if(m%n==0)
			return n;
		else
			return gcd(n,m%n);
	}
	
	
	static public int solution(int[] arr) {
		//GCD를 구해서 그 GCD로 나누어 떨어지는 몫을 곱해주면 LCM이 된다.	
		
		if(arr.length == 1)
			return arr[0];
		
		else if(arr.length == 2) {
			int g =  gcd(arr[0], arr[1]);
			return g * (arr[0]/g) * (arr[1]/g);
		}
		
		else {
			int g =  gcd(arr[0], arr[1]);
			int l= g * (arr[0]/g) * (arr[1]/g);
				
			for(int i=2; i<arr.length; i++) { 
				g = gcd(l,arr[i]);
				l = g * (l/g) * (arr[i]/g);
			}
			return l;
		}
	}
	
	
	  public static void main(String[] args) {
		  int a[] = {2,6,8,14};
		  System.out.println(solution(a));
	  }
}
