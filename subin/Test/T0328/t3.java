package T0328;

public class t3 {

	public static int solution(int A[]) {
		String s1 = "", s2 = "", s3= "", s4 = "";
		for(int i=0; i<A.length-1; i++) {
			if(i%2 == 0) {
				s1 += "0";
				s2 += "1";
			}
			else {
				s1 += "1";
				s2 += "0";
			}
		}
		
		for(int i=0; i<A.length-2; i++) {
			if(i%2 == 0) {
				s3 += "0";
				s4 += "1";
			}
			else {
				s3 += "1";
				s4 += "0";
			}
		}
		
		//지우지 않고도 조건을 만족하는지
		String a = "";	int answer = -1;	int cnt = 0;
		for(int i=1; i<A.length; i++) {
			if(A[i] > A[i-1])
				a += "0";
			else if(A[i] < A[i-1])
				a += "1";
			else
				a += "-";
		}
		
		if(a.charAt(0) == '0' && a.equals(s1))
			return 0;
		
		else if(a.charAt(0) == '1' && a.equals(s2))
			return 0;
		
		//아닌 경우에
		for(int i=0; i<A.length; i++) {
			int arr[] = new int[A.length-1];
			
			int k = 0;
			for(int j=0; j<A.length; j++) {
				if(i == j)
					continue;
				arr[k++] = A[j];
			}
			
			String s = "";
			for(int j=1; j<A.length-1; j++) {
				if(arr[j] > arr[j-1])
					s += "0";
				else if(arr[j] < arr[j-1])
					s += "1";
				else
					s += "-";
			}
			
			if(s.charAt(0) == '0' && s.equals(s3))
				cnt++;
			else if(s.charAt(0) == '1' && s.equals(s4))
				cnt++;
				
		}
		
		if(cnt != 0)
			answer = cnt;
		
		return answer;
	}
	
	public static void main(String[] args) {
		int a[] = {3,4,5,3,7};
		int b[] = {1,2,3,4};
		int c[] = {1,3,1,2};
		int d[] = {1,1,1,1,1};
		
		System.out.println(solution(d));
	}
}
