package Ssocar;

public class t3 {
	static int min = 10000000;
	
	static void dfs(int nums[], int idx, int sum, int chk[]) {
		//종결은 idx == nums.length
		if(idx == nums.length-1) {
			min = Math.min(min, sum);
			
			System.out.println("sum" + sum);
			System.out.println("min " + min);
			return ;
		}
		
		if(idx<0 || idx>=nums.length || chk[idx] >=2) {
			System.out.println("here? -> " + idx + "  " + chk[idx]);
			return ;
		}
		
		
		int next = idx + nums[idx];
		int nextt = idx - nums[idx];
		
		if(next>=0 && next<nums.length) {
			dfs(nums,idx + nums[idx], sum++, chk);
		}
		
		if(nextt>=0 && nextt<nums.length) {		
			dfs(nums,idx - nums[idx], sum++, chk);
		}
		
	}
	
	static public int solution(int nums[]) {
		int chk[] = new int[nums.length];
		dfs(nums,0,0, chk);
		return min;
	}
	
	public static void main(String[] args) {
		int n[] = {4,1,2,3,1,0,5};
		
		System.out.println("sol" + solution(n));
	}
}
