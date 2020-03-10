package Math;

public class prog_2_re_소수찾기 {

	static int so[] = new int[9999999];
	static int answer = 0;
	
	static boolean sosu(int num) {
		if(num==0 || num ==1) // 이거 까먹지 않도록
			return false;
		
		for(int i=2;i<=num-1; i++) {
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
	
	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	
	static void perm(int arr[], int depth, int n, int r) {
		if(depth == r) {
			int num = 0;
			for(int i=0; i<r; i++) {
				num = num * 10 + arr[i];
			}
			
			if(so[num] == 0) {
				so[num] = 1;
				if(sosu(num))
					answer++;
			}
			
			return;
		}
		
		for(int i=depth; i<arr.length; i++) {
			swap(arr, i, depth);
			perm(arr, depth+1, n, r);
			swap(arr, i, depth);
		}
	}
	
	static public int solution(String numbers) {
		int arr[] = new int[numbers.length()];
		
		for(int i=0;i<numbers.length(); i++)
			arr[i] = numbers.charAt(i)-'0';
	
		for(int i=1; i<=numbers.length(); i++) {
			//arr,depth,n,r
			perm(arr,0,numbers.length(),i);
		}
		
	
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("17"));
	}
}
