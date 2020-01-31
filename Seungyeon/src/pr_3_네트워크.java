
public class pr_3_네트워크 {

	public static int solution(int n, int[][] computers) {
		int answer = 0;

		boolean chk[] = new boolean[n + 1];//n+1 만큼 check할 boolean 

		int arr[][] = new int[n + 1][n + 1]; //1번째부터 봐주기 위해서 n+1의 배열을 새로 만듬 

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				arr[i][j] = computers[i - 1][j - 1]; //i,j를 1부터 시작하고 i-1,j-1를 입력해줌 (1부터 배열을 만들기 위해)
			}
		}
		
		for(int i=1; i<chk.length; i++) {// chk의 길이만큼 돌기
			if(chk[i]==false) { //chk가 false일때만 dfs
				// 1번예제를 한번 돌면 1,2가 true가 되니까 덩어리로 묶이고,i는 3
				dfs(arr, chk, i);
				answer++;
			}
		}


		return answer;
	}

	public static void dfs(int[][] a, boolean[] c, int v) {

		int n = a.length - 1;
		c[v] = true;
		System.out.print(v + " ");

		for (int i = 1; i <= n; i++) {
			if (a[v][i] == 1 && !c[i]) {
				dfs(a, c, i);
			}
		}

	}

	public static void main(String[] args) {

		int n = 3;
		int arr[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		solution(n, arr);

		System.out.println();
		int n2 = 3;
		int arr2[][] = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
		solution(n2, arr2);

	}
}
