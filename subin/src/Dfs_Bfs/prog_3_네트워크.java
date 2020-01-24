package Dfs_Bfs;

public class prog_3_네트워크 {

	static public void dfs(int arr[][], boolean check[], int idx) {
		check[idx] = true;
		
		for(int i=1;i<arr.length; i++) {
			if(arr[idx][i] == 1 && check[i]==false)
				dfs(arr,check,i);
		}
	}
	
    static public int solution(int n, int[][] computers) {
    	int arr[][] = new int [n+1][n+1];
    	int answer = 0;
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(computers[i][j] == 1) {
    				arr[i+1][j+1] = 1;
    				arr[j+1][i+1] = 1;
    			}
    		}
    	}
    	
    	boolean check[] = new boolean[n+1];
    	
    	for(int i=1; i<check.length; i++) { // 이 부분 생각해 내는게 포인트!
    		if(check[i] == false) {//돌고 나올때 마다 연결돼있는 부분 true로 만들어주니까
    			dfs(arr,check,i);	
    			answer++; // 돌고 나왔다는거는 연결된 덩어리가 1개 존재한다는 뜻!
    		}
    	}
    	
    	return answer;
    }
	
	public static void main(String[] args) {
		
		int c[][] = {{1,1,0},{1,1,1},{0,1,1}};
		
		System.out.println(solution(3,c));
		
		
	}
}
